package dev.brainfit.security;

import java.util.Map;

public class MapCustomUserRepository implements CustomUserRepository {

    private final Map<String, CustomUser> emailToCustomUser;

    public MapCustomUserRepository(Map<String, CustomUser> emailToCustomUser) {
        this.emailToCustomUser = emailToCustomUser;
    }

    @Override
    public CustomUser findCustomUserByEmail(String email) {
        return this.emailToCustomUser.get(email);
    }
}
