public class MadLibs {
    /*
https://www.codecademy.com/courses/learn-java/projects/java-variables-mad-libs
Your description here:
This program generates a mad libbed story.
Author: Mohamed
Date: 07/04/2022
*/
    public static void main(String[] args){

        // Q3 to Q9
        String name1 = "John";
        String adjective1 = "incredible";
        String adjective2 = "wonderful";
        String adjective3 = "happy";
        String verb1 = "dance";
        String noun1 = "hooligans";
        String noun2 = "the poppies";
        String noun3 = "music";
        String noun4 = "animals";
        String noun5 = "water";
        String noun6 = "ape";
        String name2 = "Julia";
        int number = 2050;
        String place1 = "Uranus";



        //The template for the story
        String story = "This morning "+name1+" woke up feeling "+adjective1+
                ".\n'It is going to be a "+adjective2+" day!'\nOutside, a bunch of "
                +noun1+"s were protesting to keep "+noun2+" in stores.\n" +
                "They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+".\n" +
                "Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "
                +noun5+".\n "+name1+" woke up in the year "+number+"," +
                " in a world where "+noun6+"s ruled the world.";

// Q11
        System.out.println(story);
    }
}
