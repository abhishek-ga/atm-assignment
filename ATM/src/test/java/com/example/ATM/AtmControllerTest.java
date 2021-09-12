package com.example.ATM;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;


@RunWith(SpringRunner.class)
@WebMvcTest(value = AtmController.class)
@WithMockUser
public class AtmControllerTest {
	@Autowired
	private MockMvc mockMvc;


	@Test
	public void transactions() throws Exception {
		//Mockito.when(null).
	}

}