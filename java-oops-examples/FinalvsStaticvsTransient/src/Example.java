class Example {
    final int constantValue = 10; // Cannot be changed
    static int classValue = 20;  // Belongs to class

    transient int tempValue;     // Not serialized

    final void finalMethod() {}  // Cannot be overridden

    static void staticMethod() {
        System.out.println(classValue);
    }
}
