package org.example.loginapp.user;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.sql.Time;
import java.sql.Timestamp;


public class KakaoResponse {

    @Data
    public static class TokenDTO{
        @JsonProperty("access_token")
        private String accessToken;
        @JsonProperty("token_type")
        private String tokenType;
        @JsonProperty("refresh_token")
        private String refreshToken;
        @JsonProperty("expires_in")
        private String expiresIn;
        @JsonProperty("scope")
        private String profileNicname;
        @JsonProperty("refresh_token_expires_in")
        private String refreshTokenExpiresIn;
    }

    @Data
    public static class KakaoUserDTO{
        private Long id;
        private Timestamp connected_at;
        private Properties properties;

        @Data
        class Properties{
            private String nickname;
        }
    }
//    {
//        "id": 3506529675,
//        "connected_at": "2024-05-31T08:32:17Z",
//        "properties": {
//           "nickname": "지영"
//         }
//    }

//    {
//        "access_token": "G9TlbB0LeD7IwBTQDflO_5yZVjD9ZVrPAAAAAQorDSAAAAGPzcc6nfoXDHwO3UaB",
//            "token_type": "bearer",
//            "refresh_token": "1ck5MTMZ80nC_NqH154UDrhRB4oqz3Z2AAAAAgorDSAAAAGPzcc6mfoXDHwO3UaB",
//            "expires_in": 21599,
//            "scope": "profile_nickname",
//            "refresh_token_expires_in": 5183999
//    }


}
