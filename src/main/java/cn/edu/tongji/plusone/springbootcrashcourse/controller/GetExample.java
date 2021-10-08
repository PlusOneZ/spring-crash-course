package cn.edu.tongji.plusone.springbootcrashcourse.controller;

import cn.edu.tongji.plusone.springbootcrashcourse.model.UserEntity;
import cn.edu.tongji.plusone.springbootcrashcourse.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/get")
public class GetExample {

    @Resource
    UserRepository userRepository;

    @RequestMapping(value = "example", method = RequestMethod.GET)
    public String simpleGetExample() {
        return "I can hear from you!";
    }

    @RequestMapping("path/variable/{things}")
    public String pathVariableGetExample(@PathVariable Integer things) {
        return "I heard you said " + things + ".";
    }

    @RequestMapping("query/param")
    public String queryParamExample(String userName, Integer id) {
        return "Get User Info " + userName + ": " + id + ".";
    }

    @RequestMapping("user")
    public UserEntity getSimpleUser() {
        UserEntity tempUser = new UserEntity();
        tempUser.setId(1850384);
        tempUser.setName("xiaozhuo");
        tempUser.setPassword("12345");
        return tempUser;
    }

    @RequestMapping("user/{id}")
    public UserEntity getUserById(@PathVariable Integer id) {
        Optional<UserEntity> user = userRepository.findById(id);

        return user.orElse(null);
    }
}
