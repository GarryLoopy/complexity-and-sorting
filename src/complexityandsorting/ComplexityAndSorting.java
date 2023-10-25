package complexityandsorting;

import complexityandsorting.drivers.FileHelper;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import complexityandsorting.drivers.ShapeHelper;
import java.util.Comparator;
import complexityandsorting.utilities.Shape;
import complexityandsorting.drivers.Sort;

import complexityandsorting.drivers.ShapeVolumeCompare;
import complexityandsorting.drivers.ShapeBaseAreaCompare;
import java.lang.reflect.InvocationTargetException;

/**
 *
 * @author Garry Jr Dayag
 * @author Kevin Wong
 * @author Zacharia Osman
 */
public class ComplexityAndSorting {
    
    // Dictionary for holding user input
    static Map<String, String> userInput;
    
    // Possible arguments
    static String typeArgument = "-t";
    static String fileArgument = "-f";
    static String sortArgument = "-s";
    
    // Possible sort arguments
    static String[] possibleSortArguments = new String[]{
        "b", // Bubble
        "s", // Selection
        "i", // Insertion
        "m", // Merge
        "q", // Quick
        "z" // Heap
    };
    
    // Possible type of data arguments
    static String[] possibleTypeArgument = new String[]{
        "v", // Volume
        "h", // Height
        "a" // Base area
    };
    
    // Flag for controlling whether to run the program or not
    static boolean typeFlag = true;
    static boolean sortFlag = true;
    static boolean argumentFlag = true;
    static boolean fileFlag = true;
    

    // Helpers
    static FileHelper fileHelper;
    static ShapeHelper shapeHelper;

    /**
     * Main entry of the program
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        args[1]=  "-tv";
        args[0] = "-sb";
        args[2] = "-fsrc\\data\\polyfor1.txt";
        
        // Check for length
        if (!CheckForLength(args)) {
            return;
        }
        
        // Initialize Dictionary
        InitializeDictionary();
        
        //Checks for validities
        CheckForValidities(args);
        
        // Checks if arguments are valid, exits if invalid
        if (!(typeFlag && argumentFlag && fileFlag && sortFlag)) {
            System.out.println("Program did not run");
            System.out.println("Please ensure that you have the proper arguments");
            return;
        }
        
        try {
            // Create a new shape helper
            shapeHelper = new ShapeHelper(fileHelper);
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | InvocationTargetException ex) {
            System.out.println(ex.getMessage());
        }
        
        // Run sorts
        long elapsedTime = RunSort();
        
        //Print shapes
        shapeHelper.PrintShapes();
        
        PrintFinalMessages(elapsedTime);

    }
    
    private static void PrintFinalMessages(long elapsedTime)
    {
        String typeOfSort = "";
        String dataTypeUsed = "";
        int amountOfShapes = fileHelper.GetAmountOfShapes();
        
        switch (userInput.get(typeArgument))
        {
            case "v" -> dataTypeUsed = "volume";
            case "a" -> dataTypeUsed = "base area";
            case "h" -> dataTypeUsed = "height";
        }
        
        switch (userInput.get(sortArgument))
        {
            case "b" -> typeOfSort = "Bubble";
            case "i" -> typeOfSort = "Insertion";
            case "s" -> typeOfSort = "Selection";
            case "m" -> typeOfSort = "Merge";
            case "q" -> typeOfSort = "Quick";
            case "z" -> typeOfSort = "Heap";
        }
        
        // Print fancy message
        System.out.println("Sorted " + amountOfShapes + " shapes by " + dataTypeUsed + " using " + typeOfSort + " sort");
        
        //Print Elapsed time
        System.out.print("Elapsed time: " + elapsedTime + " milliseconds\n");
    }
    
    /**
     * Initiates which sorting algorithm to run via height, volume or base area
     * Returns elapsed time
     */
    private static long RunSort() {
        // Gets user input
        String userInputType = userInput.get(typeArgument).toLowerCase();
        
        long elapsedTime = 0;
        
        // Checks whether to sort via height, area or volume
        if (userInputType.equalsIgnoreCase("h")) {
            RunSortForShapes();
        } else {
            switch (userInputType) {
                case "v" ->
                    elapsedTime = RunSortForShapes(new ShapeVolumeCompare());
                case "a" ->
                    elapsedTime = RunSortForShapes(new ShapeBaseAreaCompare());

            }
        }
        
        return elapsedTime;
    }
    
    /**
     * Runs all the required validity tests
     * @param args the arguments of the user
     */
    private static void CheckForValidities(String[] args) {
        // Checks for input
        argumentFlag = CheckForInput(args);
        
        // Checks for sort argument
        sortFlag = CheckForSortValidity();
        
        // Checks for type of data argument
        typeFlag = CheckForTypeValidity();
        
        // Checks for file argument
        fileFlag = CheckForFileValidity();
    }

    /**
     * Checks for length of array, prints a helpful message if invalid
     * @param args the arguments of the user to check
     * @return true if the argument is of proper length else false
     */
    private static boolean CheckForLength(String[] args) {
        if (args.length != 3) {
            System.out.println("Must have an argument of 3, found " + args.length);
            System.out.println("The arguments allowed are:");
            System.out.println("-f or -f followed by filename or path");
            System.out.println("-t or -T followed by v/V (volume), h/H (height) or a/A (base area)");
            System.out.println("-s or -s followed by b/B (Bubble sort), s/S (Selection sort), i/I (Insertion sort), m/M (Merge sort), q/Q (Quick sort) or z/Z (Heap sort)");
            return false;
        }

        return true;
    }
    
    /**
     * Runs the sorting algorithm via the given argument for sort
     */
    private static void RunSortForShapes() {
        // Gets shape
        Shape[] data = shapeHelper.GetShapes();
        
        // Gets amount of data
        int amountOfData = data.length;
        
        // Calls the proper method for sorting via given argument
        switch (userInput.get(sortArgument)) {
            case "b" ->
                Sort.Bubble(data);
            case "s" ->
                Sort.Selection(data);
            case "i" ->
                Sort.Insertion(data);
            case "m" ->
                Sort.Merge(data);
            case "q" ->
                Sort.Quick(data, 0, amountOfData - 1);
            case "z" ->
                Sort.Heap(data);
        }
    }
    
    /**
     * Runs the sorting algorithm via the given argument for sort
     * @param comparator the comparator used to sort the data
     * @return elapsed time
     */
    private static long RunSortForShapes(Comparator<Shape> comparator) {
        // Gets shape
        Shape[] data = shapeHelper.GetShapes();
        
        // Amount of data
        int amountOfData = data.length;
        
        // Start time
        long startTime = System.currentTimeMillis();
        
        // Calls the proper method for sorting via given argument
        switch (userInput.get(sortArgument)) {
            case "b" ->
                Sort.Bubble(data, comparator);
            case "s" ->
                Sort.Selection(data, comparator);
            case "i" ->
                Sort.Insertion(data, comparator);
            case "m" ->
                Sort.Merge(data, comparator);
            case "q" ->
                Sort.Quick(data, 0, amountOfData - 1, comparator);
            case "z" ->
                Sort.Heap(data, comparator);
        }
        // End time
        long endTime = System.currentTimeMillis();
        
        return endTime - startTime;
    }
    
    /**
     * Checks if file is valid, instantiates file helper if valid
     * @return true is file is valid else false
     */
    private static boolean CheckForFileValidity() {
        // Gets file path
        String filePath = userInput.get(fileArgument);
        
        // Try opening the file, instantiates file helper
        try {
            fileHelper = new FileHelper(filePath);
        } catch (IOException ex) {
            System.out.println("The path \"" + filePath + "\" is not found");
            return false;
        }

        return true;
    }
    
    /**
     * Checks if type of data given is valid
     * @return true if type of data is valid else false
     */
    private static boolean CheckForTypeValidity() {
        // Gets current user input for type
        String argument = userInput.get(typeArgument);
        
        // Flag to check for validity
        boolean flag = false;
        
        // Checks if argument is valid
        for (String str : possibleTypeArgument) {
            if (str.equalsIgnoreCase(argument)) {
                flag = true;
            }
        }

        if (flag) {
            return true;
        } else {
            System.out.println("Argument for " + argument + " is not a valid type argument");
            return false;
        }
    }
    
    /**
     * Checks if the sort input is a valid argument
     * @return true if the argument is valid else false
     */
    private static boolean CheckForSortValidity() {
        // Gets current argument
        String argument = userInput.get(sortArgument);
        
        // A flag to determine validity
        boolean flag = false;
        
        // Checks for possible arguments
        for (String str : possibleSortArguments) {
            if (str.equalsIgnoreCase(argument)) {
                flag = true;
            }
        }
        
        
        if (flag) {
            return true;
        } else {
            System.out.println("Argument for " + argument + " is not a valid sort argument");
            return false;
        }
    }
    
    /**
     * Checks the user inputs
     * @param args
     * @return false if an invalid input it found else true
     */
    private static boolean CheckForInput(String[] args) {
        // Loop through user inputs
        for (String str : args) {
            // Gets the first two characters
            String currentValue = str.substring(0, 2);
            
            // Checks if user input is a valid input
            if (userInput.containsKey(currentValue)) {
                userInput.put(currentValue, str.substring(2));
            } else {
                System.out.println("Argument for " + currentValue + " is not a valid argument");
                return false;
            }
        }

        return true;
    }
    /**
     * Initializes the dictionary with empty values ("")
     */
    private static void InitializeDictionary() {
        userInput = new HashMap<>();

        userInput.put(typeArgument, "");
        userInput.put(fileArgument, "");
        userInput.put(sortArgument, "");
    }
}
