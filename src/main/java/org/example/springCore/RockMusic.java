package org.example.springCore;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music{
    public String getSong() {
        return "Red Hot Chilly Peppers";
    }
}
