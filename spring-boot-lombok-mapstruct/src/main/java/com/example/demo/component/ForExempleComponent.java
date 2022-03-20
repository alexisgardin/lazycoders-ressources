package com.example.demo.component;

import com.example.demo.domain.Article;
import com.example.demo.domain.User;
import com.example.demo.dto.UserDto;
import com.example.demo.mapper.WebMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import javax.annotation.PostConstruct;

@Component
@Slf4j
public class ForExempleComponent {
  @Autowired
  private WebMapper webMapper;
  public void showHowWorkMapStruct() {
    User user = User.builder()
        .articles(
            List.of(Article.builder()
                .content("my content")
                .title("my title")
                .tags(List.of("tag1", "tag2"))
                .build()))
        .email("myemail@email.com")
        .name("my name")
        .password("my password")
        .build();
    log.info("domain model user:\n{}", user);
    UserDto userDto = webMapper.toDto(user);
    log.info("dto model user:\n{}", userDto);
  }


}
