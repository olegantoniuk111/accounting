package vin.gans.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by DELL on 13.02.2017.
 */
@Controller
public class MainPageController
{
    @RequestMapping("/")
    public String mainPage(){
        return "mainPage";
    }

}
