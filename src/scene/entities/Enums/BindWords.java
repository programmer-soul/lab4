package scene.entities.Enums;

public enum BindWords {
    IN_SUCH("В такие"),
    NO("Но"),
    IN_THIS("в эту"),
    HIS("его"),
    SOME("какие-нибудь"),
    TO_HIM("Ему"),
    NOT_SOME("не о чем"),
    HERE("Тут"),
    UNDER("под"),
    AND("и"),
    SO_AND("так и"),
    TO("к"),
    NEAR("y"),
    NOT("не"),
    ON("на"),
    ALTHOUGH("хотя"),
    MAYBE("Наверное"),
    WITH_HIS("со своей"),
    IN_LOWER("в"),
    BOTTOM("Внизу");

    String BindWord;
    BindWords(String defprepadj){
        this.BindWord = BindWord;
    }
    public String getBindWord(){
        return this.BindWord;
    }




}
