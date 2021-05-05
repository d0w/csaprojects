
/**
 * Write a description of class testing here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class testing
{
    //part A
    public int limitAmplitude(int limit) {
        int counter = 0;
        for (int i = 0; i < samples.length; i++) {
            if (samples[i] > limit) {
                samples[i] = limit;
                counter++;
            }
            else if (samples[i] < (limit*-1)) {
                samples[i] = limit;
                counter++;
            }
            
        }
    }
    
    
    //part B
    public void trimSilenceFromBeginning() {
        int counter = 0;
        int[] sampler = new int[samples.length];
        for (int i = 0; i < samples.length; i++) {
            sampler[i] = samples[i];
        }
        
        for (int i = 0; i < samples.length; i++) {
            if (samples[i] == 0) {
                counter++;
            }
            else if (samples[i] != 0) {
                break;
            }
        }
        
        samples = new int[samples.length-counter];
        for (int i = 0; i < samples.length; i++) {
            samples[i] = sampler[i+counter];
        }
    }
}
