package com.test.rest.mapper;

import com.test.rest.dto.HolidayDto;
import com.test.rest.entity.Holiday;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

/**
 * Interface que permite transformar de un Dto a una entidad
 * @author ricardo.bravo
 */
@Mapper(componentModel = "spring")
public interface IHolidayMapper {

    @Mappings({
        @Mapping(source = "holidayDate", target = "date"),
        @Mapping(source = "name", target = "title"),
        @Mapping(source = "description", target = "extra")
    })
    HolidayDto toHolidayDto(Holiday holiday);

    @InheritInverseConfiguration
    Holiday toHoliday(HolidayDto dto);

}
