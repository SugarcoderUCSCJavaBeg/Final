import java.util.Scanner;

public class displayAverages {

        public static int Q1min() {

            int Q1[] = {100, 85, 70, 82, 99, 95};

            int i;
            int min = 0;
            int max = 0;

            for (i = 0; i < 6; i++) {
                if (i == 0) {
                    max = min = Q1[i];
                }
                if (Q1[i] < min) {
                    min = Q1[i];
                }
            }
            return min;
        }

        public  static int Q1max() {

            int Q1[] = {100, 85, 70, 82, 99, 95};

            int i;
            int max = 0;
            int min = 0;

            for (i = 0; i < 6; i++) {
                if (i == 0) {
                    max = min = Q1[i];
                }
                if (Q1[i] > max) {
                    max = Q1[i];
                }
            }
            return max;
        }

        public static double Q1avg() {

            int Q1[] = {100, 85, 70, 82, 99, 95};

            int i;
            int total = 0;

            for (i = 0; i < 6; i++) {
                total = total + Q1[i];
            }

            double avg = total / Q1.length;
            return avg;
        }

        public static int Q2min() {

            int Q2[] = {98, 82, 75, 90, 98, 93};

            int i;
            int max = 0;
            int min = 0;

            for (i = 0; i < 6; i++) {
                if (i == 0) {
                    max = min = Q2[i];
                }
                if (Q2[i] > max) {
                    max = Q2[i];
                }
                if (Q2[i] < min) {
                    min = Q2[i];
                }
            }

            return min;
        }

        public static int Q2max() {

            int Q2[] = {98, 82, 75, 90, 98, 93};

            int i;
            int max = 0;
            int min = 0;

            for (i = 0; i < 6; i++) {
                if (i == 0) {
                    max = min = Q2[i];
                }
                if (Q2[i] > max) {
                    max = Q2[i];
                }
                if (Q2[i] < min) {
                    min = Q2[i];
                }
            }

            return max;
        }

        public static double Q2avg() {

            int Q2[] = {98, 82, 75, 90, 98, 93};

            int i;
            int total = 0;

            for (i = 0; i < 6; i++) {
                total = total + Q2[i];
            }

            double avg = total / Q2.length;
            return avg;
        }

        public static int Q3min() {

            int Q3[] = {95, 88, 72, 88, 100, 90};

            int i;
            int max = 0;
            int min = 0;

            for (i = 0; i < 6; i++) {
                if (i == 0) {
                    max = min = Q3[i];
                }
                if (Q3[i] > max) {
                    max = Q3[i];
                }
                if (Q3[i] < min) {
                    min = Q3[i];
                }
            }
            return min;
        }

        public static int Q3max() {

            int Q3[] = {95, 88, 72, 88, 100, 90};

            int i;
            int max = 0;
            int min = 0;

            for (i = 0; i < 6; i++) {
                if (i == 0) {
                    max = min = Q3[i];
                }
                if (Q3[i] > max) {
                    max = Q3[i];
                }
                if (Q3[i] < min) {
                    min = Q3[i];
                }
            }
            return max;
        }

        public static double Q3avg() {

            int Q3[] = {95, 88, 72, 88, 100, 90};

            int i;
            int total = 0;

            for (i = 0; i < 6; i++) {
                total = total + Q3[i];
            }

            double avg = total / Q3.length;
            return avg;
        }

        public static int Q4min() {

            int Q4[] = {90, 78, 78, 95, 96, 100};

            int i;
            int max = 0;
            int min = 0;

            for (i = 0; i < 6; i++) {
                if (i == 0) {
                    max = min = Q4[i];
                }
                if (Q4[i] > max) {
                    max = Q4[i];
                }
                if (Q4[i] < min) {
                    min = Q4[i];
                }
            }

            return min;
        }

        public static int Q4max() {

            int Q4[] = {90, 78, 78, 95, 96, 100};

            int i;
            int max = 0;
            int min = 0;

            for (i = 0; i < 6; i++) {
                if (i == 0) {
                    max = min = Q4[i];
                }
                if (Q4[i] > max) {
                    max = Q4[i];
                }
                if (Q4[i] < min) {
                    min = Q4[i];
                }
            }

            return max;
        }

        public static double Q4avg() {

            int Q4[] = {90, 78, 78, 95, 96, 100};

            int i;
            int total = 0;

            for (i = 0; i < 6; i++) {
                total = total + Q4[i];
            }

            double avg = total / Q4.length;
            return avg;
        }

        public static int mid1min() {

            int mid1[] = {93, 85, 80, 92, 100, 98};

            int i;
            int max = 0;
            int min = 0;

            for (i = 0; i < 6; i++) {
                if (i == 0) {
                    max = min = mid1[i];
                }
                if (mid1[i] > max) {
                    max = mid1[i];
                }
                if (mid1[i] < min) {
                    min = mid1[i];
                }
            }

            return min;

        }

        public static int mid1max() {

            int mid1[] = {93, 85, 80, 92, 100, 98};

            int i;
            int max = 0;
            int min = 0;

            for (i = 0; i < 6; i++) {
                if (i == 0) {
                    max = min = mid1[i];
                }
                if (mid1[i] > max) {
                    max = mid1[i];
                }
                if (mid1[i] < min) {
                    min = mid1[i];
                }
            }

            return max;

        }

        public static double mid1avg() {

            int mid1[] = {93, 85, 80, 92, 100, 98};

            int i;
            int total = 0;

            for (i = 0; i < 6; i++) {
                total = total + mid1[i];
            }

            double avg = total / mid1.length;
            return avg;
        }

        public static int mid2min() {

            int mid2[] = {88, 86, 82, 86, 97, 89};

            int i;
            int max = 0;
            int min = 0;

            for (i = 0; i < 6; i++) {
                if (i == 0) {
                    max = min = mid2[i];
                }
                if (mid2[i] > max) {
                    max = mid2[i];
                }
                if (mid2[i] < min) {
                    min = mid2[i];
                }
            }

            return min;

        }

        public static int mid2max() {

            int mid2[] = {88, 86, 82, 86, 97, 89};

            int i;
            int max = 0;
            int min = 0;

            for (i = 0; i < 6; i++) {
                if (i == 0) {
                    max = min = mid2[i];
                }
                if (mid2[i] > max) {
                    max = mid2[i];
                }
                if (mid2[i] < min) {
                    min = mid2[i];
                }
            }

            return max;

        }

        public static double mid2avg() {

            int mid2[] = {88, 86, 82, 86, 97, 89};

            int i;
            int total = 0;

            for (i = 0; i < 6; i++) {
                total = total + mid2[i];
            }

            double avg = total / mid2.length;
            return avg;
        }

        public static int final1min() {

            int final1[] = {92, 90, 76, 87, 95, 92};

            int i;
            int max = 0;
            int min = 0;

            for (i = 0; i < 6; i++) {
                if (i == 0) {
                    max = min = final1[i];
                }
                if (final1[i] > max) {
                    max = final1[i];
                }
                if (final1[i] < min) {
                    min = final1[i];
                }
            }

            return min;
        }

        public static int final1max() {

            int final1[] = {92, 90, 76, 87, 95, 92};

            int i;
            int max = 0;
            int min = 0;

            for (i = 0; i < 6; i++) {
                if (i == 0) {
                    max = min = final1[i];
                }
                if (final1[i] > max) {
                    max = final1[i];
                }
                if (final1[i] < min) {
                    min = final1[i];
                }
            }

            return max;
        }

        public static double final1avg() {

            int final1[] = {92, 90, 76, 87, 95, 92};

            int i;
            int total = 0;

            for (i = 0; i < 6; i++) {
                total = total + final1[i];
            }

            double avg = total / final1.length;
            return avg;
        }

    }

















