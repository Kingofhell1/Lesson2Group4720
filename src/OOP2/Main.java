package OOP2;

public class Main {
    public static void main(String[] args) {

        Athletics[] athletes = {
                new Human(700, 150),
                new Cat(100, 200),
                new Robot(450, 0),
                new Cat(120, 225),
                new Human(2500, 220)
        };

        Crossable[] equipments = {
                new Wall(50),
                new Treadmill(500),
                new Wall(70)
        };

        for (Athletics athlete : athletes) {
            for (Crossable equipment: equipments) {
                equipment.cross(athlete);
            }
        }
    }
}