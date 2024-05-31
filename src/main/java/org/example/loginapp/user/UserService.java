package org.example.loginapp.user;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;

    @Transactional
    public void 회원가입(String username, String password, String email){
        User user =User.builder()
                .username(username)
                .password(password)
                .email(email)
                .build();
        userRepository.save(user);
    }
    public User 로그인(String username, String password){
        User user = userRepository.findByUsername(username);
        if(user == null){
            throw new RuntimeException("아이디가 없습니다");
        }else {
            if (user.getPassword().equals(password)){
                return user;
            }else {
                throw new RuntimeException("비밀번호가 틀렸습니다");
            }
        }
    }



}
