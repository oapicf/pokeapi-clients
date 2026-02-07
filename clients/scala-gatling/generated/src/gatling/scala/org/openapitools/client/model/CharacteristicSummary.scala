
package org.openapitools.client.model

import java.net.URI

case class CharacteristicSummary (
    _url: URI
)
object CharacteristicSummary {
    def toStringBody(var_url: Object) =
        s"""
        | {
        | "url":$var_url
        | }
        """.stripMargin
}
