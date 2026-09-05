import java.util.HashSet;

class Solution {
    public boolean isPathCrossing(String path) {

        int x = 0;
        int y = 0;

        // Store visited positions
        HashSet<String> visited = new HashSet<>();

        // Starting position
        visited.add(x + "," + y);

        for (int i = 0; i < path.length(); i++) {

            char dir = path.charAt(i);

            if (dir == 'N') {
                y++;
            } 
            else if (dir == 'S') {
                y--;
            } 
            else if (dir == 'E') {
                x++;
            } 
            else if (dir == 'W') {
                x--;
            }

            // Current position
            String position = x + "," + y;

            // If already visited, path crosses itself
            if (visited.contains(position)) {
                return true;
            }

            // Add current position
            visited.add(position);
        }

        return false;
    }
}