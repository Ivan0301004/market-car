package com.agencyCar.project.carSalesWebiste.service.implementation;

import com.agencyCar.project.carSalesWebiste.dto.UserDto;
import com.agencyCar.project.carSalesWebiste.exceptions.NoArgumentException;
import com.agencyCar.project.carSalesWebiste.exceptions.ResourceNotFoundException;
import com.agencyCar.project.carSalesWebiste.mappers.UserMapper;
import com.agencyCar.project.carSalesWebiste.model.User;
import com.agencyCar.project.carSalesWebiste.respository.UserRepository;
import com.agencyCar.project.carSalesWebiste.service.UserService;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserServiceImpl(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Override
    public Page<UserDto> getAllUsers(Pageable pageable) {
        Page<User> users = this.userRepository.findAll(pageable);
        return this.userMapper.toDtoListPage(users);
    }

    @Override
    public UserDto getUserById(Long id) {
        User userToRetrieve = this.userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User was not found"));
        return this.userMapper.toDto(userToRetrieve);
    }

    @Override
    @Transactional
    public User createUser(UserDto userDto) {
        if (userDto == null) {
            log.error("An error occurred to save the user");
            throw new NoArgumentException("User cannot be null");
        }

        try {
            User userToSave = this.userMapper.toEntity(userDto);
            log.info("User {} has been created successfully!", userDto.toString());
            return this.userRepository.save(userToSave);
        } catch (Exception e) {
            log.error("An error occurred while saving the user", e.getCause());
            throw new RuntimeException("An error occurred while saving the user", e.getCause());
        }
    }

    @Override
    public User removeUser(Long userId) {
        User user = this.userRepository.findById(userId)
                .orElseThrow(() -> {
                    log.error("User with id {} was not found", userId);
                    return new ResourceNotFoundException("User was not found", HttpStatus.NOT_FOUND);
                });

        log.info("User {} has been deleted successfully", user);
        this.userRepository.delete(user);
        return user;
    }

    @Override
    public User patchUser(Long id, UserDto userDto) {
        return null;
    }

    @Override
    public UserDto updateUser(Long id, UserDto userDto) {

        if (userDto == null) {
            // TODO : add api error here
        }

        User userToUpdate = this.userRepository.findById(id)
                .map(user -> {
                    user.setFirstName(userDto.getFirstName());
                    user.setLastName(userDto.getLastName());
                    user.setAddress(userDto.getAddress());
                    return user;
                })
                .orElseThrow(() -> new ResourceNotFoundException("User was not found", HttpStatus.NOT_FOUND));

        return this.userMapper.toDto(this.userRepository.save(userToUpdate));
    }

    @Override
    public String uploadProfilePicture(String imageUrl) {
        return null;
    }
}
