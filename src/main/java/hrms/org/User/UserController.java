package hrms.org.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    /** Read & List */
    @GetMapping("/user")
    public List<User> getUsers(){
        return userRepository.findAll();
    }
    /** Save */

    /** Update */

    /** Delete */
}
