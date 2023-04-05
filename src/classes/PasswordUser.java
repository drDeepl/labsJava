package classes;

public class PasswordUser extends AbstractUser{

    @Override
    public String submit(){
        String result = "";
        if(password.length() > 5){
            result = "Password authorized";
        }
        else{
            result = "password must be more 5 symbols";
        }
        return result;
    }
}
