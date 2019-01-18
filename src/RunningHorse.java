public class RunningHorse {
    public static void main(String[] args) {



    Horse horse1 = new Mustang(15000, "Cheeta");
    Horse horse2 = new Mustang(12000, "Fast Deer");
    Horse horse3 = new Mustang(40000, "Fat Horse");

    Horse[] horses = new Horse[6];

    horses[1]=horse1;
    horses[3]=horse2;
    horses[5]=horse3;
    HorseBarn barn = new HorseBarn(horses);

    System.out.println(barn);
    System.out.println("Cheeta is in stall:"+barn.findHorseSpace("Fast Deer"));

            barn.consolidate();


}}


//08/20/14/18