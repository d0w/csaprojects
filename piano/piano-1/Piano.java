import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * A piano that can be played with the computer keyboard.
 * 
 * @author: M. Kölling
 * @version: 0.1
 */
public class Piano extends World
{
    /**
     * Make the piano.
     */
    public Piano() 
    {
        super(800, 340, 1);
        makeKeys();
        makeBlackKeys();
    }

    void makeKeys() {
        int i = 0;
        String[] keyNameArray = {"a", "s", "d", "f", "g", "h", "j", "k", "l", ";", "'", "]"};
        String[] soundFileArray = {"3c", "3d", "3e", "3f", "3g", "3a", "3b", "4c", "4d", "4e", "4f", "4g"};
        while(i < 12) {
            String keyName = keyNameArray[i];
            String soundFile = soundFileArray[i] + ".wav";
            Key key = new Key(keyName, soundFile);

            addObject(key,63 * i + 54, 140);
            i++;
        }
    }

    void makeBlackKeys() {
        int i = 0;
        String[] keyNameArray = {"w", "e", "r", "t", "y", "u", "i", "o", "p", "", "["};
        String[] soundFileArray = {"3c#", "3d#", "", "3f#", "3g#", "3a#", "", "4c#", "4d#", "", "4f#"};
        //used array to fill in spots where black keys do not appear

        while(i < 11) {
            if(soundFileArray[i] != "") {
                //increment through list, whenever theres a space, put no black key
                String keyName = keyNameArray[i];
                String soundFile = soundFileArray[i] + ".wav";
                BlackKey key = new BlackKey(keyName, soundFile);
                addObject(key, 86 + i * 63, 86);
            }
            i++;
        }

    }
}