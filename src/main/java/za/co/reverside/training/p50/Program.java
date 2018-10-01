package za.co.reverside.training.p50;

public class Program {

    public String generateSquareStarPattern(int n){
        String value = "";
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                value = value + "*";
            }
            value = value + "\n";
        }
        return value;
    }


}
