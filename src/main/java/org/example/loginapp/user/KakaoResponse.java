package org.example.loginapp.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.sql.Timestamp;

public class KakaoResponse {
//    {
//        "access_token": "6frGK2OVO8hyOrszK0WNdHDbBnmJ7q4rAAAAAQo9dVsAAAGPzTfVx_oXDHwO3UaB",
//            "token_type": "bearer",
//            "refresh_token": "KWNuOWWpdK317lw52-bbz5jG_6cVpV3UAAAAAgo9dVsAAAGPzTfVwvoXDHwO3UaB",
//            "expires_in": 21599,
//            "scope": "profile_nickname",
//            "refresh_token_expires_in": 5183999
//    }
//{
//    "id": 3506322659,
//    "connected_at": "2024-05-31T05:55:40Z",
//    "properties": {
//       "nickname": "지영"
//    },
//}
//}
    @Data
    public static class TokenDTO{
        @JsonProperty("access_token")
        public String accessToken;
        @JsonProperty("token_type")
        public String tokenType;
        @JsonProperty("refresh_token")
        public String refreshToken;
        @JsonProperty("expires_in")
        public String expiresIn;
        @JsonProperty("scope")
        public String scope; //조심하자
        @JsonProperty("refresh_token_expires_in")
        public String refreshTokenExpiresIn;

    }

    @Data
    public static class KakaoUserDTO{
        public Long id;
        @JsonProperty("connected_at")
        public Timestamp connectedAt;
        public Properties properties;

        @Data
        public static class Properties{
            public String nickname;
        }
    }

}
