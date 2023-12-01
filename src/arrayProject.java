import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class arrayProject
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        ArrayList<Integer> treasureLocations = new ArrayList<>();
        ArrayList<Integer> userPredictions = new ArrayList<>();
        defineTresureLocation(treasureLocations,random);
        takeUserPredictions(userPredictions,scan);
        boolean check = checkPredictionLocation(userPredictions,treasureLocations);
        System.out.println(treasureLocations);
        System.out.println(check);
    }
    public static ArrayList<Integer> defineTresureLocation(ArrayList<Integer> cargoLocations,Random random)
    {
        int minLocation = 1;
        int maxLocation = 7;
        while(cargoLocations.size()<3)
        {
            int randomLocations = (random.nextInt(maxLocation - minLocation + 1) + minLocation);
            if(!cargoLocations.contains(randomLocations))
            {
                cargoLocations.add(randomLocations);
            }
        }
        return cargoLocations;
    }
    public static ArrayList<Integer> takeUserPredictions (ArrayList<Integer> userPredictions,Scanner scan)
    {
        for(int i = 0;i<3;i++)
        {
            userPredictions.add(scan.nextInt());
        }
        return userPredictions;
    }
    public static boolean checkPredictionLocation(ArrayList<Integer> userPrediction,ArrayList<Integer>tresureLocation)
    {
        boolean check = userPrediction.equals(tresureLocation);
        return check;
    }
}
