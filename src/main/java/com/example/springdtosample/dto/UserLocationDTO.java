package com.example.springdtosample.dto;

import lombok.Data;

@Data
public class UserLocationDTO {
    private Long userId;
    private String username;
    private double lat;
    private double lng;
    private String place;
}
