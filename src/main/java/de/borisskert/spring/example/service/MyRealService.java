package de.borisskert.spring.example.service;

import de.borisskert.spring.example.MyService;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("real")
@Primary
public class MyRealService implements MyService {
    @Override
    public String get() {
        return "This is for real!";
    }
}
