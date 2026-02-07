
package org.openapitools.client.model

import java.net.URI

case class EggGroupDetailPokemonSpeciesInner (
    /* Pokemon species name. */
    _name: Option[String],
    /* The URL to get more information about the species */
    _url: Option[URI]
)
object EggGroupDetailPokemonSpeciesInner {
    def toStringBody(var_name: Object, var_url: Object) =
        s"""
        | {
        | "name":$var_name,"url":$var_url
        | }
        """.stripMargin
}
