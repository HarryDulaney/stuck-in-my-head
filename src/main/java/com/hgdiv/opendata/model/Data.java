package com.hgdiv.opendata.model;

import java.util.List;

/**
 * @author HGDIV
 * @param <T> Wrapper for application object to enable mapping
 *            by Jackson ObjectMapper on Data[{k:key,v:value}] style JSON
 */
public class Data<T> {

    private Integer total;
    private List<T> data;
    private String next;


    private String checksum;

    public Data() {
    }

    public Data(List<T> data) {
        this.data = data;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getChecksum() {
        return checksum;
    }

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }


}
