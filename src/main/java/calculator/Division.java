package calculator;

public class Division extends Operation{
    public Division(float _a, float _b){
        a = _a;
        b = _b;
    }

    public float operar(){
        if(b == 0){
            if(a == 0)
                return Float.NaN;
            else if(a >0)
                return Float.POSITIVE_INFINITY;
            else
                return Float.NEGATIVE_INFINITY;
         }
         return a / b;
    }
}
