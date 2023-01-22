//package hrms.org.Services;
//
//import hrms.org.User.User;
//import hrms.org.User.UserRepository;
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//
//import javax.transaction.Transactional;
//import java.util.List;
//
//@Service
//@Transactional
//@RequiredArgsConstructor
//@Slf4j
//public class UserServiceImplementation implements UserService, UserDetailsService {
//    private final UserRepository userRepository;
//    private final PasswordEncoder passwordEncoder;
//
//    @Override
//    public User saveUser(User user) {
//        return null;
//    }
//
//    @Override
//    public User getUser(String email) {
//        return null;
//    }
//
//    @Override
//    public List<User> getAllUsers() {
//        return null;
//    }
//
//    @Override
//    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
//        User user = userRepository.findByEmail(email);
//
//        if (user == null) {
//            log.error("User not found in the database");
//            throw new UsernameNotFoundException("User not found");
//        } else {
//            log.info("User found in the database{}", email);
//        }
//
//        return null;
//    }
//}
