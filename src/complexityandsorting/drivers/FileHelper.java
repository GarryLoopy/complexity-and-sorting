package complexityandsorting.drivers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Class mainly for prepping a contents of a file for creating shapes
 * @author Garry Jr
 */
public class FileHelper {
    Path filePath;

    String fileContents;
    String[] contentsSplit;

    /**
     * Constructor for the file helper
     * @param filePath the file path for the objects
     * @throws IOException thrown if the file path is invalid or not found
     */
    public FileHelper(String filePath) throws IOException
    {
        // Create a Path object from the filePath
        // Read the contents of the file into a String
        this.filePath = Path.of(filePath);
        fileContents = Files.readString(this.filePath);
        
        // Splits contents
        SplitContents();
    }

    /**
     * Gets the contents of the file split by a delimiter
     * @return the contents of the file that is split
     */
    public String[] GetContentsSplit()
    {
        return this.contentsSplit;
    }

    /**
     * Gets the amount of shapes in the file
     * @return
     */
    public int GetAmountOfShapes()
    {
        return Integer.parseInt(contentsSplit[0]);
    }
    
    /**
     * Splits the content of the file by " " delimiter
     */
    private void SplitContents()
    {
        contentsSplit = fileContents.split(" ");
    }
}
