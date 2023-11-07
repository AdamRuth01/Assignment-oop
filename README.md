# Submission task OOP

## Linux environment
### How to run the program in Linux:

## Linux/Ubuntu/Java installation
#### 
1. Install Ubuntu: Ubuntu can be installed by PowerShell.
2. Use the (wsl -- install ) designation, (The Windows Subsystem for Linux),to install a Linux distribution (Such as, Ubuntu).
3. When Ubuntu installation is complete. Create a "Username" and a "password".
4. In Ubuntu check if java is installed and which version of java is downloaded. Use designation (java -version) to examine if the java program already exist and which version is available on the computer.
5. If java do not exist: Use distro/package manager: Use designation (sudo apt-get update) "Then you need to enter password for Ubuntu, to make the download completed".
6. Next designation to type in is: `(sudo apt install openjdk-19-jdk-headless)`. You can install more types of java versions by enter
designation `(sudo update-alternatives --config java)`. 
7. Then chose which version you want, auto or manual will of the versions will pop up as a choice! Please enter the  auto version.

## Commands and intro in ubuntu:
## How to run a program in linux:

#### Commandos in Ubuntu:

- The use designation (clear) to delete the recent text on the screen. Making the Ubuntu environment more present to work in "without distractions".
- Commando `ls` is used for list all the "maps" and "katalogs" in the folder we are in.
- Commando `pwd` point out where we stand! In which folder. 
- Commando `cd` "change directory"
- Commando `cd` with a `/`: --> `cd /` where `/` means the root, so with command basically takes you to the c-drive in windows. "As far out as possible".
- Then in Ubuntu the standard directory/search-way will change, this will upper (yourUsername@Laptop-G8HVHR4T:/$). This is the standard directory "yourUsername@Laptop-G8HVHR4T:~$".
1. Afterward type in ls then you will receive all the folders in your root catalog.
2. Give commando `cd` once again to make the search-way get back to standar "Not root search". Standard = "`yourUsername@Laptop-G8HVHR4T:~$`".
3. `mkdir` = "`Make directory`". 
4. Give commando `mkdir java_program_1` then enter. If nothing happens then the mkdir its completed.
5. Give command `ls`!
6. The `ls` result should be java_program_1!
7. Congrats you have now created a map!
8. Give commando `cd java_program_1/` to jump into the file!
9. The `cd java_program_1/` result would be `~/java_program_1$`
10. NOW ARE YOU READY TO RUN A JAVA PROGRAM IN LINUX!
11. The latest result `~/java_program_1$` Give commando `nanao`! nano is a text editing program. After nano a filename or chose a filename if it exists. `~/java_program_1$ nano HelloWorld.java`. 
12. Then you have created a platform to write your java program and run it. It will pop up a window. 
13. When you write the java code it needs to be exact, to be abel to run.
14. For example write `"Hello world"`. 
15. Afterward you have different options on the lower part of the screen. Chose option `^X for exit`. Klick and hold --> `Ctrl + X`!
16. Then klick enter for YES! Then the file name will upper and just click enter to continue. 
17. Use commando `nano cat HelloWorld.java` then press enter!
18. What will upper on the screen is the full code printed. 
19. If you want to change the name of the file you can use command `mv HelloWorld.java HelloWorld_1`. 
20. You have now changed the file name.
## Compile the program: 
- When you stand in file `java_program_1$` write `javac HelloWorld.java`.
## Run the java program:
- To run the program type in `java HelloWorld`
- The result will be out printed on the screen.

## How to run the program in intellij
To begin with, I would like to introduce the different classes:
 ###   -  `Main.java`
_Class Description_:
- >What the main methods function is: 
- >In main a new object of class `Main` called `runner` was created and the methode `mainMenu` is called.

### _Methods/Functions in MinClass_:
- > `mainMenu` (The mainMenu methode is a private methode.The very idea is to use a menu of 11 options to coordinate out
in witch methode the user chose to call. The mainMenu is depended and later on called the underlying method menuSelection (what the user don't see on the console itself))
 

- > `menuSelection` (Menu selection is the underlying method for mainMenu, and coordinate to different methods to call for the function that has been chosen) in the mainMenu().

- 


### - `UserList`
_Class Description_: 
- >`UserList` has three class variables
  > - `String dbName = "users.txt";` 
 _Description:_ `dbName` is the Class variable which contains storage of the actual text file that we created.
  > - `UserDatabase db;`
 _Description:_ `db` is used in three methods:
  > - `db` is used in `userList()` where the bridge to the database and retrieval of the text file for userList(). "Where you store the users that's already added"
  > - `db` is used in `Collection` in the method `retrieveUserList()` 
  > - `db` is used in `storeUserList()` to store the actual list that has been created and collect from local Variable hashMap `users`
  > - `HashMap<Integer, User> users;`
 _Description:_ `HashMap<Integer, User> users;` Is used in every single method in `UserList` except from `sorterawhere()` the hashMap already is stored in the parameter from method `sortByE_Name()` 

_main description of the class `UserList`_: 

> Is the intermediary to the `User()` class --> "constructor and toString" and the receiver and returner of the main class methods themselves.
> Storage, editing and sorting are properties that `UserList()` possesses.
> 


 ### - `UserDatabase`
_Class Description_:



 

 ### - `User`
_Class Description_:
> `Class User` is  where we store constructor,getters and setters and in the end the toString.
>





## How clean code is applied and what principals are used



 
