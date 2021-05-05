public class test{
    public static void main(String[] args){
        double tuition = 10000.0;
        double yearlyIncreasePercentage = 0.05;
        
        double tuitionInTenYears = 0.0;
        double fourYearsOfTuition = 0.0;

        for (int i = 0; i < 14; i++){
            tuition += tuition * yearlyIncreasePercentage; 
            
            if (i == 9)
                tuitionInTenYears = tuition;

            if (i == 10 || i == 11| i == 12 || i == 13)
                fourYearsOfTuition += tuition;
        }

        System.out.printf("Tuition cost after 10 years is: $%.2f%n" + 
            "Four years of tuition after 10 years is: $%.2f%n", 
            tuitionInTenYears, fourYearsOfTuition);
    }
}