class MagicChairFactory extends ChairFactory {
    @Override
    IChair createChair() {
        return new MagicChair();
    }
}