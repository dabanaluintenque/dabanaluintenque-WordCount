
public class ReturnWordCount {
    /**
     * @param in A String representing a sentence, with words delineated by spaces.
     * @return return the amount of words in a string.
     */
    public int count(String in){
        
        String text = "";
        String emptySpace = " ";

        for (int i = 0; i < in.length(); i ++) {

            char isEmpty = in.charAt(i);
            char empty = emptySpace.charAt(0);

            if (isEmpty == empty) {

                text += empty;
            }
        }

        int numberOfWords = (text.length() + 1);
        
        
        return numberOfWords ;
    }
}
