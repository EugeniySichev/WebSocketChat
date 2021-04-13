package com.example.WebSocketChat.storage;

import java.util.Set;

public class UserStorage {

    private static UserStorage instance;
    private Set<String> users;

    private UserStorage(){

    }

    public static synchronized UserStorage getInstance(){
        if(instance == null){
            instance = new UserStorage();
        }
        return instance;
    }

    public Set<String> getUsers(){
        return users;
    }

    public void setUsers(String userName) throws Exception {
        if(users.contains(userName)){
            throw new Exception("user already exists with userName: " + userName);
        }
        users.add(userName);
    }
}
