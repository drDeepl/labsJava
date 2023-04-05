package classes;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class EmailUser extends AbstractUser{
    


    @Override
    public String submit(){
        
        String patternRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2}.$";
        Pattern pattern = Pattern.compile(patternRegex);
        Matcher matcher = pattern.matcher(login);
        String result = "";
        String resultPass = checkPassword();
        if(matcher.matches()){
            result =  "email authorized";
        }
        else{
            result =  "email don't authorized";   
        }
        result += "\t" + resultPass;
        return result;
    }        
}
