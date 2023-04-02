package project.capstone.service;

import project.capstone.domain.UserDto;

public interface UserService {
    UserDto getList(String name) throws Exception;

    int save(UserDto userDto) throws Exception;
}
