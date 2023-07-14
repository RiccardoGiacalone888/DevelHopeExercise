package co.develhope.introduction;


//// Definizione della classe "Programmer"


public class Programmer {
    //// Dichiarazione delle variabili di istanza
    private String name;
    private Integer age;
    private Boolean wearGlasses;

    // // Metodo drinkCoffee() che stampa a console "Espresso is the secret!"
    public void drinkCoffee() {
        System.out.println("Espresso is the secret!");
    }

    // Metodo printDetails che stampa in console name+is a+ age + yo programming!
    public void printDetails() {
        System.out.println(name + " is a " + age + " - yo Programming!");
    }

    // Metodo hasGlasses che stampa is + name + wearing glasses?
    public void hasGlasses() {
        System.out.println("Is " + name + "wearing glasses?");
    }

    public void setName(String name)
    // funzione costruttrice con i vari this. per inizializzare le varibili di istanza dell'oggetto
    {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setWearGlasses(Boolean wearGlasses) {
        this.wearGlasses = wearGlasses;
    }

    // Creazione della classe TestProgrammers
    public class TestProgrammers {
        public static void main(String[] args) {
            //creazione di due oggetti , TesProgrammer 1 e 2
            Programmer TestProgrammer1 = new Programmer();
            Programmer TestProgrammer2 = new Programmer();
            /* Impostazione dello stato degli oggetti assegnando valori alle variabili di istanza
            con chiamata dei metodi drinkCoffee() e printDetails()
             */
            TestProgrammer1.setName("Richi");
            TestProgrammer1.setAge(34);
            TestProgrammer1.setWearGlasses(true);
            TestProgrammer1.drinkCoffee();
            TestProgrammer1.printDetails();
            TestProgrammer1.setWearGlasses(true);

            TestProgrammer2.setName("Eleonora");
            TestProgrammer2.setAge(31);
            TestProgrammer2.setWearGlasses(false);
            TestProgrammer2.drinkCoffee();
            TestProgrammer2.printDetails();
            TestProgrammer2.setWearGlasses(false);

        }
    }
}

