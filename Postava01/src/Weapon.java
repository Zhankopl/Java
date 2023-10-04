public class Weapon {
    private int damage;
    private int durability;

    public Weapon(int damage, int durability) {
        this.damage = damage;
        this.durability = durability;
    }

    public int getDamage() {
        return damage;
    }

    public int getDurability() {
        return durability;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "damage=" + damage +
                ", durability=" + durability +
                '}';
    }
}
