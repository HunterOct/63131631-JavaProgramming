package Decorator.B2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoaiBoTuDung extends TokenizeDecorator {
    private ArrayList <String> stopWords ;
    public LoaiBoTuDung(Tokenize token) {
        super(token);
        stopWords = new ArrayList<>(Arrays.asList("Và","Thì","Hoặc","Mà","Là","Nhưng"));
    }

    @Override
    public List<String> tokenize() {
//        List<String> words = token.tokenize();
//        words = words.removeAll(stopWords);
//        return new ArrayList<>(Arrays.asList(words));
        return null;
    }

}
