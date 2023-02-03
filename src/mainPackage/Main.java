package mainPackage;

import evolution.EvolutionScheme;
import test.TestDataset;

import java.util.ArrayList;

public class Main
{

    public static void main(String[] args)
    {
        TestDataset testing = new TestDataset();

        System.out.println(testing.getTracks() + "\n" + testing.getHappiness() + "\n" + testing.getSadness() + "\n" + testing.getRage());

        new EvolutionScheme(testing.getMutationPossibility(), testing.getGenerationLimit(), testing.getResultLength(), testing.getExcHappiness(), testing.getExcSadness(), testing.getExcRage(), testing.getHappiness(), testing.getSadness(), testing.getRage(), testing.getTracks());

    }

}
