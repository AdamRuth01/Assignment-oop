package org.example;
import javax.swing.*;
import java.util.*;
public class Main {
    userList users = new userList();
    /**
     * mainMenu() Is the selection fas, for the user to see the
     * different options that are available.
     * After the option is made will mainMenu() call menuSelection()
     * for forwarding and run the console choice
     */
    private void mainMenu() {
          while (true) {
              try {
              System.out.println("***Options *USER* Menu***\n"
                      + "1: Add user \n"
                      + "2: Show users\n"
                      + "3: Remove user\n"
                      + "4: Search by id\n"
                      + "5: Get users by e_name\n"
                      + "6: Search users where e_name contains a value\n"
                      + "7: Search users by age\n"
                      + "8: Store user list\n"
                      + "9: Retrieve user list\n"
                      + "10: Sort user by Las name\n"
                      + "11: Quit\n");
              Scanner scanner = new Scanner(System.in);
              int input = scanner.nextInt();
              if (input == 11) {
                  return;
              }
              menuSelection(input);
              }catch (Exception e){
                  System.out.println("Illegal input! ");
          }

      }
    }
    /**
     * menuSelection() has the function of forwarding the code
     * for the method that has been chosen by the user, (like a transfer)
     * @param selection
     */
    private void menuSelection(int selection) {
        switch (selection) {
            case 1:
                addUser();
                break;
            case 2:
                showUsers();
                break;
            case 3:
                removeUser();
                break;
            case 4:
                searchUserById();
                break;
            case 5:
                getUserByE_Name();
                break;
            case 6:
                searchUserByE_Name();
                break;
            case 7:
                searchUserByAge();
                break;
            case 8:
                storeUserList();
                break;
            case 9:
                retrieveUserList();
                break;
            case 10:
                sortUsersByE_Name();
        }
    }
    private void addUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter id f_name e_name age email ");
        String response = scanner.nextLine();
        String[] userData = response.split(" ");
        if (checkUserInput(userData)) {
            User user1 = new User(Integer.parseInt(userData[0]), userData[1], userData[2], Integer.parseInt(userData[3]), userData[4]);
            users.addUser(user1);
        }
    }
    private void showUsers() {
        Collection<User> registredUsers = users.getUsers();
        for (User aUser : registredUsers) {
            System.out.println(aUser);
        }
    }
    private void removeUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ange id ");
        int id = scanner.nextInt();
        users.removeUser(id);
    }
    private void searchUserById() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input an id for a user!");
        int id = scanner.nextInt();
        User obj = users.getUserById(id);
        if (obj == null) {
            System.out.println("Missing user with id " + id);
        } else {
            System.out.println(obj);
        }
    }
    private void getUserByE_Name() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input an existing last name for a user!");
        String e_Name = scanner.nextLine();
        ArrayList<User> registredUsers = users.getUsersByE_Name(e_Name);
        if (registredUsers.isEmpty()) {
            System.out.println("Missing user with last name " + e_Name);
        } else {
            for (User aUser : registredUsers) {
                System.out.println(aUser);
            }
        }
    }
    private void searchUserByE_Name() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input an existing last name for a user!");
        String e_Name = scanner.nextLine();
        ArrayList<User> registredUsers = users.searchUsersByE_Name(e_Name);
        if (registredUsers.isEmpty()) {
            System.out.println("Missing user with last name " + e_Name);
        } else {
            for (User aUser : registredUsers) {
                System.out.println(aUser);
            }
        }
    }
    private void searchUserByAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input an existing age for a user!");
        int age = scanner.nextInt();
        ArrayList<User> registredUsers = users.searchUsersByAge(age);
        if (registredUsers.isEmpty()) {
            System.out.println("Missing user with age " + age);
        } else {
            for (User aUser : registredUsers) {
                System.out.println(aUser);
            }
        }
    }
    private void storeUserList() {
        users.storeUserList();
    }
    private void retrieveUserList() {
        users.retrieveUserList();
        showUsers();
    }
    private void sortUsersByE_Name() {
        Collection<User> sortedUsers = users.sortByE_Name();
        for (User obj : sortedUsers) {
            System.out.println(obj);
        }
    }
    private boolean checkUserInput(String[] userInput) {
        if (userInput.length != 5) {
            System.out.println("Missing parameters");
            return false;
        }//if ()
        return true;
    }
    private void ListUsers() {
        Collection<User> registredUsers = users.getUsers();
        for (User aUser : registredUsers) {
            System.out.println(aUser);
        }
    }




    /**
     * This is the main method
     * This is where we call the function mainMenu();
     *
     * @param args
     */
    public static void main(String[] args) {
        Main runner = new Main();
        runner.mainMenu();
    }
}
