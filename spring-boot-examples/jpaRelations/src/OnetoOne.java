/*


@Entity
public class Employee {
    @Id
    private Long id;

    @OneToOne
    @JoinColumn(name = "workstation_id")
    private Workstation workstation;
    // ...
}

@Entity
public class Workstation {
    @Id
    private Long id;

    @OneToOne(mappedBy = "workstation")
    private Employee employee;
    // ...
}

 */