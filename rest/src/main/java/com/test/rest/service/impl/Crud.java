package com.test.rest.service.impl;

import com.test.rest.exception.SaveException;
import com.test.rest.repo.IGenericRepo;
import com.test.rest.service.ICrud;

/**
 *
 * @author ricardo.bravo
 * @param <T>
 * @param <ID>
 */
public abstract class Crud<T, ID> implements ICrud<T, ID> {

    protected abstract IGenericRepo<T, ID> getRepo();

    @Override
    public T save(T t) throws SaveException {
        return getRepo().save(t);
    }

}
