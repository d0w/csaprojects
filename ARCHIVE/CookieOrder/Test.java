import java.util.*;
/**
 * Write a description of class Test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Test
{

    public static void main(String[] args) {
        List digits = new ArrayList<Integer>();
        digits.add(0);
        System.out.println(digits);

        ArrayList nums = new ArrayList<Double>();
        nums.add(3.14);
        nums.add(2.718);
        nums.add(1.618);
        nums.add(0.663);

        
       
    }

    public DownloadInfo getDownloadInfo(String title) {
        for (DownloadInfo download : downloadList) {
            if (download.getTitle().equals(title)) {
                return download;
            }
        }
        return null;
    }

    public void updateDownloads(List<String> titles) {
        for (String title : titles) {
            DownloadInfo get = getDownloadInfo(title);
            if (get == null) {
                DownloadInfo entry = new DownloadInfo(title);
                downloadList.add(entry);
            }
            else {
                get.incrementTimesDownloaded(); 
            }
        }
    }

    
}
