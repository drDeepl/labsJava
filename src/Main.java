
import classes.EmailUser;
import classes.PhoneUser;



public class Main {
     public static void main(String[] args) {
        String email = "dadada.gmail.com";
        String pass = "somed";
        String result = "";


        EmailUser emailVal = new EmailUser();
        emailVal.setLogin(email);
        emailVal.setPassword(pass);
        String emailRes = emailVal.submit();
        result += emailRes + "\n";
        
      String phone = "+7(444)333-22-11";
      PhoneUser phoneVal = new PhoneUser();
      phoneVal.setLogin(phone);
      phoneVal.setPassword(pass);
      String phoneRes = phoneVal.submit();
      result += phoneRes + "\n";
      System.out.println(result);


   }
}
