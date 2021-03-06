package zadanie3extra;

public class CompTest {
    public static void main(String[] args) {

        Overclock oc = new Overclock();

        ComputerAssembly ca = new ComputerAssembly();
        Memory memory1 = new Memory("Kingston", "Gmax", 12000, 4.5);
        Memory memory2 = new Memory("MSI", "Glow", 16000, 4.7);

        Procesor procesor1 = new Procesor("Intel", "Pentium 4", 5.6);
        Procesor procesor2 = new Procesor("Intel", "Core i-7", 5.9);

        Computer comp1 = new Computer("Turbo", memory1, procesor1);
        Computer comp2 = new Computer("Oxygen", memory2, procesor2);

        System.out.println(comp1.procesor.timing + " GHz");

        oc.increaseCpuClock(comp1, 1.0);

        System.out.println(comp1.procesor.timing + " GHz");

        oc.decreaseCpuClock(comp1, 1.0);

        System.out.println(comp1.procesor.timing + " GHz");

        Computer mega = ca.assembly("Mega", "Intel", 9.7, "Razer", 8000, 7.6);

        System.out.println(mega);


    }
}
