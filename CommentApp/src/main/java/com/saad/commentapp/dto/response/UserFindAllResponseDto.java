package com.saad.commentapp.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserFindAllResponseDto {

    List<Long> favProducts;
    private String name;
    private String surName;
    private String email;
    private String telephone;

}
