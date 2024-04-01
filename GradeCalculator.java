import java.util.Scanner;

public class GradeCalculator {
    //input:take marks obtained /100 in each subject
    //sum up marks obtained in each subject
    //calculate average %
    //Grade calculation - assign grades based on the average %
    //Display results - show the av%,& corresponding grade to user

    //we have a variable "total units" and assign it a value.
    //we will prompt the user for their marks and use the ttl units to loop through the scanner.
    //after user puts all the subject we will calculate average percentage
    //it is not a must the user to put all units, they'll have an option to put less units than required.
    //we will the assign grades based on av%
    //lastly, show av% and grade of the user


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalUnits = 7;
        int totalMarks = 700;
        //int numUnits = totalUnits;
        float sum = 0;


        System.out.println("---Grade calculator---<br>");


        int marks = 0;
        for (int tunit = 1; tunit <= totalUnits; tunit++) {
            System.out.println("Enter marks obtained in your units");
            marks = scanner.nextInt();
            scanner.nextLine();
            sum += marks;
            //int avp = sum/numUnits * 100;

            if (tunit == totalUnits) {
                System.out.println("Maximum number of units reached");
            } else if (tunit < totalUnits) {
                System.out.println("Do you wants to continue(y/n)");
                String choice = scanner.nextLine();

                if (choice.equalsIgnoreCase("y")) {
                   
                    System.out.println("Your current total marks is:" + sum);
                } else if (choice.equalsIgnoreCase("n")) {
                    System.out.println("You have choosen to exit");

                    break;
                } else {
                    System.out.println("Incorrect input!!! Pls try again");
                    tunit--;// decreament loop counter to allow re-entering choice
                }

            }
              
            }
            scanner.close();
            float avp = (sum/totalUnits) * 100;
            System.out.println("Your total marks is: " + sum);
            System.out.println("Your % average is: " + avp + "%");
            if(avp >= 70){
                System.out.println("Grade A");
            }else if (avp >= 60 && avp < 70 ) {
                System.out.println("Grade B");
            }else if (avp >= 50 && avp < 60) {
                System.out.println("Grade C");
            }else if (avp >= 40 && avp < 50) {
                System.out.println("Grade D");
            }else if (avp < 40) {
                System.out.println("Fail");
            }
        }

        }
        

    

    

