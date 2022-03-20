package com.example.demo.dto;


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
public class UserDto {
    private String name;
    private String email;
    private List<ArticleDto> articles;
}
