/**
 * Created by xuweijie on 2016/10/22.
 */
public class ShowMain {
    public static void main(String[] args){

        Character queen=new Queen("刘亦菲");
        queen.display();
        queen.setWeapon(new BowAndArrowBehavior());
        queen.fight();

        System.out.println("武器更换为：");
        queen.setWeapon(new SowrdBehavior());
        queen.fight();
    }
}
