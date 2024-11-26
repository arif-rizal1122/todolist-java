
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

    public static void addTodoList() {

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