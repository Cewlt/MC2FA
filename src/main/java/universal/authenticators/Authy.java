package universal.authenticators;

/**
 * Created by colt.
 * Jul 11 2017 - 21:11
 */
public class Authy implements IAuthenticator {

    public void createUser(String email, String phone, String countryCode) {

    }

    public void deleteUser(String email, String phone, String countryCode) {

    }

    public boolean verifyUser(String user, String token) {
        return true;
    }
}
