package com.example.demo.security;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.config.annotation.web.configurers.oauth2.server.resource.OAuth2ResourceServerConfigurer.JwtConfigurer;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;

@Component
public class JwtUtils {

	private static final org.slf4j.Logger LOG = LoggerFactory.getLogger(JwtUtils.class);
	
	public boolean validateJwt(String authToken) {
		try {
			Jwts.parser().setSigningKey(
					"semillakjdajodajiqwjdkoqdmaskldmaiodmiocmio12j39812jiodajd89wjdi1moadkd9w9kd1kddakdmakodjid1j90d1jalkdlkzp1k010938fldo9k1") 
					.parseClaimsJws(authToken);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			LOG.error("ERROR AL VALIDAR EL TOKEN JWT", e);
		}
		return false;

	}

	public String getUserNameFromjwtToken(String token) {
		return Jwts.parser().setSigningKey(
				"semillakjdajodajiqwjdkoqdmaskldmaiodmiocmio12j39812jiodajd89wjdi1moadkd9w9kd1kddakdmakodjid1j90d1jalkdlkzp1k010938fldo9k1")
				.parseClaimsJws(token).getBody().getSubject();
	}
}
