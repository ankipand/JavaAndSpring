package WissenTech;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Solution {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	RatingStatisticsCollectorImpl collectorImpl = new RatingStatisticsCollectorImpl();
	collectorImpl.putNewRating("Hello", 4);
}
public static class RatingStatisticsCollectorImpl implements RatingStatisticsCollector {
    @Override
    
    public void putNewRating(String app, int rating){ 
    }

    @Override
    public double getAverageRating(String app){
    	
		return 0;
       
    }

    @Override
    public int getRatingsCount(String app){
		return 0;
        // YOUR CODE HERE
    }
}

}
