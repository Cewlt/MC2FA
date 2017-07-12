package universal.authenticators;

/**
 * Created by colt.
 * Jul 11 2017 - 21:15
 */
public class GoogleAuthenticator implements IAuthenticator {
    private GoogleAuthenticator googleAuthenticator;

    public GoogleAuthenticator() {
        googleAuthenticator = new GoogleAuthenticator();
    }

    public void createUser(String email, String phone, String countryCode) {

    }

    public void deleteUser(String email, String phone, String countryCode) {

    }

    public boolean verifyUser(String user, String token) {
        return true;
    }
}
