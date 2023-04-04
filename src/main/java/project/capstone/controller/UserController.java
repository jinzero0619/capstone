package project.capstone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import project.capstone.domain.UserDto;
import project.capstone.service.UserService;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/api/login")
    @ResponseStatus(HttpStatus.OK)
    public String singIn(@RequestBody UserDto userDto) throws Exception {
        System.out.println("넘어온 데이터 = " + userDto);
        String name = userService.getUser(userDto);
        if(name != null && name !=""){
            System.out.println("DB 조회 성공");
            System.out.println("name = " + name);
            return name;
        } else {
            System.out.println("name = " + name);
            System.out.println("DB 조회 실패");
            return null;
        }
    }


    @PostMapping("/api/signup")
    @ResponseStatus(HttpStatus.CREATED)
    public HttpStatus signUp(@RequestBody UserDto userDto) throws Exception{
        System.out.println("[수신받은 데이터 ] = " + userDto);
//        userDto.setUserBirth(new java.sql.Date(userDto.getUserBirth().getTime()));
//        userDto.getUserBirth();
        int rowCnt = userService.save(userDto);
        if(rowCnt==1) {
            System.out.println("DB 저장 성공");
            return HttpStatus.CREATED;
        }
        else{
            return HttpStatus.REQUEST_TIMEOUT;
        }

    }
}
