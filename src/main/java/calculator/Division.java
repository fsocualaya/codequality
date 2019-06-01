package calculator;

public class Division extends Operation{
    public Division(float _firstNumber, float _secondnumber){
        a = _firstNumber;
        b = _secondnumber;
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
