import java.util.words.txt; //random, scanner, arraylist
import java.io.IOException; //file, filenotfoundexception
public class WordSearch{
    //all words from a text file get added to wordsToAdd, indicating that they
    //have not yet been added
    private ArrayList<String> wordsToAdd;

    //all words that were successfully added get moved into wordsAdded.
    private ArrayList<String> wordsAdded;

    //a random Object to unify your random calls
    private Random randgen;
    private char[][]data;
    private int wordsIn;

    /**Initialize the grid to the size specified 
     *fill all of the positions with '_'
     *@param row is the starting height of the WordSearch
     *@param col is the starting width of the WordSearch
     */
    public WordSearch(int rows,int cols,int fileName){
	data = new char [rows][cols];
	wordsIn = 0;
	
    }
    public WordSearch(int rows,int cols,int fileName, int randSeed){
	data = new char [rows][cols];
    }

    /**Set all values in the WordSearch to underscores'_'*/
    private void clear(){
	for (int i = 0;i<data.length;i++){
	    data[i][i] = '_';
	}
    }

    /**The proper formatting for a WordGrid is created in the toString.
     *@return a String with each character separated by spaces, and rows
     *separated by newlines.
     */
    public String toString(){
	String ans = ""
	for (int i = 0;i<data.length;i++){
	    ans = ans + data[i][i];
	}
	return ans;
    }


    /**Attempts to add a given word to the specified position of the WordGrid.
     *The word is added from left to right, must fit on the WordGrid, and must
     *have a corresponding letter to match any letters that it overlaps.
     *
     *@param word is any text to be added to the word grid.
     *@param row is the vertical locaiton of where you want the word to start.
     *@param col is the horizontal location of where you want the word to start.
     *@return true when the word is added successfully. When the word doesn't fit,
     * or there are overlapping letters that do not match, then false is returned 
     * and the board is NOT modified.
     */
    public boolean addWordHorizontal(String word,int row, int col){
	for (int i = 0;i<word.length;i++){
	    data [row][col] = word[i];
	    col = col + 1;
	}
	return true;
    }

   /**Attempts to add a given word to the specified position of the WordGrid.
     *The word is added from top to bottom, must fit on the WordGrid, and must
     *have a corresponding letter to match any letters that it overlaps.
     *
     *@param word is any text to be added to the word grid.
     *@param row is the vertical locaiton of where you want the word to start.
     *@param col is the horizontal location of where you want the word to start.
     *@return true when the word is added successfully. When the word doesn't fit,
     *or there are overlapping letters that do not match, then false is returned.
     *and the board is NOT modified.
     */
    public boolean addWordVertical(String word,int row, int col){
	for (int i = 0;i<word.length;i++){
	    data [row][col] = word[i];
	    row = row + 1;
	}
	return true;
    }
    /**Attempts to add a given word to the specified position of the WordGrid.
     *The word is added from top left to bottom right, must fit on the WordGrid,
     *and must have a corresponding letter to match any letters that it overlaps.
     *
     *@param word is any text to be added to the word grid.
     *@param row is the vertical locaiton of where you want the word to start.
     *@param col is the horizontal location of where you want the word to start.
     *@return true when the word is added successfully. When the word doesn't fit,
     *or there are overlapping letters that do not match, then false is returned.
     */
    public boolean addWordDiagonal(String word,int row, int col){
	for (int i = 0;i<word.length;i++){
	    data [row][col] = word[i];
	    row = row + 1;
	    col = col + 1;
	}
	return true;
    }
    public boolean addWord(int r, int c, String word, int rowIncrement, int colIncrement){
	for (int i = 0;i<word.length;i++){
	    data [row][col] = word[i];
	    row += rowIncrement;
	    col += colIncrement;
	    wordsIn += 1;
	}
	return true;
    }
    private boolean addAllWords(){
	if (wordsToAdd.length() == 0){
	    return true;
	}
	return false;
   }
	


}
