
    public class StringManipulation {

        public static String removeConsecutiveOccurrences(String s, int occurance) {
            StringBuilder result = new StringBuilder();
            int count = 1;

            for (int i = 0; i < s.length(); i++) {
                // Append the first character to the result directly
                if (i == 0) {
                    result.append(s.charAt(i));
                } else {
                    // If the current character is the same as the previous one, increment the count
                    if (s.charAt(i) == s.charAt(i - 1)) {
                        count++;
                    } else {
                        // If the count reaches the occurance, do not append it to the result
                        if (count != occurance) {
                            // If the sequence does not meet the occurance condition, append the previous character
                            result.append(String.valueOf(s.charAt(i - 1)).repeat(count));
                        }
                        // Reset the count to 1 for the new character
                        count = 1;
                    }
                }
            }
            // Handle the last sequence of characters
            if (count != occurance) {
                result.append(String.valueOf(s.charAt(s.length() - 1)).repeat(count));
            }

            return result.toString();
        }

        public static void main(String[] args) {
            String s = "abbbcccac";
            int occurance = 3;

            // Get the result string after removing characters
            String result = removeConsecutiveOccurrences(s, occurance);

            // Output the final string
            System.out.println("Final Output: " + result);
        }
    }
