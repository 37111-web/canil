package enums;

public enum Habitat {
    
    DOMESTIC(1,"Domestic")
    WILD_FOREST(2, "Wild - Forest")
    WILD_SAVANA(3,"Wild - Savana")
    WILD_OCEAN(4,"Wild - Ocean")
    URBAN(5,"Urban")
    FARM(6,"Farm")
    
    private final int code;
    private final String displayName;

    Habitat(int code, String displayName){
        this.code = code;
        this.displayName = displayName;
    }
     
    public int getCode(){
        return code;
    }
public String getDisplayName(){
    return DisplayName;
}
    
    public static Habitat fromCode (int code){
        for (Habitat h : values()){
            if (h.code == code)
                return h;
        }
        thorow new IllegalArgumentoException("Habitat invalido: " + code);
    }
}
