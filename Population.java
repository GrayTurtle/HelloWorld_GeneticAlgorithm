import java.util.Arrays;
import java.util.Random;

public class Population {

	private float elitism;
	private float mutation;
	private float crossover;
	private Chromosome[] popArr;

	public Population(int size, int crossoverRatio, float elitismRatio, float mutationRatio) {
		this.crossover = crossoverRatio;
		this.elitism = elitismRatio;
		this.mutation = mutationRatio;

		//make initial population
		this.popArr = new Chromosome[size];
		for (int i = 0; i < size; i++) {
			this.popArr[i] = Chromosome.generateRandom();
		}

		Arrays.sort(this.popArr);
	}
}
