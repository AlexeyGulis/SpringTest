package org.example;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music{
    public String getSong(){
        return "Black Parade";
    }
}
