package evolution;


import java.util.ArrayList;
import java.util.Random;

public class GenZeroCreation
{
    private int resultLength;
    private int setLength;

    protected GenZeroCreation(int resultLength, int setLength)
    {
        this.resultLength = resultLength;
        this.setLength = setLength;
    }

    protected ArrayList<String> genZeroCreation()
    {
        ArrayList<String> genZero = new ArrayList<>();

        for (int i = 0; i < 8; i++)
        {
            int amount = 0;
            String current = null;

            for (int j = 0; j < setLength; j++)
            {
                if (amount < 10)
                {
                    int existance = new Random().nextInt(2);
                    amount++;

                    if (current == null) current = Integer.toString(existance);
                    else current += Integer.toString(existance);

                }

                else current += "0";
            }

            genZero.add(current);

        }

        return genZero;
    }


}
