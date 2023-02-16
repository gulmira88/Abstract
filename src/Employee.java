public class Employee extends Person {
    private long id;

    public Employee(String name, char gender, long id) {
        super(name, gender);
        this.id = id;


    }

    public Employee(String name, char gender) {
        super(name, gender);
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                '}';
    }

    @Override
    public void work() {
        if (id == 0) {
            System.out.println("Jumushchu ystebeyt");
        } else {
            System.out.println("Jum.yshtebiet");
        }


        }

    }
