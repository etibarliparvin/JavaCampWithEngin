package core.concretes;

import business.abstracts.UserAuthorizationService;
import entity.concretes.User;
import google.GoogleAuthorizationService;
import google.GoogleUser;

public class GoogleAuthorizationAdapter implements UserAuthorizationService {
    private String password;
    private int id;

    public GoogleAuthorizationAdapter(String password, int id) {
        this.password = password;
        this.id = id;
    }

    public User mappingUser() {
        User user = new User();
        GoogleUser googleUser = new GoogleUser();
        user.setId(id);
        user.setName(googleUser.getName());
        user.setSurname(googleUser.getSurname());
        user.setEmail(googleUser.getEmail());
        user.setPassword(password);
        return user;
    }

    @Override
    public boolean validation(String email) {
        if (email != null) {
            GoogleAuthorizationService googleAuthorizationService = new GoogleAuthorizationService();
            googleAuthorizationService.Authorization();
            return true;
        }
        return false;
    }
}
