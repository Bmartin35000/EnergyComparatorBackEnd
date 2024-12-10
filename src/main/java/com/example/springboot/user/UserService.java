package com.example.springboot.user;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserService(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }


    public UserDto signIn(UserDto userDto) {
        return this.userMapper.toDto(this.userRepository.findByIdAndPassword(userDto.getId(), userDto.getPassword()));
    }

    public void signUp(UserDto userDto) throws Exception {
        if (this.userRepository.findById(userDto.getId()).isPresent()) {
            throw new Exception("Compte existant");
        }
        this.userRepository.save(this.userMapper.fromDto(userDto));
    }

    public void editUser(UserDto userDto) {
        this.userRepository.save(this.userMapper.fromDto(userDto));
    }

    public void deleteUser(String id) {
        this.userRepository.deleteById(id);
    }


}
