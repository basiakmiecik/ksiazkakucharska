package ksiazkakucharska20.ksiazkakucharska20;


import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;



@Repository
public class RecipesRepository {

    private List<Recipe> recipeList= new ArrayList<>();

    public RecipesRepository(){
        recipeList.add(new Recipe("kurczakwz","Kurczak w ziołach",2,
                45,5,"mięsne", "http://cdn32.beszamel.smcloud.net/t/thumbs/660/441/1/" +
                "recipes/photo/przepis-na-pieczonego-kurczaka-w-ziolach.jpg",
                "Kurczaka należy dokładnie umyć i osuszyć. W misce ucieramy masło " +
                        "ze świeżymi ziołami: majerankiem i rozmarynem, pietruszką, a także sokiem z" +
                        " cytryny oraz solą i pieprzem do smaku. Połowę tej ziołowej mieszanki wkładamy do " +
                        "środka kurczaka. Drugą połową nacieramy kurczaka z zewnątrz. Tak przygotowanego " +
                        "kurczaka wkładamy do brytfanny żeliwnej lub naczynia żaroodpornego i do piekarnika. " +
                        "Kurczaka pieczemy ok. pół godziny w temperaturze 220ºC. Po upływie tego czasu kurczaka " +
                        "obracamy na drugą stronę, obniżamy temperaturę piekarnika do 180°C i pieczemy kolejne " +
                        "20 minut do pół godziny, aż kurczak nabierze złocistego koloru. W tym czasie warto " +
                        "kurczaka oprószyć delikatnie mąką i polać kilkoma łyżkami wrzątku. " +
                        "W  trakcie pieczenia można kilka razy polać kurczaka powstałym w " +
                        "naczyniu sosem. Sos powstały podczas pieczenia kurczaka wlewamy do " +
                        "małego garnka, dolewamy do niego wino, odrobinę masła i zagotowujemy – " +
                        "ten sos wykorzystujemy do polania przyrządzonego kurczaka."));
        recipeList.add(new Recipe("ziemniakiwz","Ziemniaki w ziołach",
                1,25,9,"wegeteriańskie",
                "http://najsmaczniejsze.pl/wp-content/uploads/2012/08/pieczone-ziemniaki-z-ziolami.jpg",
                "Ziemniaki obrać i pokroić obgotować w osolonej wodzie ok.10 minut. Cebulę " +
                        "pokroić w kostkę i podsmażyć na margarynie dodać kiełbasę pokrojoną w " +
                        "talarki i pokrojone ziemniaki. Wyłożyć do naczynia żaroodpornego i " +
                        "posypać wymieszanymi ze sobą ziołami. Wstawić do piekarnika na ok. 20 " +
                        "minut w tem.200 stopni.Następnie posypać startym żółtym serem i wymieszać, " +
                        "wstawić na 15 minut. Opiekać pod przykryciem.\n" +
                        "obiad zapiekanka kiełbasa ziemniaki ziola\n"));
        recipeList.add(new Recipe("lososza","Łosoś z ananasem",5,
                60,17,"rybne",
                "https://hips.hearstapps.com/del.h-cdn.co/assets/16/21/1600x1066/gallery-1464202521" +
                        "-delish-grilled-salmon-pineapple-salsa.jpg?resize=980:*",
                "Rybę pokroić na niewielkie kawałki, skropić sokiem z cytryny, posolić, " +
                        "posypać pieprzem i odstawić do lodówki chociaż na pół godziny.\n" +
                "Następnie panierować : koperek - jajko - mąka i od razu kłaść na rozgrzany olej. \n" +
                "Po usmażeniu polać sosem koperkowym . Posypać kawałkami ananasa, który świetnie komponuje się smakowo.\n" ));
        recipeList.add(new Recipe("salatkaw","Sałatka włoska",2,
                50,1,"wegetariańskie",
                "https://www.przyslijprzepis.pl/media/cache/default_view/uploads/media/recipe/00" +
                        "03/50/a70b4ee90d248fc7f2e3483a996da4342c3743e3.jpeg",
                "Wszystkie warzywa myjemy, sałatę rwiemy na mniejsze kawałki.Paprykę kroimy w paski." +
                        "Ogórka obieramy ,kroimy w pół plastry.cebulę kroimy w talarki.Pomidory,oliwki i mini " +
                        "mozzarelle kroimy na pół.Sosy dokładnie mieszamy z wodą i olejem,dodajemy do sałatki " +
                        "i mieszamy.Wstawiamy na 15 minut do lodówki aby składniki sałatki się przegryzły."));
        recipeList.add(new Recipe("karkowkapi","Karkówka po indyjsku",4,
                90,2,"mięsne",
                "https://static.smaker.pl/photos/1/8/4/1847466ce836bc286e1b3a4931fa58a4" +
                        "_374470_5bb0a7d1da45d_wm.jpg",
                "Mięso myjemy, osuszamy ręcznikiem papierowym, kroimy w centymetrowe plastry. " +
                        "Oprószamy przyprawą do mięsa i zostawiamy na noc w lodówce. Następnego dnia przyprawioną " +
                        "karkówkę podsmażamy na rozgrzanym oleju podlewając niewielką ilością wody. Mięso z powstałym " +
                        "sosem przekładamy go garnka i zalewamy wrzątkiem i dusimy przez ok. 50 min."+
                        "Owoce kroimy w kawałki i podsmażamy na 2 łyżkach sosu powstałego podczas duszenia mięsa. " +
                        "Po 8 minutach dodajemy resztę sosu powstałą podczas duszenia mięsa oraz syrop z ananasa. " +
                        "Dodajemy 6 łyżek mleczka kokosowego oraz przyprawy do sosu."+
                        "Mięso przekładamy do naczynia żaroodpornego , zalewamy sosem z owocami. Pieczemy ok. 20 min. " +
                        "W temp. 180C."));
    }

    public List<Recipe>getRecipeList(){return recipeList;}



    public void add(Recipe recipe){recipeList.add(recipe);}

    public Recipe findByID(String id){
        for(Recipe recipe:recipeList){
            if(recipe.getId().equalsIgnoreCase(id))
                return recipe;
        }
    return null;}

    public List<Recipe>sortHardLevel(){
        HardLevelComparator hardLevelComparator=new HardLevelComparator();
        Collections.sort(recipeList,hardLevelComparator);
    return recipeList;}

    public List<Recipe>sortTime(){
        TimecookingComparator timecookingComparator=new TimecookingComparator();
        Collections.sort(recipeList,timecookingComparator);
        return recipeList;}

    public int popularity(int poularity){
        poularity++;
    return poularity;}


}
