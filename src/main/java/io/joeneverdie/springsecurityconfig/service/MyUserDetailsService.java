package io.joeneverdie.springsecurityconfig.service;

import io.joeneverdie.springsecurityconfig.model.MyUserDetails;
import io.joeneverdie.springsecurityconfig.model.User;
import io.joeneverdie.springsecurityconfig.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findByUserName(userName);
        user.orElseThrow(() -> new UsernameNotFoundException("Not found " + userName));
        return user.map(MyUserDetails::new).get();
    }

    public List<User> getAllUserByActive(boolean active) {
        return userRepository.getAllByActive(active);
    }
}
