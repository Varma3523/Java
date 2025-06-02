/*
                       Instead of one large interface:

interface Worker {
    void work();
    void eat();
}
                       Split into:


interface Workable { void work(); }
interface Eatable { void eat(); }


*/