
package org.openapitools.client.model

import java.net.URI

case class EvolutionChainSummary (
    _url: URI
)
object EvolutionChainSummary {
    def toStringBody(var_url: Object) =
        s"""
        | {
        | "url":$var_url
        | }
        """.stripMargin
}
