package com.involveininnovation.chat.payloads;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.*;

@NoArgsConstructor
@Getter
@Setter
public class UserDto
{
    private int id;

    @NotNull
    @NotEmpty
    @Size(message = "User name be min of 4 characters !!")
    private String name;

    @Email(message = "Enter the valid Email")
    @NotEmpty
    private String email;

    @NotNull
    @NotEmpty
    @Size(min=5,max = 20,message="Password should be min of 5 and max 20 !!")
    private String password;
}
