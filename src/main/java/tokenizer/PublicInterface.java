package tokenizer;

public interface PublicInterface {
    void getActiveToken();
    void getEndToken();
    void previousToken();
    void nextToken();
    void getSpecialTokenOfEnd();
    void hasMoreTokens();
    void getLongestMatch();
}
