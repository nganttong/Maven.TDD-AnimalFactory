package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.net.Inet4Address;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    private Cat defaultCat;

    @Before
    public void setUp() throws Exception {
        String name = "Luna";
        Date birthDate = new Date();
        Integer id = 0;
        defaultCat = new Cat(name, birthDate, id);
    }

    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void setCatName() {
        //given
        String catsActualName = "Luna";
        //refer setup
        //when
        defaultCat.setName(catsActualName);
        //then
        String expectedName = defaultCat.getName();
        Assert.assertEquals(expectedName, catsActualName);
    }

    @Test
    public void testSpeak() {
        //give
        String catsActualSpeech = "meow!";
        //when
        defaultCat.speak();
        //then
        String expectedSpeech = defaultCat.speak();
        Assert.assertEquals(expectedSpeech, catsActualSpeech);
    }

    @Test
    public void testBirthDate() {
        //given
        Date actualBirthDate = new Date();
        //when
        defaultCat.getBirthDate();
        //then
        Date expectedBirthDate = defaultCat.getBirthDate();
        Assert.assertEquals(expectedBirthDate,actualBirthDate);
    }

    @Test
    public void testEatFood() {
        //given
        Food foodToEat = new Food();
        Integer expectedMealsEaten = 1;
        //when
        defaultCat.eat(foodToEat);
        Integer actualMealsEaten = defaultCat.getNumberOfMealsEaten();
        //then
        Assert.assertEquals(expectedMealsEaten,actualMealsEaten);
    }

    @Test
    public void testGetIntId() {
        //given
        Integer expectedCatId = 0;
        //when
        Integer actualCatId = defaultCat.getId();
        //then
        Assert.assertEquals(expectedCatId,actualCatId);
    }

    @Test
    public void animalInheritanceTest() {
        //given
        boolean isAnimal = defaultCat instanceof Animal;
        //then
        Assert.assertTrue(isAnimal);
    }


    @Test
    public void mammalInheritanceTest() {
        //given
        boolean isAnimal = defaultCat instanceof Mammal;
        //then
        Assert.assertTrue(isAnimal);
    }
}
