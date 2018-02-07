import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
public class Labmain {


    /**
     * Retrieve contents from a URL and return them as a string.
     *
     * @param url url to retrieve contents from
     * @return the contents from the url as a string, or an empty string on error
     */
    public static String urlToString(final String url) {
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;
    }
    public static void main(String[] args){
        String[] st = ("Now modify your code above so that it looks for " +
                "and counts occurrences of a specific word, which you can " +
                "define as a constant in your code. For example, how " +
                "many times does the word \"Prince\" appear in Hamlet? Can " +
                "you make your new function case-insensitive, so that \"Prince\" and " +
                "\"prince\" are counted as the same word?").split(" ");
        System.out.println("a"+'a');
        System.out.println(st.length);
        int c = 0;
        boolean counted = false;
        for (int i = 0; i < st.length; i++){
            counted = false;
            for (int j = i-1; j >-1; j--){
                if (removePunc(st[i]).equalsIgnoreCase(removePunc(st[j]))){
                    counted = true;
                    break;
                }
            }
            if(!counted)c++;
        }
        System.out.println(c);
    }
    public static String removePunc(String st){
        char[] chars = st.toLowerCase().toCharArray();
        String st2 = "";
        for(int i = 0; i < chars.length; i++){
            if(chars[i] >= 'a'&& chars[i] <= 'z'){
                st2 += chars[i];
            }
        }

        return st2;
    }
}
