package calculator;

public class Division extemds Operation{
    public Division(float _a, float _b){
        a = _a;
        b = _b;
    }

    public float operar(){
        if(b == 0){
            if(a == 0)
                return float.NaN;
            else if(a >0)
                return float.POSITIVE_INFINITY;
            else
                return float.NEGATIVE_INFINITY;
         }
         return a / b;
    }
}
