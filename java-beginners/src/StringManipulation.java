
    public class StringManipulation {

        public static String removeConsecutiveOccurrences(String s, int occurance) {
            StringBuilder result = new StringBuilder();
            int count = 1;

            for (int i = 0; i < s.length(); i++) {
                if (i == 0) {
                    result.append(s.charAt(i));
                } else {
                    if (s.charAt(i) == s.charAt(i - 1)) {
                        count++;
                    } else {
                        if (count != occurance) {
                            result.append(String.valueOf(s.charAt(i - 1)).repeat(count));
                        }
                        count = 1;
                    }
                }
            }
            if (count != occurance) {
                result.append(String.valueOf(s.charAt(s.length() - 1)).repeat(count));
            }

            return result.toString();
        }

        public static void main(String[] args) {
            String s = "abbbcccac";
            int occurance = 3;
            String result = removeConsecutiveOccurrences(s, occurance);
            System.out.println("Final Output: " + result);
        }
    }
