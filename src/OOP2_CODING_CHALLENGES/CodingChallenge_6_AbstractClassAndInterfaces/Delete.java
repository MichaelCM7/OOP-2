package OOP2_CODING_CHALLENGES.CodingChallenge_6_AbstractClassAndInterfaces;

public class Delete implements DataSource{
    @Override
    public void execute(){
        System.out.println("Data has been deleted.");
    }
}
