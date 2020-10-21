package is.hi.hbv501g.BaraSpara;

import is.hi.hbv501g.BaraSpara.Services.SavingTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    private SavingTypeService savingTypeService;
    @Autowired
    public HomeController(SavingTypeService savingTypeService){
        this.savingTypeService=savingTypeService;
    }

    @RequestMapping("/")
    public String Home(){
        
        return "Velkominn";
    }

}
