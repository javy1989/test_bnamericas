package com.test.rest.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * Interface que extiende JpaRepository y acceder a todos los metodos para
 * trabajar con la base de datos
 *
 * @author ricardo.bravo
 * @param <T>
 * @param <ID>
 */
@NoRepositoryBean
public interface IGenericRepo<T, ID> extends JpaRepository<T, ID> {

}
