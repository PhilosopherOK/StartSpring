package org.example.springCore;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music{
    @Override
    public String getSong() {
        return "Ludovico Einaudi";
    }
}
