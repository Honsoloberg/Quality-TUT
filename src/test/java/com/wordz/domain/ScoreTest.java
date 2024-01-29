package com.wordz.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

class ScoreTest {

	@Test
	public void addTest() {
		assertEquals(8, new Score().add(3, 5));
	}

}
