package chap3;

public class WordTool {

    public static void testing(){
        System.out.println("Testing..");
    }
    public int wordCount(String s) {

        int count = 0;

        if (!(s == null || s.isEmpty())) {
            String[] w = s.split("\\s+"); //split by whitespaace
            count = w.length;

        }
        return count;
    }

    public static void main(String[] args) {

        //static is something(variable/method) belongs to the class, not to the object
        testing();
        WordTool.testing();


        WordTool wt = new WordTool();
        int count = wt.wordCount("testing one two three four five");
        System.out.println("word count = " + count);
    }
}



