public class Main{
    public static void main(String[] args) {
        //String: Know Program
        //String after reverse: margorP wonK

        StringBuilder string = new StringBuilder("Know Program");
        string.reverse();
        System.out.println(string);

        // Another way is storing the string in a String variable and then reversing 

        //String: Know Program
        //String after reverse: margorP wonK

        String string1 = "Know Program";
        StringBuilder string2 = new StringBuilder(string1);
        string2.reverse();
        string2.toString();
        System.out.println(string2);

        //Words = “Hi, How are you?”
        //Reverse of Words = “,iH woH era ?uoy”

        String words = "Hi, How are you?";
        String word[] = words.split("\\s");
        String output = "";
        for(int i = 0; i < word.length; i++){
            StringBuilder word1 = new StringBuilder(word[i]);
            word1.reverse();
            output +=  word1.toString() + " ";
        }
        System.out.println(output.trim());


        //Sentence= “Hi, How are you?”
        //The reverse of Sentence= “you? are How Hi,”

        String name = "Hi, How are you?";
        String[] words1 = name.split("\\s");
        String real_name = "";
        for(int i=words1.length-1;i>=0;i--){
            real_name += words1[i]+ " ";
        }
        System.out.println(real_name.trim());
    }
}