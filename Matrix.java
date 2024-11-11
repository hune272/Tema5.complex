import java.util.Random;
public class Matrix {
    private int nrLines;
    private int nrCols;
    Numarcomplex[][] mat;

    public Numarcomplex[][] getMat() {
        return mat;
    }
    public Matrix(int nrLines, int nrCols) {
        this.nrLines = nrLines;
        this.nrCols = nrCols;
        mat = new Numarcomplex[nrLines][nrCols];
        for (int i = 0; i < nrLines; i++) {
            for (int j = 0; j < nrCols; j++) {
                mat[i][j] = new Numarcomplex(new Random().nextInt(10), new Random().nextInt(10));
            }
        }
    }
    public int getNrLines() {
        return nrLines;
    }
    public int getNrCols() {
        return nrCols;
    }
    public void setNrLines(int nrLines) {
        this.nrLines = nrLines;
    }
    public void setNrCols(int nrCols) {
        this.nrCols = nrCols;
    }
    public void afisare(Numarcomplex[][] a){
        for (int i = 0; i < nrLines; i++) {
            for (int j = 0; j < nrCols; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
    public Numarcomplex[][] adunareMatrice(Numarcomplex[][] a, Numarcomplex[][] b){
        Numarcomplex[][] c = new Numarcomplex[nrLines][nrCols];
        for(int i = 0; i < nrLines; i++){
            for(int j = 0; j < nrCols; j++){
                c[i][j] = c[i][j].adunare(a[i][j], b[i][j]);
            }
        }
        return c;
    }
    public Numarcomplex[][] inmultireScalarMatrice(Numarcomplex[][] a, int scalar){
        Numarcomplex[][] rezultat = new Numarcomplex[nrLines][nrCols];
        for(int i = 0; i < nrLines; i++){
            for(int j = 0; j < nrCols; j++){
                rezultat[i][j] = a[i][j].inmultireScalar(a[i][j], scalar);
            }
        }
        return rezultat;
    }
}
