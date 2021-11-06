package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void testCreateDog() {
        //given
        String expectedName = "Rocco";
        Date expectedDate = new Date();
        //when
        Dog actualDog = AnimalFactory.createDog(expectedName, expectedDate);
        //then
        Assert.assertEquals(expectedName, actualDog.getName());
        Assert.assertEquals(expectedDate, actualDog.getBirthDate());
    }

    @Test
    public void testCreateCog() {
        //given
        String expectedName = "Luna";
        Date expectedDate = new Date();
        //when
        Cat actualCat = AnimalFactory.createCat(expectedName, expectedDate);
        //then
        Assert.assertEquals(expectedName, actualCat.getName());
        Assert.assertEquals(expectedDate, actualCat.getBirthDate());
    }
}
