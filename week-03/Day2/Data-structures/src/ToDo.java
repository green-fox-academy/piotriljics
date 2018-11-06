public class ToDo {
    public static void main(String[] args) {

        String myTodo = "\n - Buy milk\n";
        String myTodo2 = " - Download games\n";
        String myTodo3 = "   - Diablo";
        StringBuilder sb = new StringBuilder(myTodo);
        sb.insert(myTodo.length() , myTodo2 + myTodo3);
        System.out.println("My todo: " + sb);
    }
}

// Add "My todo:" to the beginning of the todoText
// Add " - Download games" to the end of the todoText
// Add " - Diablo" to the end of the todoText but with indention
// Expected outpt:

// My todo:
//  - Buy milk
//  - Download games
//      - Diablo
