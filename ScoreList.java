/////////////////////////////////////////////////////////////////////////////
// Semester:         CS367 Spring 2016 
// PROJECT:          p0
// FILE:             ScoreList.java
//
// Authors: Derek Buchinger
//
//////////////////////////// 80 columns wide //////////////////////////////////

/** 
 * A container that stores references to instances of Score in a 
 * contiguous and ordered list of those instances.
 */

public class ScoreList implements ScoreListADT {
	
	private int numItems = 0;					// number of stored scores
	private Score[] scores = new Score[50];						// stored scores
	
	/** 
	 * Returns the number of Scores in the list or zero
	 * @return the number of scores in this list
	 */
	public int size() {
		return numItems;
	}
	
	
	/** 
	 * Adds the score to the end of this list..
	 * 
	 * @param score a non-null Score to place as the last item in the list.
	 * @throws IllegalArgumentException
	 */
	public void add(Score score) throws IllegalArgumentException {
	    scores[numItems] = score;
	    numItems++;
	}
	
	
	/**
	 * Removes and returns the item at index position i.
	 * If i is less than zero or greater than size()-1,
	 * will throw an IndexOutOfBoundsException.
	 * @param i must be greater than or equal to zero and less than size()
	 * @return the item at index i
	 * @throws IndexOutOfBoundsException
	 */
	public Score remove(int i) throws IndexOutOfBoundsException {	
		if (i < 0 || i >= numItems) {
            throw new IndexOutOfBoundsException();
        }
		Score remove = scores[i];
		for(int j = i; j < numItems - 1; j++) {
			scores[j] = scores[j + 1];
		}
	    numItems = numItems - 1;
		return remove;
	}
	
	
	/**
	 * Returns (without removing) the item at index position i.
	 * If i is less than zero or greater than size()-1,
	 * will throw an IndexOutOfBoundsException.
	 * @param i must be greater than or equal to zero and less than size()
	 * @return the item at index i
	 * @throws IndexOutOfBoundsException
	 */
	public Score get(int i) throws IndexOutOfBoundsException {
		if (i < 0 || i >= numItems) {
	        throw new IndexOutOfBoundsException();
	    }
		return scores[i];
	}
	
}
