/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.sportal.common.interfaces;

/**
 * @param <T>
 */
public interface InterfaceUUID<T> {

    String getUUID();

    T setUUID(String sid);

    T setUUID();
}
