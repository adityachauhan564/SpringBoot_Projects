package com.jbdl63.digitalLibrary.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbdl63.digitalLibrary.Exceptions.DataNotFoundException;
import com.jbdl63.digitalLibrary.Model.Book;
import com.jbdl63.digitalLibrary.Model.User;
import com.jbdl63.digitalLibrary.Repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User addNewUser(User user) {
        return userRepository.save(user);
    }

    public List<Book> findAllBooksIssuedToUser(String userName) {
        User user = userRepository.findByUserName(userName);
        if (user == null) {
            throw new DataNotFoundException("User with name '" + userName + "' not found");
        }
        // Assuming User has a getter getIssuedBooks() mapped as a OneToMany relationship.
        return user.getIssuedBooks();
    }

    }
