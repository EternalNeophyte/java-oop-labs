package rpis81.alexandrov.oop.model.iterator;

import rpis81.alexandrov.oop.model.floor.Floor;

import java.util.Iterator;

public class FloorIterator extends ObjectIterator implements Iterator<Floor> {

    public FloorIterator(Floor[] floors) {
        super(floors);
    }

    @Override
    public boolean hasNext() {
        return super.hasNext();
    }

    @Override
    public Floor next() {
        return (Floor) super.next();
    }
}