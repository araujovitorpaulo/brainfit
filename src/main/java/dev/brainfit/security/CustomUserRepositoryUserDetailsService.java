package dev.brainfit.security;

import java.util.Objects;

// @Service
public class CustomUserRepositoryUserDetailsService /* implements UserDetailsService */ {

    private final CustomUserRepository userRepository;

    public CustomUserRepositoryUserDetailsService(final CustomUserRepository userRepository) {
        this.userRepository = Objects.requireNonNull(userRepository, "UserRepository must be not null");
    }

    // @Override
    // public UserDetails loadUserByUsername(final String email) throws
    // UsernameNotFoundException {
    // final CustomUser customUser =
    // this.userRepository.findCustomUserByEmail(email);
    // if (customUser == null) {
    // throw new UsernameNotFoundException("username " + email + " is not found");
    // }
    // return new CustomUserDetails(customUser);
    // }

    // static final class CustomUserDetails extends CustomUser implements
    // UserDetails {

    // private static final List<GrantedAuthority> ROLE_USER = Collections
    // .unmodifiableList(AuthorityUtils.createAuthorityList("ROLE_USER"));

    // CustomUserDetails(final CustomUser customUser) {
    // super(customUser.getId(), customUser.getEmail(), customUser.getPassword());
    // }

    // @Override
    // public Collection<? extends GrantedAuthority> getAuthorities() {
    // return ROLE_USER;
    // }

    // @Override
    // public String getUsername() {
    // return getEmail();
    // }

    // @Override
    // public boolean isAccountNonExpired() {
    // return true;
    // }

    // @Override
    // public boolean isAccountNonLocked() {
    // return true;
    // }

    // @Override
    // public boolean isCredentialsNonExpired() {
    // return true;
    // }

    // @Override
    // public boolean isEnabled() {
    // return true;
    // }

    // }

}
