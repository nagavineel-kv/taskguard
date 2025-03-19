package com.authcontrol.taskguard.service;

import com.authcontrol.taskguard.payload.UserDto;

public interface UserService {
    public UserDto createUser(UserDto userDto);
}
