package com.example.demo.dto;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@Builder(toBuilder = true)
@EqualsAndHashCode
@ToString
public class ArticleDto {
  private String title;
  private String content;
  private List<String> tags;
}
