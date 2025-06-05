/*

Authorization Flow

1.
Access Decision:
                 The FilterSecurityInterceptor checks if the authenticated user has required permissions
                 Consults AccessDecisionManager which uses AccessDecisionVoters

2.
Authorization Checks:
          Role-based checks (hasRole(), hasAnyRole())
          Permission-based checks (hasAuthority(), hasAnyAuthority())
          Custom authorization logic

3.
Access Control:
        If authorized: Proceeds to the requested resource
        If not authorized: Throws AccessDeniedException

 */