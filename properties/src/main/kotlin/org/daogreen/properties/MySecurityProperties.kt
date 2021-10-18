package org.daogreen.properties

import kotlinx.serialization.Serializable

@Serializable
data class MySecurityProperties(
    var user: String,
    var password: String,
    var useOAuth: Boolean
)