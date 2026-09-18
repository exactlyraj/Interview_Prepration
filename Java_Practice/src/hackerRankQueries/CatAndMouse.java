package hackerRankQueries;

public class CatAndMouse {
    public static void main(String args[]){
        System.out.println(
        catAndMouse(2,5,4)
        );
        
    }

    private static String catAndMouse(int x, int y, int z) {
        int catAdistance = Math.abs(z - x);
        int catBdistance = Math.abs(z - y);
        return catAdistance < catBdistance ? "Cat A" : (catBdistance < catAdistance ? "Cat B" : "Mouse C");
    }

}
