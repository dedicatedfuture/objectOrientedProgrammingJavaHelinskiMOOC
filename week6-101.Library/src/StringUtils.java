/**
 * Created by Bill on 1/7/18.
 */
public class StringUtils {

    public static boolean included(String words, String searched){
        if((words.toUpperCase().contains((searched.trim().toUpperCase())))){
          return true;
        }

        return false;

    }
}
