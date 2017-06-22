class One {
    int count = 1;
    void f(){
        System.out.println("In one, count = " + count++) ;
    }
}

class Two extends One {
    void f() {
        count = count * 3;
        System.out.println("In two, count = " + count);
    }
}

class Three {
    public static void main(String args[]){
        One x = new Two();
        One y = (One) x;
        x.f();
        y.f();

        Two z = (Two) new One();
        z.f();
    }
}
