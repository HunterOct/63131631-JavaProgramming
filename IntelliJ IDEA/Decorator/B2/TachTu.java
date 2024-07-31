package Decorator.B2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TachTu implements Tokenize{
    private String s;

    public TachTu(String s) {
        this.s = s;
    }

    @Override
    public List<String> tokenize() {
        String[] tokens = s.split(" ");
        return new ArrayList<>(Arrays.asList(tokens));
    }
}
