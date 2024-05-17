package com.example.demo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class City {
    private Integer id;
    private String name;
    private String countryCode;
    private String district;
    private String population;
}
