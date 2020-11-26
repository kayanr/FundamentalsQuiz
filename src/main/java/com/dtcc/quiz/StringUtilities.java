package com.dtcc.quiz;

public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        return input;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        return (baseValue + valueToBeAdded);
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        String reversedValue ="";
        for(int i = (valueToBeReversed.length()-1); i >= 0 ; i--)
            { reversedValue += valueToBeReversed.charAt(i); }

        return reversedValue;
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
            char middleCharacter = '';
            int middleIndex = word.length()/2;
            middleCharacter = word.charAt(middleIndex);

            return middleCharacter;

    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
           String strModified = "";

           for (int i = 0; i < value.length(); i++) {
               if (value.charAt(i) != charToRemove)
                   strModified += value.charAt(i);
           }
        return strModified;
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        String lastWord ="";
        int lastSpaceIndex = sentence.lastIndexOf(' ');
        for(int i = lastSpaceIndex +1; i< sentence.length(); i++)
            { lastWord += sentence.charAt(i);      }
        return lastWord;

    }
}
