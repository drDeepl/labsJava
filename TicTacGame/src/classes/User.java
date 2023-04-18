package classes;

public class User {
    private boolean isX;
    private String username;

    public User(String username, boolean isX){
        this.username = username;
        this.isX = isX;
    }

    public boolean getStepValue(){
        return isX;
    }

    public String getUsername(){
        return username;
    }

}
