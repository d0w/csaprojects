#include <iostream>
#include <ctime>
#include <math.h>
#include <iomanip>

using namespace std;
int students() {
	cout << "Enter the number of students: ";
	int students;
	cin >> students;

	int score;
	int first = 0, second = 0;

	string name;
	string firstPlace, secondPlace;

	for (int i = 0; i < students; i++) {
		cout << "Enter a student name: ";
		cin >> name;
		cout << "Enter a student score: ";
		cin >> score;

		if (i == 0) {
			first = score;
			firstPlace = name;
		}
		else if (i == 1 && score > first) {
			second = first;
			first = score;
			secondPlace = firstPlace;
			firstPlace = name;
		}
		else if (i == 1) {
			second = score;
			secondPlace = name;
		}
		else if (i > 1 && score > first && score > second) {
			second = first;
			secondPlace = firstPlace;
			first = score;
			firstPlace = name;
		}
		else if (i > 1 && score > second) {
			secondPlace = name;
			second = score;
		}
	}

	cout << "Top two students:" << endl;
	cout << firstPlace << "'s score is " << setprecision(1) << fixed << static_cast<double>(first) << endl;;
	cout << secondPlace << "'s score is " << setprecision(1) << fixed << static_cast<double>(second) << endl;;

	return 0;
}

int tuition() {
	double tuition = 10000.0;
	double ten = 0.0;
	double four = 0.0;

	for (int i = 0; i < 14; i++) {
		tuition += tuition * 0.05;

		if (i == 9) {
			ten = tuition;
		}
		if (i == 10 || i == 11 | i == 12 || i == 13)
			four += tuition;
	}
	cout << setprecision(2) << fixed << "Tuition after 10 years is: $" << ten << endl;
	cout << setprecision(2) << fixed << "The total cost of four years' worth of tuition after the tenth year is: $" << four << endl;
	return 0;
}

int averages() {
	double average;
	double total = 0;
	int pos = 0;
	int neg = 0;
	int count = 0;

	cout << "Enter an integer, the input ends if it is 0: ";
	int input;
	cin >> input;
	while (input != 0) {
		count++;
		if (input < 0) {
			neg++;
		}
		else if (input > 0) {
			pos++;
		}
		total += input;
		cin >> input;
	}

	if (total == 0 && count == 0) {
		cout << "No numbers are entered except 0" << endl;
	}
	else {
		cout << "The number of positives is " << pos << endl;
		cout << "The number of negatives is " << neg << endl;
		average = total / static_cast<double>(count);
		cout << "The total is " << total << endl;
		cout << "The average is " << average << endl;
	}
	return 0;
}
int chapter3Lab() {
	double a, b, c, d, e, f;
	cout << "Enter a-f" << endl;
	cin >> a >> b >> c >> d >> e >> f;

	const double EPSILON = 1E-14;
	double check = (a * d - b * c);
	if (abs(check - 0) < EPSILON) {
		cout << "The equation has no solution" << endl;
	}
	else {
		double x = (e * d - b * f) / check;
		double y = (a * f - e * c) / check;
		cout << "x is " << x << " and y is " << y << endl;
	}
	return 0;
}
int exercise1() {
	double a, b, c;
	cout << "Insert Three Values";
	cin >> a >> b >> c;

	const double EPSILON = 1E-14;
	double x = pow(b, 2) - (4 * a * c);
	if (x > 0) {
		double roots = (-b + pow(x, 0.5)) / (2 * a);
		double roots1 = (-b - pow(x, 0.5)) / (2 * a);
		cout << "The roots are " << roots << " and" << roots1 << endl;
	}
	else if (abs(x - 0) < EPSILON) {
		double roots = (-b + pow(x, 0.5)) / (2 * a);
		cout << "The root is: " << roots;
	}
	else {
		cout << "The equation has no real roots" << endl;
	}
	return 0;

}
void test() {
	// area of circle
	double radius;
	double area;

	radius = 20;

	area = radius * radius * 3.14159;

	cout << "Area: " << area << endl;

	int one;
	int two;
	cin >> one >> two;


	// Clock


		   // Obtain the total seconds since the midnight, Jan 1, 1970
	int totalSeconds = time(0);

	// Compute the current second in the minute in the hour
	int currentSecond = totalSeconds % 60;

	// Obtain the total minutes
	int totalMinutes = totalSeconds / 60;

	// Compute the current minute in the hour
	int currentMinute = totalMinutes % 60;

	// Obtain the total hours
	int totalHours = totalMinutes / 60;

	// Compute the current hour
	int currentHour = totalHours % 24;

	// Display results
	cout << "Current time is " << currentHour << ":"
		<< currentMinute << ":" << currentSecond << " GMT" << endl;

	cout << static_cast<int>(24.768 * 100) / 100.0 << endl;

	cout << 'A' + 1 << endl;;
	bool cool = true;
	cout << cool << endl;
	cout << !(3 == 2);





}
int dateGiver()
{
	int y, m, month, days;
	cout << "Enter a month and year";
	cin >> m >> y;
	if (m == 1)
		cout << "January " << y << " has 31 days";
	else if (m == 2)
	{
		if (y % 4 != 0)
			cout << "February " << y << " has 28 days";
		else
			cout << "February " << y << " has 29 days";
	}
	else if (m == 3)
		cout << "March " << y << " has 31 days";
	else if (m == 4)
		cout << "April " << y << " has 30 days";
	else if (m == 5)
		cout << "May " << y << " has 31 days";
	else if (m == 6)
		cout << "June " << y << " has 30 days";
	else if (m == 7)
		cout << "July " << y << " has 31 days";
	else if (m == 8)
		cout << "August " << y << " has 31 days";
	else if (m == 9)
		cout << "September " << y << " has 30 days";
	else if (m == 10)
		cout << "October " << y << " has 31 days";
	else if (m == 11)
		cout << "November " << y << " has 30 days";
	else if (m == 12)
		cout << "December " << y << " has 31 days";
	else
		cout << "The valid input for month is from 1 to 12";
	return 0;
}
void binary() {

   int bin2dec(const string & binarystring) {
       string num = binarystring;
       int dec = 0;

       // initializing base value to 1, i.e 2^0
       int base = 1;

       int len = num.length();
       for (int i = len - 1; i >= 0; i--) {
           if (num[i] == '1')
               dec += base;
           base = base * 2;
       }

       return dec;
   }


   int main() {
       cout << "enter a binary number: ";
       string num;
       cin >> num;
       cout << "decimal value: " << bin2dec(num) << endl;
       return 0;
   }
}
int hexDigitConverter()
{
	cout << "Enter a hex digit: ";
	char hexDigit;
	cin >> hexDigit;

	hexDigit = toupper(hexDigit);
	if (hexDigit <= 'F' && hexDigit >= 'A')
	{
		int value = 10 + hexDigit - 'A';
		cout << "The decimal value for hex digit "
			<< hexDigit << " is " << value << endl;
	}
	else if (isdigit(hexDigit))
	{
		cout << "The decimal value for hex digit "
			<< hexDigit << " is " << hexDigit << endl;
	}
	else
	{
		cout << hexDigit << " is an invalid input" << endl;
	}

	return 0;
}
void investment() {
	double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
		return investmentAmount * pow(1 + monthlyInterestRate, years * 12);
	}


	int testmain() {
		double investAmount;
		double annualRate;

		cout << "The amount invested: ";
		cin >> investAmount;
		cout << "Annual interest rate: ";
		cin >> annualRate;
		annualRate /= 100;

		cout << "Years Future Value" << endl;
		for (int i = 1; i <= 30; i++) {
			cout << i << " ";
			cout << setprecision(2) << fixed;
			cout << futureInvestmentValue(investAmount, annualRate / 12, i);
			cout << "\n";
		}
		return 0;
	}
}
void piThing() {
	double m(double n) {
		double pi = 0;
		for (double i = 1; i < n + 1; i++) {
			pi += pow(-1, i + 1) / (2 * i - 1);
		}
		pi *= 4;
		return pi;
	}
	int testmain() {
		double start = 1;
		double end = 901;
		cout << setw(10) << left << setprecision(4) << fixed;
		cout << "i" << "m(i)" << endl;
		for (double i = start; i < end + 1; i += 100) {
			cout << setw(10) << setprecision(0) << i << setprecision(4) << m(i) << endl;
		}
		return 0;
	}
}
void equations() {
	void solveEquation(double a, double b, double c, double d, double e, double f, double& x, double& y, bool& isSolvable) {
		if ((a * d - b * c) == 0) {
			isSolvable == false;
		}
		else {
			x = (e * d - b * f) / (a * d - b * c);
			y = (a * f - e * c) / (a * d - b * c);
		}

	}

	int main() {
		double a, b, c, d, e, f, x = 0, y = 0;
		bool solve = true;
		cout << "Enter a, b, c, d, e, f: " << endl;
		cin >> a >> b >> c >> d >> e >> f;


		solveEquation(a, b, c, d, e, f, x, y, solve);
		if (solve == false) {
			cout << "The equation has no solution." << endl;
		}
		else {
			cout << "x is: " << x << "\ny is: " << y << endl;
		}
		return 0;
	}
}
class Rectangle {
public:
	Rectangle() {
		width = 1;
		height = 1;
	}
	Rectangle(double w, double h) {
		width = w;
		height = h;
	}

	void changeW(double w) {
		width = w;
	}
	void changeH(double h) {
		height = h;
	}

	double getW() {
		return width;
	}
	double getH() {
		return height;
	}

	double getArea() {
		return width * height;
	}
	double getPerimeter() {
		return (2 * width) + (2 * height);
	}


private:
	double width;
	double height;

};

bool isAnagram(const string& s1, const string& s2) {
	   // Get lengths of both strings
	   int n1 = s1.length();
	   int n2 = s2.length();
	
	   // If length of both strings is not same, then they
	   // cannot be anagram
	   if (n1 != n2)
	       return false;
	
	   // Sort both the strings
	   string str1;
	   str1 = s1;
	   string str2;
	   str2 = s2;
	
	
	   sort(str1.begin(), str1.end());
	   sort(str2.begin(), str2.end());
	
	   // Compare sorted strings
	   for (int i = 0; i < n1; i++)
	       if (str1[i] != str2[i])
	           return false;
	
	   return true;
	}
	
	int main()
	{
	   string s1;
	   string s2;
	   cout << "Enter a string s1: ";
	   cin >> s1;
	   cout << "Enter a string s2: ";
	   cin >> s2;
	   bool test = isAnagram(s1, s2);
	   if (test) {
	       cout << s1 << " and " << s2 << " are anagrams" << endl;
	   }
	   if (!test)
	       cout << s1 << " and " << s2 << " are not anagrams" << endl;
	
	   return 0;
	}