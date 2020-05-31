package question1;

public class UneUtilisation {

    public static void main(String[] args) throws Exception {
        Pile p1 = new Pile(6);
        Pile p2 = new Pile(10);
        // p1 est ici une pile de polygones réguliers PolygoneRegulier.java

        p1.empiler(new PolygoneRegulier(5, 100));
        p1.empiler("polygone");
        p1.empiler(new Integer(100));
        System.out.println(" la pile p1 = " + p1); // Quel est le résultat ?

        p2.empiler(new Integer(1000));
        p1.empiler(p2);
        System.out.println(" la p1 = " + p1); // Quel est le résultat ?

        try {
            p1.empiler(new PolygoneRegulier(4, 100));
            String s = "";
            Object obj = p1.depiler();
            if (obj != null && obj instanceof Pile) {
                s = ((Pile) obj).toString();
            }
            System.out.println("res: " + s);
        } catch (Exception e) {
            e.printStackTrace();
        } // catch
    } // main()
} // UneUtilisation