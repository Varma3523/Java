/*
        Bad: Class handles both order processing and logging
        Good: Split into two classes
        
class OrderProcessor {
    public void processOrder(Order order) { ... }
}

class OrderLogger {
    public void logOrder(Order order) { ... }
}


*/