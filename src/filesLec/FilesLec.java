package filesLec;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilesLec {
    public static void main(String[] args) {
        String directory = "data";
        String filename = "info.txt";
        String secondName = "grocery-list.csv";

        //where the folder is going to live
        Path dataDirectory = Paths.get(directory);
        //where the file is going to live
        Path dataFile = Paths.get(directory, filename);
        Path mySecondFile = Paths.get(directory, secondName);
        //things to write in the file
        List<String> groceryList = new ArrayList<>();
        //Arrays.asList("Coffee","Milk","Sugar");

        //adding to the arrayList<>() and rerun;
        groceryList.add("cheese");
        groceryList.add("eggs");
        groceryList.add("tomatoes");
        groceryList.add("milk");
        groceryList.add("coffee");
        groceryList.add("sugar");

        List<String> numberList = Arrays.asList("1", "2", "5", "8", "10");

//create Directory
        if (Files.notExists(dataDirectory)) {
            try {
                Files.createDirectory(dataDirectory);
            } catch (IOException exp) {
                System.out.println("problems creating the directory");
                exp.printStackTrace();
            }
        }


        //creating a directory method
        createDir(dataDirectory);

        //creating and checking a file
        createAndCheckFile(dataFile);
        createAndCheckFile(mySecondFile);

//methods to create the file
        createFile(dataFile);
        createFile(mySecondFile);

        //to write on the dataFile (info.txt)
//        try {
//            Files.write(dataFile, numberList);
//            Files.write(mySecondFile, groceryList, StandardOpenOption.APPEND);
//        } catch (IOException e) {
//            System.out.println("Problems writing the file");
//            e.printStackTrace();
//        }

        writeFile(dataFile, numberList);
        writeFile(mySecondFile, groceryList);

        //reading files
//        try {
//            List<String> lines = Files.readAllLines(dataFile);
//            for (String line : lines) {
//                System.out.println("Line = " + line);
//            }
//            List<String> groceries = Files.readAllLines(mySecondFile);
//            for (String grocery : groceries) {
//                System.out.println("grocery= " + groceries);
//            }
//        } catch (IOException e) {
//            System.out.println("problems reading the file");
//            e.printStackTrace();
//        }

        readFile(dataFile);
        readFile(mySecondFile);

//create directory
//        if (!Files.exists(dataFile)) {
//            try {
//                Files.createFile(dataFile);
//            } catch (IOException exp) {
//                System.out.println("problems creating the files");
//                exp.printStackTrace();
//            }
//        }

        //replace item method
        List<String> modifiedGrocery = replaceItem(mySecondFile, "milk", "cream");

//        for(String newLine : modifiedGrocery){
//            System.out.println("newLine = " + newLine);
//        }
        writeFile(mySecondFile, modifiedGrocery);
    }//end main class

    private static void createDir(Path aDir) {
        if (Files.notExists(aDir)) {
            try {
                Files.createDirectory(aDir);
            } catch (IOException e) {
                System.out.println("problems creating the directory/files");
                e.printStackTrace();
            }
        }
    }


    private static void createAndCheckFile(Path aFile) {
        if (Files.notExists(aFile)) {
            try {
                Files.createFile(aFile);
            } catch (IOException e) {
                System.out.println("problems creating the directory/files");
                e.printStackTrace();
            }
        }
    }


    public static void createFile(Path aFile) {
        if (!Files.exists(aFile)) {
            try {
                Files.createFile(aFile);
            } catch (IOException exp) {
                System.out.println("problems creating the files");
                exp.printStackTrace();
            }
        }

    }

    public static void writeFile(Path aFile, List<String> aList) {
        try {
            Files.write(aFile, aList);
            //Files.write(aFile,aList,StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println("problem writing the files");
            e.printStackTrace();
        }
    }

    public static void readFile(Path aFile) {
        try {
            List<String> lines = Files.readAllLines(aFile);
            for (String line : lines) {
                System.out.println("lines = " + line);
            }
        } catch (IOException e) {
            System.out.println("Porblem reading the file");
            e.printStackTrace();
        }
    }

    private static List<String> replaceItem(Path aFile, String find, String replacement) {
        List<String> newList = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(aFile);
            for (String line : lines) {
                if (line.equals(find)) {
                    //creating a new copy without milk
                    newList.add(replacement);
                    continue;
                }
                //adding everything except for the one you are looking for
                newList.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return newList;
    }


}
