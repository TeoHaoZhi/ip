
public class Duke {
    public static void main(String[] args) {
        //Greetings & renaming
        System.out.println("Hello! I'm JARVIS");
        System.out.println("What can I do for you?");

        //Print newline to seperate greetings and goodbye
        System.out.println();

        Echo respond = new Echo();
        respond.echoBack();




    }
}
