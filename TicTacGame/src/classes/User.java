package classes;

public class User {
    private boolean isX;
    private String username;

    public User(String username, boolean isX){
        this.isX = isX;
    }

    public boolean getIsX(){
        return isX;
    }
}
