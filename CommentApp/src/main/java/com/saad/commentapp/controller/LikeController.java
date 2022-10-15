package com.saad.commentapp.controller;

import com.saad.commentapp.dto.request.LikeCreateRequestDto;
import com.saad.commentapp.repository.entity.Like;
import com.saad.commentapp.service.LikeService;
import com.saad.commentapp.service.ProductService;
import com.saad.commentapp.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("/like")
public class LikeController {


    private final LikeService likeService;
    private final UserService userService;

    private final ProductService productService;


    @GetMapping("/tolike")
    public ResponseEntity<Like> toLike(LikeCreateRequestDto dto) {

        return ResponseEntity.ok(likeService.toLike(dto));

    }


}