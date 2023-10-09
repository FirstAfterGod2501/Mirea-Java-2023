class MultifunctionalChairFactory extends ChairFactory {
    @Override
    IChair createChair() {
        return new MultifunctionalChair();
    }
}