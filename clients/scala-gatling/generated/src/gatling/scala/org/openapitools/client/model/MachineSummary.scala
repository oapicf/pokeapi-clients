
package org.openapitools.client.model

import java.net.URI

case class MachineSummary (
    _url: URI
)
object MachineSummary {
    def toStringBody(var_url: Object) =
        s"""
        | {
        | "url":$var_url
        | }
        """.stripMargin
}
