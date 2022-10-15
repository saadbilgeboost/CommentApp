package com.saad.commentapp.mapper;

import com.saad.commentapp.dto.request.LikeCreateRequestDto;
import com.saad.commentapp.repository.entity.Like;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface LikeMapper {


    LikeMapper INSTANCE = Mappers.getMapper(LikeMapper.class);


    Like toLike(final LikeCreateRequestDto requestDto);
}