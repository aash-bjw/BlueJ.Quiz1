 

public class LoopFun
{

      /**
       * Given a number, return the factorial of that number.
       * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
       * @param number
       * @return the factorial of the number
       */
      public Integer factorial(Integer number){
          int x = number;
          int j = 1;
          for (int i = 1; i <= x; i++){
              j = j * i;
            }
          return j;
      }

      /**
       * Given a phrase, get the acronym of that phrase. Acronym is the combination of
       * the first character of each word in upper case.
       * For example, given "Ruby on Rails", this method will return "ROR"
       * @param phrase
       * @return Upper case string of the first letter of each word
       */
      public String acronym(String phrase) {
          StringBuilder sb = new StringBuilder();
          for(String s : phrase.split(" ")){
            sb.append(s.charAt(0));
            }
          
          String newStr = sb.toString();
          return newStr.toUpperCase();
      }

      /**
       * To prevent anyone from reading our messages, we can encrypt it so it will only be readable by its
       * intended audience. This method encrypt the message by shifting the letter by 3 characters. If the character is
       * at the end of the alphabet, it will wraps around.
       * For example:
       *  'a' => 'd'
       *  'w' => 'z'
       *  'x' => 'a'
       *  'y' => 'b'
       * @param word
       * @return the encrypted string by shifting each character by three character
       */
      public String encrypt(String word) {
          char[] result = new char[word.length()];
          for (int i = 0; i < result.length; i++) {
          result[i] = (char) (word.charAt(i) + 3);
}
        String newStr = new String(result);
        return newStr;
      } 
}
