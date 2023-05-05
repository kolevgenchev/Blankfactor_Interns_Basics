package MartiTaskLectureTwoOOPEncapsulation;

import java.util.ArrayList;

public class Student {
        private String name;
        private int age;
        private ArrayList<String> courses;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
            this.courses = new ArrayList<String>();
        }

        public void addCourse(String course) {
            this.courses.add(course);
        }

        public void removeCourse(String course) {
            this.courses.remove(course);
        }

        public String[] getCourses() {
            return this.courses.toArray(new String[0]);
        }

        public int getAge() {
            return this.age;
        }

        public String getName() {
            return this.name;
        }
    }

