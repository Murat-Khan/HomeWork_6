public class Boss extends GameEntity {
    private Weapon weapon = new Weapon();

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
public String Info(){
        return "Health: " + this.getHealth() + " Damage: " + this.getDamage() + " Weapontype: " + weapon.getType() +
                " Weapon: " + this.getWeapon().getName();
}

}
