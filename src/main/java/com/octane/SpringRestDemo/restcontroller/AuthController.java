package com.octane.SpringRestDemo.restcontroller;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.octane.SpringRestDemo.payload.auth.Token;
import com.octane.SpringRestDemo.payload.auth.UserLogin;
import com.octane.SpringRestDemo.service.TokenService;

@RestController
public class AuthController {

    private final AuthenticationManager authenticationManager;
    private final TokenService tokenService;

    public AuthController(TokenService tokenService,AuthenticationManager authenticaitonManager) {
        this.tokenService = tokenService;
        this.authenticationManager = authenticaitonManager;
    }

    @PostMapping("/token")
    @ResponseBody
    public Token token(@RequestBody UserLogin userLogin) throws AuthenticationException {
        Authentication  authentication = authenticationManager.authenticate(
            new UsernamePasswordAuthenticationToken(userLogin.username(), userLogin.password())
        );
        return new Token(tokenService.generateToken(authentication));
    }
}
