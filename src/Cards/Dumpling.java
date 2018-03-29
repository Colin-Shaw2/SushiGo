package Cards;


public class Dumpling extends Card {

    private String imagePath = "/Game/CardImages/Dumpling.jpg";

    public Dumpling() {
        super("Dumpling");
    }

    public Dumpling(String name) {
        super(name);
    }

    public String getImagePath() {
        return imagePath;
    }
}
