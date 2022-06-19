package com.test.rest.dto;

import java.util.Date;

/**
 * Objeto DTO
 * @author ricardo.bravo
 */
public class HolidayDto {

    private Date date;
    private String title;
    private String extra;

    public HolidayDto() {
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

}
