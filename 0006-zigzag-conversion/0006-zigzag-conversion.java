class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        int n = s.length();
        char[] result = new char[n];
        int resultIndex = 0;
        
        // The total step size to complete one full wave cycle up and down
        int cycleLen = 2 * (numRows - 1);

        // Process row by row
        for (int r = 0; r < numRows; r++) {
            // The step sizes alternate inside the wave
            int step1 = cycleLen - 2 * r;
            int step2 = 2 * r;

            int i = r;
            boolean useStep1 = true;

            while (i < n) {
                result[resultIndex++] = s.charAt(i);

                // For the top row (r=0) or bottom row (r=numRows-1), 
                // one of the steps is 0. We skip 0 steps to avoid infinite loops/duplicates.
                if (r == 0 || r == numRows - 1) {
                    i += cycleLen;
                } else {
                    i += useStep1 ? step1 : step2;
                    useStep1 = !useStep1; // Alternate the steps
                }
            }
        }

        return new String(result);
    }
}