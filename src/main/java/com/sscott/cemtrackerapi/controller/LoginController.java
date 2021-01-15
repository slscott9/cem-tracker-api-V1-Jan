package com.sscott.cemtrackerapi.controller;

import com.sscott.cemtrackerapi.dto.UserDto;
import com.sscott.cemtrackerapi.dto.response.ServerResponse;
import com.sscott.cemtrackerapi.service.security.MyUserDetailsService;
import org.apache.catalina.Server;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class LoginController {

    @Autowired
    MyUserDetailsService myUserDetailService;

    @PostMapping("v1/login")
    public ResponseEntity<UserDto> login(@RequestBody UserDto userDto) {

        try{
            UserDetails user = myUserDetailService.loadUserByUsername(userDto.getUserName());
            PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
            String encodedPassword = user.getPassword();

            if(passwordEncoder.matches(userDto.getPassword(),encodedPassword )){
                return new ResponseEntity<UserDto>(userDto, HttpStatus.OK);
            }else {
                System.out.print("username is " + user.getUsername() + "password is " + user.getPassword());
                return new ResponseEntity<UserDto>( userDto, HttpStatus.UNAUTHORIZED);
            }

        }catch (UsernameNotFoundException usernameNotFoundException) {
            System.out.print("username not found exception");
            return new ResponseEntity<UserDto>( userDto, HttpStatus.UNAUTHORIZED);
        }
    }
}





