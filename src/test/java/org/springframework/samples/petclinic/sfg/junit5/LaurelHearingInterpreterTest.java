package org.springframework.samples.petclinic.sfg.junit5;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.sfg.BaseConfig;
import org.springframework.samples.petclinic.sfg.HearingInterpreter;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.samples.petclinic.sfg.LaurelConfig;

import static org.junit.jupiter.api.Assertions.*;

@SpringJUnitConfig(classes = {
    BaseConfig.class,
    LaurelConfig.class
})
class LaurelHearingInterpreterTest {

    @Autowired
    private HearingInterpreter hearingInterpreter;

    @Test
    void whatIHeard() {
        String word = hearingInterpreter.whatIHeard();

        assertEquals("Laurel", word);
    }
}