package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void testAddCat() {
        //given
        CatHouse.clear(); // empties Cat Warehouse
        Cat expected = new Cat("Luna", new Date(), 1);
        //when
        CatHouse.add(expected);
        //then
        Cat actual = CatHouse.getCatById(1);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemoveCatInt() {
        //given
        CatHouse.clear(); // empties Cat Warehouse
        Cat expectedId = new Cat("Luna", new Date(), 1); //add a new for test
        CatHouse.add(expectedId); //add the cat to our cat house
        //when
        CatHouse.remove(expectedId); //we remove the cat
        Cat actualId = CatHouse.getCatById(1); //we try to find hte cat at id 1
        //then
        Assert.assertNull(actualId); //when we remove the cat, there should be nothing
        // we expect the cat to not be there,
        // so this is when we get the cat, we check if we removed the cat
//        Assert.assertEquals(null, actualId);  this is if we have to use assertequals
    }

    @Test
    public void testRemoveCatCat() {
        //given
        CatHouse.clear();
        Cat expectedCat = new Cat("Sol", new Date(), 2);
        CatHouse.add(expectedCat);
        //when
        CatHouse.remove(expectedCat);
        Cat actualCat = CatHouse.getCatById(2);
        //then
        Assert.assertNull(actualCat);
//        Assert.assertEquals(null, actualCat);
    }

    @Test
    public void testGetCatById() {
        //given
        CatHouse.clear();
        Cat expectedCat = new Cat("Sol", new Date(), 2);
        CatHouse.add(expectedCat);
        //when
        CatHouse.getCatById(2);
        Cat actualCat = CatHouse.getCatById(2);
        //then
        Assert.assertEquals(expectedCat, actualCat);
    }

    @Test
    public void testNumberOfCats() {
        //given
        CatHouse.clear();
        Cat expectedCat = new Cat("Luna", new Date(), 1);
        CatHouse.add(expectedCat);
        //when
        Integer actualNumberOfCats = CatHouse.getNumberOfCats();
        //then
        Assert.assertEquals(Integer.valueOf(1), actualNumberOfCats);
    }
}
