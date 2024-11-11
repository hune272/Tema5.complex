import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Numarcomplex nr1 = new Numarcomplex(1, -7);
        System.out.println(nr1.toString());
        Numarcomplex nr2 = new Numarcomplex(1, 7);
        System.out.println(nr2.toString());
        Numarcomplex nr3 = new Numarcomplex(4, 4);
        System.out.println(nr3.toString());
        nr3 = nr3.inmultireScalar(nr1, 4);
        System.out.println(nr3.toString());
        nr3 = nr3.inmultire(nr1, nr2);
        System.out.println(nr3.toString());
        Numarcomplex nr4 = new Numarcomplex(-5, 6);
        nr4 = nr4.adunare(nr1, nr2);
        System.out.println(nr4.toString());
        Numarcomplex nr5 = new Numarcomplex(7, 2);
        nr5 = nr5.adunare(nr1, nr2);
        System.out.println(nr5.toString());
        Numarcomplex nr6 = new Numarcomplex(5, -2);
        System.out.println("---------------------------");
        Numarcomplex[] nrComplexe;
        nrComplexe = new Numarcomplex[] {nr1, nr2, nr3, nr4, nr5, nr6};
        for(int i =0; i < nrComplexe.length; i++){
            System.out.println(nrComplexe[i].toString());
        }
        System.out.println("---------------------------");
        for(Numarcomplex v: nrComplexe){
            System.out.println(v.toString());
        }
        Matrix m = new Matrix(5, 5);
        m.afisare(m.getMat());

        Matrix m1 = new Matrix(5, 5);
        Matrix m2 = new Matrix(5, 5);
        Numarcomplex[][] rezultat;
        rezultat = m.adunareMatrice(m1.getMat(), m2.getMat());
        Numarcomplex[][] inmultireSec;
        inmultireSec = m.inmultireScalarMatrice(m.getMat(), 5);
        System.out.println("---------------------------------");
        m.afisare(rezultat);
        System.out.println("---------------------------------");
        m.afisare(inmultireSec);
        m1.afisare(m1.getMat());

    }
}
