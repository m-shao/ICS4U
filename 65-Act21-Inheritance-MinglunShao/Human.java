/*
Last Edited By: Minglun Shao
Last Edited On: 2023/12/13
Description:
Emulates a Human
*/

class Human {
    private int age; // age of person as integer
    private String name; // name of person as string
    private boolean inRelationship;

    public Human(int age, String name, boolean inRelationship) {
        this.age = age;
        this.name = name;
        this.inRelationship = inRelationship;
    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.inRelationship = false;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setInRelationship(boolean inRelationship) {
        this.inRelationship = inRelationship;
    }

    public boolean getInRelationship() {
        return inRelationship;
    }

    // has person say sentence
    public void says(String sentence) {
        System.out.println(name + " said: " + sentence);
    }

    @Override
    public String toString() {
        return (name + " is " + age + " years old and is " + (!inRelationship ? "not " : "") + "in a relationship");
    }
}