package az.iktlab.groupsipweb.service;

import az.iktlab.groupsipweb.model.Person;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class UserService {

    @PostConstruct
    public void postConsTest() {
        System.out.println("test post constructor");
        System.out.println("test post constructor");
        System.out.println("test post constructor");
        System.out.println("test post constructor");
        System.out.println("test post constructor");
        System.out.println("test post constructor");
        System.out.println("test post constructor");
    }

    Person p = new Person();
}
