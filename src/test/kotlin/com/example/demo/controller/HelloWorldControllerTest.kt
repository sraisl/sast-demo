package com.example.demo.controller

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class HelloWorldControllerTest {

    @Test
    fun `hello returns hello world`() {
        val controller = HelloWorldController()

        assertEquals("hello world", controller.hello())
    }
}


