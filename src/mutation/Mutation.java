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
            char[] currentComb = mutationed.get(i).toCharArray();

            for (int j = 0; j < setLength; j++)
            {
                if (new Random().nextInt(100) <= mutationPossibility)
                {
                    if (currentComb[j] == '0')
                    {
                        currentComb[j] = '1';

                        boolean isStable = false;

                        while (!isStable)
                        {

                            for (int k = 0; k < mutationed.get(i).length(); k++)
                            {
                                if (currentComb[k] == '1' && new Random().nextInt(2) == 0)
                                {
                                    currentComb[k] = '0';
                                    isStable = true;
                                    break;
                                }
                            }

                        }



                    }
                    else
                    {
                        currentComb[j] = '0';

                        boolean isStable = false;

                        while (!isStable)
                        {

                            for (int k = 0; k < mutationed.get(i).length(); k++)
                            {
                                if (currentComb[k] == '0' && new Random().nextInt(2) == 1)
                                {
                                    currentComb[k] = '1';
                                    isStable = true;
                                    break;
                                }
                            }

                        }

                    }
                }
            }

            for (int j = 0; j < setLength; j++)
            {
                if (temp == null) temp = Character.toString(currentComb[j]);
                else temp += Character.toString(currentComb[j]);
            }

            mutationed.set(i, temp);

        }

        return mutationed;
    }

}
