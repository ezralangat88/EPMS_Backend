package hrms.org.Services;

import hrms.org.User.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);

    User getUser(String email);

    List<User> getAllUsers();
}
