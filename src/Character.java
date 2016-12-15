/**
 * Created by xuweijie on 2016/10/22.
 */
public abstract class Character {
    public Weapon weapon;

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public abstract void display();
    public abstract void fight();

}
