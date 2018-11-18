package ksiazkakucharska20.ksiazkakucharska20;

import org.apache.tomcat.websocket.pojo.PojoMessageHandlerWholePong;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.server.ServerEndpoint;

@Controller
public class RecipeConroller {

    private RecipesRepository recipesRepository;

    @Autowired
    public RecipeConroller(RecipesRepository recipesRepository) {
        this.recipesRepository = recipesRepository;
    }


    @RequestMapping("/recipe")
    public String recipe(@RequestParam String id, Model model) {
        Recipe byID = recipesRepository.findByID(id);
        model.addAttribute("recipe",byID);
        return "recipe";
    }

    @GetMapping("/dodaj")
    public String showForm(Model model) {
        model.addAttribute("rec", new Recipe());
        return "recipeForm";
    }

    @PostMapping("/saveRecipe")
    public String save(Recipe rec, @RequestParam String name, @RequestParam String timecooking) {
        char[] chars= toString().toCharArray();
        rec.setId(name+chars[1]+chars[5]+chars[3]);
        rec.setPopularity(0);
        rec.setTimecooking(Integer.valueOf(timecooking));
        recipesRepository.add(rec);
        return "redirect:/";
    }


    @GetMapping("/")
    public String recipeList(Model model) {
        model.addAttribute("recipeList", recipesRepository.getRecipeList());
        return "recipeList";
    }

    @GetMapping("/sortH")
    public String sortH(Model model){
        model.addAttribute("sortH",recipesRepository.sortHardLevel());
    return "redirect:/";}

    @GetMapping("/sortT")
    public String sortT(Model model){
        model.addAttribute("sortT",recipesRepository.sortTime());
        return "redirect:/";}








    }
