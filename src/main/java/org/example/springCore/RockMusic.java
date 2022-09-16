package org.example.springCore;

import org.springframework.stereotype.Component;


public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "Red Hot Chilly Peppers";
    }
}
