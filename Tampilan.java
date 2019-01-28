public class Tampilan {
    public static void main(String[]args){
        bujursangkarr ff = new bujursangkarr();
        lgkrn ii = new lgkrn();

        ff.setSisi(5);
        ff.Keliling();
        System.out.println("jadi keliling adalah bujur sangkar " +ff.getKeliling());

        ii.setJari(10);
        ii.setPhi(3.14);
        ii.keliling();
        System.out.println("jadi keliling lingkaran adalah "+ii.getKeliling());

    }
}
