/*
 * Copyright (c) 2020. Taktik SA, All rights reserved.
 */

package org.taktik.icure.services.external.http.websocket

interface AsyncProgress {
	suspend fun progress(progress: Double)
}
