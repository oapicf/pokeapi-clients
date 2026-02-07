
package org.openapitools.client.model

import java.net.URI

case class LocationSummary (
    _name: String,
    _url: URI
)
object LocationSummary {
    def toStringBody(var_name: Object, var_url: Object) =
        s"""
        | {
        | "name":$var_name,"url":$var_url
        | }
        """.stripMargin
}
