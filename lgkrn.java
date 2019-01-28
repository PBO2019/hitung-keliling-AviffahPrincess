public class lgkrn {
    private double keliling;
    private double phi = 3.14;
    private int jari = 5;

    public void keliling() {
        this.keliling = 2 * phi * jari;
    }

    public void setKeliling(double Keliling) {
        this.keliling = keliling;
    }

    public double getKeliling() {
        return keliling;
    }

    public double getPhi() {
        return phi;
    }

    public void setJari(int jari) {
        this.jari = jari;
    }

    public void setPhi(double phi) {
        this.phi = phi;
    }
}

