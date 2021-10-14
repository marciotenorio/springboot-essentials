package academy.devdojo.springboot.domain;

public class Anime {

    //Problems with serializer commonly is that a model don't have getters and setters
    private String name;

    public Anime(String name) {
        this.name = name;
    }

    public Anime(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
