package test;

import mainPackage.Expectation;

import java.util.ArrayList;
import java.util.Random;

public class TestDataset
{

    private int mutationPossibility;
    private int generationLimit;
    private int resultLength;

    private Expectation excHappiness;
    private Expectation excSadness;
    private Expectation excRage;

    private ArrayList<String> tracks = new ArrayList<>();
    private ArrayList<Integer> happiness = new ArrayList<>();
    private ArrayList<Integer> sadness = new ArrayList<>();
    private ArrayList<Integer> rage = new ArrayList<>();

    public TestDataset()
    {
        mutationPossibility = 45;
        generationLimit = 50;
        resultLength = 10;

        excHappiness = Expectation.MIN_HAPPINESS;
        excSadness = Expectation.MAX_SADNESS;
        excRage = Expectation.MAX_RAGE;

        for (int i = 0; i < 20; i++)
        {
            tracks.add("track " + (i + 1));
            happiness.add(new Random().nextInt(101));
            sadness.add(new Random().nextInt(101));
            rage.add(new Random().nextInt(101));
        }

    }

    public int getMutationPossibility() {return mutationPossibility;}
    public int getGenerationLimit() {return generationLimit;}
    public int getResultLength() {return resultLength;}
    public Expectation getExcHappiness() {return excHappiness;}
    public Expectation getExcSadness() {return excSadness;}
    public Expectation getExcRage() {return excRage;}
    public ArrayList<String> getTracks() {return tracks;}
    public ArrayList<Integer> getHappiness() {return happiness;}
    public ArrayList<Integer> getSadness() {return sadness;}
    public ArrayList<Integer> getRage() {return rage;}

}
