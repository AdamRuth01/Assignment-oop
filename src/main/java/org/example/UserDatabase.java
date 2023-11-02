package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class UserDatabase {
    String database;

    public UserDatabase(String db) {
        try {
            database = System.getProperty("user.dir") + System.getProperty("file.separator") + db;
            File f = new File(database);
            if (!f.exists()) {
                f.createNewFile();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//Constructor

    public void storeUsers(Collection<User> users) {
        FileWriter userFile = null;

        try {
            userFile = new FileWriter(database, false);
            for (User obj : users) {
                String userRow = obj.getId() + " "
                        + obj.getF_Name() + " "
                        + obj.getE_Name() + " "
                        + obj.getAge() + " "
                        + obj.getEmail();

                userFile.write(userRow + "\n");

            }
            userFile.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    public Collection<User> retrieveUsers() {
        Collection<User> result = new ArrayList<>();
        File fileToRead = new File(database);
        try {
            Scanner scanner = new Scanner(fileToRead);

            while (scanner.hasNextLine()) {
                String userRow = scanner.nextLine();
                String[] userData = userRow.split(" ");

                User obj = new User(Integer.valueOf(userData[0]),
                        userData[1], userData[2], Integer.valueOf(userData[3]), userData[4]);
                result.add(obj);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return result;
    }


}//UserDatabase

