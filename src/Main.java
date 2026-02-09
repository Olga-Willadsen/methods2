import java.util.Random;
import java.util.Scanner;

public class Main {

    String [] destinations = new String [3];


    void main (){

        promptDestinations();
        showDestinations();
        randomiser();
        showDestinationByID(2);

    }

    void promptDestinations (){
        Scanner scan = new Scanner(System.in);

       /* int i=0
        while (i<destinations.length);{
            String userInput = scan.nextLine();
            i++;
        }*/

        for (int j=0; j<destinations.length;j++){
            System.out.println("please input your "+ (j+1) +". dream destination");
            String userInput = scan.nextLine();
            destinations [j]= userInput;
        }

        System.out.println("thank you for your input");

    }

    void showDestinations(){
       /* for (int i=0; i<destinations.length; i++)
            System.out.println(destinations[i]);*/

        for (String destinations:destinations){
            System.out.println(destinations);
        }
    }

    void randomiser (){
        Random r= new Random ();
        int randomNumber = r.nextInt(destinations.length);
        String randomDestinations = destinations[randomNumber];
        System.out.println("you should go to: "+randomDestinations);
    }


    void showDestinationByID (int id){
        String d = destinations[id-1];
        System.out.println(d);

    }


}

  /* int randomNum = (int)(Math.random() * 3);
        System.out.println(randomNum);
        */