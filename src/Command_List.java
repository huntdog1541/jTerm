import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by David on 5/10/2016.
 */
public class Command_List {

    private String[] comd;
    private ArrayList<String> list;

    public Command_List()
    {
        list = new ArrayList<String>();
        readCommd();
    }

    public void readCommd()
    {
        BufferedReader buff = null;
        try {
            buff = new BufferedReader(new FileReader("commands.txt"));
            String line = buff.readLine();

            while(line != null) {
                list.add(line);
                line = buff.readLine();
            }
            getItems();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("Working Directory = " + System.getProperty("user.dir"));
            try{
                buff.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public String[] getList()
    {
        return comd;
    }

    private void getItems()
    {
        int len = list.size(), j = 0;
        comd = new String[len];
        for(String i : list)
        {
            comd[j++] = i;
        }
    }
}
