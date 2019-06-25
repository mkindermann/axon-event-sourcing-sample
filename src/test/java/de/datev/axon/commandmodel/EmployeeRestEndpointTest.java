package de.datev.axon.commandmodel;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import de.datev.axon.gui.EmployeeRestEndpoint;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeRestEndpointTest {

	@Autowired
    private EmployeeRestEndpoint controller;

    @Test
    public void contexLoads() throws Exception {
        assertThat(controller).isNotNull();
    }

    
	
}
