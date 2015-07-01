package be.vdab;

import be.vdab.domain.User;
import be.vdab.repository.UserRepository;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by jeansmits on 30/06/15.
 */
@Named
@RequestScoped
public class UserBean {
    @Inject
    private UserRepository userRepository;

    private User user = new User();

    public User getUserById(int id){
         return userRepository.findUserById(id);
    }
    public String addUser(){
        userRepository.save(user);
        return "allusers";
    }

    public User getUser() {
        return user;
    }
}
