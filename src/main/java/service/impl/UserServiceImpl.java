package service.impl;

import dao.UserDao;
import exception.DataProcessException;
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
        return userDao.getById(id).orElseThrow(
                () -> new DataProcessException("Can't take user by id"));
    }

    @Override
    public List<User> listUsers() {
        return userDao.getAllUsers();
    }
}
