package ksiazkakucharska20.ksiazkakucharska20;

public class Recipe {

    private String id;
    private String name;
    private int hardLevel;
    private int timecooking;
    private int popularity;
    private String kind;
    private String image;
    private String description;


    public Recipe() {
    }

    public Recipe(String id,String name, int hardLevel, int timecooking, int popularity, String kind,
                  String image, String description) {
        this.id=id;
        this.name = name;
        this.hardLevel = hardLevel;
        this.timecooking = timecooking;
        this.popularity = popularity;
        this.kind = kind;
        this.image=image;
        this.description=description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHardLevel() {
        return hardLevel;
    }

    public void setHardLevel(int hardLevel) {
        this.hardLevel = hardLevel;
    }

    public int getTimecooking() {
        return timecooking;
    }

    public void setTimecooking(int timecooking) {
        this.timecooking = timecooking;
    }

    public int getPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
