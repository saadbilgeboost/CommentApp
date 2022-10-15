package com.saad.commentapp.repository;

import com.saad.commentapp.repository.entity.Like;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILikeRepository extends JpaRepository<Like, Long> {
}
