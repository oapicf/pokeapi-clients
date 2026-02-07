
package org.openapitools.client.model

import java.net.URI

case class TypeDetailPokemonInnerPokemon (
    /* The name of the pokemon */
    _name: Option[String],
    /* The URL to get more information about the pokemon */
    _url: Option[URI]
)
object TypeDetailPokemonInnerPokemon {
    def toStringBody(var_name: Object, var_url: Object) =
        s"""
        | {
        | "name":$var_name,"url":$var_url
        | }
        """.stripMargin
}
