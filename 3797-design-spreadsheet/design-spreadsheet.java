class Spreadsheet {
    private Map<String, Integer> cellValues;

    public Spreadsheet(int rows) {
        cellValues = new HashMap<>();
    }

    public void setCell(String cell, int value) {
        cellValues.put(cell, value);
    }

    public void resetCell(String cell) {
        cellValues.remove(cell);
    }

    public int getValue(String formula) {
        // formula starts with "=" always
        String expr = formula.substring(1);  

        String[] parts = expr.split("\\+");  // exactly 2 parts      
        int sum = 0;
        for (String part : parts) {
            part = part.trim();
            if (Character.isDigit(part.charAt(0))) {
                sum += Integer.parseInt(part);
            } else {
                sum += cellValues.getOrDefault(part, 0);
            }
        }
        return sum;
    }
}
