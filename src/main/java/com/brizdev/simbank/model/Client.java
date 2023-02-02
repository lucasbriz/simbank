package com.brizdev.simbank.model;

import java.util.Date;
import java.util.UUID;

public class Client {

    private final UUID userId;
    private final String firstName;
    private final String lastName;
    private final String id;
    private final Date dateOfBirth;
    private final String address;
    private final int addressNumber;
    private final String note;
    private final String country;
    private final long zipCode;
    private final String email;

    public Client(
            UUID userId,
            String firstName,
            String lastName,
            String id,
            Date dateOfBirth,
            String address,
            int addressNumber,
            String note,
            String country,
            long zipCode,
            String email) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.addressNumber = addressNumber;
        this.note = note;
        this.country = country;
        this.zipCode = zipCode;
        this.email = email;
    }

    public UUID getUserId() {
        return userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getId() {
        return id;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public int getAddressNumber() {
        return addressNumber;
    }

    public String getNote() {
        return note;
    }

    public String getCountry() {
        return country;
    }

    public long getZipCode() {
        return zipCode;
    }

    public String getEmail() {
        return email;
    }

}
