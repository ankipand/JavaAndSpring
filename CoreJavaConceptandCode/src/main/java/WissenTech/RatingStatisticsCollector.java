package WissenTech;

public interface RatingStatisticsCollector {

	double getAverageRating(String app);

	void putNewRating(String app, int rating);

	int getRatingsCount(String app);

}
