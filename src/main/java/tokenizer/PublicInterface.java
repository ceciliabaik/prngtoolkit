package tokenizer;

public interface PublicInterface {
    int getActiveToken();
    int getEndToken();
    int previousToken();
    int nextToken();
    void getSpecialTokenOfEnd();
    void hasMoreTokens();
    void getLongestMatch();
}
