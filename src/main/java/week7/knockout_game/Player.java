package week7.knockout_game;

public class Player {

    private String name;        // initialize our private variable, so we can only access "name" within this java class
    private boolean knockedOut;     // are they still in the game or not? true or false
    private int knockoutNumber;     // initialize "knockoutNumber" variable which will be an int

    public Player(String name) {        // initialize public method called "Player" with one argument - name
        this.name = name;       // initialize name variable for Player method. serves as a parameter for other methods.
        this.knockedOut = false;        // initialize knockedOut variable as false within this method.
    }       // end of Player argument. this method will represent a Player in our program.

    public String playTurn(DiceCup diceCup) {       // playTurn will represent a play in our diceCup game.
        int score = diceCup.rollAll();      // diceCup will use the rollAll() method
        // .rollAll will randomize multiple objects at once.
        if (playerKnockedOut(score)) {      //calls playerKnockedOut method in this if statement on variable "score"
            knockedOut = true;      // return knockedOut variable as true
        }       // end of if statement
        // print a format string below called "resultTemplate"
        String resultTemplate = "Player %s rolled a total of %d and %s knocked out. (Your knockout number was %d)";
        // knockedOutOrNot variable = "was not"
        String knockedOutOrNot = "was not";     // knockedOutOrNot variable initialized here.
        // defining print messages to display for our program user...
        if (knockedOut) {       // if knockedOut is equal to true...
            knockedOutOrNot = "was";        // set knockedOutOrNot variable to "was" (Player was knockedOut)
        }       // end of if statement
        String result = String.format(resultTemplate, name, score, knockedOutOrNot, knockoutNumber);
        // formatted string result contains 5 arguments above.
        return result;      // return formatted string variable "result"
    }       // end of public string playTurn method

    private boolean playerKnockedOut(int score) {       // boolean playerKnockedOut method with one argument, "score"
        if (score == knockoutNumber) {      // if score is the knockoutNumber...
            return true;        // return true
        } else {        // if-else block
            return false;       // return false
        }       // end of if-else statement
    }       // playerKnockedOut method ends here. returns boolean values.

    public String getName() {       // getName() method here
        return name;        //
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isKnockedOut() {
        return knockedOut;
    }

    public void setKnockedOut(boolean knockedOut) {
        this.knockedOut = knockedOut;
    }

    public int getKnockoutNumber() {
        return knockoutNumber;
    }

    public void setKnockoutNumber(int knockoutNumber) {
        this.knockoutNumber = knockoutNumber;
    }


}