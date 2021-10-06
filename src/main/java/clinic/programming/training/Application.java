package clinic.programming.training;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
public class Application {

    public int countWorld(String words){
        String [] separateWord = StringUtils.split(words, "");
        return (separateWord == null) ? 0: separateWord.length;
    }

    public void  greet(){
        List<String> greetings = new ArrayList<>();
        greetings.add("Hello");
        for(String greeting : greetings){
            System.out.println("Greetings " + greeting);
        }
    }


    public Application() {
        System.out.println ("Inside Application");
    }


    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
        System.out.println ("Starting Application");
        Application app = new Application();
        app.greet();
        int  count = app.countWorld("I have four words");
        System.out.println("Number  " + count);
    }
}
