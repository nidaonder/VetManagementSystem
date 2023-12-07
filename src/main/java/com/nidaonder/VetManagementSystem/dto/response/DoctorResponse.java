package com.nidaonder.VetManagementSystem.dto.response;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DoctorResponse {
    private long id;
    private String name;
    private String phone;
    private String mail;
    private String address;
    private String city;
}
