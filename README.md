# JWT Based Authentication spring Boot 3.2.4
1, Create two child classes which override the addFilterInternal method from OncePerRequestFilter spring package, one to generate JWT token and the other to validate the token         

    @Override
    public void doFilterInternal(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
    throws IOException, ServletException {
        ... own filter logic ...
    }

2, Add to the securityFilterChain bean in the configuration class.  

    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity httpSecurity) throws Exception {
    ...
    .addFilterAfter(new JWTTokenGeneratorFilter(), BasicAuthenticationFilter.class)
    .addFilterBefore(new JWTTokenValidatorFilter(), BasicAuthenticationFilter.class)
    ...
    }
3, Finally if it does not work clone this project and run.

4, Follow me on https://www.linkedin.com/in/tatekahmed/ 