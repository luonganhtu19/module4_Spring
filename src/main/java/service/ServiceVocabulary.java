package service;

import model.Vocabulary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServiceVocabulary implements IServiceVocabulary {
    private static Map<Long,Vocabulary> listVocabulary;
    static {
        listVocabulary= new HashMap<>();
        listVocabulary.put(1L,new Vocabulary(1l,"cat","mèo"));
        listVocabulary.put(2L,new Vocabulary(2l,"dog","chó"));
        listVocabulary.put(3L,new Vocabulary(3l,"new","tin tức"));
        listVocabulary.put(4L,new Vocabulary(4l,"fish","cá"));
        listVocabulary.put(5L,new Vocabulary(5l,"elephants","voi"));
    }
    @Override
     public List<Vocabulary> findAll(){
        ArrayList list=new ArrayList(listVocabulary.values());
        return list;
    };
    @Override
    public Vocabulary findById(Long id){
        return null;
    }


    @Override
    public Vocabulary findByName(String name) {
        for (Map.Entry<Long,Vocabulary> entry:listVocabulary.entrySet()){
            Vocabulary newVocabulary=entry.getValue();
            if (newVocabulary.getVocabularyEng().equals(name)||newVocabulary.getVocabularyVN().equals(name)){
                return newVocabulary;
            }
        }
        return null;
    }

    @Override
    public void update(Vocabulary model) {
    };
    @Override
    public void save(Vocabulary Model) {
    };
    @Override
    public void remove(Long id){
    };
}
