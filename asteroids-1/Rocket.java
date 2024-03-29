import greenfoot.*;

/**
 * A rocket that can be controlled by the arrowkeys: up, left, right.
 * The gun is fired by hitting the 'space' key. 'z' releases a proton wave.
 */
public class Rocket extends SmoothMover
{
    private static final int gunReloadTime = 5;         // The minimum delay between firing the gun.
    private static final int protonReload = 100;

    private int reloadDelayCount;               // How long ago we fired the gun the last time.
    private int protonDelay;
    private int shots;
    private boolean canFire;
    private int counter;

    private GreenfootImage rocket = new GreenfootImage("rocket.png");    
    private GreenfootImage rocketWithThrust = new GreenfootImage("rocketWithThrust.png");

    /**
     * Initialise this rocket.
     */
    public Rocket()
    {
        reloadDelayCount = 5;
        protonDelay = 10;
        Vector force = new Vector(Greenfoot.getRandomNumber(360), 0.7);
        addToVelocity(force);
        shots = 0;
        canFire = true;
        counter = 0;
    }

    /**
     * Do what a rocket's gotta do. (Which is: mostly flying about, and turning,
     * accelerating and shooting when the right keys are pressed.)
     */
    public void act()
    {
        checkKeys();
        reloadDelayCount++;
        protonDelay++;
        move();
        checkCollision();
        if (!canFire) {

            counter++;
        }
        if (counter > 50) {
            canFire = true;
            counter = 0;
        }
        reload();
    }
    
    private void reload() {
        if (canFire) {
            GreenfootImage rocket = this.getImage();
            rocket.setTransparency(255);
            setImage(rocket);
        }
        if (!canFire) {
            GreenfootImage rocket = this.getImage();
            rocket.setTransparency(100);
            setImage(rocket);
        }
    }

    private void ignite(boolean param) {
        GreenfootImage ignite = new GreenfootImage("rocketWithThrust.png");
        GreenfootImage nonIg = new GreenfootImage("rocket.png");
        if (param) {
            setImage(ignite);
            Vector ign = new Vector(getRotation(), 0.2);
            addToVelocity(ign);
        }
        if (!param) {
            setImage(nonIg);
        }
    }

    public void checkCollision() {
        Asteroid a = (Asteroid) getOneIntersectingObject(Asteroid.class);
        if (a != null) 
        {
            Space space = (Space) getWorld();
            space.addObject(new Explosion(), getX(), getY());
            space.removeObject(this);
            space.gameOver();
        }
    }

    public void startProtonWave() {
        if (protonDelay >= protonReload) 
        {
            getWorld().addObject(new ProtonWave(), getX(), getY());
            protonDelay = 0;
        }

    }

    /**
     * Check whether there are any key pressed and react to them.
     */
    private void checkKeys() 
    {
        if (canFire) {

            if (Greenfoot.isKeyDown("space")) {
                fire();
            }
        }
        if (Greenfoot.isKeyDown("left")) {
            turn(-5);
        }
        if (Greenfoot.isKeyDown("right")) {
            turn(5);
        }
        if (Greenfoot.isKeyDown("z")) {
            startProtonWave();
        }
        if (Greenfoot.isKeyDown("up")) {
            ignite(true);
        }
        else {
            ignite(false);
        }
    }

    /**
     * Fire a bullet if the gun is ready.
     */
    private void fire() 
    {
        if (reloadDelayCount >= gunReloadTime) 
        {
            Bullet bullet = new Bullet (getVelocity(), getRotation());
            getWorld().addObject (bullet, getX(), getY());
            bullet.move ();
            reloadDelayCount = 0;
            if (canFire) {
                shots++;
                if (shots > 40) {
                    canFire = false;
                    shots = 0;
                }
            }

        }

        

    }

}