public class MethodDemo {
    //methods----
    // method signature   ========
    // 1. method name
    // 2. parameter list
    // 3. return type
    // 4. visibilty modifiers
    // 5. acccess modifiers
    // 6. execption list
    // 7. body


    int age;// field

    public void celebrateBirthday() {    // non static methods --- isme java phele se hi ek ob ject bana ke deta hai  --(this)__  ya isko pale holder bhi bol sakte hain
        this.age++;
    }
}

    class main{
        public static void main(String[] args) {
            MethodDemo object  =  new MethodDemo();
            object.age = 45;
            object.celebrateBirthday();
            System.out.println(object.age);

        }
    }

// -------------------------------         TYPES OF METHODS   ---------------------------------------
// WITH RETURN TYPE WITH PARAMETER
// WITH RETURN TYPE WITHOUT PARAMETER
// WITHOUT RETURN TYPE WITH PARAMETER
// WITHOUT RETURN TYPE WITHOUT PARAMETER
