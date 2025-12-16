package gr.aueb.cf.cf9.ch15.schoolapp;

public class TeacherServiceImpl implements ITeacherService{
    @Override
    public void addTeacher(Teacher teacher) {
        System.out.println("Teacher added successfully");
    }

    @Override
    public void updateTeacher(Teacher teacher) {
        System.out.println("Teacher updated successfully");
    }

    @Override
    public void removeTeacher(long id) {
        System.out.println("Teacher remove successfully");
    }

    @Override
    public Teacher getTeacherByID(long id) {
        return new Teacher("Spir", "k", 1L);
    }

    @Override
    public Teacher[] getAllTeachers() {
        return new Teacher[]  {
                new Teacher("q", "R", 2L),
                new Teacher("e", "d", 3L),
                new Teacher("r", "e", 4L),
                new Teacher("s", "z", 5L)
        };
    }
}
