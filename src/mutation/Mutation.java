package mutation;

import java.util.ArrayList;
import java.util.Random;

public class Mutation
{

    private int mutationPossibility;
    private int setLength;

    private ArrayList<String> sorted;

    public Mutation(int mutationPossibility, int setLength, ArrayList<String> sorted)
    {
        this.mutationPossibility = mutationPossibility;
        this.setLength = setLength;
        this.sorted = sorted;
    }

    public ArrayList<String> mutation()
    {
        ArrayList<String> mutationed = sorted;

        mutationed.set(4, mutationed.get(0));
        mutationed.set(5, mutationed.get(1));
        mutationed.set(6, mutationed.get(2));
        mutationed.set(7, mutationed.get(3));

        for (int i = 4; i < sorted.size(); i++)
        {
            String temp = null;

            for (int j = 0; j < setLength; j++)
            {
                if (new Random().nextInt(100) <= mutationPossibility)
                {
                    for (int k = 0; k < j; k++)
                    {
                        if (temp == null) temp = Character.toString(mutationed.get(i).charAt(k));
                        else temp = Character.toString(mutationed.get(i).charAt(k));
                    }

                    if (mutationed.get(i).charAt(j) == '0')
                    {

                        if (temp == null) temp = "1";
                        else temp += "1";

                    }

                    else
                    {
                        if (temp == null) temp = "0";
                        else temp += "0";
                    }

                    if (j + 1 < setLength)
                    {
                        for (int k = j + 1; k < setLength; k++)
                        {
                            temp += Character.toString(mutationed.get(i).charAt(k));
                        }
                    }

                }
            }

            mutationed.set(i, temp);

        }

        return mutationed;
    }

}
