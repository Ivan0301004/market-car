package com.agencyCar.project.carSalesWebiste.mappers;

import com.agencyCar.project.carSalesWebiste.dto.UserDto;
import com.agencyCar.project.carSalesWebiste.model.User;
import org.mapstruct.Mapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;

import java.util.List;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User toEntity(UserDto userDto);

    UserDto toDto(User user);

    default Page<UserDto> toDtoListPage(Page<User> userList) {
        return new PageImpl<>(userList.getContent().stream()
                .map(this::toDto)
                .collect(Collectors.toList()),
                userList.getPageable(), userList.getTotalElements());
    }
}
