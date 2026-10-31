
package com.basics.quest4;

public class Training {

    public String[] showCourses() {

        String[] courses = {"Java", "Spring Boot", "React", "SQL"};

        return courses;
    }

    public void showTrainers(String... names) {

        System.out.println("Trainer Details:");

        for (String name : names) {
            System.out.println(name);
        }
    }
}
