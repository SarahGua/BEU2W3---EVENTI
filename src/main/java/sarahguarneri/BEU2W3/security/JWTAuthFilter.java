package sarahguarneri.BEU2W3.security;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import sarahguarneri.BEU2W3.entites.User;
import sarahguarneri.BEU2W3.service.UserService;

import java.io.IOException;
import java.util.Optional;
import java.util.UUID;

@Component
public class JWTAuthFilter extends OncePerRequestFilter {

    @Autowired
    private JWTTools jwtTools;

    @Autowired
    private UserService userService;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        String authHeader = request.getHeader("Authorization");
        if(authHeader == null || !authHeader.startsWith("Bearer")){
            throw new RuntimeException("Per favore inserire il token");
        } else {
            String accessToken = authHeader.substring(7);
            jwtTools.verifyToken(accessToken);
            //poi da modificare
            String id = jwtTools.extractIdFromToken(accessToken);
            Optional<User> user = userService.findById(UUID.fromString(id));

            UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(user, null, user.get().getAuthorities());
            SecurityContextHolder.getContext().setAuthentication(authentication);

            filterChain.doFilter(request, response);

        }
    }
}
