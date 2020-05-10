package books;

import books.Author;
import books.LibraryBook;

import java.util.Arrays;

public class ArraysLecture {
    public static void main(String[] args) {
        // What's the same about arrays from JavaScript and arrays in Java?
        // Arrays are collections of data!
        // They are 0 indexed! (to access the third element, I need to access the array at the index point of?)
        // We can save arrays to variables!

        // What's different?
        // How we instantiate arrays. In JS: let arr = ["banana",77, {name: "Bill", job: "computer man"}];
        // In Java:
        int[] nums = new int[5];
//        boolean[] bools = new boolean[2];
        // This will instantiate an array with 5 elements;

         System.out.println(nums[0]); // What will I get from this sout?
//        System.out.println(bools[1]);

        // Let's set values for our array elements using a loop!

        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 1;
//            System.out.println(nums[i]);
        }

        // We see that iterating through an array with a for loop is similar to JS.

//         System.out.println(nums[3]); // What will I get from this sout?

//         System.out.println(nums[99]); // What would I have gotten from this in JavaScript? Now?

        int[] otherNums = {6, 7, 8, 9};
        // This will instantiate an array with 4 pre-defined elements.

//         System.out.println(otherNums[1]); // What do is see printed from this sout?
//        System.out.println(otherNums[4]); // What do is see printed from this sout?

        // Let's get a bit more complicated. :)

        LibraryBook garfield = new LibraryBook("Garfield Loses His Feet", "Jim Davis", 1984, "Random House");
        LibraryBook hunchback = new LibraryBook("The Hunchback of Notre-Dame", "Victor Hugo", 1831, "Gosselin");
        LibraryBook superfudge = new LibraryBook("Superfudge", "Judy Blume", 1980, "E. P. Dutton");
        LibraryBook grapesWrath = new LibraryBook("The Grapes of Wrath", "John Steinbeck", 1939, "The Viking Press");
        LibraryBook phantomOfOpera = new LibraryBook("The Phantom of the Opera", "Gaston Leroux", 1911, "Pierre Laie");
        LibraryBook lesMiserables = new LibraryBook("Les Misérables", "Victor Hugo", 1862, "Librairie internationale A. Lacroix, Verboeckhoven, et Cie.");

        //initializing the array
        LibraryBook[] library = new LibraryBook[5];

        library[0] = garfield;

//        System.out.println(library[0].getTitle()); // What do I see in this sout?
//        System.out.println(library[1]); // What do I see in this sout? - nothing because it has not been initialized

        library[1] = hunchback;
        library[2] = superfudge;
        library[3] = grapesWrath;
        library[4] = phantomOfOpera;

        // We have the ability to iterate through arrays similar to our for of loops in JS!

        for (LibraryBook book : library) {
            String title = book.getTitle();
            String author = book.getAuthor();
//            System.out.format("'%s' by %s%n", title, author);
        }

        // Let's explore the Arrays class.

        // Arrays.fill

        int[] allSevens = new int[7];
        Arrays.fill(allSevens, 7);
        for (int seven : allSevens) {
//            System.out.println(seven);
        }

        // What'll we see after uncommenting these lines of code?
    //        allSevens[2] = 8;
    //        Arrays.fill(allSevens, 7);
    //        System.out.println(allSevens[2]);

        // Arrays.equals

        int[] yetMoreSevens = {7, 7, 7, 7, 7, 7, 7};

//        System.out.println(allSevens);
//        System.out.println(yetMoreSevens);
//        System.out.println(allSevens == yetMoreSevens); // What do I see from this sout?
//        System.out.println(allSevens.length);
//        System.out.println(Arrays.equals(allSevens, yetMoreSevens)); // What do you think the equals method evaluates?

        // Arrays.toString

//        System.out.println(allSevens); // What do I see from this sout?
//        System.out.println(Arrays.toString(allSevens)); // What does the Arrays.toString do?

        // Arrays.sort

        int[] aMess = new int[]{34, 88, 42, 17, 22, 19, 24};

        Arrays.sort(aMess);
//        System.out.println(Arrays.toString(aMess)); // What order would I expect to see?

        // Arrays.copyOf

//        library[5] = lesMiserables; // What happens when I uncomment this line?

        library = Arrays.copyOf(library, library.length + 1);
//        System.out.println(library.length);

        library[5] = lesMiserables;
        for (LibraryBook book : library) {
            String title = book.getTitle();
            String author = book.getAuthor();
//            System.out.format("'%s' by %s%n", title, author);
        }

        // Two-Dimensional Arrays
//        System.out.println(funnyJoke);


        int[][] twoDExample = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };


        // accessing individual elements:
        // arr[num1][num2]
        // arr name of the 2D array.
        // num1 = The row of the 2D array, Selecting the array within the array.
        // num2 = The element of the array within the array.

        // How can we sout the numbers 1, 6, and 8?
//        System.out.println(twoDExample[0][0]);
//        System.out.println(twoDExample[1][2]);
//        System.out.println(twoDExample[2][1]);


        for (int[] row : twoDExample) {
            System.out.println("+---+---+---+");

            System.out.print("| ");

            for (int n : row) {
                System.out.print(n + " | ");
            }

            System.out.println();
        }

        System.out.println("+---+---+---+");

    }

}