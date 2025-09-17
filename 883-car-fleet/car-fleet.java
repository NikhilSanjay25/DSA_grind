import java.util.*;

class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        ArrayList<int[]> op = new ArrayList<>();
        for (int i = 0; i < position.length; i++) {
            op.add(new int[]{position[i], speed[i]});
        }

        // Sort cars by starting position (descending order)
        Collections.sort(op, (a, b) -> Integer.compare(b[0], a[0]));

        int count = 0;
        double fleetTime = -1.0;

        for (int[] car : op) {
            double time = (double)(target - car[0]) / car[1];
            if (time > fleetTime) {
                // New fleet
                count++;
                fleetTime = time;
            }
            // else car merges into the fleet ahead
        }

        return count;
    }
}
