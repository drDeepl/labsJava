package classes;

public abstract class AbstractUser {
    protected String login;
    protected String password;
    

    
    public void setLogin(String login){
        this.login = login;

    }

    public void setPassword(String password){
        this.password = password;
    }


    public String getLogin(){
        return login;
    }

    public String getPassword(){
        return password;
    }

    public abstract String submit();

    protected String checkPassword(){
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
    
