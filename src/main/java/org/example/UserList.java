package org.example;

import java.util.*;

public class userList {

    String dbName = "users.txt";
    UserDatabase db;

    // Här lagras användare med hjälp av sina unika ID
    HashMap<Integer, User> users;

    public userList() {
        users = new HashMap<Integer,User>();
        db = new UserDatabase(dbName);
    }

    public void addUser(User user) {
        users.put(user.getId(), user);
    }

    public ArrayList<User> searchUsersByE_Name(String e_Name) {
        ArrayList<User> resultat = new ArrayList<>();
        for (User obj : users.values()) {
            if (obj.getE_Name().toLowerCase().contains(e_Name.toLowerCase())) {
                resultat.add(obj);
            }
        }
        return resultat;
    }

    public Collection<User> retrieveUserList() {
        users = new HashMap<Integer, User>();
        Collection<User> fromDb = db.retrieveUsers();
        for (User obj : fromDb) {
            users.put(obj.getId(), obj);
        }
        return getUsers();
    }

    public void storeUserList() {
        if (!users.isEmpty()) {
            db.storeUsers(users.values());
        }
    }

    public ArrayList<User> searchUsersByAge(int age) {
        ArrayList<User> resultat = new ArrayList<>();
        for (User obj : users.values()) {
            if (obj.getAge() == age) {
                resultat.add(obj);
            }
        }
        return resultat;
    }

    public ArrayList<User> getUsersByE_Name(String e_Name) {
        ArrayList<User> resultat = new ArrayList<>();
        for (User obj : users.values()) {
            if (obj.getE_Name().equalsIgnoreCase(e_Name)) {
                resultat.add(obj);
            }
        }
        return resultat;
    }

    public User getUserById(int userId) {
        return users.get(userId);
    }
    public void removeUser(int id) {
        users.remove(id);
    }

    public Collection<User> getUsers() {
        return users.values();
    }

    public Collection<User> sortByE_Name() {
        List<User> aList = new ArrayList<>(users.values());
        sortera(aList);
        Collection<User> c = aList;
        return c;
    }

    private void sortera(List<User> list) {
        boolean sorterad = false;
        User temp;

        while (!sorterad) {
            sorterad = true;
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i).getE_Name().compareTo(list.get(i + 1).getE_Name()) > 0) {
                    temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                    sorterad = false;
                }
            }
        }
    }
}