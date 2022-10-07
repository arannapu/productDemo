package com.example.Example.Topics;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.TimeZone;
import java.util.function.Predicate;

@Data
@Entity
@Table(name = "Pro_Info")
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class ProductEntity {
    @javax.persistence.Id
    @GeneratedValue
    private String Id;
    private String ProductName;
    private static SimpleDateFormat localDateTime;
    String localDateString = localDateTime.format(DateTimeFormatter.ISO_DATE);



}
