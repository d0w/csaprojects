;import greenfoot.*;

/**
 * Space. Something for rockets to fly in.
 * 
 * @author Michael Kölling
 * @version 1.0
 */
public class Space extends World
{
    private Counter scoreCounter;
    private int startAsteroids = 3;
    private int score;

    /**
     * Create the space and all objects within it.
     */
    public Space() 
    {
        super(600, 500, 1);
        GreenfootImage background = getBackground();
        background.setColor(Color.BLACK);
        background.fill();

        createStars(40);
        score = 0;

        Rocket rocket = new Rocket();
        addObject(rocket, getWidth()/2 + 100, getHeight()/2);

        addAsteroids(startAsteroids);

        scoreCounter = new Counter("Score: ");
        addObject(scoreCounter, 60, 480);

        Explosion.initializeImages();
        ProtonWave.initializeImages();
    }

    /**
     * Add a given number of asteroids to our world. Asteroids are only added into
     * the left half of the world.
     */
    private void addAsteroids(int count) 
    {
        for(int i = 0; i < count; i++) 
        {
            int x = Greenfoot.getRandomNumber(getWidth()/2);
            int y = Greenfoot.getRandomNumber(getHeight()/2);
            addObject(new Asteroid(), x, y);
        }
    }

    /**
     * Places number of stars in random locations
     * @param int number
     */
    private void createStars(int number) {
        GreenfootImage star = getBackground();
        for (int i = 0; i < number; i++) {
            star.setColor(Color.WHITE);
            //star.setTransparency(Greenfoot.getRandomNumber(155) + 100);
            star.fillOval(Greenfoot.getRandomNumber(getWidth()), 
                Greenfoot.getRandomNumber(getHeight()), 2, 2);
        }
    }
    
    public void addScore(int val) {
        scoreCounter.add(val);
        score += val;
        
    }
        

    /**
     * This method is called when the game is over to display the final score.
     */
    public void gameOver() {
        addObject(new ScoreBoard(score), getWidth() / 2, getHeight() / 2);
    }

}