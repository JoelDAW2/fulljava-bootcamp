package com.example;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    // private List myList = new ArrayList();
    private List<Double> notes = new ArrayList<>();

    public Student(String name, List<Double> notes)
    {
        this.name = name;
        this.notes = notes;
    }

    // Getters
    public String getName()
    {
        return this.name;
    }

    public List<Double> getNotes()
    {
        return this.notes;
    }

    // Setters
    public void setName(String title)
    {
        this.name = name;
    }

    public void setNotes(List<Double> notes)
    {
        this.notes = notes;
    }

    public void addNotes(Double note, List<Double> studentPersonalNotes)
    {
        studentPersonalNotes.add(note);
        System.out.println("\nNota añadida");
    }

    public Double calculateAverage()
    {
        Double sumNotes = 0.0;
        for (Double note : this.notes) {
            sumNotes += note;
        }
        return sumNotes / this.notes.size();
    }

    public String studentApproves()
    {
        if(this.calculateAverage() >= 5)
        {
            return " (Aprobado)";
        }
        return " (Suspendido)";
    }

    /* public static Student bestStudent(List<Student> students)
    {
        List<Student> orderedStudents = new ArrayList<>();
        List<Double> studentsNotes = new ArrayList<>();
        for (Student student : students) {
            studentsNotes.add(student.calculateAverage());
        }
        Collections.sort(studentsNotes);
        return studentsNotes.get(studentsNotes.size());
    } */
}
