
package org.openapitools.client.model

import java.net.URI

case class PokemonShapeDetailNamesInner (
    _url: URI,
    _name: String
)
object PokemonShapeDetailNamesInner {
    def toStringBody(var_url: Object, var_name: Object) =
        s"""
        | {
        | "url":$var_url,"name":$var_name
        | }
        """.stripMargin
}
