package service.impl;

import dto.UserResponseDto;
import model.User;
import org.springframework.stereotype.Component;
import service.UserMapper;

@Component
public class UserMapperImpl implements UserMapper {
    public UserResponseDto toDto(User user) {
        UserResponseDto userDto = new UserResponseDto();
        userDto.setName(user.getName());
        userDto.setId(user.getId());
        return userDto;
    }
}
