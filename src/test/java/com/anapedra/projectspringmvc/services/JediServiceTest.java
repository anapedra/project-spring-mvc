package com.anapedra.projectspringmvc.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JediServiceTest {


    @Test
    public void  ShouldSaveJediWhenEmailDoesNotExist(){

        final var expectedName = "Ana Lúcia";
        final var expectEmail = "anapedra.mil@gmail.com";
        final var expectedCpf = "01589021576";
        final var expectedEge = 43;



         Jedi actualJedi= new Jedi(expectedName,expectEmail,expectedCpf,expectedEge);


        Assertions.assertNotNull(actualJedi);
        Assertions.assertNotNull(actualJedi.getId());
        Assertions.assertEquals(expectedName,actualJedi.getName());
        Assertions.assertEquals(expectedCpf,actualJedi.getCpf());
        Assertions.assertEquals(expectedEge,actualJedi.getEge());
        Assertions.assertNotNull(actualJedi.getCreatedAt());
        Assertions.assertNotNull(actualJedi.getUpdatedAt());
        Assertions.assertNull(actualJedi.getDeletedAt());



    }
}