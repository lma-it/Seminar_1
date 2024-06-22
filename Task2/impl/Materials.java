package Task2.impl;

public enum Materials {
    
    PLASTIK("пластик"), GLASS("стекло");

    private final String material;

    Materials (String material) {
        this.material = material;
    }

    public String getMaterial(){
        return material;
    }
}
