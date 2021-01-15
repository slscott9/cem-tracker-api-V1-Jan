package com.sscott.cemtrackerapi.service.security;

import com.sscott.cemtrackerapi.dao.UserRepository;
import com.sscott.cemtrackerapi.models.MyUserDetail;
import com.sscott.cemtrackerapi.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;


/*
    Spring security will use this service to authenticate a user

    Takes a user name and returns a UserDetail object to authenticate

    repo returns user -> UserDetailsService returns UserDetail object -> spring security authenticates user
 */
@Service //can inject this service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findByUserName(userName);

        user.orElseThrow(() -> new UsernameNotFoundException("Not found: " + userName));

        return user.map(MyUserDetail::new).get();
    }
}
