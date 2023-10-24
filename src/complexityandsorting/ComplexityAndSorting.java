package complexityandsorting;

import java.util.HashMap;
import java.util.Map;

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
    
    static String[] possibleSortArguments = new String[] {
        "b",
        "s",
        "i",
        "m",
        "q",
        "z"
    };
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        if (args.length != 3)
        {
            System.out.println("Must have an argument of 3, found " + args.length);
            System.out.println("The arguments allowed are:");
            System.out.println("-f or -f followed by filename or path");
            System.out.println("-t or -T followed by v/V (volume), h/H (height) or b/B (base area)");
            System.out.println("-s or -s followed by b/B (Bubble sort), s/S (Selection sort), i/I (Insertion sort), m/M (Merge sort), q/Q (Quick sort) or z/Z (Heap sort)");
            return;
        }
        
        InitializeDictionary();
        CheckForSortInput(args);
        
        

    }
    
    private static boolean CheckForSortValidity(Map<String, String> userInput)
    {
        String argument = userInput.get(sortArgument);
        
        for (String str : possibleSortArguments)
        {
            if (str.equalsIgnoreCase(argument))
                return true;
        }
        
        return false;
    }
    
    private static void CheckForSortInput(String[] args)
    {
        String currentValue;
        for (String str : args)
        {
            currentValue = str.substring(0, 2);
            
            if (userInput.containsKey(currentValue))
            {
                userInput.put(currentValue, str.substring(2));
            }
            else
            {
                System.out.println(currentValue + " is not a valid argument");
            }
        }
    }
    
    private static void InitializeDictionary()
    {
        userInput = new HashMap<>();
        
        userInput.put(typeArgument, "");
        userInput.put(fileArgument, "");
        userInput.put(sortArgument, "");
    }
}
