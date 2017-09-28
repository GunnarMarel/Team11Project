package is.hi.byrjun.controller;

import is.hi.byrjun.model.Kennari;
import is.hi.byrjun.services.DaginnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Small controller just to show that you can have multiple controllers in your
 * project
 */
@Controller
@RequestMapping("/demo") // Notice here that the Request Mapping is set at the Class level
public class DemoController {

    @Autowired
    DaginnService daginnService;

    // Notice here that since the class has "/demo", this path is "/demo/page"
    @RequestMapping("/page")
    public String demoPage() {
        return "demo/demo"; // this returns a .jsp file with the path /webapp/WEB-INF/jsp/demo/demo.jsp
    }

    /**
     * Býður sama notandanum góðan daginn
     *
     * @param model
     * @return
     */
    @RequestMapping("/notandi")
    public String notandi(Model model) {
        model.addAttribute("nafn", "Ebba Þóra");
        return "demo/synaNotandi";
    }

    /**
     * Spyr hvað notandinn heitir
     *
     * @return
     */
    @RequestMapping("/spyrjaNotanda")
    public String spyrjaNotandi() {
        return "demo/hvadaNotandi";
    }

    /**
     * Tekur við nafni frá notanda og birtir Góðan daginn nafn
     *
     * @param nafn Nafn á notanda
     * @param model Módel með attributum
     * @return
     */
    @RequestMapping(value = "/hver", method = RequestMethod.POST)
    public String hver(@RequestParam(value = "nafn", required = false)
            String nafn, ModelMap model) {

        if (daginnService.erNafnRett(nafn)) {
            Kennari k = new Kennari(nafn, "Tómasarhagi");
            model.addAttribute("kennari", k);
            return "demo/synaKennari";
        } else {
            model.addAttribute("nafn", nafn);
            return "demo/rangtNafn";
        }
    }
}
