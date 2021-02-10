package service.impl;

import dao.UserDao;
import java.util.List;
import model.User;
import org.springframework.stereotype.Service;
import service.UserService;

@Service
public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void add(User user) {
        userDao.add(user);
    }

    @Override
    public User getUserById(Long id) {
        if (userDao.getById(id).isEmpty()) {
            return null;
        }
        return userDao.getById(id).get();
    }

    @Override
    public List<User> listUsers() {
        return userDao.getAllUsers();
    }
}
