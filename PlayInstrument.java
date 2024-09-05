//Driver class
public class PlayInstrument{
    public static void main(String[] args) {
        Instrument a = new Instrument();
        Instrument b = new Instrument("Piano", 200.0);
        Instrument c = new Instrument("Violin", 650.9);

        a.setType("Guitar");
        a.setPrice(101.5);
        a.print();
        b.print();
        c.print();
        System.out.println("» Informasi :");

        //paling mahal
        if (a.getPrice() > b.getPrice() && a.getPrice() > c.getPrice()) {
            System.out.println("Harga Guitar Paling Mahal");
        } else if (b.getPrice() > a.getPrice() && b.getPrice() > c.getPrice()) {
            System.out.println("Harga Piano Paling Mahal");
        } else {
            System.out.println("Harga Violin Paling Mahal");
        }

        //paling murah
        if (a.getPrice() < b.getPrice() && a.getPrice() < c.getPrice()) {
            System.out.println("Harga Guitar Paling Murah");
        } else if (b.getPrice() < a.getPrice() && b.getPrice() < c.getPrice()) {
            System.out.println("Harga Piano Paling Murah");
        } else {
            System.out.println("Harga Violin Paling Murah");
        }
        System.out.println("==============");
    }
}