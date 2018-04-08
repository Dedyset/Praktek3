package praktek03;

public class SmartphoneAksi {
    public static void main(String[] args) {
        Smartphone s = new Smartphone();
        s.setMerk ("Xiomi");
        s.setWarna ("Hitam");
        s.setHarga(1900000);
        
        s.cetakInfo();
        
        System.out.print("Merknya \t: ");
        System.out.println(s.getMerk());
        System.out.print("Warnanya \t: ");
        System.out.println(s.getWarna());
        System.out.print("Harganya \t: ");
        System.out.println(s.getHarga());
    }
}
