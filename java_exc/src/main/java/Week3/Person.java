package Week3;

public class Person {
    private String name;
    private int age;
    private String favoriteColor;

    public String setName(String name) {
        this.name = name;
        return name;
    }
    public int getAge() {
        this.age = age;
        return age;
    }
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("That aint no age sire.");
        }
    }
    public String getFavoriteColor(String favoriteColor) {
        return favoriteColor;
    }
    public void setFavoriteColor() {
        this.favoriteColor = favoriteColor;
    }
}
