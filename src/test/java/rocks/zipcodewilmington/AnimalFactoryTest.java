package rocks.zipcodewilmington;

import org.junit.Test;
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

        //when
        AnimalFactory.createDog("Rocco", new Date());
        //then

    }
}
