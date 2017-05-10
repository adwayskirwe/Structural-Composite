
public class Client {
    public static void main(String[]args) {
        Operand o1 = new Operand("2");
        o1.append();
        o1.print();
        Operator o2 = new Operator("+");
        o2.append();
        //o2.print();
        Operand o3 = new Operand("3");


        o3.append();
        o3.print();
    }

}
