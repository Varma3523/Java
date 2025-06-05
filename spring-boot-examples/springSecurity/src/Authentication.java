/*
1.
Client Request: A user makes a request to access a protected resource

2.
Security Filter Chain:
     The request enters the Spring Security filter chain
     Key filters include SecurityContextPersistenceFilter, UsernamePasswordAuthenticationFilter,
       ExceptionTranslationFilter, and FilterSecurityInterceptor

3.
Authentication Process:
      The AuthenticationManager receives the authentication request
      It delegates to one or more AuthenticationProviders
      Common providers include:
           DaoAuthenticationProvider (for database authentication)
           LdapAuthenticationProvider (for LDAP)
           JwtAuthenticationProvider (for JWT tokens)

4.
UserDetailsService (if using database authentication):
         Loads user details from storage
         Verifies credentials (usually password comparison)

5.
Authentication Result:
         If successful: Creates an Authentication object and stores it in the SecurityContext
         If failed: Throws an AuthenticationException

6.
SecurityContext:
              The authenticated user's information is stored in thread-local SecurityContext

 */