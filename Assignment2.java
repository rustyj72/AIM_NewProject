import java.util.Scanner;

class MyClass {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("Enter the scores for 4 of your students below:");
        System.out.println(" ");
        System.out.println("Student 1:");
        int score1 = myObj.nextInt();

        System.out.println("Student 2:");

        int score2 = myObj.nextInt();
        System.out.println("Student 3:");
        int score3 = myObj.nextInt();

        System.out.println("Student 4:");
        int score4 = myObj.nextInt();

        System.out.println(" ");
        //run if score1 is the greatist score
        if (score1 > score2 && score1 > score3 && score1 > score4) {
            int aScore = score1;
            int bScore = score1 - 20;
            int cScore = score1 - 30;
            int dScore = score1 - 40;

            System.out.println("Student 1: " + score1 + " = A");

            //Score student2
            if (score2 < dScore) {
                System.out.println("Student 2: " + score2 + " = F");
            }
            if (score2 > dScore && score2 < cScore) {
                System.out.println("Student 2: " + score2 + " = D");
            }
            if (score2 > cScore && score2 < bScore) {
                System.out.println("Student 2: " + score2 + " = B");
            }
            if (score2 > bScore) {
                System.out.println("Student 2: " + score2 + " = A");
            }

            //Score student3
            if (score3 < dScore) {
                System.out.println("Student 3: " + score3 + " = F");
            }
            if (score3 > dScore && score3 < cScore) {
                System.out.println("Student 3: " + score3 + " = D");
            }
            if (score3 > cScore && score3 < bScore) {
                System.out.println("Student 3: " + score3 + " = B");
            }
            if (score3 > bScore) {
                System.out.println("Student 3: " + score3 + " = A");
            }

            //Score student4
            if (score4 < dScore) {
                System.out.println("Student 4: " + score4 + " = F");
            }
            if (score4 > dScore && score4 < cScore) {
                System.out.println("Student 4: " + score4 + " = D");
            }
            if (score4 > cScore && score4 < bScore) {
                System.out.println("Student 4: " + score4 + " = B");
            }
            if (score4 > bScore) {
                System.out.println("Student 4: " + score4 + " = A");
            }


        }

        //run if score2 is the greatist score
        if (score2 > score1 && score2 > score3 && score2 > score4) {
            int aScore = score2;
            int bScore = score2 - 20;
            int cScore = score2 - 30;
            int dScore = score2 - 40;

            //Score student1
            if (score1 < dScore) {
                System.out.println("Student 1: " + score1 + " = F");
            }
            if (score1 > dScore && score1 < cScore) {
                System.out.println("Student 1: " + score1 + " = D");
            }
            if (score1 > cScore && score1 < bScore) {
                System.out.println("Student 1: " + score1 + " = B");
            }
            if (score1 > bScore) {
                System.out.println("Student 1: " + score1 + " = A");
            }

            System.out.println("Student 2: " + score2 + " = A");

            //Score student3
            if (score3 < dScore) {
                System.out.println("Student 3: " + score3 + " = F");
            }
            if (score3 > dScore && score3 < cScore) {
                System.out.println("Student 3: " + score3 + " = D");
            }
            if (score3 > cScore && score3 < bScore) {
                System.out.println("Student 3: " + score3 + " = B");
            }
            if (score3 > bScore) {
                System.out.println("Student 3: " + score3 + " = A");
            }

            //Score student4
            if (score4 < dScore) {
                System.out.println("Student 4: " + score4 + " = F");
            }
            if (score4 > dScore && score4 < cScore) {
                System.out.println("Student 4: " + score4 + " = D");
            }
            if (score4 > cScore && score4 < bScore) {
                System.out.println("Student 4: " + score4 + " = B");
            }
            if (score4 > bScore) {
                System.out.println("Student 4: " + score4 + " = A");
            }
        }

        //run if score 3 is the greatist score
        if (score3 > score2 && score3 > score1 && score3 > score4) {
            int aScore = score3;
            int bScore = score3 - 20;
            int cScore = score3 - 30;
            int dScore = score3 - 40;

            //Score student1
            if (score1 < dScore) {
                System.out.println("Student 1: " + score1 + " = F");
            }
            if (score1 > dScore && score1 < cScore) {
                System.out.println("Student 1: " + score1 + " = D");
            }
            if (score1 > cScore && score1 < bScore) {
                System.out.println("Student 1: " + score1 + " = B");
            }
            if (score1 > bScore) {
                System.out.println("Student 1: " + score1 + " = A");
            }


            //Score student2
            if (score2 < dScore) {
                System.out.println("Student 2: " + score2 + " = F");
            }
            if (score2 > dScore && score2 < cScore) {
                System.out.println("Student 2: " + score2 + " = D");
            }
            if (score2 > cScore && score2 < bScore) {
                System.out.println("Student 2: " + score2 + " = B");
            }
            if (score2 > bScore) {
                System.out.println("Student 2: " + score2 + " = A");
            }

            //Score student3
            System.out.println("Student 3: " + score3 + " = A");

            //Score student4
            if (score4 < dScore) {
                System.out.println("Student 4: " + score4 + " = F");
            }
            if (score4 > dScore && score4 < cScore) {
                System.out.println("Student 4: " + score4 + " = D");
            }
            if (score4 > cScore && score4 < bScore) {
                System.out.println("Student 4: " + score4 + " = B");
            }
            if (score4 > bScore) {
                System.out.println("Student 4: " + score4 + " = A");
            }


        }


        //run if score4 is the greatist score
        if (score4 > score2 && score4 > score3 && score4 > score1) {
            int aScore = score4;
            int bScore = score4 - 20;
            int cScore = score4 - 30;
            int dScore = score4 - 40;

            //Score student1
            if (score1 < dScore) {
                System.out.println("Student 1: " + score1 + " = F");
            }
            if (score1 > dScore && score1 < cScore) {
                System.out.println("Student 1: " + score1 + " = D");
            }
            if (score1 > cScore && score1 < bScore) {
                System.out.println("Student 1: " + score1 + " = B");
            }
            if (score1 > bScore) {
                System.out.println("Student 1: " + score1 + " = A");
            }


            //Score student2
            if (score2 < dScore) {
                System.out.println("Student 2: " + score2 + " = F");
            }
            if (score2 > dScore && score2 < cScore) {
                System.out.println("Student 2: " + score2 + " = D");
            }
            if (score2 > cScore && score2 < bScore) {
                System.out.println("Student 2: " + score2 + " = B");
            }
            if (score2 > bScore) {
                System.out.println("Student 2: " + score2 + " = A");
            }

            //Score student3
            if (score3 < dScore) {
                System.out.println("Student 3: " + score3 + " = F");
            }
            if (score3 > dScore && score3 < cScore) {
                System.out.println("Student 3: " + score3 + " = D");
            }
            if (score3 > cScore && score3 < bScore) {
                System.out.println("Student 3: " + score3 + " = B");
            }
            if (score3 > bScore) {
                System.out.println("Student 3: " + score3 + " = A");
            }


            System.out.println("Student 4: " + score4 + " = A");

        }


        }
    }
