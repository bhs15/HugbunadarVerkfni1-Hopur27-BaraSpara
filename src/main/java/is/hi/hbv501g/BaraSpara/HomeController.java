package is.hi.hbv501g.BaraSpara;

import is.hi.hbv501g.BaraSpara.Entities.SavingType;
import is.hi.hbv501g.BaraSpara.Services.SavingTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;




@Controller
public class HomeController {

    private SavingTypeService savingTypeService;
    @Autowired
    public HomeController(SavingTypeService savingTypeService){
        this.savingTypeService=savingTypeService;
    }

    @RequestMapping("/")
    public String Home(Model model){
        model.addAttribute("savingTypes", savingTypeService.findAll());
        return "Velkominn";
    }

    @RequestMapping(value = "/addSavingType", method = RequestMethod.POST)
    //TODO Add @Valid and fix import and error handling
    public String addSavingType(SavingType savingType, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "add-SavingType";
        }

        //Vistar nýju SavingType og skilar nýja listanum með model
        savingTypeService.save(savingType);
        model.addAttribute("savingType", savingTypeService.findAll());
        return "Velkominn";
    }

}
