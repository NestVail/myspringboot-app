package com.basic.myspringboot.controller.form;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Getter @Setter
public class UserForm {
    @NotEmpty(message = "name field cannot be empty")
    private String name;

    @NotBlank(message = "email field cannot be empty or blank")
    @Email(message = "invalid email format")
    private String email;
}
