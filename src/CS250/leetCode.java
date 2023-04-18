//package CS250;
//
//public class leetCode {
//    public static int romanToInt(String s) {
//        int count = 0;
//        if (s.length() <= 15){
//            for (int i = 0; i < s.length(); i++) {
//                //for (int j = 0; )
//                    if (i == s.length() - 1) {
//                        if (s.charAt(i) == 'V') {
//                            count = count + 5;
//                        }
//                        if (s.charAt(i) == 'L') {
//                            count = count + 50;
//                        }
//                        if (s.charAt(i) == 'D') {
//                            count = count + 500;
//                        }
//                        if (s.charAt(i) == 'M') {
//                            count = count + 1000;
//                        }
//                        if (s.charAt(i) == 'I') {
//                            count = count + 1;
//                        }
//                        if (s.charAt(i) == 'C') {
//                            count = count + 100;
//                        }
//                        if (s.charAt(i) == 'X') {
//                            count = count + 10;
//                        }
//
//                    }
//                    else {
//                        if (s.charAt(i) == 'I' && s.charAt(i + 1) == 'V') {
//                            count = count + 4;
//                        }
//                        if (s.charAt(i) == 'I' && s.charAt(i + 1) == 'X') {
//                            count = count + 9;
//                            flag = false;
//                        }
//                        if (s.charAt(i) == 'I' && s.charAt(i + 1) != 'X' || s.charAt(i) == 'I' && s.charAt(i + 1) != 'V') {
//                            count = count + 1;
//                            flag = false;
//                        }
//                        if (s.charAt(i) == 'X' && s.charAt(i + 1) == 'L') {
//                            count = count + 50;
//                            flag = false;
//                        }
//                        if (s.charAt(i) == 'X' && s.charAt(i + 1) == 'C') {
//                            count = count + 100;
//                            flag = false;
//                        }
//                        if (s.charAt(i) == 'X' && s.charAt(i + 1) != 'L' || s.charAt(i) == 'X' && s.charAt(i + 1) != 'C') {
//                            count = count - 10;
//                            i++;
//                            flag = false;
//                        }
//                        if (s.charAt(i) == 'C' && s.charAt(i + 1) == 'D') {
//                            count = count + 500;
//                            flag = false;
//                        }
//                        if (s.charAt(i) == 'C' && s.charAt(i + 1) == 'M') {
//                            count = count + 1000;
//                            flag = false;
//                        }
//                        if (s.charAt(i) == 'C' && s.charAt(i + 1) != 'D' || s.charAt(i) == 'C' && s.charAt(i + 1) != 'M') {
//                            count = count - 100;
//                            i++;
//                            flag = false;
//                        }
//                        if (s.charAt(i) == 'V') {
//                            count = count + 5;
//                            flag = false;
//                        }
//                        if (s.charAt(i) == 'L') {
//                            count = count + 50;
//                            flag = false;
//                        }
//                        if (s.charAt(i) == 'D') {
//                            count = count + 500;
//                            flag = false;
//                        }
//                        if (s.charAt(i) == 'M') {
//                            count = count + 1000;
//                        }
//                    }
//                } // end of while
//
//                }
//
//        }
//        if (!(count > 1 && count < 4000)){
//            return -1;
//        }
//        return count;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(romanToInt("III"));
//        System.out.println(romanToInt("LVIII"));
//        System.out.println(romanToInt("MCMXCIV"));
//    }
//}