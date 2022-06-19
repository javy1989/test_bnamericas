/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.test.rest.service;

import com.test.rest.exception.SaveException;

/**
 *
 * @author ricardo.bravo
 * @param <T>
 * @param <ID>
 */
public interface ICrud<T, ID> {

    T save(T t) throws SaveException;
}
