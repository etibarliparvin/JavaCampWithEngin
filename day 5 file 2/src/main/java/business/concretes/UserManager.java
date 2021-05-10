package business.concretes;

import business.abstracts.UserAuthorizationService;
import business.abstracts.UserService;
import dataAccess.abstracts.UserDao;
import entity.concretes.User;
import storage.UserStorage;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserManager implements UserService {
    private UserAuthorizationService authorizationService;
    private UserDao userDao;

    public UserManager(UserAuthorizationService authorizationService, UserDao userDao) {
        this.authorizationService = authorizationService;
        this.userDao = userDao;
    }

    @Override
    public boolean register(User user) {
        if(registerProtocol(user) && emailControl(user)){
            if(validationLink(user)){
                userDao.add(user);
                return true;
            }else {
                System.out.println("You have to complete email registration");
            }
        }
        System.out.println("Check your credentials again");
        return false;
    }

    @Override
    public void login(String email, String password) {
        for(User user : UserStorage.users){
            if(user.getEmail().equals(email) && user.getPassword().equals(password)){
                System.out.println("Credentials are correct");
            }
        }
        System.out.println("Credentials are invalid");
    }

    @Override
    public void delete(User user) {
        userDao.delete(user);
        System.out.println("Successfully deleted");
    }

    @Override
    public User getById(int id) {
        return userDao.getById(id);
    }

    @Override
    public List<User> getAll() {
        return userDao.getAll();
    }

    public boolean registerProtocol(User user){
        String regex = "^[A-Z0-9._+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
        Pattern pattern = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
        Matcher control = pattern.matcher(user.getEmail());
        return user.getName().length() > 2 && user.getSurname().length() > 2 && control.matches() && user.getPassword().length() > 6;
    }

    public boolean emailControl(User user){
        for(User user1 : UserStorage.users){
            if(user1.getEmail().equals(user.getEmail())){
                System.out.println("This email is already in use");
                return false;
            }
        }
        return true;
    }

    public boolean validationLink(User user){
        if(authorizationService.validation(user.getEmail())){
            System.out.println("Finalized successfully");
            return true;
        }
        return false;
    }
}
