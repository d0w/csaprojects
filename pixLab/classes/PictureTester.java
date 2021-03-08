/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
    /** Method to test zeroBlue */
    public static void testZeroBlue()
    {
        Picture beach = new Picture("beach.jpg");
        beach.explore();
        beach.zeroBlue();
        beach.explore();
    }

    /** Method to test mirrorVertical */
    public static void testMirrorVertical()
    {
        Picture caterpillar = new Picture("caterpillar.jpg");
        caterpillar.explore();
        caterpillar.mirrorVertical();
        caterpillar.explore();
    }

    /** Method to test mirrorTemple */
    public static void testMirrorTemple()
    {
        Picture temple = new Picture("temple.jpg");
        temple.explore();
        temple.mirrorTemple();
        temple.explore();
    }

    /** Method to test the collage method */
    public static void testCollage()
    {
        Picture canvas = new Picture("640x480.jpg");
        canvas.createCollage();
        canvas.explore();
    }

    /** Method to test edgeDetection */
    public static void testEdgeDetection()
    {
        Picture swan = new Picture("swan.jpg");
        swan.edgeDetection(10);
        swan.explore();
    }

    public static void testOnlyBlue() {
        Picture blue = new Picture("sky.jpg");
        blue.explore();
        blue.keepOnlyBlue();
        blue.explore();
    }

    public static void testNegate() {
        Picture blue = new Picture("sky.jpg");
        blue.explore();
        blue.negate();
        blue.explore();
    }

    public static void testGrayscale() {
        Picture blue = new Picture("sky.jpg");
        blue.explore();
        blue.grayscale();
        blue.explore();
    }

    public static void testFixWater() {
        Picture water = new Picture("water.jpg");
        water.explore();
        water.fixUnderwater();

    }

    public static void testVerticalRightToLeft() {
        Picture blue = new Picture("sky.jpg");
        blue.explore();
        blue.mirrorVerticalRightToLeft();
        blue.explore();
    }
    
    public static void testMirrorHorizontal() {
        Picture blue = new Picture("sky.jpg");
        blue.explore();
        blue.mirrorHorizontal();
        blue.explore();
    }
    
    public static void testHorizontalBotToTop() {
        Picture blue = new Picture("sky.jpg");
        blue.explore();
        blue.mirrorHorizontalBotToTop();
        blue.explore();
    }
    
    public static void testMirrorDiagonal() {
        Picture blue = new Picture("sky.jpg");
        blue.explore();
        blue.mirrorDiagonal();
        blue.explore();
    }
    
    public static void testMirrorArms() {
        Picture snow = new Picture("snowman.jpg");
        snow.explore();
        snow.mirrorArms();
        snow.explore();
    }
    
    public static void testMirrorGull() {
        Picture gull = new Picture("seagull.jpg");
        gull.explore();
        gull.mirrorGull();
        gull.explore();
    }
    
    public static void testCopy() {
        Picture gull = new Picture("seagull.jpg");
        Picture blue = new Picture("sky.jpg");
        blue.copy(gull, 1, 50, 2, 30, 30, 40); 
        blue.explore();
    }
    
    public static void testMyCollage() {
        Picture pic = new Picture("640x480.jpg");
        pic.myCollage();
        pic.explore();
    }

    /** Main method for testing.  Every class can have a main
     * method in Java */
    public static void main(String[] args)
    {
        // uncomment a call here to run a test
        // and comment out the ones you don't want
        // to run
        testZeroBlue();
        testOnlyBlue();
        //testKeepOnlyRed();
        //testKeepOnlyGreen();
        testNegate();
        testGrayscale();
        testFixWater();
        testMirrorVertical();
        testMirrorTemple();
        //testMirrorArms();
        //testMirrorGull();
        //testMirrorDiagonal();
        testCollage();
        //testCopy();
        testEdgeDetection();
        //testEdgeDetection2();
        //testChromakey();
        //testEncodeAndDecode();
        //testGetCountRedOverValue(250);
        //testSetRedToHalfValueInTopHalf();
        //testClearBlueOverValue(200);
        //testGetAverageForColumn(0);
    }
}