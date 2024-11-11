public class Numarcomplex {
    private int  real;
    private int imag;
    public Numarcomplex(int real, int imag) {
        this.real = real;
        this.imag = imag;
    }
    public int getReal() {
        return this.real;
    }
    public int getImag(){
        return this.imag;
    }
    public void setReal(int real) {
        this.real = real;
    }
    public void setImag(int imag) {
        this.imag = imag;
    }

    @Override
    public String toString() {
        if(imag < 0){
            return real+""+imag+"i";
        }
        else
        {
            return real+"+"+imag +"i";
        }
    }
    public Numarcomplex adunare(Numarcomplex a, Numarcomplex b){
        return new Numarcomplex(b.real+a.real, b.imag+a.imag);
    }
    public Numarcomplex scadere(Numarcomplex a, Numarcomplex b){
        return new Numarcomplex(b.real-a.real, b.imag-a.imag);
    }
    public Numarcomplex inmultireScalar(Numarcomplex a,int scalar){
        return new Numarcomplex(a.real * scalar, a.imag * scalar);
    }
    public Numarcomplex inmultire(Numarcomplex a, Numarcomplex b){
        Numarcomplex returnat = new Numarcomplex(1, 1);
        returnat.real = a.real * b.real - a.imag * b.imag;
        returnat.imag = a.real * b.real + a.imag * b.imag;
        return returnat;
    }
}
