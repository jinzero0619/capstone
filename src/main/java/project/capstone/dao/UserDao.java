package project.capstone.dao;

import project.capstone.domain.UserDto;

public interface UserDao {
    UserDto select(String name);

    int insert(UserDto userDto);
}
