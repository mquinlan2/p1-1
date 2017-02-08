/////////////////////////////////////////////////////////////////////////////
// Semester:         CS367 Spring 2016 
// PROJECT:          p0
// FILE:             Score.java
//
// Authors: Derek Buchinger
//
//////////////////////////// 80 columns wide //////////////////////////////////


/** 
 * A class that stores the name, points possible, and points
 * achieved in a homework assignment. Also includes methods 
 * to retrieve that information which are called by ScoreList.
 */

public class Score {
	
	private String name;      // name of assignment
	private double points;    // points achieved in an assignment
	private double possible;  // points possible to achieve in an assignment
	
	/**
	 * The constructor for this class stores the vital information for 
	 * ScoreList to use (the parameters)
	 * 
	 * @param name the name of the assignment
	 * @param points the number of points achieved
	 * @param possible the number of points possible
	 */
	public Score(String name, double points, double possible) {
		if (!(name instanceof String) || (name == null) ||
				(points < 0) || (possible < 0) || (possible < points)) {
			throw new IllegalArgumentException();
		}
		this.name = name;
		this.points = points;
		this.possible = possible;
	}
	
	/**
	 * This method returns the name of the assignment
	 * 
	 * @return name of the assignment
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * This method returns the points achieved on the assignment
	 * 
	 * @return points achieved on the assignment
	 */
	public double getPoints() {
		return points;
	}
	
	/**
	 * This method returns the points possible to achieve on the assignment
	 * 
	 * @return points possible to achieve on the assignment
	 */
	public double getMaxPossible() {
		return possible;
	}
	
	/**
	 * This method returns the type of assignment, such as program or homework,
	 * based on the first letter of the assignment name.
	 * 
	 * @return first letter of assignment name
	 */
	public String getCategory() {
		return name.substring(0, 1);
	}
	
	/**
	 * Gives the percent achieved on the assignment using the variables
	 * points and possible.
	 * 
	 * @return percentage on assignment
	 */
	public double getPercent() {
		return ((points/possible) * 100);
	}
	
	/**
	 * This method returns the values of the scores in string format
	 * so that it is easier to test results.
	 */
	public String toString() {
	    return getCategory() + " " + getName() + " " + 
	        getPoints() + " / "+getMaxPossible() + " " +
	        getPercent() ;
	}
}
