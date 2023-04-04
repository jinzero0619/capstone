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

    // region Select
    @Override
    public String getName(UserDto userDto) throws Exception {
        return userDao.select(userDto);
    }

    @Override
    public UserDto getUser(String id) throws Exception {
        return userDao.select(id);
    }
    //endregion


    // region Insert
    @Override
    public int save(UserDto userDto) throws Exception{
        return userDao.insert(userDto);
    }
    // endregion


}
