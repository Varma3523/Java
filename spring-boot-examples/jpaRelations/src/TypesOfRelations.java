/*
JPA (Java Persistence API) provides several ways to handle relationships between entities.
 These relationships are fundamental in object-relational mapping (ORM) and allow you to model how
  different database tables relate to each other in your Java application.

Types of Relationships in JPA

JPA supports four main types of relationships:

One-to-One (@OneToOne)
One-to-Many (@OneToMany)
Many-to-One (@ManyToOne)
Many-to-Many (@ManyToMany)

 */
/*

Key Concepts in JPA Relationships

1. Owning Side vs. Inverse Side

The owning side is responsible for managing the relationship (where the foreign key is stored)
The inverse side uses the mappedBy attribute to point to the owning side.

2. Fetch Types

         EAGER: Related entities are loaded immediately with the parent entity
         LAZY: Related entities are loaded only when explicitly accessed (default for @OneToMany and @ManyToMany)
       ex:
            @OneToMany(fetch = FetchType.LAZY)
            private List<Employee> employees;

3. Cascade Types

Control which operations should be cascaded to related entities:

           PERSIST
           MERGE
           REMOVE
           REFRESH
           DETACH
           ALL
     ex:
         @OneToMany(cascade = CascadeType.ALL)
         private List<OrderItem> items;
4. Orphan Removal

When set to true, if an entity is removed from the relationship, it's automatically deleted

ex:
        @OneToMany(orphanRemoval = true)
        private List<Address> addresses;
 */