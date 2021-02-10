package service;

import dto.UserResponseDto;
import model.User;

public interface UserMapper {
    UserResponseDto toDto(User user);

    User fromDto(UserResponseDto userResponseDto);
}

