package com.movies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * problem stmt:
 * input
 * 5
 * 2 3 4 1 5
 * 2 1 3 4 5
 * output:
 * 2
 */
class TestClass {
	public static void main(String args[]) throws Exception {
		// BufferedReader
		System.out.println("Enter number of movies");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int numberOfMovies = Integer.parseInt(line);

		System.out.println("Enter kohli's movies rank");
		int[] kohliMovies = readInputEvaluate(br, numberOfMovies);
		System.out.println("Enter Dhoni's movies rank");
		int[] dhoniMovies = readInputEvaluate(br, numberOfMovies);
		System.out.println("Printing kohli's movies");
		printMovies(kohliMovies);
		System.out.println("Printing Dhoni's movies ");
		printMovies(dhoniMovies);
		getMissMatch(kohliMovies, dhoniMovies);
	}

	private static void getMissMatch(int[] kohliMovies, int[] dhoniMovies) {
		// TODO Auto-generated method stub
		

	}

	private static void printMovies(int[] movies) {
		for (int i = 0; i < movies.length; i++) {
			System.out.print(" "+movies[i]);
		}
		System.out.println();

	}

	private static int[] readInputEvaluate(BufferedReader br, int numberOfMovies)
			throws IOException {
		String line;
		line = br.readLine();
		String[] movies = line.split(" ");
		if (movies.length != numberOfMovies) {
			throw new RuntimeException("Number of movies enteres is not equal");
		}
		int[] integerMovies = new int[movies.length];
		for (int i = 0; i < movies.length; i++) {
			integerMovies[i] = Integer.parseInt(movies[i]);
		}
		return integerMovies;
	}

}
