package model;

public class Vocabulary {
    private Long id;
    private String vocabularyEng;
    private String vocabularyVN;

    public Vocabulary() {
    }

    public Vocabulary(Long id, String vocabularyEng, String vocabularyVN) {
        this.id=id;
        this.vocabularyEng = vocabularyEng;
        this.vocabularyVN = vocabularyVN;
    }

    public String getVocabularyEng() {
        return vocabularyEng;
    }

    public void setVocabularyEng(String vocabularyEng) {
        this.vocabularyEng = vocabularyEng;
    }

    public String getVocabularyVN() {
        return vocabularyVN;
    }

    public void setVocabularyVN(String vocabularyVN) {
        this.vocabularyVN = vocabularyVN;
    }

    @Override
    public String toString() {
        return "Vocabulary{" +
                "id=" + id +
                ", vocabularyEng='" + vocabularyEng + '\'' +
                ", vocabularyVN='" + vocabularyVN + '\'' +
                '}';
    }
}
