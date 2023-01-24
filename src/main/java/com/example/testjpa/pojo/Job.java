package com.example.testjpa.pojo;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Data
@Table (name = "job")
@Entity
@ToString
@DynamicInsert
@DynamicUpdate
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