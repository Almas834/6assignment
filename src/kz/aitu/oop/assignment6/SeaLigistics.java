package kz.aitu.oop.assignment6;


class SeaLogistics implements Logistic{
    @Override
    public Transport createTransport() {
        return new Ship();
    }

    @Override
    public Transport planDelivery() {
        return null;
    }
}