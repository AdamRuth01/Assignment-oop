package org.example;
import java.util.*;
public class userList {
    String dbName = "users.txt";
    UserDatabase db;
    HashMap<Integer, User> users;
    public void addUser(User user) {
        users.put(user.getId(), user);
    }
    public void removeUser(int id) {
        users.remove(id);
    }
    public User getUserById(int userId) {
        return users.get(userId);
    }
    public Collection<User> getUsers() {
        return users.values();
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

    /**
     * This method search for a user by last name,
     * @param e_Name a last name used for search
     * @return a list of @see org.example.User matching search criteria, empty list otherwise
     */
    public ArrayList<User> searchUsersByE_Name(String e_Name) {
        ArrayList<User> resultat = new ArrayList<>();
        for (User obj : users.values()) {
            if (obj.getE_Name().toLowerCase().contains(e_Name.toLowerCase())) {
                resultat.add(obj);
            }
        }
        return resultat;
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
    public userList() {
        users = new HashMap<Integer,User>();
        db = new UserDatabase(dbName);
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
<<<<<<< Updated upstream
                //if (list.get(i).getE_Name().compareTo(list.get(i + 1).getE_Name()) > 0) {
                if (list.get(i).getE_name().toLowerCase().compareTo(list.get(i + 1).getE_name().toLowerCase()) > 0) {
=======
                if (list.get(i).getE_Name().toLowerCase().compareTo(list.get(i + 1).getE_Name().toLowerCase()) > 0) {
>>>>>>> Stashed changes
                    temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                    sorterad = false;
                }
            }
        }
    }
}
