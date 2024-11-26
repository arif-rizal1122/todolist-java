
public class AplikasiTodoList {

    public static String[] model = new String[10];


    public static void main(String[] args) {

     // testShowTodolist();
     // testAddTodoList();
     testRemoveTodoList();
    }

    public static void showTodoList(){
        for (int i = 0; i < model.length; i++) {
            String todo = model[i];
            var nomor =  i + 1;
            if (todo != null){
                System.out.println(nomor + ". " + todo);
            }
        }
    }
    public static void testShowTodolist(){
        model[0] = "basic";
        model[1] = "java";
        model[2] = "pzn";
        showTodoList();
    }

    public static void addTodoList(String todo) {
        boolean penuh = true;
        // cek apakah model penuh
        for (int i = 0; i < model.length; i++) {
            if (model[i] == null){
                // model masih ada yg kosong
                penuh = false;
                break;
            }
        }
        // jika penuh, kita resize ukuran array 2x lipat
        if (penuh){
            String[] temp = model; // array lama
            model = new String[model.length * 2]; // array baru
            for (int i = 0; i < temp.length; i++) {
               if (model[i] == temp[1]){
                   break;
               }
            }
        }

        // tmabhakan posisi ke data array nya null
        for (int i = 0; i < model.length; i++) {
            if (model[i] == null){
                model[i] = todo;
                break;
            }
        }
    }

    public static void testAddTodoList(){
        for (int i = 1; i < 10; i++) {
            addTodoList("contoh to do ke = " + i);
        }
        showTodoList();
    }

    public static boolean removeTodoList(Integer number){
        if ((number - 1) >= model.length){
//  Langkah pertama adalah memeriksa apakah indeks yang dihitung (number - 1) berada di luar batas panjang array model.
//  Jika number - 1 lebih besar atau sama dengan panjang array model, berarti nomor item yang diberikan tidak valid (karena berada di luar jangkauan daftar), dan metode akan mengembalikan false.
            return false;
        } else if (model[number - 1] == null){
             return false;
        } else {
            for (int i = number - 1; i < model.length; i++) {
                if (i == (model.length -1)){
                    model[i] = null;
                } else {
                    model[i] = model[i + 1];
                }

            }
            return true;
        }
    }



    public static void testRemoveTodoList(){
        addTodoList("satu");
        addTodoList("dua");
        addTodoList("tiga");
        addTodoList("empat");
        addTodoList("lima");

        boolean result  = removeTodoList(9);
        System.out.println(result);

        result = removeTodoList(4);
        System.out.println(result);

        showTodoList();
    }


    /**
     *
     * Menetukan view todolist nya
     *
     * */
    public static void viewAddTodolist(){

    }



    public static void viewRemoveTodolistt(){

    }




}