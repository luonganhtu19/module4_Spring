package controller;

import model.Vocabulary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import service.IServiceVocabulary;

import java.util.Map;

@Controller
@RequestMapping("/vocabulary")
public class VocabularyController {
    @Autowired
    private IServiceVocabulary iServiceVocabulary;
    @GetMapping
    public String dictionary(){
        return "dictionary";
    }
    @PostMapping
    public String searchVocabulary(@RequestParam(value = "chooseOption",required = false) String chooseOption,
                                   @RequestParam(value = "vocabulary" ,required = false) String vocabulary,
                                   Map<String,String> model){
        String result=null;
        Vocabulary searchVocabulary=iServiceVocabulary.findByName(vocabulary);

        if (searchVocabulary==null){
            result="not found "+vocabulary;
        }else {
            switch (chooseOption){
            case "eng":
                result=searchVocabulary.getVocabularyVN();
                break;
            case "vn":
                result=searchVocabulary.getVocabularyEng();
                break;
            default:
                break;
            }
        }
        model.put("vocabulary",vocabulary);
        model.put("result",result);
        model.put("chooseOption",chooseOption);
        return "dictionary";
    }
}
