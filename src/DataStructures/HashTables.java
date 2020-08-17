package DataStructures;

import java.util.Arrays;

public class HashTables {
    // Offers fast insertion and searching
    //limited in size because they are based on arrays
    //key values are assigned to elements in a hast table using hash function
    // hash function helps calculate the best index an item should go in - its job is to store values in an array with limited size
   // i want info with this id -> calcuation (id provides the exact index for the information) - > hashtable (goes directly to the array location) - > sends back to the user

    String [] theArray;
    int arraySize;
    int itemsInAArray = 0;
    public static void main(String[] args) {
        //create array with 30 empty spaces
        HashTables theFunc = new HashTables(30);
        String [] elementsToAdd = {"1", "5", "17", "21", "26"};
        theFunc.hashFunction1(elementsToAdd,theFunc.theArray);
        theFunc.displayTheStack();


    }

    //hashfunction - put values in the same index where it matches the value
    public void hashFunction1(String[] stringsForArray, String [] theArray){
        for (int n = 0; n < stringsForArray. length; n++){
            //inforation that is stored inside the array that is passed over
            String newElementVal = stringsForArray[n];
            //whatever is stored in the array and storing it in that index. - this is the hashfunction part
            theArray[Integer.parseInt(newElementVal)]=newElementVal;
        }
    }
    public void hashFunction2(String[] stringsForArray, String [] theArray) {
        for (int n = 0; n< stringsForArray.length; n++){
            String newElementVal = stringsForArray[n];
            int arrayIndex = Integer.parseInt(newElementVal) % 29;
            System.out.println("Modulus index = " + arrayIndex + " for value " + newElementVal);
//            while(theArray[arrayIndex != "-1"]){
//                ++arrayIndex;
//                System.out.println("Collision, try " + arrayIndex + "instead");
//                arrayIndex %= arraySize;
//
//            }
            theArray[arrayIndex]= newElementVal;
        }
    }

        HashTables(int size){
        arraySize = size;
        theArray = new String [size];
        Arrays.fill(theArray, "-1");
    }

    public void displayTheStack(){
        int increment = 0;
        for (int m = 0; m < 3; m++){
            increment += 10;
            for (int n = 0; n< 71; n++){
                System.out.println("-");
                System.out.println();
            }
            for (int n = increment - 10; n < increment; n++){
                System.out.printf("| %3s " + " ", n);
            }
            System.out.println("|");
            for (int n = increment - 10; n< increment; n++){
                if (theArray[n].equals("-1"))
                    System.out.print("|     ");
                else
                    System.out.print(String.format("| %3s " + " ", theArray[n]));
            }
            System.out.println("|");
            for (int n = 0; n< 71; n++){
                System.out.print("-");
                System.out.println();
            }

        }

    }


}
