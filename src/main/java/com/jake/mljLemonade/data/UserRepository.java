package com.jake.mljLemonade.data;

import com.jake.mljLemonade.models.UserEntry;
import com.jake.mljLemonade.models.UserInfo;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserRepository {
    private List<UserEntry> allEntries = new ArrayList<>();

    public List<UserEntry> getAllEntries(){
        return allEntries;
    }
    public void addEntry(UserEntry userEntry){
        allEntries.add(userEntry);
    }

    public UserEntry getLastEntry(){
        UserEntry last = this.allEntries.get(this.allEntries.size() - 1);
        return last;
    }

    private List<UserInfo> allUsers = new ArrayList<>();

    public List<UserInfo> getAllUsers(){
        return allUsers;
    }

    public void addUser(UserInfo userInfo){
        allUsers.add(userInfo);
    }

    public UserInfo getLastUser(){
        UserInfo last = this.allUsers.get(this.allUsers.size()-1);
        return last;
    }

}