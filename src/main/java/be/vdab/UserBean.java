package be.vdab;

import be.vdab.domain.User;
import be.vdab.repository.UserRepository;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

/**
 * Created by jeansmits on 30/06/15.
 */
@Named
public class UserBean {
    @Inject
    private UserRepository userRepository;
    private User user;

    public User getUserById(int id){
         return userRepository.findUserById(id);
    }
    public void addUser(){
        userRepository.save(user);
    }

}
