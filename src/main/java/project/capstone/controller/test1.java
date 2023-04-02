package project.capstone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.capstone.domain.UserDto;
import project.capstone.service.UserService;

@RestController
public class test1 {

    @Autowired
    UserService userService;

    @PostMapping("/api/signup")
    public String test1(@RequestBody UserDto userDto) throws Exception{
//        String name = "테스트";
//        System.out.println("일단 서버 신호");
//        UserDto userDto = userService.getList(name);
        System.out.println("[수신받은 데이터 ] = " + userDto);
        int rowCnt = userService.save(userDto);
        if(rowCnt==1) {
            System.out.println("DB 저장 완료");
        }
        return "저장성공";
    }
}
