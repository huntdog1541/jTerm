import javax.swing.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by dhunt on 5/21/16.
 */
public class Command_Execute {

    public Command_Execute(String command, JTextArea output)
    {
        Process p;
        try {
            p = Runtime.getRuntime().exec(command);
            p.waitFor();
            BufferedReader read = new BufferedReader(new InputStreamReader(p.getInputStream()));


            String ln = "";
            while((ln = read.readLine()) != null)
            {
                output.append(ln + "\n");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
