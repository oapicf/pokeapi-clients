
package org.openapitools.client.model


case class PalParkEncounter (
    /* The base score given to the player when this Pokémon is caught during a pal park run. */
    _baseScore: Option[Integer],
    /* The base rate for encountering this Pokémon in this pal park area. */
    _rate: Integer,
    /* The Pokémon species being encountered. */
    _pokemonSpecies: PokemonSpeciesSummary
)
object PalParkEncounter {
    def toStringBody(var_baseScore: Object, var_rate: Object, var_pokemonSpecies: Object) =
        s"""
        | {
        | "baseScore":$var_baseScore,"rate":$var_rate,"pokemonSpecies":$var_pokemonSpecies
        | }
        """.stripMargin
}
