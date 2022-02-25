public class Main {

    public static void main(String argv[]) {
        Pile maPile = Pile.CreerPile(10);
        if (!maPile.est_vide()) System.out.println("NOK");

        maPile.empiler(5);
        if (maPile.est_vide()) System.out.println("NOK");

        int element = maPile.depiler();
        if (!maPile.est_vide()) System.out.println("NOK");
        if (element != 5) System.out.println("NOK");
        
        if(!maPile.est_vide()) System.out.println(maPile.sommet());
        if(!maPile.est_vide()) maPile.vider();
    }
}