class Solution {
    public String convert(String s, int numRows) {
        // Edge case: If 1 row or string is too short, no zigzag happens
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        // Initialize a StringBuilder for each row to efficiently build the strings
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        // The peak (highest row index)
        int P = numRows - 1;

        // Distribute each character into its correct row using our wave formula
        for (int i = 0; i < s.length(); i++) {
            int rowIndex = P - Math.abs((i % (2 * P)) - P);
            rows[rowIndex].append(s.charAt(i));
        }

        // Combine all rows into one final String
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }
}