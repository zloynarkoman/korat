    package cc.korat.controllers;

    import org.springframework.stereotype.Controller;
    import org.springframework.ui.Model;
    import org.springframework.web.bind.annotation.RequestMapping;
    import org.springframework.web.servlet.ModelAndView;

    /**
     * @author tsarev.oi@mail.ru
     *         User: Oleg Tsarev
     *         Date: 10.11.2010
     *         Time: 14:17:42
     *
     */
    @Controller
    public class MainController {

        public static final String INDEX_PAGE = "/index.page";
        public static final String INDEX_VIEW = "main";

        public static final String INFO_PAGE = "/info.page";
        public static final String INFO_VIEW = "info";

        @RequestMapping(value=INDEX_PAGE)
         public ModelAndView index(Model model) {

            model.addAttribute("message", "Message from main controller to main page!");

            return new ModelAndView(INDEX_VIEW);
        }

        @RequestMapping(value=INFO_PAGE)
         public ModelAndView info(Model model) {

            model.addAttribute("message", "Message from main controller to info page!");

            return new ModelAndView(INFO_VIEW);
        }

    }