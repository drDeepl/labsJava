package classes;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class PhoneUser extends AbstractUser{
    

    
    @Override
    public String submit(){
    
        String patternRegex ="^\\+7\\(\\d{3}\\)-\\d{3}-\\d{2}-\\d{2}";
        Pattern pattern = Pattern.compile(patternRegex);
        Matcher matcher = pattern.matcher(login);
        String result = "";
        String resultPass = checkPassword();
        if(matcher.matches()){
            result =  "phone authorized";
        }
        else{
            result = "phone don't authorized";   
        }
        result += "\t" + resultPass;
        return result;
    }
}
