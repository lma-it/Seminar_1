import java.time.LocalDate;

public class Animal {

    // Поля класса
    private String name;
    private LocalDate birthDate;


    public Animal(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public Animal(LocalDate birthDate, String name) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getInfo(){
        return String.format("Name: %s, Birth Date: %s", this.name, this.birthDate);
    }

    public void setName(String name) {
        this.name = name;
    }
}
