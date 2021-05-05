import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
    ///////////////////// constructors //////////////////////////////////

    /**
     * Constructor that takes no arguments 
     */
    public Picture ()
    {
        /* not needed but use it to show students the implicit call to super()
         * child constructors always call a parent constructor 
         */
        super();  
    }

    /**
     * Constructor that takes a file name and creates the picture 
     * @param fileName the name of the file to create the picture from
     */
    public Picture(String fileName)
    {
        // let the parent class handle this fileName
        super(fileName);
    }

    /**
     * Constructor that takes the width and height
     * @param height the height of the desired picture
     * @param width the width of the desired picture
     */
    public Picture(int height, int width)
    {
        // let the parent class handle this width and height
        super(width,height);
    }

    /**
     * Constructor that takes a picture and creates a 
     * copy of that picture
     * @param copyPicture the picture to copy
     */
    public Picture(Picture copyPicture)
    {
        // let the parent class do the copy
        super(copyPicture);
    }

    /**
     * Constructor that takes a buffered image
     * @param image the buffered image to use
     */
    public Picture(BufferedImage image)
    {
        super(image);
    }

    ////////////////////// methods ///////////////////////////////////////

    /**
     * Method to return a string with information about this picture.
     * @return a string with information about the picture such as fileName,
     * height and width.
     */
    public String toString()
    {
        String output = "Picture, filename " + getFileName() + 
            " height " + getHeight() 
            + " width " + getWidth();
        return output;

    }

    /** Method to set the blue to 0 */
    public void zeroBlue()
    {
        Pixel[][] pixels = this.getPixels2D();
        for (Pixel[] rowArray : pixels)
        {
            for (Pixel pixelObj : rowArray)
            {
                pixelObj.setBlue(0);
            }
        }
    }

    public void keepOnlyBlue() {
        Pixel[][] pixels = this.getPixels2D();
        for (Pixel[] row : pixels) {
            for (Pixel obj : row) {
                obj.setRed(0);
                obj.setGreen(0);
            }
        }
    }

    public void negate() {
        Pixel[][] pixels = this. getPixels2D();
        for (Pixel[] row : pixels) {
            for (Pixel obj : row) {
                obj.setBlue(255 - obj.getBlue());
                obj.setRed(255 - obj.getRed());
                obj.setGreen(255 - obj.getGreen());
            }
        }
    }

    public void grayscale() {
        Pixel[][] pixels = this. getPixels2D();
        for (Pixel[] row : pixels) {
            for (Pixel obj : row) {
                int avg = (obj.getBlue() + obj.getRed() + obj.getGreen()) / 3;
                obj.setBlue(avg);
                obj.setRed(avg);
                obj.setGreen(avg);
            }
        }
    }

    /** Method that mirrors the picture around a 
     * vertical mirror in the center of the picture
     * from left to right */
    public void mirrorVertical()
    {
        Pixel[][] pixels = this.getPixels2D();
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        int width = pixels[0].length;
        for (int row = 0; row < pixels.length; row++)
        {
            for (int col = 0; col < width / 2; col++)
            {
                leftPixel = pixels[row][col];
                rightPixel = pixels[row][width - 1 - col];
                rightPixel.setColor(leftPixel.getColor());
            }
        } 
    }

    public void mirrorVerticalRightToLeft()
    {
        Pixel[][] pixels = this.getPixels2D();
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        int width = pixels[0].length;
        for (int row = 0; row < pixels.length; row++)
        {
            for (int col = 0; col < width / 2; col++)
            {
                leftPixel = pixels[row][col];
                rightPixel = pixels[row][width - 1 - col];
                leftPixel.setColor(rightPixel.getColor());
            }
        } 
    }

    public void mirrorHorizontal()
    {
        Pixel[][] pixels = this.getPixels2D();
        Pixel bottomPixel = null;
        Pixel topPixel = null;
        int height = pixels.length;
        for (int row = 0; row < height / 2; row++)
        {
            for (int col = 0; col < pixels[0].length; col++)
            {
                topPixel = pixels[row][col];
                bottomPixel = pixels[height - 1 - row][col];
                bottomPixel.setColor(topPixel.getColor());
            }
        } 
    }

    public void mirrorHorizontalBotToTop()
    {
        Pixel[][] pixels = this.getPixels2D();
        Pixel bottomPixel = null;
        Pixel topPixel = null;
        int height = pixels.length;
        for (int row = 0; row < height / 2; row++)
        {
            for (int col = 0; col < pixels[0].length; col++)
            {
                topPixel = pixels[row][col];
                bottomPixel = pixels[height - 1 - row][col];
                topPixel.setColor(bottomPixel.getColor());
            }
        } 
    }

    public void mirrorDiagonal()
    {
        Pixel[][] pixels = this.getPixels2D();
        Pixel topPixel = null;
        Pixel bottomPixel = null;
        int height = pixels.length;
        int width = pixels[0].length;
        for (int row = 0; row < pixels[0].length && row < pixels.length; row++) {
            for (int col = row + 1; col < pixels[0].length && col < pixels.length; col++) {
                topPixel = pixels[row][col];
                bottomPixel = pixels[col][row];
                topPixel.setColor(bottomPixel.getColor());
            }
        }
    }

    /** Mirror just part of a picture of a temple */
    public void mirrorTemple()
    {
        int mirrorPoint = 276;
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        int count = 0;
        Pixel[][] pixels = this.getPixels2D();

        // loop through the rows
        for (int row = 27; row < 97; row++)
        {
            // loop from 13 to just before the mirror point
            for (int col = 13; col < mirrorPoint; col++)
            {

                leftPixel = pixels[row][col];      
                rightPixel = pixels[row]                       
                [mirrorPoint - col + mirrorPoint];
                rightPixel.setColor(leftPixel.getColor());
                count++;
            }
        }
        System.out.println(count);
    }

    public void mirrorArms() {
        Pixel fromPixel = null;
        Pixel toPixel = null;
        Pixel[][] pixels = this.getPixels2D();
        int mirrorPoint = 195;

        for (int row = 165; row < 195; row++) {
            for (int col = 95; col < 290; col++) {
                fromPixel = pixels[row][col];
                toPixel = pixels[mirrorPoint - row + mirrorPoint][col];
                toPixel.setColor(fromPixel.getColor());
            }
        }

    }

    public void mirrorGull()
    {

        Pixel rightPixel = null;
        Pixel leftPixel = null;
        Pixel[][] pixels = this.getPixels2D();
        int mirrorPoint = 345;
        for (int row = 235; row < 323; row++)
        {
            for (int col = 238; col < mirrorPoint; col++)
            {
                rightPixel = pixels[row][col];
                leftPixel = pixels[row][mirrorPoint - col + mirrorPoint/3];
                leftPixel.setColor(rightPixel.getColor());
            }
        }
    }

    /** copy from the passed fromPic to the
     * specified startRow and startCol in the
     * current picture
     * @param fromPic the picture to copy from
     * @param startRow the start row to copy to
     * @param startCol the start col to copy to
     */
    public void copy(Picture fromPic, 
    int startRow, int startCol)
    {
        Pixel fromPixel = null;
        Pixel toPixel = null;
        Pixel[][] toPixels = this.getPixels2D();
        Pixel[][] fromPixels = fromPic.getPixels2D();
        for (int fromRow = 0, toRow = startRow; 
        fromRow < fromPixels.length &&
        toRow < toPixels.length; 
        fromRow++, toRow++)
        {
            for (int fromCol = 0, toCol = startCol; 
            fromCol < fromPixels[0].length &&
            toCol < toPixels[0].length;  
            fromCol++, toCol++)
            {
                fromPixel = fromPixels[fromRow][fromCol];
                toPixel = toPixels[toRow][toCol];
                toPixel.setColor(fromPixel.getColor());
            }
        }   
    }

    public void copy(Picture fromPic, int fromStartR, int fromStartC, int fromEndR,
            int fromEndC, int toStartR, int toStartC) {
        Pixel fromPixel = null;
        Pixel toPixel = null;
        Pixel[][] toPixels = this.getPixels2D();
        Pixel[][] fromPixels = fromPic.getPixels2D();
        
        for (int fromR = fromStartR, toR = toStartR; fromR <= fromEndR && toR < toPixels.length;
                fromR++, toR++) {
            for (int fromC = fromStartC, toC = toStartC; 
                    fromC <= fromEndC && toC < toPixels[0].length;
                    fromC++, toC++) {
                fromPixel = fromPixels[fromR][fromC];
                toPixel = toPixels[toR][toC];
                toPixel.setColor(fromPixel.getColor());
            }
        }
    }
    
    public void myCollage() {
        Picture blue = new Picture("sky.jpg");
        Picture gull = new Picture("seagull.jpg");
        Picture door = new Picture("thrudoor.jpg");
        
        this.copy(blue, 0, 0);
        blue.mirrorHorizontal();
        
        this.copy(gull, 100, 0, 60, 20, 120, 400);
        gull.grayscale();
        
        this.copy(door, 100, 0, 75, 100, 200, 300);
        door.negate();
    }

    /** Method to create a collage of several pictures */
    public void createCollage()
    {
        Picture flower1 = new Picture("flower1.jpg");
        Picture flower2 = new Picture("flower2.jpg");
        this.copy(flower1,0,0);
        this.copy(flower2,100,0);
        this.copy(flower1,200,0);
        Picture flowerNoBlue = new Picture(flower2);
        flowerNoBlue.zeroBlue();
        this.copy(flowerNoBlue,300,0);
        this.copy(flower1,400,0);
        this.copy(flower2,500,0);
        this.mirrorVertical();
        this.write("collage.jpg");
    }

    /** Method to show large changes in color 
     * @param edgeDist the distance for finding edges
     */
    public void edgeDetection(int edgeDist)
    {
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        Pixel[][] pixels = this.getPixels2D();
        Color rightColor = null;
        for (int row = 0; row < pixels.length; row++)
        {
            for (int col = 0; 
            col < pixels[0].length-1; col++)
            {
                leftPixel = pixels[row][col];
                rightPixel = pixels[row][col+1];
                rightColor = rightPixel.getColor();
                if (leftPixel.colorDistance(rightColor) > 
                edgeDist)
                    leftPixel.setColor(Color.BLACK);
                else
                    leftPixel.setColor(Color.WHITE);
            }
        }
    }

    public void fixUnderwater() {
        Pixel[][] pixels = this.getPixels2D();
        long total = 0;
        int num = 0;
        for (Pixel[] row : pixels)
        {
            for (Pixel pixel : row)
            {
                int avg = (pixel.getBlue() + pixel.getRed() + pixel.getGreen()) / 3;
                total += avg;
                num++;
            }
        }
        int avg = (int) (total /= num);
        for (Pixel[] row : pixels)
        {
            for (Pixel pixel : row)
            {
                pixel.setBlue((pixel.getBlue() - avg) * 2);
                pixel.setRed((pixel.getRed() - avg) * 2);
                pixel.setGreen((pixel.getGreen() - avg) * 2);
            }
        }
    }

    /* Main method for testing - each class in Java can have a main 
     * method 
     */
    public static void main(String[] args) 
    {
        Picture sky = new Picture("sky.jpg");
        sky.explore();
        sky.keepOnlyBlue();
        sky.explore();
    }

} // this } is the end of class Picture, put all new methods before this
