package project_CoreJava;
class Credential1 extends amazon{
    
    private String cardName;
    private int cardNo;
    private String cardDate;

    void setcardName(String cardName) {
        this.cardName = cardName;
    }

    void setcardNo(int cardNo) {
        this.cardNo = cardNo;
    }

    void setDate(String cardDate) {
        this.cardDate = cardDate;
    }

    String getcardName() {
        return cardName;
    }

    int getcardNo() {
        return cardNo;
    }

    String getcardDate() {
        return cardDate;
    }

    Credential1(String cardName, int cardNo, String cardDate) {
        this.cardName = cardName;
        this.cardNo = cardNo;
        this.cardDate = cardDate;
    }
}
