package prac_6.task3;

public class Boys implements Nameable {
    private String name;

    public Boys(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
