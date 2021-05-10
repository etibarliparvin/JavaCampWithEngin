package dataAccess.concretes;

import dataAccess.abstracts.UserDao;
import entity.concretes.User;
import storage.UserStorage;

import java.util.List;

public class HibernateUserDao implements UserDao {
    @Override
    public void add(User user) {
        System.out.println("User is added: " + user.getName());
        UserStorage.users.add(user);
    }

    @Override
    public void update(User user) {
        for(int i = 0; i < UserStorage.users.size(); i++){
            if(user.getId() == UserStorage.users.get(i).getId()){
                UserStorage.users.get(i).setName(user.getName());
                UserStorage.users.get(i).setSurname(user.getSurname());
                UserStorage.users.get(i).setEmail(user.getEmail());
                UserStorage.users.get(i).setPassword(user.getPassword());
                break;
            }
        }
    }

    @Override
    public void delete(User user) {
        for(int i = 0; i < UserStorage.users.size(); i++){
            if(user.getId() == UserStorage.users.get(i).getId()){
                UserStorage.users.remove(user);
                break;
            }
        }
    }

    @Override
    public User getById(int id) {
        return UserStorage.users.get(id);
    }

    @Override
    public List<User> getAll() {
        return UserStorage.users;
    }
}
