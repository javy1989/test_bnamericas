package com.test.rest.task;

import com.test.rest.dto.HolidayDto;
import com.test.rest.entity.Holiday;
import com.test.rest.exception.SaveException;
import com.test.rest.mapper.IHolidayMapper;
import com.test.rest.service.IHolidayService;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author ricardo.bravo
 */
@Component
public class HolidayTask {

    //servicios
    @Autowired
    private IHolidayService holidayService;
    @Autowired
    private IHolidayMapper mapper;

    @Autowired
    private RestTemplate restTemplate;

    @PostConstruct
    public void init() {
        get();
    }

    public void get() {

        // agregar lista de mediatype
        List<MediaType> acceptableMediaTypes = new ArrayList<>();
        acceptableMediaTypes.add(MediaType.APPLICATION_JSON);

        //agregar lista a cabeceras de request
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(acceptableMediaTypes);
        HttpEntity<String> entity = new HttpEntity<>(headers);

        String url = "https://feriados-cl-api.herokuapp.com/feriados";
        //realizar peticion
        try {
            HolidayDto[] items = restTemplate.exchange(url, HttpMethod.GET, entity, HolidayDto[].class).getBody();
            if (items == null) {
                return;
            }
            //recorrer listado de resultados
            for (HolidayDto item : items) {
                try {
                    //transforma a entidad el dto que se recorre
                    Holiday h = mapper.toHoliday(item);
                    //guardar en la base de datos
                    holidayService.save(h);
                } catch (SaveException ex) {
                    Logger.getLogger(HolidayTask.class.getName()).log(Level.SEVERE, "ERROR AL GUARDAR EN BASE DE DATOS", ex);
                }
            }
        } catch (HttpClientErrorException e) {
            Logger.getLogger(HolidayTask.class.getName()).log(Level.SEVERE, "ERROR AL REALIZAR LA PETICION", e);
        }

    }
}
