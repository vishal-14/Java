package com.designpattern;

/**
 * 7.Implement Composite Design Pattern to maintain
 * the directories of employees on the basis of departments.
 */
import java.util.ArrayList;
import java.util.List;

//Component
interface Directory {
    void showDirectoryDetails();
}

//Leaf
class technical implements Directory {
    private String name;
    private String favoriteLanguage;

    public technical(String name, String favoriteLanguage) {
        this.name = name;
        this.favoriteLanguage = favoriteLanguage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    @Override
    public void showDirectoryDetails() {
        System.out.println("technical{" +
                "name='" + name + '\'' +
                ", favoriteLanguage='" + favoriteLanguage + '\'' +
                '}');
    }

    @Override
    public String toString() {
        return "technical{" +
                "name='" + name + '\'' +
                ", favoriteLanguage='" + favoriteLanguage + '\'' +
                '}';
    }
}

//leaf
class hr implements Directory{

    private String name;
    private String type;

    public hr(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void showDirectoryDetails() {
        System.out.println("hr{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}');
    }

    @Override
    public String toString() {
        return "hr{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}

//Composite
class Technical_Directory implements Directory{

    List<Directory> technicalDirectory = new ArrayList<Directory>();

    @Override
    public void showDirectoryDetails() {
        System.out.println("Technical Employee Directory");
        technicalDirectory.forEach(e->e.showDirectoryDetails());
    }
}

//Composite
class HR_Directory implements Directory{

    List<Directory> hrDirectory = new ArrayList<Directory>();

    @Override
    public void showDirectoryDetails() {
        System.out.println("HR Employee Directory");
        hrDirectory.forEach(e->e.showDirectoryDetails());
    }
}

class EmployeeDirectory implements Directory{

    List<Directory> companyDirectory = new ArrayList<>();

    @Override
    public void showDirectoryDetails() {
        companyDirectory.forEach(e->e.showDirectoryDetails());
    }
}
// Client
public class CompositePattern {
    public static void main(String[] args) {
        technical emp1= new technical("Bob","Python");
        technical emp2= new technical("Auro", "Java");

        hr emp3= new hr("Bill", "Sales");
        hr emp4= new hr("Moody","Recruiter");

        Technical_Directory d1= new Technical_Directory();
        d1.technicalDirectory.add(emp1);
        d1.technicalDirectory.add(emp2);

        HR_Directory d2= new HR_Directory();
        d2.hrDirectory.add(emp3);
        d2.hrDirectory.add(emp4);


        EmployeeDirectory Dir= new EmployeeDirectory();
        Dir.companyDirectory.add(d1);
        Dir.companyDirectory.add(d2);

        Dir.showDirectoryDetails();


    }
}
