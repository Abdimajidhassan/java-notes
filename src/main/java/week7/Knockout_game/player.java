package week7.Knockout_game;

public class player {
    private String name;
    private boolean knockedOut;
    private int knockoutNumber;

    public player(String name) {
        this.name = name;
        this.knockedOut = false;
    }
    public String playTurn(diceCup diceCup) {
        int score = diceCup.rollall();
        if (playerKnockedOut(score)){
            knockedOut = true;
        }

        String resultTemplate = "Player %s rolled a total of %d and %s knocked out! (your knockout number is %d)";
        String knockedoutornot = " was not knocked out!";
        if (knockedOut){
            knockedoutornot =  "was knocked out!";
        }

        String result = String.format(resultTemplate, name, score, knockedoutornot ,knockoutNumber);
        return result;
    }
    public boolean playerKnockedOut(int score) {
        if (score == knockoutNumber) {
            return true;
        }else {
            return false;
        }
    }

    public String getName() {
        return name;
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
