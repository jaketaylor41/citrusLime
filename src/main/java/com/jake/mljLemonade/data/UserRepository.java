package com.jake.mljLemonade.data;

import com.jake.mljLemonade.models.UserEntry;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserRepository {
    private List<UserEntry> allEntries = new ArrayList<>();

    public List<UserEntry> getAllEntries(){
        return allEntries;
    }
    public void addEntry(UserEntry mathEntry){
        allEntries.add(mathEntry);
    }
}