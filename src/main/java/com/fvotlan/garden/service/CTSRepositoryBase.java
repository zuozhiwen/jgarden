package com.fvotlan.garden.service;

import java.util.LinkedList;
import java.util.List;

/**
 * CTS DB Repository Base
 *
 * @author zhiwen.zuo
 * @date 2019-05-28
 **/
public abstract class CTSRepositoryBase<T> {

    /**
     * 返回指定的Metric。
     * @return
     */
    public abstract String getMetric();



    public T insert(T obj){
        return obj;
    }

    public List<T> bulkInsert(List<T> objs){
        return objs;
    }

    public int delete(Object query){
        return 0;
    }

    public List<T> query(){
        return null;
    }

    public List<T> queryAll(){
        return null;
    }

    public List<T> queryPage(){
        return null;
    }
}
