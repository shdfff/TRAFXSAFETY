package simple;


public class FindSecondWord {

	  public static String findSecondWord(String sentence) {
	    if (sentence == null || sentence.isEmpty()) {
	      return ""; // Handle empty sentence or null input
	    }

	    String[] words = sentence.split(" ");

	    // Check if there are at least two words
	    if (words.length < 2) {
	      return ""; // No second word if there's less than 2 words
	    }

	    return words[1]; // Return the second word (index 1)
	  }

	  public static void main(String[] args) {
	    String inputSentence = "This is a test sentence";
	    String secondWord = findSecondWord(inputSentence);

	    if (secondWord.isEmpty()) {
	      System.out.println("The sentence does not contain a second word");
	    } else {
	      System.out.println("The second word in the sentence is: " + secondWord);
	    }
	  }
	}
