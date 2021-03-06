import java.util.*;

public abstract class Progression {

    public ArrayList<Double> termes;
    public double raison;
    public int rang;

    public Progression(double terme, double raison) {
        this.rang = 0;
        this.termes = new ArrayList<Double>();
        this.termes.add(terme);
        this.raison = raison;
    }

    public abstract void next();

    public void next(int n) {
        for (int i=1; i <= n; i++)
            this.next();
    }

    public double getTerme() {
        return this.termes.get(this.rang);
    }

    public String toString() {
        String res = "";

        for (int i=0; i <= this.rang; i++)
            res += this.termes.get(i) + " ";

        return res;
    }
}