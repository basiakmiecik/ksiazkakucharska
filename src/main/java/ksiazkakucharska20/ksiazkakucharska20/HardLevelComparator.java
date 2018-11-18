package ksiazkakucharska20.ksiazkakucharska20;


import java.util.Comparator;

public class HardLevelComparator implements Comparator<Recipe> {

    @Override
    public int compare(Recipe r1, Recipe r2) {
        if(r1.getHardLevel() > r2.getHardLevel())
            return -1;
        else if(r1.getHardLevel() == r2.getHardLevel())
            return 0;
        else
            return 1;
    }
}
