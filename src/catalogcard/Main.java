/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catalogcard;

import java.util.*;

/**
 *
 * @author 2ndyrGroupB
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        App app = new App(); // Initializing app

        while (true) { //Loop to ask input forever
            switch (app.choice()) { // A selection control
                case "1":
                case "Add Card":
                    app.addCard(); // Calling the addCard method
                    break;
                case "2":
                case "Edit Card":
                    app.editCard(); // Calling the editCard method
                    break;
                case "3":
                case "Remove Card":
                    app.removeCard(); //Calling the removeCard method
                    break;
                case "4":
                case "View Card":
                    app.viewCard(); //Calling the viewCard method
                    break;
                default:
                    break;
            }
        }
    }

}
