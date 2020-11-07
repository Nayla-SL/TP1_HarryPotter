package ar.com.ada.online.second.tp1;

import java.util.*;

public class SelectionActions {

    public static Character selectionPart() {

        Character auxCharacter;
        Scanner keyboard = new Scanner(System.in);
        int option;
        boolean aux = true;
        do {
            System.out.println("Digitize what character you want");
            System.out.println("1- Wizard");
            System.out.println("2- Elf");
            System.out.print("Option: ");
            option = keyboard.nextInt();


            switch (option) {
                case 1:
                    //mago
                    aux = false;
                    return gameWizard();// metodo de mago y las elecciones para el juego
                case 2:
                    // elfo
                    aux = false;
                    return gameElf(); //metodo de elfo y las elecciones para el juego
                default:
                    System.out.println("You must choose a valid option.");
                    return null;
            }
        } while (aux);

    }


    public static Wizard gameWizard() {
        int option;

        Wizard playerWizard = new Wizard();
        Scanner keyboard = new Scanner(System.in);
        //selecciona mago
        System.out.print("Choose and type your name: ");
        playerWizard.setName(keyboard.next());
        System.out.println("");
        boolean aux = true;

        //selecciona ubicacion
        do {
            System.out.println("Select a location:");
            System.out.println("1) Hogwarts");
            System.out.println("2) Diagon Alley");
            System.out.println("3) Hogsmeade");
            System.out.print("Option: ");
            option = keyboard.nextInt();
            switch (option) {
                case 1:
                    aux = false;
                    playerWizard.setLocation("1) Hogwarts");
                    break;
                case 2:
                    aux = false;
                    playerWizard.setLocation("2) Diagon Alley");
                    break;
                case 3:
                    aux = false;
                    playerWizard.setLocation("3) Hogsmeade");
                    break;
                default:
                    System.out.println("You must choose a valid option.");
                    playerWizard.setLocation((String) null);
                    break;
            }
        } while (aux);

        System.out.println("");

        playerWizard.setLifeSpan(100);
        playerWizard.setMagicEnergy(100);
        playerWizard.setTypeOfCharacter("Wizard");
        playerWizard.setWand(WandWizard());
        playerWizard.setSpells(SpellSelection());
        playerWizard.isDarkOrNot();
        if (playerWizard.isDarkWizard())
            System.out.println("You are a dark wizard.");
        else
            System.out.println("You are a white wizard");
        playerWizard.configSpells();
        return playerWizard;

    }

    //    metodo de varitas
    public static Wand WandWizard() {

        List<Wand> nWand = new ArrayList<>();
        nWand.add(new Wand(4, "Madera de serpiente"));
        nWand.add(new Wand(5, "Nogal negro"));
        nWand.add(new Wand(2, "Sauce"));
        nWand.add(new Wand(3, "Sauco"));
        nWand.add(new Wand(4, "Diamond"));
        nWand.add(new Wand(5, "Alamo temblon"));
        System.out.printf("Magic wands:\n" +
                "Madera de serpiente: +4 attacking points \n" +
                "Nogal negro: +5 attacking points\n" +
                "Sauce: +2 attacking points \n" +
                "Sauco: +3 attacking points\n " +
                "Diamond: +4 attacking points\n" +
                "Alamo temblon: +5 attacking points\n"
        );
        System.out.println();
        Random random = new Random();
        for (int i = 0; i < nWand.size(); i++) {

        }

        Wand PlayerWand = new Wand();
        PlayerWand = nWand.get(random.nextInt(nWand.size()));
        System.out.println("The wand " + PlayerWand + " has selected you.");

        return PlayerWand;

    }

    public static Elf gameElf() {

        Elf playerElf = new Elf();
        int option;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Choose and type your name: ");
        playerElf.setName(keyboard.next());

        //selecciona ubicacion
        boolean aux = true;
        do {
            System.out.println("Select a location:");
            System.out.println("1) Hogwarts");
            System.out.println("2) Diagon Alley");
            System.out.println("3) Hogsmeade");
            System.out.print("Option: ");
            option = keyboard.nextInt();
            switch (option) {
                case 1:
                    aux = false;
                    playerElf.setLocation("1) Hogwarts");
                    break;
                case 2:
                    aux = false;
                    playerElf.setLocation("2) Diagon Alley");
                    break;
                case 3:
                    aux = false;
                    playerElf.setLocation("3) Hogsmeade");
                    break;
                default:
                    System.out.println("You must choose a valid option.");
                    playerElf.setLocation((String) null);
                    break;
            }
        } while (aux);


        System.out.println("");
        playerElf.setLifeSpan(100);
        playerElf.setMagicEnergy(100);
        playerElf.setSpells(SpellSelection());
        playerElf.configSpells();
        playerElf.isFreeOrNot();
        if (playerElf.isFreeElf())
            System.out.println("You are a free elf");
        else
            System.out.println("You are a house-elf");

        return playerElf;

    }


    public static List<Spell> SpellSelection() {

        Scanner keyboard = new Scanner(System.in);
        int option;


        System.out.println();
        System.out.println("ATTENTION !!!");
        System.out.println();
        System.out.println("You can only choose six spells in total\n");
        System.out.printf("Attacking Spells { \n" +
                "1.	 BOMBARDA MAXIMA { attacks: 10, magic energy used: 5 }\n" +
                "2.  DESMAIUS { attacks: 15, magic energy used: 10 } \n" +
                "3.  EXPULSO { attacks: 20, magic energy used: 15 } \n" +
                "4.  LEVICORPUS { attacks: 12, magic energy used: 6 } \n" +
                "5.  REDUCTO { attacks: 20, magic energy used: 12 } \n" +
                "6.	 CONFRINGO { attacks: 15, magic energy used: 10 } \n" +
                "7.	 DEPRIMO { attacks: 10, magic energy used: 5 } \n" +
                "8.	 GLACIUS { attacks: 25, magic energy used: 20 } \n" +
                "9.	 INCENDIO { attacks: 25, magic energy used: 20 } \n" +
                "10. AVADA KEDAVRA { attacks: 100, magic energy used: 90 } \n" +
                "11. CRUCIATUS { attacks: 80, magic energy used: 70 } \n" +
                "12. IMPERIUS { attacks: 90, magic energy used: 80} \n }\n"
        );
        System.out.printf("Healing Spells { \n" +
                "13. ANAPNEO { recovered life points: 20, magic energy used: 20 } \n" +
                "14. BRAQUIAM EMENDO { recovered life points: 15, magic energy used: 18 }\n" +
                "15. EPISKEY { recovered life points: 10, magic energy used: 15 }\n" +
                "16. OSSIO DISPERSIMUS { recovered life points: 20, magic energy used: 18 }\n" +
                "17. REPARIFORS { recovered life points: 10, magic energy used: 10 }\n" +
                "18. FÉRULA { recovered life points: 15, magic energy used: 15 }\n" +
                "19. VULNERA SANENTUR { recovered life points: 15, magic energy used: 15\n } \n"
        );
        System.out.printf("Recovery Spells { \n" +
                "20. RECUPERA { magic energy recovered: 15, magic energy used 3} \n } \n"
        );


        List<Spell> PlayerChosenSpells = new ArrayList<>();
        boolean aux;
        for (int i = 0; i < 6; i++) {
            do {
                aux = false;
                System.out.println("Choose your spell number " + (i + 1));
                System.out.print("Option: ");
                option = keyboard.nextInt();
                switch (option) {
                    case 1:
                        PlayerChosenSpells.add(new AttackSpell("BOMBARDA MAXIMA", 5, 10));
                        break;
                    case 2:
                        PlayerChosenSpells.add(new AttackSpell("DESMAIUS", 10, 15));
                        break;
                    case 3:
                        PlayerChosenSpells.add(new AttackSpell("EXPULSO", 15, 20));
                        break;
                    case 4:
                        PlayerChosenSpells.add(new AttackSpell("LEVICORPUS", 6, 12));
                        break;
                    case 5:
                        PlayerChosenSpells.add(new AttackSpell("REDUCTO", 12, 20));
                        break;
                    case 6:
                        PlayerChosenSpells.add(new AttackSpell("CONFRIGNO",10,15));
                    case 7:
                        PlayerChosenSpells.add(new AttackSpell("DEPRIMO", 5, 10));
                        break;
                    case 8:
                        PlayerChosenSpells.add(new AttackSpell("GLACIUS", 20, 25));
                        break;
                    case 9:
                        PlayerChosenSpells.add(new AttackSpell("INCENDIO", 20, 25));
                        break;
                    case 10:
                        PlayerChosenSpells.add(new AttackSpell("AVADA KEDAVRA", 90, 100));
                        break;
                    case 11:
                        PlayerChosenSpells.add(new AttackSpell("CRUCIATUS", 70, 80));
                        break;
                    case 12:
                        PlayerChosenSpells.add(new AttackSpell("IMPERIUS", 80, 90));
                        break;
                    case 13:
                        PlayerChosenSpells.add(new HealingSpell("ANAPNEO", 20, 20));
                        break;
                    case 14:
                        PlayerChosenSpells.add(new HealingSpell("BRAQUIAM EMENDO", 18, 15));
                        break;
                    case 15:
                        PlayerChosenSpells.add(new HealingSpell("EPISKEY", 15, 10));
                        break;
                    case 16:
                        PlayerChosenSpells.add(new HealingSpell("OSSIO DISPERSIMUS", 18, 20));
                        break;
                    case 17:
                        PlayerChosenSpells.add(new HealingSpell("REPARIFORS", 10, 10));
                        break;
                    case 18:
                        PlayerChosenSpells.add(new HealingSpell("FERULA", 15, 15));
                        break;
                    case 19:
                        PlayerChosenSpells.add(new HealingSpell("VULNERA SANENTUR", 16, 20));
                        break;
                    case 20:
                        PlayerChosenSpells.add(new RecoverySpell("RECUPERA", 3, 15));
                        break;
                    default:
                        aux = true;
                        System.out.println("You must choose a valid option.");
                }
                System.out.println("You can choose " + (6 - (i + 1)) + " more spells.");
            } while (aux);
        }


        return PlayerChosenSpells;

    }


}