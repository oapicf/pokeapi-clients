
package org.openapitools.client.model

import java.net.URI

case class PokemonHabitatSummary (
    /* The name of the referenced resource. */
    _name: String,
    /* The URL of the referenced resource. */
    _url: URI
)
object PokemonHabitatSummary {
    def toStringBody(var_name: Object, var_url: Object) =
        s"""
        | {
        | "name":$var_name,"url":$var_url
        | }
        """.stripMargin
}
