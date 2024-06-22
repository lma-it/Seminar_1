package Task1;
import java.time.LocalDate;

public class Dog extends Animal{

    private Owner owner;

    public Dog(String name, LocalDate birthDate, Owner owner) {
        super(name, birthDate);
        this.owner = owner;
    }

    @Override
    public String getInfo() {
        return String.format("%s Name of owner: %s",super.getInfo(), this.owner.getName());
    }
    
}
