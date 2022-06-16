// Student id :- #A00255187
// Student Name :- Bhimani Dhavalkumar Zaverbhai
// JAV-1001 - 50733 - App Development for Android - 202205 - 001

public class RollingDie {

    private String DiceName;  // get String for Dicename
    private int Numofside;   // get intiger for number of dice side
    private int Faceofside;  // get intiger for face of side

    public RollingDie() {  // use the Constructors for rollingdice
        DiceName = "d6";    // dice name is d6
        Numofside = 6;      
        rolling();

    }

    public RollingDie(int Numofside) {
        this.Numofside = Numofside;
        DiceName = "d" + Numofside; // dicename is define to d and Number of diceside
        rolling();
    }

    public RollingDie(int Numofside, int Faceofside) {
        this.Numofside = Numofside;
        DiceName = "d" + Numofside;
        this.Faceofside = Faceofside;
    }

    //A roll method to generate a random value
    public void rolling() {
        Faceofside = (int) (1 + Math.random() * Numofside); 
    }

    public String getDiceName() { // use get set method for Dicename
        return DiceName;
    }

    public int getNumofside() {  // use get set method for number of dice side
        return Numofside;
    }

    public int getFaceofside() { // use get set method for Face of side
        return Faceofside;
    }

    public void setNumofside(int Numofside) {  // use set for number of dice side for d6
        this.Numofside = Numofside;
        DiceName = "d6";
    }

    public void setFaceofside(int Faceofside) { 
        this.Faceofside = Faceofside;
    }
    public static void main(String[] args) {

        System.out.println("Defualt DiceName :- D6"); // dicename is d6
        RollingDie d6 = new RollingDie();             // get object d6 for rollingdie
        System.out.println("Face of Dice :- " + d6.getFaceofside());  
        System.out.println("Roll the d6...");    // Roll the dice
        d6.rolling();
        System.out.println("After the roll:- " + d6.getFaceofside()+"\n");  // get value after the roll d6





        System.out.println("Defualt DiceName :- D20");   // dicename is d20
        RollingDie d20 = new RollingDie(20);   // get object d20 for rollingdiee
        System.out.println("Face of Dice :- "  + d20.getFaceofside());
        System.out.println("Roll the d20...");    // Roll the dice
        d20.rolling();
        System.out.println("After the roll " + d20.getFaceofside()+"\n");   // get value after the roll for d20

  



        System.out.println("Defualt DiceName :- D10");   // dicename is d10
        RollingDie d10 = new RollingDie(10);   //get object d10 for rollingdiee
        System.out.println("Face of Dice :-  " + d10.getFaceofside());
        System.out.println("Roll the d10");       // Roll the dice
        d10.rolling();
        System.out.println("After the roll " + d10.getFaceofside()+"\n"); //get value after the roll for d10



        RollingDie[] dice = new RollingDie[5]; // roll dice 5 time
        for (int i = 0; i < dice.length; i++)    
        dice[i] = new RollingDie(6); 
        int rolls = 0;
        do {
            for (int i = 0; i < dice.length; i++) dice[i].rolling(); 

            rolls += 1;
        } while (dice[0].getFaceofside() != dice[1].getFaceofside() || 
                dice[0].getFaceofside() != dice[2].getFaceofside() ||
                dice[0].getFaceofside() != dice[3].getFaceofside() ||
                dice[0].getFaceofside() != dice[4].getFaceofside()
        );
        System.out.println("Bonus Found 5 :-" + rolls); // get the total after roll 5 time

    }
}

