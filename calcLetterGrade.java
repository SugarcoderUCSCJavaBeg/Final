
public class calcLetterGrade {

    /*
    - Create a output file with the grades of all students (ABC order)
    - Each line has one student, grade
        Example:

        "Letter grade for students from input.txt is:"
        Jane Smith:  A
        Bob Marley:  B

     */


    public static String calcLetterGrade(double average) {

        if (average >= 90) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else if (average >= 60) {
            return "D";
        } else {
            return "F";
        }
    }


}
