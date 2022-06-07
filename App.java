import java.time.LocalDate;

public class App {

    private String name;
    private String loc;
    private LocalDate time;

    public App(String event, LocalDate time, String loc) {
        this.name = event;
        this.time = time;
        this.loc = loc;
    }

    public String getName() {
        return name;
    }

    public void setName(String event) {
        this.name = event;
    }

    public LocalDate getAge() {
        return time;
    }

    public void setAge(LocalDate time) {
        this.time = time;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

}