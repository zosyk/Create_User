package store;

import models.User1;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Alekcandr on 2/28/2016.
 */
public class UserCache {
    private UserCache(){

    }
    private static final UserCache INSTANCE = new UserCache();

    private final ConcurrentHashMap<Integer, User1> users = new ConcurrentHashMap<Integer, User1>();

    public static UserCache getInstance(){
        return INSTANCE;
    }
    public Collection<User1> values(){
        return this.users.values();
    }
    public void add(final User1 user){
        this.users.put(user.getId(),user);
    }
    public void edit(final User1 user){
        this.users.replace(user.getId(),user);
    }
    public void delete(final int id){
        this.users.remove(id);
    }
    public User1 get(final int id){
        return this.users.get(id);
    }
}
