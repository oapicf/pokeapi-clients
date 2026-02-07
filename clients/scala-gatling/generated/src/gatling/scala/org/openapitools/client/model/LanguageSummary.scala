
package org.openapitools.client.model

import java.net.URI

case class LanguageSummary (
    _name: String,
    _url: URI
)
object LanguageSummary {
    def toStringBody(var_name: Object, var_url: Object) =
        s"""
        | {
        | "name":$var_name,"url":$var_url
        | }
        """.stripMargin
}
