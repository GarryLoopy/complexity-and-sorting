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

/**
 *
 * @author Garry Jr Dayag
 * @author Kevin Wong
 * @author Zacharia Osman
 */
public class ComplexityAndSorting {

    static Map<String, String> userInput;

    static String typeArgument = "-t";
    static String fileArgument = "-f";
    static String sortArgument = "-s";

    static String[] possibleSortArguments = new String[]{
        "b", // Bubble
        "s", // Selection
        "i", // Insertion
        "m", // Merge
        "q", // Quick
        "z" // Heap
    };

    static String[] possibleTypeArgument = new String[]{
        "v", // Volume
        "h", // Height
        "a" // Base area
    };

    static boolean flag = true;

    static FileHelper fileHelper;
    static ShapeHelper shapeHelper;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        args[0] = "-tv";
        args[1] = "-fsrc\\data\\polyfor1.txt";
        args[2] = "-sq";

        if (!CheckForLength(args)) {
            return;
        }

        InitializeDictionary();

        CheckForValidities(args);

        if (!flag) {
            System.out.println("Program did not run");
            System.out.println("Please ensure that you have the proper arguments");
            return;
        }

        shapeHelper = new ShapeHelper(fileHelper);
        
        RunSort();
        
        shapeHelper.PrintShapes();

    }

    private static void RunSort() {
        String userInputType = userInput.get(typeArgument).toLowerCase();
        if (userInputType.equalsIgnoreCase("h")) {
            RunSortForShapes();
        } else {
            switch (userInputType) {
                case "v" ->
                    RunSortForShapes(new ShapeVolumeCompare());
                case "a" ->
                    RunSortForShapes(new ShapeBaseAreaCompare());

            }
        }
    }

    private static void CheckForValidities(String[] args) {
        flag = CheckForInput(args);
        flag = CheckForSortValidity();
        flag = CheckForTypeValidity();
        flag = CheckForFileValidity();
    }

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

    private static void RunSortForShapes() {
        Shape[] data = shapeHelper.GetShapes();
        int amountOfData = data.length;
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

    private static void RunSortForShapes(Comparator<Shape> comparator) {
        Shape[] data = shapeHelper.GetShapes();
        int amountOfData = data.length;
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
    }

    private static boolean CheckForFileValidity() {
        String filePath = userInput.get(fileArgument);
        try {
            fileHelper = new FileHelper(filePath);
        } catch (IOException ex) {
            System.out.println("The path \"" + filePath + "\" is not found");
            return false;
        }

        return true;
    }

    private static boolean CheckForTypeValidity() {
        String argument = userInput.get(typeArgument);

        boolean typeFlag = false;

        for (String str : possibleTypeArgument) {
            if (str.equalsIgnoreCase(argument)) {
                typeFlag = true;
            }
        }

        if (typeFlag) {
            return true;
        } else {
            System.out.println("Argument for " + argument + " is not a valid type argument");
            return false;
        }
    }

    private static boolean CheckForSortValidity() {
        String argument = userInput.get(sortArgument);

        boolean sortFlag = false;

        for (String str : possibleSortArguments) {
            if (str.equalsIgnoreCase(argument)) {
                sortFlag = true;
            }
        }

        if (sortFlag) {
            return true;
        } else {
            System.out.println("Argument for " + argument + " is not a valid sort argument");
            return false;
        }
    }

    private static boolean CheckForInput(String[] args) {
        String currentValue;
        for (String str : args) {
            currentValue = str.substring(0, 2);

            if (userInput.containsKey(currentValue)) {
                userInput.put(currentValue, str.substring(2));
            } else {
                System.out.println("Argument for " + currentValue + " is not a valid argument");
                return false;
            }
        }

        return true;
    }

    private static void InitializeDictionary() {
        userInput = new HashMap<>();

        userInput.put(typeArgument, "");
        userInput.put(fileArgument, "");
        userInput.put(sortArgument, "");
    }
}
