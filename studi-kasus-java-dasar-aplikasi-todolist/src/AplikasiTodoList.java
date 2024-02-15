import java.util.Map;

public class AplikasiTodoList {

    public static String[] model = new String[10]; //membuat model

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        viewShowTodoList();

    }

    // menentukan business logic

    /**
     * Menampilkan todo list
     */
    public static void showTodoList(){
        System.out.println("TODOLIST");
        for (var i = 0; i < model.length; i++) {
            var todo = model[i];
            var no = i + 1;

            if (todo != null){
                System.out.println(no + ". " + todo);
            }
        }
    }

    // test menampilkan todo list
    public static void testShowTodoList() {
        model[0] = "Belajar Java Dasar";
        model[1] = "Studi Kasusu Java Dasar: Membuat Todo List";
        showTodoList();
    }

    /**
     * Menambah todo ke list
     */
    public static void addTodoList(String todo) {

        //cek apakah model penuh? (untuk menentukan size)
        var isFull = true;
        for (int i = 0; i < model.length; i++) {
            if(model[i] == null){
                //model masih ada yg kosong
                isFull = false;
                break;
            }
        }

        //jika penuh, resize 2x
        if(isFull) {
            var temp = model;
            model = new String[model.length * 2];

            for (int i = 0; i < temp.length; i++) {
                model[i] = temp[i];
            }

        }

        //tambah ke posisi yang data array nya null
        for (var i = 0; i < model.length; i++) {
            if (model[i] == null){
                model[i] = todo;
                break;
            }
        }
    }

    // test menambah todo ke list
    public static void testAddTodoList() {
        for (int i = 0; i < 25; i++) {
            addTodoList("Contoh todo ke " + i);
        }
        showTodoList();
    }

    /**
     * Menghapus todo dari list
     */
    public static boolean removeTodoList(Integer number) {
        if((number - 1) >= model.length){
            return false;
        } else if (model[number - 1] == null) {
            return false;
        } else {
            for (int i = (number - 1); i < model.length; i++) {
                if( i == (model.length - 1)){
                    model[i] = null;
                } else {
                    model[i] = model[i + 1];
                }
            }
            return true;
        }
    }

    // test remove todo dari list
    public static void testRemoveTodoList(){
        addTodoList("Satu");
        addTodoList("Dua");
        addTodoList("Tiga");
        addTodoList("Empat");
        addTodoList("Lima");

        var result = removeTodoList(20);
        System.out.println(result);

        result = removeTodoList(7);
        System.out.println(result);

        result = removeTodoList(2);
        System.out.println(result);

        showTodoList();
    }

    //input data
    public static String input(String info){
        System.out.print(info + " : ");
        String data = scanner.nextLine();
        return data;
    }

    public static void testInput(){
        var name = input("Nama");
        System.out.println("Hi " + name);
    }


    // menentukan view

    /**
     * Menampilkan view todo list
     */
    public static void viewShowTodoList() {

        while (true) {
            showTodoList();

            System.out.println("MENU : ");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("x. Keluar");

            var input = input("Pilih ");
            if(input.equals("1")){
                viewAddTodoList();
            } else if(input.equals("2")){
                viewRemoveTodoList();
            } else if(input.equals("x")){
                break;
            } else {
                System.out.println("Pilihan tidak valid");
            }
        }
    }

    //test viewShowTodoList
    public static void testViewShowTodoList(){
        addTodoList("Satu");
        addTodoList("Dua");
        addTodoList("Tiga");
        addTodoList("Empat");
        addTodoList("Lima");

        viewShowTodoList();

    }

    /**
     * Menampilkan view menambahkan todo list
     */
    public static void viewAddTodoList() {

        System.out.println("TAMBAH TODO LIST");

        var todo = input("Todo (x Jika Batal)");

        if(todo.equals("x")){
            //batal
        } else {
            addTodoList(todo);
        }
    }

    //test viewAddTodoList
    public static void testViewAddTodoList(){
        addTodoList("Satu");
        addTodoList("Dua");

        viewAddTodoList();

        showTodoList();
    }

    /**
     * Menampilkan view menghapus todo list
     */
    public static void viewRemoveTodoList() {
        System.out.println("HAPUS TODOLIST");

        var number = input("Nomor yang dihapus (x Jika Batal)");

        if(number.equals("x")){
            //batal
        } else {
            boolean success = removeTodoList(Integer.valueOf(number));
            if(!success){
                System.out.println("Gagal menghapus todoList : " + number);
            }
        }
    }

    //test viewRemoveTodoList
    public static void testViewRemoveTodoList(){
        addTodoList("Satu");
        addTodoList("Dua");
        addTodoList("Tiga");

        showTodoList();

        viewRemoveTodoList();

        showTodoList();
    }

}
