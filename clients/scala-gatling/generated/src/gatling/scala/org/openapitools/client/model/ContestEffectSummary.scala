
package org.openapitools.client.model

import java.net.URI

case class ContestEffectSummary (
    /* The URL of the referenced resource. */
    _url: URI
)
object ContestEffectSummary {
    def toStringBody(var_url: Object) =
        s"""
        | {
        | "url":$var_url
        | }
        """.stripMargin
}
