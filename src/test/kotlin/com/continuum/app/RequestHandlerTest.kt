package com.continuum.app

import kotlin.test.Test
import kotlin.test.assertEquals

class RequestHandlerTest {
    @Test
    fun handlesHealthCheck() {
        val handler = RequestHandler(ProcessingService("continuum-request-for-payment-inbound"))

        assertEquals("continuum-request-for-payment-inbound processed: health-check", handler.handle("health-check"))
    }
}