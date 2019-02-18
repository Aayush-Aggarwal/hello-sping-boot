package com.myfirst.springservice.democrud.beans;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Student {

    String name;
    
    String RegistrationNumber;
    
    int age;
}

