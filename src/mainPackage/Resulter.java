package mainPackage;

import java.util.ArrayList;

public class Resulter
{

    private ArrayList<String> tracks;
    private String result;

    public Resulter(ArrayList<String> tracks, String result)
    {
        this.tracks = tracks;
        this.result = result;
    }

    public void getResult()
    {
        System.out.println("Here is the list which is created for you:");

        for (int i = 0; i < result.length(); i++)
        {
            if (result.charAt(i) == '1')
            {
                System.out.println(tracks.get(i));
            }
        }
    }


}
