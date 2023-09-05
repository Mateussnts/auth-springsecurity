package com.challenge.quotation.model;

import javax.xml.crypto.Data;

public class Moeda {

    private String codein;
    private String name;
    private String high;
    private String low;
    private String varbid;
    private String pctChange;
    private String bid;
    private String ask;
    private String timestamp;
    private Data create_date;

    public String getCodein() {
        return codein;
    }

    public void setCodein(String codein) {
        this.codein = codein;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHigh() {
        return high;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    public String getLow() {
        return low;
    }

    public void setLow(String low) {
        this.low = low;
    }

    public String getVarbid() {
        return varbid;
    }

    public void setVarbid(String varbid) {
        this.varbid = varbid;
    }

    public String getPctChange() {
        return pctChange;
    }

    public void setPctChange(String pctChange) {
        this.pctChange = pctChange;
    }

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public String getAsk() {
        return ask;
    }

    public void setAsk(String ask) {
        this.ask = ask;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public Data getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Data create_date) {
        this.create_date = create_date;
    }
}
