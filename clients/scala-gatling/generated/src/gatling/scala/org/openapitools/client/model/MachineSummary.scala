
package org.openapitools.client.model

import java.net.URI

case class MachineSummary (
    /* The URL of the referenced resource. */
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
