package catalogcard;

import java.util.*;

public class App {

    Scanner input = new Scanner(System.in);
    ArrayList<CatalogCard> cat = new ArrayList<>();

    public String choice() { // Method to show choices
        System.out.println("---------------------***--------------------------");
        System.out.println("|             1 - Add Card                        |");
        System.out.println("|             2 - Edit Card                       |");
        System.out.println("|             3 - Remove Card                     |");
        System.out.println("|             4 - View Card/s                     |");
        System.out.println("--------------------***---------------------------");
        System.out.print("Please Enter Your Choice: ");
        String choice = input.nextLine();

        return choice;
    }

    public void addCard() { // Method for Adding Card into list
        CatalogCard card = new CatalogCard(); // Initializing an object card

        // Asking inputs from the user to add
        System.out.print("Card ID: ");
        card.setCardID(input.nextLine());
        System.out.print("Book Title: ");
        card.setBookTitle(input.nextLine());
        System.out.print("Book Author: ");
        card.setBookAuthor(input.nextLine());
        System.out.print("Year Published: ");
        card.setYearPublished(input.nextLine());
        System.out.print("Publisher: ");
        card.setPublisher(input.nextLine());
        System.out.println("Successfully Added!");

        cat.add(card); // Adding an element into ArrayList
    }

    public void editCard() { // Method for Editing the elements in the List 
        if (cat.isEmpty()) { //Condition to check if the the list is empty
            System.out.println("Please Add Card First");
        } else {
            System.out.print("Please Enter ID:"); // Asking Id wanted to edit
            String id = input.nextLine();
            String message = ""; //Empty string for message
            for (int i = 0; i < cat.size(); i++) {  // Looping to check every element in  the ArrayList 
                if (id.equals(cat.get(i).getCardID())) { //Checking if the Id inputted is equal to the Id stored

                    //Asking inputs to edit
                    System.out.print(" New Card ID: ");
                    cat.get(i).setCardID(input.nextLine());
                    System.out.print(" NewBook Title: ");
                    cat.get(i).setBookTitle(input.nextLine());
                    System.out.print(" New Book Author: ");
                    cat.get(i).setBookAuthor(input.nextLine());
                    System.out.print(" New Year Published: ");
                    cat.get(i).setYearPublished(input.nextLine());
                    System.out.print(" New Publisher: ");
                    cat.get(i).setPublisher(input.nextLine());
                    // Method to edit the specified element
                    message = " Edited Successfully!";
                } else {
                    message = "Not found!";
                }
            }
            System.out.println(message);

        }

    }

    public void removeCard() { // Method to remove card in the list
        if (cat.isEmpty()) {  //Condition to check f the list is empty
            System.out.println("Please Add Card First");
        } else {
            System.out.print("Please Enter ID:"); // Asking Id to be remove
            String id = input.nextLine();
            String message = "";
            for (int i = 0; i < cat.size(); i++) {  // Looping to check every element in  the ArrayList
                if (id.equals(cat.get(i).getCardID())) { // Checking if the Id inputted is equal to the Id stored
                    cat.remove(cat.get(i)); // Method used to remove specific element in the list
                    message = " Successfully deleted!";
                } else {
                    message = "Not found!";
                }
            }
            System.out.println(message);
        }

    }

    public void viewCard() {//Method to view Cards 

        if (cat.isEmpty()) { //Condition to check if the list is empty
            System.out.println("Please Add Card First");
        } else {
            //Choices to view input
            System.out.println("1. View Card by Id");
            System.out.println("2. View All");
            System.out.print("Please Choose:"); //Asking Id
            String choice = input.nextLine();

            if (choice.equals("1")) { // Checking if the input is by Id

                System.out.print("Please Enter ID:"); //Asking Card Id to view
                String id = input.nextLine();
                String message = "";

                for (int i = 0; i < cat.size(); i++) { // Looping to check every element in  the ArrayList

                    if (id.equals(cat.get(i).getCardID())) { // Condition to check if the Id inputted is equal to Id already stored
                        message = "ID: " + cat.get(i).getCardID() + " " + "Book Title: "
                                + cat.get(i).getBookTitle() + " "
                                + "Book Author: " + cat.get(i).getBookAuthor()
                                + "\nYear Published: " + cat.get(i).getYearPublished()
                                + " " + "Publisher: " + cat.get(i).getPublisher();
                        break;
                    } else {
                        message = "Not found!";
                    }
                }
                System.out.println(message);
            } else if (choice.equals("2")) { // Condition to check  if the input choice is viewing all
                Collections.sort(cat); //Sorting the element
                for (int i = 0; i < cat.size(); i++) {  // Looping to check every element in  the ArrayList
                    System.out.println("ID: " + cat.get(i).getCardID()
                            + " " + "Book Title: " + cat.get(i).getBookTitle()
                            + " " + "Book Author:" + cat.get(i).getBookAuthor()
                            + " " + "Year Published: " + cat.get(i).getYearPublished()
                            + " " + "Publisher: " + cat.get(i).getPublisher());

                }
            } else {
                System.out.println("Not found!");
            }

        }

    }

}
