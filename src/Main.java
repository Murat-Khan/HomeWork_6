public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(500);
        boss.setDamage(50);
        boss.getWeapon().setType(WeaponType.TRAUMATIC);
        boss.getWeapon().setName("Makarova");

       Skeleton skelet1 = new Skeleton();
       skelet1.setHealth(600);
       skelet1.setDamage(30);
       skelet1.getWeapon().setType(WeaponType.HUNTING);
       skelet1.getWeapon().setName("Shotgun");
       skelet1.setArrows(45);

       Skeleton skelet2 = new Skeleton();
        skelet2.setHealth(400);
        skelet2.setDamage(20);
        skelet2.getWeapon().setType(WeaponType.FIREARMS);
        skelet2.getWeapon().setName("Kalashnikov");
        skelet2.setArrows(75);

        //System.out.println("Health: " + boss.getHealth() + " Damage: " + boss.getDamage() + " WeaponType: " + boss.getWeapon().getType() + " WeaponName: " + boss.getWeapon().getName());//
        System.out.println(boss.Info());
        System.out.println(skelet1.Info());
        System.out.println(skelet2.Info());
    }
}