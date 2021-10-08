package cn.edu.tongji.plusone.springbootcrashcourse.repository;

import cn.edu.tongji.plusone.springbootcrashcourse.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<UserEntity, Integer> {
}
