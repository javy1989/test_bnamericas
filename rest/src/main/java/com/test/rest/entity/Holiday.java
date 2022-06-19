package com.test.rest.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * 
 * @author ricardo.bravo
 */
@Entity
@Table(name = "feriados", schema = "registro")
public class Holiday implements Serializable {

    @Id
    @Temporal(TemporalType.DATE)
    @Column(name = "fecha")
    private Date holidayDate;

    @Column(name = "nombre")
    private String name;

    @Column(name = "descripcion")
    private String description;

    public Holiday() {
    }

    public Date getHolidayDate() {
        return holidayDate;
    }

    public void setHolidayDate(Date holidayDate) {
        this.holidayDate = holidayDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return name;
    }

}
