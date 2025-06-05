/*

Definition: Data is only loaded from the database when it's explicitly accessed.

Characteristics:

           Improves initial load performance by deferring related object loading
           Reduces memory usage for unused data
           May cause "N+1 queries problem" if not handled properly
           Better for large object graphs where you don't always need all relations


When to use:

     When related data isn't always needed
     For large datasets where loading everything would be inefficient
     In web applications where you only need partial data for initial rendering

Example:

         // Lazy loading (default for collections)
           @OneToMany(fetch = FetchType.LAZY)
           private List<Order> orders;
 */