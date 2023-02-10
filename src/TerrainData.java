public class TerrainData {
    private int[][] terrainData;

    public TerrainData(int[][] a) {
        terrainData = a;
    }

    public int countSquaresBelowSeaLeve() {
        int count = 0;
        for(int i = 0; i < terrainData.length; i++) {
            for(int j = 0; j < terrainData[i].length; j++) {
                if(terrainData[i][j] < 0) {
                    count++;
                }
            }
        }
        return count;
    }

    private boolean isLocValid(Location loc) {
        if(loc == null)
            return false;
        return loc.getRow() >= 0 && loc.getCol() >= 0 &&
                loc.getRow() < terrainData.length && loc.getCol() < terrainData[0].length;
    }

    private boolean isShearDrop(int row, int col) {
        if(isLocValid(new Location(row -1, col))) {
            int dif = terrainData[row][col] - terrainData[row - 1][col];
        }




        return false;
    }
}
