package OOP2_CODING_CHALLENGES.CodingChallenge_6_AbstractClassAndInterfaces;

public class Admin extends Account {
    private String AuthPassword;

    public Admin(int _id, String _name, String _password){
        this.id = _id;
        this.name = _name;
        this.AuthPassword = _password;
    }
}
