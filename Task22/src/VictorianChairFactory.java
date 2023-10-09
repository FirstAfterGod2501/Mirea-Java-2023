class VictorianChairFactory extends ChairFactory {
    @Override
    IChair createChair() {
        return new VictorianChair();
    }
}