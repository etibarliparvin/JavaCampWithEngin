package business.concretes;

import business.abstracts.UserAuthorizationService;

public class UserAuthorizationManager implements UserAuthorizationService {
    @Override
    public boolean validation(String email) {
        if(email != null){
            System.out.println("Success");
            return true;
        }
        return false;
    }
}
