package com.api.rottentomatoes;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


import java.io.PrintWriter;
import java.util.List;

import com.api.rottentomatoes.model.Movie;
import com.api.rottentomatoes.model.Review;




public class apiRottenTomatoes {
	
	private static final FetchReviews fetchReviews = new FetchReviews();
	private static final FetchMovies fetchMovies = new FetchMovies();
	
	public static void apirotten() throws IOException
	{
//		final Movie m = fetchMovies.getMovies("king");
//		final Review r = fetchReviews.getReviews("771382256");
		
		String movieID = "21063";
		
		List<Review> reviews = fetchReviews.getReviews(movieID);
		
//		PrintWriter out = new PrintWriter("C://Users/Vishnu Chelle/Documents/KDM/MovieReviewData/ActionReview.txt");
		
		System.out.println(reviews.size());
		
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("C://Users/Vishnu Chelle/Documents/KDM/MovieReviewData/MusicReview.txt", true)));
		for (Review r : reviews){
//			System.out.println(r.getQuote() + "\n");
			out.println(r.getQuote() + "\n");
//			out.println("\n");    
		
		}
		out.close();
	}
		
	public static void main(String[] args){
		try {
			apirotten();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
