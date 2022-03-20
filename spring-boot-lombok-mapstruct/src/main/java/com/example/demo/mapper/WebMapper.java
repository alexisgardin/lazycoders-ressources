package com.example.demo.mapper;

import com.example.demo.domain.User;
import com.example.demo.dto.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public abstract class WebMapper {

  public abstract UserDto toDto(User user);
}
