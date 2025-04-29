package com.github.pedroluis02.homedevicesapi

import io.ktor.client.request.*
import io.ktor.http.*
import io.ktor.server.testing.*
import kotlin.test.Test
import kotlin.test.assertEquals

class ApplicationTest {

    @Test
    fun testHeath() = testApplication {
        application {
            module()
        }
        client.get("/health").apply {
            assertEquals(HttpStatusCode.Companion.OK, status)
        }
    }
}
