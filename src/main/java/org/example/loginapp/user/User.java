package org.example.loginapp.user;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@Table(name = "user_tb")
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(unique = true)
    private String username;
    private String password;
    private String email;
    private String address; // 배송할 때 받기
    private String provider; //facebook, kakao, apple, naver

    @Builder

    public User(Integer id, String username, String password, String email, String address, String provider) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.address = address;
        this.provider = provider;
    }
}
