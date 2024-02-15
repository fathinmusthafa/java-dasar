package programmer.zaman.now.generic.application;

import programmer.zaman.now.generic.MyData;

public class CovariantApp {
    public static void main(String[] args) {

        MyData<String> stringMyData = new MyData<>("Fathin");
        process(stringMyData);

        MyData<? extends Object> myData = stringMyData;


    }

    public static void process(MyData<? extends Object> myData){
        //hanya boleh get
        System.out.println(myData.getData());

        //set
        //System.out.println(myData.setData());
        //tidak boleh, berbahaya
    }
}
