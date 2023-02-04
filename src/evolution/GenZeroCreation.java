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
                if (amount < resultLength)
                {
                    int existance = new Random().nextInt(2);
                    if (existance == 1) amount++;

                    if (current == null) current = Integer.toString(existance);
                    else current += Integer.toString(existance);

                }

                else current += "0";
            }

            if (amount < resultLength)
            {
                char[] notEnough = current.toCharArray();

                while (amount != resultLength)
                {

                    for (int j = 0; j < notEnough.length; j++)
                    {
                        if (notEnough[j] == '0')
                        {
                            int existance = new Random().nextInt(2);

                            if (existance == 1)
                            {
                                notEnough[j] = '1';
                                amount++;
                            }

                        }

                        if (amount == resultLength) break;
                    }

                }

                String temp = null;
                for (int j = 0; j < notEnough.length; j++)
                {
                    if (temp == null) temp = Character.toString(notEnough[j]);
                    else temp += Character.toString(notEnough[j]);
                }

            }

            genZero.add(current);

        }

        return genZero;
    }


}
