package com.guavaParallel.dto;

import java.time.LocalDate;

public class PassengerInformationDTOBuilder {
    private String name;
    private Integer age;
    private String origin;
    private String destination;
    private LocalDate startDate;
    private LocalDate returnDate;

    public PassengerInformationDTOBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PassengerInformationDTOBuilder setAge(Integer age) {
        this.age = age;
        return this;
    }

    public PassengerInformationDTOBuilder setOrigin(String origin) {
        this.origin = origin;
        return this;
    }

    public PassengerInformationDTOBuilder setDestination(String destination) {
        this.destination = destination;
        return this;
    }

    public PassengerInformationDTOBuilder setStartDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }

    public PassengerInformationDTOBuilder setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
        return this;
    }

    public PassengerInformationDTO createPassengerInformationDTO() {
        return new PassengerInformationDTO(name, age, origin, destination, startDate, returnDate);
    }
}