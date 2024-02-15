package programmer.zaman.now.generic.application;

import programmer.zaman.now.generic.MyData;

public class ContravariantApp {
    public static void main(String[] args) {

        MyData<Object> objectMyData = new MyData<>("Fathin");

        MyData<? super String> myData = objectMyData;

        process(objectMyData);

        System.out.println(myData.getData());

    }

    public static void process(MyData<? super String> myData){

        //lebih baik gunakan tipe data sesuai super/parentnya
        Object value = myData.getData();
        System.out.println("Process parameter : " + value);

        myData.setData("Agus");
    }
}
