package mainPackage;

import java.util.ArrayList;

public class Resulter
{

    private ArrayList<String> tracks;
    private String result;

    private int resultLength;

    public Resulter(ArrayList<String> tracks, String result, int resultLength)
    {
        this.tracks = tracks;
        this.result = result;
        this.resultLength = resultLength;
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
