package ants;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem {


    private int num_ants;
    private int num_cities;
    private double pheromone_weight;
    private double heuristic_weight;
    private int greedy_param;
    private float evaporation_param;
    private float intesification_param;
    private int[][] distance_matrix;



    public Problem(int num_ants, int num_cities, double pheromone_weight, double heuristic_weight, int greedy_param,
            float evaporation_param, float intesification_param, String data_path) {

        this.num_ants = num_ants;
        this.num_cities = num_cities;
        this.pheromone_weight = pheromone_weight;
        this.heuristic_weight = heuristic_weight;
        this.greedy_param = greedy_param;
        this.evaporation_param = evaporation_param;
        this.intesification_param = intesification_param;

        this.parseCSV(data_path);
    }

    /***
     * Load an array representing the data held in a tsp file.
     * 
     * @param data_path - Path of the tsp file to load data from.
     */
    private void parseCSV(String path) {
        this.distance_matrix = new int[this.num_cities][this.num_cities];
        int[] record;

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            String[] split_line;
            int j = 0;

            while ((line = br.readLine()) != null) {
                split_line = line.split(" ");
                record = new int[this.num_cities];

                for (int i = 0; i < split_line.length; i++) {
                    record[i] = Integer.parseInt(split_line[i]);
                }

                this.distance_matrix[j] = record;
                j++;
            }
        } catch (IOException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    /****** ACCESSORS ******/
    public int get_num_cities() {
        return this.num_cities;
    }

    /******* TO STRING *******/
    public String toString() {
        String s = "";

        s += "Problem:\n";
        s += this.num_ants + " - num_ants\n";
        s += this.num_cities + " - num_cities\n";
        s += this.evaporation_param + " - evaporation_param\n";
        s += this.intesification_param + " - intesification_param\n";
        s += this.pheromone_weight + " - pheromone_weight\n";
        s += this.heuristic_weight + " - heuristic_weight\n";
        s += this.greedy_param + " - greedy_param\n";

        return s;
    }


    public void setPheromone_weight(int pheromone_weight) {
        this.pheromone_weight = pheromone_weight;
    }

    public void setHeuristic_weight(int heuristic_weight) {
        this.heuristic_weight = heuristic_weight;
    }

    public void setGreedy_param(int greedy_param) {
        this.greedy_param = greedy_param;
    }

    public void setEvaporation_param(float evaporation_param) {
        this.evaporation_param = evaporation_param;
    }

    public void setIntesification_param(float intesification_param) {
        this.intesification_param = intesification_param;
    }
    public int getNum_ants() {
        return num_ants;
    }

    public int getNum_cities() {
        return num_cities;
    }

    public float getEvaporation_param() {
        return evaporation_param;
    }

    public float getIntesification_param() {
        return intesification_param;
    }

    public int[][] getDistance_matrix() {
        return distance_matrix;
    }


    public double getPheromone_weight() {
        return pheromone_weight;
    }

    public double getHeuristic_weight() {
        return heuristic_weight;
    }

    public int getGreedy_param() {
        return greedy_param;
    }






}
