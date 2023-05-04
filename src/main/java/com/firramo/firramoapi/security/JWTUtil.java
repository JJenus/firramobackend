package com.firramo.firramoapi.security;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.firramo.firramoapi.model.firramo.AppUser;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JWTUtil<T> {
    private String secret = "#&6t37hdj$fd09!!!56% 343";
    private String appName = "Firramo";

    public String generateToken(T obj){
        String token = "";
        Date now = new Date();
        long seconds = 604800L; // 7 days

        if(obj instanceof AppUser){
            AppUser user = (AppUser) obj;

            token = JWT.create().withSubject(user.getName())
                    .withIssuer(appName)
                    .withSubject("Login Auth")
                    .withClaim("email", user.getEmail())
                    .withIssuedAt(new Date())
                    .withExpiresAt(new Date(now.getTime() + seconds))
                    .sign(Algorithm.HMAC256(secret));
        } else {
            com.firramo.firramoapi.model.evergreen.AppUser user = (com.firramo.firramoapi.model.evergreen.AppUser) obj;
            token = JWT.create().withSubject(user.getName())
                    .withIssuer(appName)
                    .withSubject("Login Auth")
                    .withClaim("email", user.getEmail())
                    .withIssuedAt(new Date())
                    .withExpiresAt(new Date(now.getTime() + seconds))
                    .sign(Algorithm.HMAC256(secret));
        }

        return token;
    }

    public String verifyToken(String token)throws JWTVerificationException {
        JWTVerifier verifier = JWT.require(Algorithm.HMAC256(secret))
                .withIssuer(appName)
                .withSubject("Login Auth")
                .build();
        DecodedJWT jwt = verifier.verify(token);
        return jwt.getClaim("email").asString();
    }
}
