package com.saad.commentapp.mapper;

import com.saad.commentapp.dto.request.LoginRequestDto;
import com.saad.commentapp.dto.request.UserCreateRequestDto;
import com.saad.commentapp.dto.response.UserCreateResponseDto;
import com.saad.commentapp.dto.response.UserFindAllResponseDto;
import com.saad.commentapp.repository.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);


    UserCreateResponseDto toUserCreateResponseDto(final User user);

    User toUser(final UserCreateResponseDto userCreateResponseDto);

    List<UserFindAllResponseDto> toUserFindAllResponseDto(final List<User> users);


    User toUser(final UserCreateRequestDto requestDto);

    User toUserFromLogin(final LoginRequestDto dto);
}