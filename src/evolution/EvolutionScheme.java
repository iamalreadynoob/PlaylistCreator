package evolution;

import mainPackage.Expectation;
import mainPackage.Resulter;
import mutation.Mutation;
import sort.Sorting;

import java.util.ArrayList;

public class EvolutionScheme
{

    private int mutationPossibility;
    private int generationLimit;
    private int resultLength;

    private Expectation excHappiness;
    private Expectation excSadness;
    private Expectation excRage;

    private ArrayList<Integer> happiness;
    private ArrayList<Integer> sadness;
    private ArrayList<Integer> rage;
    private ArrayList<String> tracks;

    public EvolutionScheme(int mutationPossibility, int generationLimit, int resultLength, Expectation excHappiness, Expectation excSadness, Expectation excRage, ArrayList<Integer> happiness, ArrayList<Integer> sadness, ArrayList<Integer> rage, ArrayList<String> tracks)
    {
        this.mutationPossibility = mutationPossibility;
        this.generationLimit = generationLimit;
        this.resultLength = resultLength;
        this.excHappiness = excHappiness;
        this.excSadness = excSadness;
        this.excRage = excRage;
        this.happiness = happiness;
        this.sadness = sadness;
        this.rage = rage;
        this.tracks = tracks;

        GenZeroCreation genZeroCreation = new GenZeroCreation(resultLength, happiness.size());
        Sorting sorting = new Sorting(tracks.size(), excHappiness, excSadness, excRage, happiness, sadness, rage, genZeroCreation.genZeroCreation());
        Mutation mutation = new Mutation(mutationPossibility, tracks.size(), sorting.sort());

        ArrayList<String> loopMutated = mutation.mutation();

        for (int i = 1; i < generationLimit; i++)
        {
            Sorting loopSorting = new Sorting(tracks.size(), excHappiness, excSadness, excRage, happiness, sadness, rage, loopMutated);
            Mutation loopMutating = new Mutation(mutationPossibility, tracks.size(), loopSorting.sort());
            loopMutated = loopMutating.mutation();
        }

        Sorting lastSort = new Sorting(tracks.size(), excHappiness, excSadness, excRage, happiness, sadness, rage, loopMutated);

        Resulter result = new Resulter(tracks, lastSort.sort().get(0), resultLength);
        result.getResult();

    }

}
