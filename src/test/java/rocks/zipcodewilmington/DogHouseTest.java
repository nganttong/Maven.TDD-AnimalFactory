package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    private Dog defaultDog;

    @Before
    public void setUp() throws Exception {
        DogHouse.clear();
        this.defaultDog = new Dog ("Rocco", new Date(), 1);
        DogHouse.add(defaultDog);
    }

    @Test
    public void testAddDog() {
        //given
        DogHouse.clear(); // empties Dog Warehouse
        Dog expected = new Dog("Rocco", new Date(), 1);
        //when
        DogHouse.add(expected);
        //then
        Dog actual = DogHouse.getDogById(1);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemoveDogById() {
        //given
        Integer defaultDogId = defaultDog.getId();
        Integer actualId = 1;
        //when
        DogHouse.remove(defaultDogId);
        Dog actualDog = DogHouse.getDogById(actualId);
        //then
        Assert.assertNull(actualDog);
//        Assert.assertEquals(null, actualId);
    }

    @Test
    public void testRemoveDogbyDog() {
        //given
        //test set in @before
        //when
        Dog actualDog =  DogHouse.getDogById(1);
        //then
        Assert.assertEquals(defaultDog,actualDog);
    }

    @Test
    public void testGetDogById() {
        //give
        //test set up
        //when
        Dog actualDog = DogHouse.getDogById(1);
        //then
        Assert.assertEquals(defaultDog, actualDog);
    }

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();
        // When
        DogHouse.add(animal);
        // Then
        DogHouse.getNumberOfDogs();
    }
}
