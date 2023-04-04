package project.capstone.dao;

import project.capstone.domain.UserDto;

public interface UserDao {
    
    // 유저조회
    String select(UserDto userDto);
    
    // 회원가입
    int insert(UserDto userDto);
}
