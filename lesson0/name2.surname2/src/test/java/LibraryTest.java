import org.junit.Test;
import org.junit.Ignore;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
//import static org.hamcrest.MatcherAssert.assertThat;

import static org.junit.Assert.*;

/*
 * This Java source file was auto generated by running 'gradle init --type java-library'
 * by 'dbutakov' at '10/15/16 12:10 AM' with Gradle 3.1
 *
 * @author dbutakov, @date 10/15/16 12:10 AM
 */
public class LibraryTest {
    @Test
    public void test_negative_case_name2surname2() {
        Library classUnderTest = new Library();
        assertThat(classUnderTest.someLibraryMethod(true), is(false));
    }
}
