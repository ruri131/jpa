package com.example.testjpa.pojo;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

@Data
@Entity
@ToString
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String category;
    String title;
    String companyname;
    String location;
    Integer salary;

}
