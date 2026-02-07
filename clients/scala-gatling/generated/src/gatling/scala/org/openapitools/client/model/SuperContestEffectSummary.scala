
package org.openapitools.client.model

import java.net.URI

case class SuperContestEffectSummary (
    _url: URI
)
object SuperContestEffectSummary {
    def toStringBody(var_url: Object) =
        s"""
        | {
        | "url":$var_url
        | }
        """.stripMargin
}
