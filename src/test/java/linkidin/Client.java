package linkidin;

public class Client {

    private String email;
    private String password;


    public Client(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }

}
