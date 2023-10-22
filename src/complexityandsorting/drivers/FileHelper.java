package complexityandsorting.drivers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileHelper {
    Path filePath;

    String fileContents;
    String[] contentsSplit;

    public FileHelper(String filePath) throws IOException
    {
        // Create a Path object from the filePath
        // Read the contents of the file into a String
        this.filePath = Path.of(filePath);
        fileContents = Files.readString(this.filePath);

        SplitContents();
    }

    public String[] GetContentsSplit()
    {
        return this.contentsSplit;
    }

    public int GetAmountOfShapes()
    {
        return Integer.parseInt(contentsSplit[0]);
    }

    private void SplitContents()
    {
        contentsSplit = fileContents.split(" ");
    }
}
