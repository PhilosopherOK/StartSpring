package org.example.springCore;

import org.springframework.stereotype.Component;

@Component
public class JasMusic implements Music{
    @Override
    public String getSong() {
        return "Tu turutu !";
    }
}
