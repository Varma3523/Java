class ScientificCalculator extends Calculator {
    // Overriding - same signature as parent
    @Override
    int add(int a, int b) {
        System.out.println("Adding integers");
        return super.add(a, b);
    }
}