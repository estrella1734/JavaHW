Contains 15 Java exercises:

1. Exercise of selective narration-Season
Enter the months from January to December, use switch to determine the corresponding seasons of spring, summer, autumn and winter and print them out. If it is not in this range, "input error" will be printed.

2. Exercise of selective narration-Salary
Enter the number of hours worked by convenience store work-study students and calculate their salary.
Within 60 hours, the hourly wage is 150 yuan.
61~80 hours, calculated at 1.25 times hourly wage.
Over 81 hours, calculated at 1.5 times hourly wage.
Note: Salary is calculated on a cumulative basis. If the working hours are 90 hours, the salary is 60*150 + 20*150*1.25 + 10*150*1.5 yuan.

3. Exercises in Selective Narration-Electricity
Electric power companies use a cumulative method to calculate electricity bills, which are divided into non-business electricity and business electricity.
Enter the type of electricity used and the kilowatt hour to calculate the electricity bill to be paid. (All are calculated based on non-summer months)
    
4. Exercises in Selective Narration-LeapYear
Enter the first year of the year, such as 2015. Determine whether this year is a leap year.
Tip: There is a leap every four years, there is no leap every hundred years, and there is a leap every four hundred years.

5. Exercise of selective narrative-Refund
Enter the amount due and actual payment for purchases at a certain store.
If the actual amount paid is less than the amount payable, "insufficient amount" will be printed.
If the actual amount paid is equal to the amount payable, "no change required" is printed.
If the actual amount paid is greater than the amount payable, the number of banknotes and coins with the smallest amount recovered will be output.
Assume that the currency values ​​are only 1000, 500, and 100 yuan banknotes and 50, 10, 5, and 1 yuan coins.
Explanation: If you buy a product worth 132 yuan and pay 1,000 yuan, you should get back one piece of 500 yuan, three pieces of 100 yuan, one 50 yuan coin, one 10 yuan coin, one 5 yuan coin and three 1 yuan coins.

6. Exercises in selective narration-Equation
The quadratic equation ax2+bx+c=0. Enter the three values ​​a, b, c and calculate the roots of the equation.
b2-4ac > 0, there are two unequal real roots.
b2-4ac = 0, there are two equal real roots.
b2-4ac < 0, then "no real root" is printed.

7. Practice of returning to the circle-Expression
Use the for loop to calculate the value of 12-22+32-42+…+492-502.

8. Practice of returning to the circle-Factor
Enter a positive integer and find all its factors.
Explanation: The factors of 36 are 1, 2, 3, 4, 6, 9, 12, 18, 36.

9. Practice of returning to the circle-PerfectNumber
A number is a perfect number if it is equal to the sum of all its factors.
Find all perfect numbers within 100.
Explanation: The factors of 6 are 1, 2, 3, 6=1+2+3, so 6 is a perfect number.

10. Practice of returning to the circle-Amstrong
An Amstrong number is a three-digit integer whose sum of cubes is equal to the number itself.
Find all Amstrong numbers.
Explanation: 153=13+53+33, so 153 is the Amstrong number.

11. Loop practice-Prime
Input a positive integer and find all prime numbers less than or equal to it.

12. One-dimensional array exercises-MaxMin
Place 10 numbers in a one-dimensional array in advance, and find the largest value and the smallest value among the 10 numbers.

13. Exercises on two-dimensional array-Sales
A certain company has five products, A, B, C, D and E,
with unit prices of 12, 16, 10, 14 and 15 yuan respectively.
The company has three salesmen and their sales volume in a certain month is as follows. Show

Salesperson Product A Product B Product C Product D Product E
Jean 33 32 56 45 33
Tom 77 33 68 45 23
Tina 43 55 43 67 65
Try calculation:
a. Total sales amount per salesperson
b. The salesperson with the best performance (the one with the largest total sales amount)
c. Total sales amount of each product
d. The product with the largest total sales amount

14. Exercises on encapsulation, inheritance, polytypes and modifiers-Employee
There is a company where every employee has basic information such as name, gender, date of employment, phone number, and email address. The company has two types of employees, permanent and temporary. Permanent employees are divided into three types: general staff, supervisors and salespeople. Permanent employees all receive salary and lunch allowance (fixed at 2,400 yuan); supervisors also receive performance bonuses and transportation allowances (fixed). (3,000 yuan); salespersons will receive additional sales bonuses; temporary employees will receive hourly wages.
In main(), four instances are generated, namely supervisor, general employee, salesperson and temporary employee (the data is directly in the program through the constructor hard code), and their basic information and current month's salary are printed.
Note: The general staff's salary is the basic salary plus lunch allowance, the supervisor's salary is the basic salary plus lunch allowance plus efficiency bonus and transportation allowance, the salesperson's salary is the basic salary plus lunch allowance plus sales bonus, and the temporary employee's salary is the hourly wage. Multiply by the number of hours worked in the month.

15. Interface practice-Shape
There is an interface named Shape, which has two member methods: one is to calculate the area computeArea(), and the other is to calculate the perimeter computeCircumference().
Write two categories, Circle and Rectangle, to implement the above interface and verify the results.
