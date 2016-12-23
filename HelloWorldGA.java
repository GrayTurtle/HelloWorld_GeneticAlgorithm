public class HelloWorldGA {

	public static void main(String[] args) {
		final int populationSize = 2048;

		final int maxGenerations = 16384;

		final float crossoverRatio = 0.8f;

		//ratio of the population that will stay the same
		final float elitismRatio = 0.1f;

		final float mutationRatio = 0.03f;

		//initialize the population
		Population population = new Population(populationSize, crossoverRatio,
								elitismRatio, mutationRatio);

		//evolve the population, stop when maxGenerations is reached or when
		// we find the target
		int i = 0;
		Chromosome best = population.getPopulation()[0];

		while ((i++ <= maxGenerations) && (best.getFitness() != 0)) {
			System.out.println("Generation " + i + ":" + best.getGene());
			population.evolve();
			best = population.getPopulation()[0];
		}

		System.out.println("Generation " + i + ":" + best.getGene());
	}
}
