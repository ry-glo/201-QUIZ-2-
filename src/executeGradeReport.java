public class GradeReport {
public static void executeGradeReport (double score) {

        //step one is to call validateScore

    if (validateScore(score) == false ) {        // when not valid
        System.out.println("Invalid score");
        return;
    }
    else{
        char letterGrade = calculateLetterGrade(score);
        displayPerformanceMessage(letterGrade);

    }

    }

}
