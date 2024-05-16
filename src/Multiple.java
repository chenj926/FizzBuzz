class Multiple {
    private int num = 0;

    public void multiple() {
        for (; num <= 100; num++) {
            if (num % 3 == 0 || num % 5 == 0) {
                System.out.println(num);
            }
        }
    }
}
