public class Monsters {
    private String name;
    private double rating;
    private double Hp;
    private double armor;

    public Monsters(String n, double r, double hp, double a){
        name = n;
        rating = r;
        Hp = hp;
        armor = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getHp() {
        return Hp;
    }

    public void setHp(double hp) {
        this.Hp = hp;
    }

    public double getArmor() {
        return armor;
    }

    public void setArmor(double armor) {
        this.armor = armor;
    }
    public String toString(){
        return "Monster{" + name + " challenge rating:" + rating + " health:" + Hp + " armor:" + armor + "}";
    }
}
