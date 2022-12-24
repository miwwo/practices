package prac_6.task3;

public class Girls implements Nameable{
    private String name;

    public Girls(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
