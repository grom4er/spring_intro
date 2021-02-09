package dao.impl;

import dao.UserDao;
import java.util.List;
import model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void add(User user) {

    }

    @Override
    public List<User> listUsers() {
        return null;
    }
}
