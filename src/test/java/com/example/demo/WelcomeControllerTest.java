package com.example.demo;

import com.example.services.WelcomeService;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;


public class WelcomeControllerTest {

    @Mock
    WelcomeService welcomeService;

    @Mock
    Model model;

    WelcomeController welcomeController;

    @BeforeEach
    public void setUp() throws Exception{
        MockitoAnnotations.initMocks(this);
        welcomeController=new WelcomeController(welcomeService);

    }

    @Test
    public void showWelcome() {

        String actual=welcomeController.showWelcome(model);
        assertEquals("welcome",actual);
        verify(welcomeService,times(1)).generateWelcomeMessage();
        verify(model,times(1)).addAttribute(eq("welcomeMsg"),any());
    }
}