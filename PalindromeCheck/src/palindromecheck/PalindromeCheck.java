/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package palindromecheck;

/**
 *
 * @author Camilo
 */
public class PalindromeCheck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String pstring = "Madam, I'm Adam";
        pstring = keepChars(pstring);
        System.out.println(pstring);
        System.out.println(isPalindrome(pstring));
    }
    
    public static String keepChars(String s)
    {
        s = s.replaceAll("[^a-zA-Z]","");
        s = s.toLowerCase();
        return s;
    }
    
    public static boolean isPalindrome(String s) {
        
        if (s.length() <= 1) return true;
   
        return s.charAt(0) == s.charAt(s.length() - 1) &&
                 isPalindrome(s.substring(1, s.length() - 1));
    }
    
}
