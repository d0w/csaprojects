import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * @author 
 * @version 
 */
public class Bloodstream extends World
{
    private int score;
    private int time;

    /**
     * Constructs BloodStream World
     */
    public Bloodstream()
    {    
        super(780, 360, 1); 
        setPaintOrder(Border.class);
        showScore();
        score = 0;
        prepare();
        showTime();
    }

    /**
     * Adds new Bacteria object to world at (779, randomLocation)
     */
    public void act()
    {
        if (Greenfoot.getRandomNumber(100) < 3)
        {
            addObject(new Bacteria(), 779, Greenfoot.getRandomNumber(360));
        }
        if (Greenfoot.getRandomNumber(100) < 1) {
            addObject(new Lining(), 779, Greenfoot.getRandomNumber(360));
        }
        if (Greenfoot.getRandomNumber(100) < 6) {
            addObject(new RedCell(), 779, Greenfoot.getRandomNumber(360));
        }
        spawnVirus();
        countTime();
        if (time > 2000) {
            showEndMessage();
            Greenfoot.stop();
        }
    }

    public void spawnVirus() {
        if (Greenfoot.getRandomNumber(100) < 1) {
            addObject(new Virus(), 779, Greenfoot.getRandomNumber(360));
        }
    }

    /**
     * Show score
     */
    public void showScore() {

        Integer.toString(score);
        showText("Score: " + score, 80,25);
    }
    
    
    /**
     * Adds score to score 
     * @param int points
     */
    public void addScore(int points) {
        score += points;
        showScore();

        if (score < 0) {
            Greenfoot.playSound("game-over.wav");
            Greenfoot.stop();
        }
    }
    
    /**
     * Increments the time
     */
    private void countTime() {
        time++;
        showTime();
    }
    
    /**
     * Shows Time
     */
    private void showTime() {
        Integer.toString(time);
        showText("Time: " + time, 200,25);
    }
    
    private void showEndMessage() {
        showText("You win. Score: " + score, 300, 230); 
    }
    
    
    
    /**
     * Prepares the world visuals
     * 
     */
    private void prepare()
    {
        WhiteCell whitecell = new WhiteCell();
        addObject(whitecell, 100, 179);
        Lining lining = new Lining();
        addObject(lining, 126, 1);
        Lining lining2 = new Lining();
        addObject(lining2, 342, 5);
        Lining lining3 = new Lining();
        addObject(lining3, 589, 2);
        Lining lining4 = new Lining();
        addObject(lining4, 695, 5);
        Lining lining5 = new Lining();
        addObject(lining5, 114, 359);
        Lining lining6 = new Lining();
        Lining lining7 = new Lining();
        addObject(lining7, 295, 353);
        Lining lining8 = new Lining();
        Lining lining9 = new Lining();
        Lining lining10 = new Lining();
        addObject(lining10, 480, 358);
        Lining lining11 = new Lining();
        addObject(lining11, 596, 359);
        Lining lining12 = new Lining();
        addObject(lining12, 740, 354);

        Border border1 = new Border();
        addObject(border1, 0, 180);
        addObject(new Border(), 770, 180);
    }
}
