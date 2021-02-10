package service.impl;

import dao.UserDao;
import java.util.List;
import java.util.Optional;
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
        Optional<User> user = userDao.getById(id);
        if (user.isEmpty()) {
            return null;
        }
        return user.get();
    }

    @Override
    public List<User> listUsers() {
        return userDao.getAllUsers();
    }
}
