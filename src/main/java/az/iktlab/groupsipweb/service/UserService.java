package az.iktlab.groupsipweb.service;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class UserService {

    @PostConstruct
    public void  postConsTest(){
        System.out.println("test post constructor");
        System.out.println("test post constructor");
        System.out.println("test post constructor");
        System.out.println("test post constructor");
        System.out.println("test post constructor");
        System.out.println("test post constructor");
        System.out.println("test post constructor");
    }

}
