package com.example.demo.domain;


import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@EqualsAndHashCode
@Getter
@Setter
@Builder(toBuilder = true)
@ToString
public class User {
    private String name;
    private String email;
    private String password;
    private List<Article> articles;
}
