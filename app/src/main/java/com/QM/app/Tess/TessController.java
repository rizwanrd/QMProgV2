package com.QM.app.Tess;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class TessController {

    @Autowired TessService tessService;

    @GetMapping("/use-scanner")
    public String Tess(Model model) {
        String tessData = tessService.getTextFromScanner();
        model.addAttribute("tessData", tessData);
        return "use-scanner";
    }

}
