
public class Operator extends Identifier {
    String currOperator;
    public Operator(String s){
        currOperator=s;
    }
    public void append(){
        expression=expression.concat(currOperator);
    }

}
