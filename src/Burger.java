public class Burger {

    public String bun;
    public int meat = 1;
    public String salad;
    public boolean mayo;



    public Burger(String bun, int meat, String salad, boolean mayo) {
        this.bun = bun;
        this.meat = meat;
        this.salad = salad;
        this.mayo = mayo;
        System.out.println(toString());
    }

    public Burger(String bun, String salad) {
        this.bun = bun;
        this.salad = salad;
        System.out.println(toString());
    }

    public Burger(String bun, String salad, boolean mayo) {
        this.bun = bun;
        this.salad = salad;
        this.mayo = mayo;
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Burger{" +
                "bun='" + bun + '\'' +
                ", meat=" + (meat > 1 ? "meat x " + meat : "meat") +
                ", salad='" + salad + '\'' +
                ", mayo=" + (mayo ? "mayo" : "without mayo") +
                '}';
    }
}
