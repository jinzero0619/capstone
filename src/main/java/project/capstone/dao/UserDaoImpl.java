package project.capstone.dao;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import project.capstone.domain.UserDto;


@Repository
@Mapper
public class UserDaoImpl implements UserDao {

    String namespace = "project.capstone.dao.UserMapper.";

    @Autowired
    SqlSession session;

    @Override
    public UserDto select(String name) {
        return session.selectOne(namespace+"select",name);
    }

    @Override
    public int insert(UserDto userDto) {
        return session.insert(namespace+"insert",userDto);
    }




}
