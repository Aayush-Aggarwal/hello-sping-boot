package com.myfirst.springservice.democrud.beans;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponse {
    
    String name;
    int age;
    String registrationNumber;
    String registrationStatus;
}
