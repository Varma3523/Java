/*

Definition: All related data is loaded immediately along with the parent object.

Characteristics:

               Single query (or fewer queries) gets all needed data
               Eliminates risk of lazy loading exceptions when session is closed
               May load unnecessary data impacting performance
               Better for cases where you know you'll need the related data

When to use:

            When you know you'll need all the related data
            For small datasets where the overhead is negligible
            When you need to access data outside an open session context

Example:
       // Eager loading
         @ManyToOne(fetch = FetchType.EAGER)
          private Customer customer;
 */