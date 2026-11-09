
package org.openapitools.client.model


case class PokemonSpeciesPalParkEncounter (
    /* The base score given to the player when the referenced Pokémon is caught during a pal park run. */
    _baseScore: Option[Integer],
    /* The base rate for encountering the referenced Pokémon in this pal park area. */
    _rate: Integer,
    /* The pal park area where this encounter happens. */
    _area: PalParkAreaSummary
)
object PokemonSpeciesPalParkEncounter {
    def toStringBody(var_baseScore: Object, var_rate: Object, var_area: Object) =
        s"""
        | {
        | "baseScore":$var_baseScore,"rate":$var_rate,"area":$var_area
        | }
        """.stripMargin
}
