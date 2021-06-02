package com.srinivart.model.doctor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Doctor {
    @Id
    private int id;
    private String name;
    private String specailist;

//    public Doctor(int id, String name, String specailist) {
//        this.id = id;
//        this.name = name;
//        this.specailist = specailist;
//    }
}
