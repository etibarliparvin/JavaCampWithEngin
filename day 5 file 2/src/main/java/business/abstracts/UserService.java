package business.abstracts;

import entity.concretes.User;

import java.util.List;

public interface UserService {
    boolean register(User user);

    public void login(String email, String password);

    void delete(User user);

    User getById(int id);

    List<User> getAll();
}
