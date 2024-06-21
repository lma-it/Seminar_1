import java.time.LocalDate;

public class Cat extends Animal{
    // package-private доступ по умолчанию, который виден только в той же папке и всех папках, которые внутри, но не снаружи
    
    private Owner owner;

    // В дочеренем классе, необходимо объявить компилятор с ключевым словом super, иначе компилятор не даст запустить программу
    public Cat(String name, LocalDate birthDate, Owner owner) {
        super(name, birthDate);
        this.owner = owner;
    }

    public Owner getOwner() {
        return owner;
    }

    public String getInfo() {
        return String.format("Name of owner: %s, %s ", this.owner.getName(), super.getInfo());
    }

}
