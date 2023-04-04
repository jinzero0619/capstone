package project.capstone.service;

import project.capstone.domain.UserDto;

public interface UserService {

    String getUser(UserDto userDto) throws Exception;

    int save(UserDto userDto) throws Exception;
}
