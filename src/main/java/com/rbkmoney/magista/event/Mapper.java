package com.rbkmoney.magista.event;

/**
 * Created by tolkonepiu on 10/11/2016.
 */
public interface Mapper<T extends EventContext> {

    T fill(T value);

}