package main.java.basics.recursions.exercises;

public class ExerciseEight {

    public static int yz, nr, pc;

    public static int brasil(int wx) {
        pc+=1;
        if(wx < 2) return 4;
        else return pc + brasil(wx - 1);
    }

    public static void main(String[] args) {
        nr = 3;
        pc = 0;
        yz = brasil(nr);
        System.out.println(yz);
        System.out.println(pc);
    }

    // pc = 1 + () [wx 3]
    // pc = 2 + () [wx 2]
    // pc = 4 [wx 1]
    // 1 + 2 + 4 -> 7
    // RESULTADO --> yz = 7, pc = 3 (LETRA E)

}
