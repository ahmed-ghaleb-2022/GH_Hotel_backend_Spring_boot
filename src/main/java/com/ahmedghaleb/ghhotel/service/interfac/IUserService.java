package com.ahmedghaleb.ghhotel.service.interfac;

import com.ahmedghaleb.ghhotel.dto.LoginRequest;
import com.ahmedghaleb.ghhotel.dto.Response;
import com.ahmedghaleb.ghhotel.entity.User;

public interface IUserService {
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);
}
