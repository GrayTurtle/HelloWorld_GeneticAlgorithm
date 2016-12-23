import java.util.Random;
public class Chromosome implements Comparable<Chromosome> {
	private final String gene;
	private final int fitness;

	private static final char[] TARGET_GENE = "Hello, world!".toCharArray();

	private static final Random rand = new Random();

	public Chromosome(String gene) {
		this.gene = gene;
		this.fitness = calculateFitness(gene);
	}

	public String getGene() {
		return gene;
	}

	public int getFitness() {
		return fitness;
	}

	//static??
	private int calculateFitness(String gene) {
		int fitness = 0;
		char[] arr = gene.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			fitness += Math.abs(((int)arr[i]) - ((int) TARGET_GENE[i]));
		}
		return fitness;
	}

	public Chromosome mutate() {
		char[] arr = gene.toCharArray();
		int idx = rand.nextInt(arr.length);
		int delta = (rand.nextInt() % 90) + 32;
		arr[idx] = (char) ((arr[idx] + delta) % 122);

		return new Chromosome(String.valueOf(arr));
	}

	public Chromosome[] mate(Chromosome mate) {
		char[] gene1 = gene.toCharArray();
		char[] gene2 = mate.gene.toCharArray();

		return null;

	}

	public static Chromosome generateRandom() {
		return null;
	}

	public int compareTo(Chromosome c) {
		return -1;
	}

}
