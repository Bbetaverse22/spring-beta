package com.cydeo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan
public class OfficeHours {

    public int getHours(){
        return 5;
    }
}
