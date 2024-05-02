package com.agencyCar.project.carSalesWebiste.service;

import com.agencyCar.project.carSalesWebiste.dto.UserDto;
import com.agencyCar.project.carSalesWebiste.model.User;
import org.apache.coyote.Response;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserService {

    Page<UserDto> getAllUsers(Pageable pageable);

    UserDto getUserById(Long id);

    User createUser(UserDto userDto);

    User removeUser(Long userId);

    User patchUser(Long id, UserDto userDto);

    UserDto updateUser(Long id, UserDto userDto);

    String uploadProfilePicture(String imageUrl);

}
