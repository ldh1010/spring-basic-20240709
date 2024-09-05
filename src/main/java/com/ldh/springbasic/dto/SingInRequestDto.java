package com.ldh.springbasic.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SingInRequestDto {

    @NotBlank
    private String userId;
    @NotBlank
    private String password;

}
