package de.borisskert.spring.example.service;

import de.borisskert.spring.example.MyService;
import org.springframework.stereotype.Service;

@Service
public class MyDefaultService implements MyService {

    @Override
    public String get() {
        return "This is default";
    }
}
