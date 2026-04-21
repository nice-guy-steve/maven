package com.example.demo;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
@WebMvcTest(HelloController.class)
public class HelloControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @Test
    public void testSuccess() throws Exception {
    }
    @Test
    public void testFailure() throws Exception {
      }}
