package sort;

import mainPackage.Expectation;

import java.util.ArrayList;

public class Sorting
{
    private int setLength;

    private Expectation excHappiness;
    private Expectation excSadness;
    private Expectation excRage;

    private ArrayList<Integer> happiness, sadness, rage;
    private ArrayList<String> gen;
    public Sorting(int setLength, Expectation excHappiness, Expectation excSadness, Expectation excRage, ArrayList<Integer> happiness, ArrayList<Integer> sadness, ArrayList<Integer> rage, ArrayList<String> gen)
    {
        this.setLength = setLength;
        this.excHappiness = excHappiness;
        this.excSadness = excSadness;
        this.excRage = excRage;
        this.happiness = happiness;
        this.sadness = sadness;
        this.rage = rage;
        this.gen = gen;
    }

    public ArrayList<String> sort()
    {
        ArrayList<String> sorted = gen;
        ArrayList<Integer> scores = new ArrayList<>();

        for (int i = 0; i < gen.size(); i++)
        {
            String examine = sorted.get(i);
            int score = 0;

            for (int j = 0; j < setLength; j++)
            {

                if (examine.charAt(j) == '1')
                {
                    switch (excHappiness)
                    {
                        case MAX_HAPPINESS: score += happiness.get(i); break;
                        case MIN_HAPPINESS: score += (100 - happiness.get(i)); break;
                    }

                    switch (excSadness)
                    {
                        case MAX_SADNESS: score += sadness.get(i); break;
                        case MIN_SADNESS: score += (100 - sadness.get(i)); break;
                    }

                    switch (excRage)
                    {
                        case MAX_RAGE: score += rage.get(i); break;
                        case MIN_RAGE: score += (100 - rage.get(i)); break;
                    }
                }

            }

            scores.add(score);

        }

        for (int i = 0; i < scores.size() - 1; i++)
        {

            for (int j = 0; j < scores.size() - i - 1; j++)
            {
                if (scores.get(j) < scores.get(j + 1))
                {
                    int temp = scores.get(j);
                    scores.set(j, scores.get(j+1));
                    scores.set(j+1, temp);

                    String tempS = sorted.get(j);
                    sorted.set(j, sorted.get(j+1));
                    sorted.set(j+1, tempS);
                }
            }

        }

        return sorted;
    }
}
