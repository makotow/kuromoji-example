import org.atilika.kuromoji.Token;
import org.atilika.kuromoji.Tokenizer;

/**
 * Project: kuromoji-example
 * Package: PACKAGE_NAME
 * <p/>
 * User: makoto
 * Date: 11/26/13
 * Time: 11:15 PM
 */
public class KuromojiExample {

    public static void main(String... args) {

        Tokenizer.Builder builder = Tokenizer.builder();
        String word = "PDF,WORD、EXCELについては解析できるのだろうか。";
        Tokenizer tokenizer = builder.build();
        for(Token token : tokenizer.tokenize(word)) {
            System.out.println(token.getSurfaceForm());
        }

        builder.mode(Tokenizer.Mode.SEARCH);
        tokenizer = builder.build();
        for(Token token : tokenizer.tokenize(word)) {
            System.out.println(token.getSurfaceForm());
        }

        builder.mode(Tokenizer.Mode.EXTENDED);
        tokenizer = builder.build();
        for(Token token : tokenizer.tokenize(word)) {
            System.out.println(token.getSurfaceForm());
        }

    }
}
