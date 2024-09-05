package com.ldh.springbasic.service;

import com.ldh.springbasic.dto.PostUserRequestDto;
import com.ldh.springbasic.dto.SingInRequestDto;

public interface AuthService {
    String signUp(PostUserRequestDto dto);
    String signIn(SingInRequestDto dto);
}
