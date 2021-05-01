package main.day3;

public class UserManager {

    public User addUser(User user){
        System.out.println("User has been added." + user.getId() + " " + user.getName() + " " + user.getSurname());
        return user;
    }

    public boolean updateUser(User user){
        if(user.getId() != null) {
            System.out.println("User has been updated: " + user.getId() + " " + user.getName() + " " + user.getSurname());
            return true;
        }
        return false;
    }

    public boolean removeUser(Integer id){
        if(id != null) {
            System.out.println("User has been removed.");
            return true;
        }
        return false;
    }
}
