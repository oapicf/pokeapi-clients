
package org.openapitools.client.model


case class PokemonSpeciesVariety (
    /* Whether this variety is the default variety. */
    _isDefault: Boolean,
    /* The Pokémon variety. */
    _pokemon: PokemonSummary
)
object PokemonSpeciesVariety {
    def toStringBody(var_isDefault: Object, var_pokemon: Object) =
        s"""
        | {
        | "isDefault":$var_isDefault,"pokemon":$var_pokemon
        | }
        """.stripMargin
}
