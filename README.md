# CRUD 2.0 – Bridgeworming Assignments

CRUD project with JSP, Bootstrap and MySQL, consisting in a fictitous app that manages network assignments. This second part will hold two new features: **Hashmap and ArrayList implementations**.

## The structure

All the project data is stored in a root folder called “Main”. If you go forward, you’ll find “web” and then, several subfolders inside. The appearance should be something like this:

![Folders](https://github.com/ivanmirandastavenuiter/CRUD-2.0/blob/master/pics/img-1.png)

1. **Clients, Servers, Range, Connections**: holds main tables data information, including necessary files for deleting, updating, adding and reading. It also contains css files to give them proper style and images used on the page.
2. **Find**: contains two jsp files that implement find function inserting a keyword. It will also have their respectives css files. 
3. **Source_1 and Source_2**: back up data to load right display properties when initializing (fonts, js, css and so on).
4. **Intialize jsp pages**: login, register and home.

On the other hand, java files will be stored in previous “src/java/utils” folder. It has the following information:

Image here

## Running the program

Once we know how information is handled, we should be able to run the program. First thing we need to do is going to main page login.jsp”. Here, **we’ll find the possibility of entering our user and password**. There will be three default users that will work fine to enter home page. In addition, you can also create a new profile clicking on the link below. 

**In case of error** in user or passwords, login will react depending on the situation, showing alerts giving details of the problem. More or less, it is the same on register page, where the program will warn us in case of repeating the user, if we leave empty fields or in case passwords don’t match. You can try to check it!

## Hashmap implementation

If we go to the code, we’ll find that hasmap is used here as a backup users database that saves the information about the existing profiles. The functionality is the following: if it’s first time, three default users are created. Otherwise, next ones are stored plus the initials, permanently saving and updating information. 

To allow hashmap object run between login and register pages, the next code is applied:

` jsp
session.setAttribute("credentialsFrom", credentialsFrom);
`

The receiver takes the attribute like this:

` jsp
HashMap<String, String> credentialsTo = (HashMap)session.getAttribute("credentialsFrom");
`

## Home page and main data

Once we are logged in, we’ll see a brief presentation of the company and a navegation bar that allows the user going to the point is chosen. Details are displayed then, where we can easily make the main crud operations: deleting, creating, reading and updating. Here you have some pics:

Images here

# ArrayList implementation

Ending with explanation we also have the “find” option. It is made to introduce a word that matches the client/server category field on database. So the query is ready to return the data when category matches the word you introduce. If don’t, a pop-up will alert you, explaining the available possibilities you can count with. 

So, if I type on find clients the word “movil”, the result will be:

Image here

And don’t forget! The searcher is **ci (case insensitive), which means you can type the word like you want, as long as it matches**.

Lastly, you have the option to log out in any moment in the upper-right corner. 

