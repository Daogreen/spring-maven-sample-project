package org.daogreen.config

import org.daogreen.properties.MySecurityProperties
import org.daogreen.properties.StringFormatProperties
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@Component
@ConfigurationProperties("foo.bar")
data class ConfigProperties(var host: String = "", var port: Int = 8081) {
  var security: MySecurityProperties = MySecurityProperties("user1", "password1", false)
  var format: StringFormatProperties = StringFormatProperties(true, false, false)
}