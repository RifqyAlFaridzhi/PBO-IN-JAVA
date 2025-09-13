package soal7;

public class Akun {
    protected String username;
    protected String email;

    public Akun(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public Akun() {
        this.username = "defaultUser";
        this.email = "default@email.com";
    }

    public void login() {
        System.out.println(username + " telah login dengan email " + email);
    }

    public String getUsername() { 
        return username; 
    }
    public void setUsername(String username) { 
        this.username = username; 
    }

    public String getEmail() { 
        return email; 
    }

    public void setEmail(String email) { 
        this.email = email; 
    }
}