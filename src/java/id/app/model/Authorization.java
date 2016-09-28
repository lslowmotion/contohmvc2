package id.app.model;

/**
 *
 * @author panji
 */
public class Authorization {
    public boolean authorize(User user){
        boolean result = false;
        if(user.getUsername().equals("admin") && user.getPassword().equals("admin")){
            result = true;
        }
        return result;
    }
}
