package universal.authenticators;

/**
 * Created by colt.
 * Jul 11 2017 - 21:09
 */
public interface IAuthenticator {

    void createUser(String email, String phone, String countryCode);

    void deleteUser(String email, String phone, String countryCode);

    boolean verifyUser(String user, String token) throws Exception;
}
