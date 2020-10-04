package epam_jdi_page.utils;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class User {
    private final String userLogin;
    private final String userPassword;
    private final String userName;

    private User(String userLogin, String userPassword, String userName) {
        this.userLogin = userLogin;
        this.userPassword = userPassword;
        this.userName = userName;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public String getUserName() {
        return userName;
    }

    public static User createUserFromPropertyFile(final String propertiesFilePath) {
        File propertyFile = new File(propertiesFilePath);
        Properties properties = new Properties();

        try {
            properties.load(new FileReader(propertyFile));
        } catch (IOException e) {
            System.out.println("File not found");
        }
        return new User(properties.getProperty("userLogin"),
                properties.getProperty("userPassword"), properties.getProperty("userName"));
    }
}
