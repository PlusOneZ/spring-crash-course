package cn.edu.tongji.plusone.springbootcrashcourse.controller;

import cn.edu.tongji.plusone.springbootcrashcourse.model.UserEntity;
import cn.edu.tongji.plusone.springbootcrashcourse.repository.UserRepository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("api/v1/post")
public class PostExample {

    @Resource
    UserRepository userRepository;

    @RequestMapping(value = "user", method = RequestMethod.POST)
    public void createUser(String name, int id, String password) {
        UserEntity temp = new UserEntity();
        temp.setPassword(password);
        temp.setName(name);
        temp.setId(id);

        userRepository.save(temp);
    }

    @RequestMapping(value = "by/object/user", method = RequestMethod.POST)
    public void createUserByObject(@RequestBody UserEntity temp) {
        userRepository.save(temp);
    }

}
