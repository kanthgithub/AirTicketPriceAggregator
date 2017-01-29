package com.guavaParallel.dto;


import org.pojomatic.annotations.AutoProperty;

import java.time.LocalDate;

/**
 * Created by lakshmikanth on 29/1/17.
 */
@AutoProperty
public class PassengerInformationDTO extends BaseDTO {

    private String name;
    private Integer age;
    private String origin;
    private String destination;
    private LocalDate startDate;
    private LocalDate ReturnDate;

    public PassengerInformationDTO(String name, Integer age, String origin, String destination, LocalDate startDate, LocalDate returnDate) {
        this.name = name;
        this.age = age;
        this.origin = origin;
        this.destination = destination;
        this.startDate = startDate;
        ReturnDate = returnDate;
    }

    public String getName() {
        return name;
    }


    public Integer getAge() {
        return age;
    }


    public String getOrigin() {
        return origin;
    }


    public String getDestination() {
        return destination;
    }


    public LocalDate getStartDate() {
        return startDate;
    }


    public LocalDate getReturnDate() {
        return ReturnDate;
    }

}
