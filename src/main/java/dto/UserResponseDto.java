package dto;

import org.springframework.stereotype.Component;

@Component
public class UserResponseDto {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
