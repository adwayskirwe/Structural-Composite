
public class Operand extends Identifier{
    String currOperand;

    public Operand(String op){
        currOperand=op;
    }
    public void append(){
        expression=expression.concat(currOperand);
    }
    public void print(){
        System.out.println(expression);
    }
}
