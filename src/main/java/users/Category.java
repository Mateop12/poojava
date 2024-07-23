package users;

public class Category {

    private int idCategory;
    private String categoryName;
    private String sate;

    public Category(){

    }
    public Category(int idCategory, String categoryName, String sate) {
        this.idCategory = idCategory;
        this.categoryName = categoryName;
        this.sate = sate;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getSate() {
        return sate;
    }

    public void setSate(String sate) {
        this.sate = sate;
    }
}
