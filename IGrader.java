
public interface IGrader {

    Double gradeA = 0.90;
    Double gradeB = 0.80;
    Double gradeC = 0.70;
    Double gradeD = 0.60;
    Double gradeF = 0.59;

    void readScore();
    void calcLetterGrade();
    void printGrade();



}
