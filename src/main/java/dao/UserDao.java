package dao;

import java.util.List;
import java.util.Optional;
import model.User;

public interface UserDao {
    Optional<User> getById(Long id);

    void add(User user);

    List<User> getAllUsers();
}
