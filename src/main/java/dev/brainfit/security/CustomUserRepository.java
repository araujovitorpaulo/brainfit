package dev.brainfit.security;

public interface CustomUserRepository {

    CustomUser findCustomUserByEmail(String email);

}
