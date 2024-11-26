
public class AplikasiTodoList {

    public static String[] model = new String[10];


    public static void main(String[] args) {
        testShowTodolist();
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
                System.out.println();
                break;
            }
        }
        // jika penuh, kita resize ukuran array 2x lipat
        if (penuh){
            String[] temp = model; // array lama
            model = new String[model.length * 2]; // array baru
            for (int i = 0; i < temp.length; i++) {
               if (model[i] == temp[1]){
                   System.out.println("data sudah penuh ");
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

    }

    public static void removeTodoList(){

    }
    /**
     *
     * Menetukan view todolist nya
     *
     * */
    public static void viewAddTodolist(){

    }



    public static void removeTodolistt(){

    }




}