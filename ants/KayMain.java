package ants;

import java.lang.Math;
import java.util.ArrayList;
import java.util.Random;

public class KayMain {
  
  public static void main(String[] args) {
    /*
    Random r = new Random();

    // Test variables
    int numAnts = 4; // Number of ants
    int numCities = 5; // Number of city nodes
    float pheromones[][] = new float[numCities][numCities]; // Pheromone chart
    int distances[][] = new int[numCities][numCities]; // Distance chart
    float evaporation = 0.9f; // Evaporation constant
    float intensification = 0.1f; // Intensficiation constant
    float pheromoneWeight = 1f; // Weight of pheromones for pathfinding
    float heuristicWeight = 0f; // Weight of heuristic for pathfinding
    float greedy = 0f; // Greedy parameter
    int terminationCount = 3; // How many times we loop

    ArrayList<Integer> bestSolution = new ArrayList<>(); // Save the best solution

    // Populate pheromone and distances with dummy data
    for (int i = 0; i < numCities; ++i) {
      for (int j = 0; j < numCities; ++j) {
        if (i != j) {
          pheromones[i][j] = 1;
        }
        distances[i][j] = Math.abs(i - j); // TODO: More varied assignment
      }
    }
    
    for (int loop = 0; loop < terminationCount; ++loop) {
      ArrayList<ArrayList<Integer>> solutions = new ArrayList<>();

      // Mock up of a pathfinder
      for (int ant = 0; ant < numAnts; ++ant) {
        ArrayList<Integer> solution = new ArrayList<>();
        ArrayList<Integer> cities = new ArrayList<>();
        for (int i = 0; i < numCities; ++i) {
          cities.add(i);
        }

        for (int city = 0; city < numCities; ++city) {
          cities.remove(city);
          float probabilities[] = new float[cities.size()];
          for (int destination = 0; destination < cities.size(); ++destination) {
            if (destination == 0) {
              probabilities[destination] = pheromones[city][cities.get(destination)] / cities.size();
            } else {
              probabilities[destination] = probabilities[destination - 1] + pheromones[city][cities.get(destination)] / cities.size();
            }
            float selection = r.nextFloat();
            for (int i = 0; i < probabilities.length; ++i) {
              if (selection <= probabilities[i]) {
                solution.add(cities.get(i));
                break;
              }
            }
          }
        }
        solutions.add(solution);
      }

      if (bestSolution.size() == 0) {
        bestSolution = solutions.get(0);
      }
      int bestDistance = getDistance(bestSolution, distances);

      for (ArrayList<Integer> potentialSolution : solutions) {
        int potentialDistance = getDistance(potentialSolution, distances);
        if (potentialDistance < bestDistance) {
          bestSolution = potentialSolution;
          bestDistance = potentialDistance;
        }
      }

      for (int i = 0; i < numCities; ++i) {
        for (int j = 0; j < numCities; ++j) {
          pheromones[i][j] *= evaporation;
        }
      }

      int start = 0;
      for (int city : bestSolution) {
        pheromones[start][city] += intensification;
        pheromones[city][start] += intensification;
        start = city;
      }
    }
    */
  }


}
