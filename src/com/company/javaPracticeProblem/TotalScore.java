package com.company.javaPracticeProblem;//package com.company;
//
//public class TotalScore {
//    private double testScores[];
//    ScoresDemo TD = new ScoresDemo();
//
//    public TestScores(double scores[]) {
//        testScores = scores;
//        try {
//            for(int i = 0; i < testScores.length; i++) {
//                if(scores[i] < 0 || scores[i] > 100) {
//                    throw new IllegalArgumentException("Test scores must be between 0 and 100");
//                }
//                else {
//                    testScores[i] = scores[i];
//                }
//            }
//        }catch(IllegalFormatException ex) {
//            System.out.println(ex);
//        }
//    }
//
//    public double averageScores() {
//        double average = 0;
//        int count = testScores.length;
//        int sum = 0;
//        for(int i = 0; i < testScores.length; i++) {
//            sum += testScores[i];
//        }
//        average = sum / count;
//        return average;
//    }
//}
//
//}
