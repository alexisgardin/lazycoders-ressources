package com.example.demo;

import com.example.demo.component.ForExempleComponent;
import com.example.demo.domain.Article;
import com.example.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

  @Autowired
  private ForExempleComponent forExempleComponent;
  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }


  @Override
  public void run(String... args) throws Exception {
    forExempleComponent.showHowWorkMapStruct();
  }
}
