package rpis81.alexandrov.oop.model.floor;

import rpis81.alexandrov.oop.model.exception.NoRentedSpaceException;
import rpis81.alexandrov.oop.model.Person;
import rpis81.alexandrov.oop.model.space.Space;
import rpis81.alexandrov.oop.model.vehicle.Vehicle;
import rpis81.alexandrov.oop.model.vehicle.VehicleTypes;

import java.time.LocalDate;
import java.util.NoSuchElementException;

public interface Floor {

    boolean add(Space space);
    boolean add(int index, Space space) throws IndexOutOfBoundsException;
    Space get(int index) throws IndexOutOfBoundsException;
    Space get(String registrationNumber) throws NoRentedSpaceException;
    boolean hasSpace(String registrationNumber);
    boolean hasSpace(Person person);
    Space replaceWith(int index, Space space) throws IndexOutOfBoundsException;
    Space remove(int index) throws IndexOutOfBoundsException;
    Space remove(String registrationNumber) throws NoSuchElementException;
    boolean remove(Space space);
    int indexOf(Space space);
    int getSpacesCountWithPerson(Person person);
    int size();
    Space[] getSpaces();
    Vehicle[] getVehicles();
    int getVehiclesCount();
    boolean isRegistrationNumberEqual(Space space, String registrationNumber);
    boolean isVehiclesTypeEqual(Space space, VehicleTypes types);
    Space[] getSpacesByVehiclesType(VehicleTypes type);
    Space[] getFreeSpaces();
    int getSpacesCountByVehiclesType(VehicleTypes type);
    LocalDate getNearestEndsDate() throws NoRentedSpaceException;
    Space getSpaceWithNearestEndsDate() throws NoRentedSpaceException;
    String toString();
    int hashCode();
    boolean equals(Object obj);
    public Object clone() throws CloneNotSupportedException;
}
