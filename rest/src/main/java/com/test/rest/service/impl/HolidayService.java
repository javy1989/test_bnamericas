package com.test.rest.service.impl;

import com.test.rest.entity.Holiday;
import com.test.rest.repo.IGenericRepo;
import com.test.rest.repo.IHolidayRepo;
import com.test.rest.service.IHolidayService;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ricardo.bravo
 */
@Service
public class HolidayService extends Crud<Holiday, Date> implements IHolidayService {

    @Autowired
    private IHolidayRepo repo;
    
    
    @Override
    protected IGenericRepo<Holiday, Date> getRepo() {
        return repo;
    }

    
    
}
