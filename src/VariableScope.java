public class VariableScope {
    public static void main(String[] args) {

        Student dev =  new Student();
        dev.rollnumber = 8;

    }
    // jagah number 1

    // -- direct class ke andar koi bhi data type se start kardiya
      int age ;  // inka name bhi hai fields
      //  --  ya toh kisis class ke methord ke andar

    public void faltoo()
    {
        // jagah 2
        int age;    // local variables --  cant be used out of the method kyonki  dekho method ke andar bhi hai fir bhi nahi roya
        var agee =  4 ; // yhan bss var likha isne khud se determine karliya ki ye kya hai kis type ka hai --- local variable datatype inference ( khud se samjhna )
        // local datatype inference bss methods ke andar hi hoga na kyonki local variables sirf methods me banega na



    }




}


class Student{
    int rollnumber;

}
