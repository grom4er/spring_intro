package controller;

import dto.UserResponseDto;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.UserMapper;
import service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;
    private final UserMapper userMapper;

    public UserController(UserService userService, UserMapper userMapper) {
        this.userService = userService;
        this.userMapper = userMapper;
    }

    @GetMapping("/{user_id}")
    public UserResponseDto getUser(@PathVariable("user_id") Long id) {
        return userMapper.toDto(userService.getUserById(id));
    }

    @GetMapping("/getAll")
    public List<UserResponseDto> getAll() {
        return userService.listUsers().stream()
                .map(userMapper::toDto)
                .collect(Collectors.toList());
    }

    @GetMapping("/inject")
    public String inject() {
        IntStream.range(1, 5)
                .mapToObj(String::valueOf)
                .map(x -> {
                    User user = new User();
                    user.setName(x);
                    return user;
                })
                .forEach(userService::add);
        return "Inject complete";
    }
}
