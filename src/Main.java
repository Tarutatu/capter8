//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
public class Main {
    public static void main(String[] args) {
        Hero h = new Hero();
        h.name = "ミナト";
        h.hp = 100;
        //System.out.println("勇者" + h.name + "を生み出しました！");

        Matango m1 = new Matango();
        m1.hp = 48;
        m1.suffix = 'A';

        Matango m2 = new Matango();
        m2.hp = 48;
        m2.suffix = 'B';

        h.slip();
        m1.run();
        h.sit(5);
        m2.run();
        h.slip();
        h.slip();
        h.sit(30);
        h.run();

    }
}