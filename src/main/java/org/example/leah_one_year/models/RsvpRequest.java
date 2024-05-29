package org.example.leah_one_year.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class RsvpRequest {

    @Id
    @GeneratedValue
    Long id;
    private String name;
    private int guests;
    private String allergies;
}
