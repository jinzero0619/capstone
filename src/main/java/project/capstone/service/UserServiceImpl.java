package project.capstone.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.capstone.dao.UserDao;
import project.capstone.domain.UserDto;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public UserDto getList(String name) throws Exception {
        return userDao.select(name);
    }

    @Override
    public int save(UserDto userDto) throws Exception{
        return userDao.insert(userDto);
    }
}
