import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idstudent")
    private Integer id;

    @Column(name = "name_student")
    private String name;

    @Column(name = "mark")
    private String mark;

    public Student() {

    }

    public Student(String name, String mark) {
        this.name = name;
        this.mark = mark;
    }

    public void setId(Integer id) { this.id = id; }

    public Integer getId() { return id;}

    public void setName(String name) {this.name = name;}

    public String getName() {return name;}

    public void setMark(String mark){this.mark = mark;}

    public String getMark() {return mark;}

    @Override
    public String toString() {return String.format("Student [id = %d, name = %s, mark = %s]",id,name,mark);}

}
