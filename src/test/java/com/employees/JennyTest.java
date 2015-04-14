package com.employees;
import org.junit.Test;
import static org.fest.assertions.Assertions.*;

public class JennyTest {

    @Test
    public void testSetSalary() throws Exception {
        Jenny jenny = new Jenny();
        jenny.setSalary(100.00);
        double actualValue=jenny.getSalary();
        assertThat(actualValue).isEqualTo(100.00);
    }

    @Test
    public void testGiveRaise() throws Exception {
        Jenny jenny = new Jenny();
        jenny.setSalary(0.00);
        jenny.giveRaise(100.00);
        double actualValue = jenny.getSalary();
        assertThat(actualValue).isEqualTo(100.00);
    }
}