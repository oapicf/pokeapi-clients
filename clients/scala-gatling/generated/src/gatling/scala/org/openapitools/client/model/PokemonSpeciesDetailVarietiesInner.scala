
package org.openapitools.client.model


case class PokemonSpeciesDetailVarietiesInner (
    _isDefault: Boolean,
    _pokemon: AbilityDetailPokemonInnerPokemon
)
object PokemonSpeciesDetailVarietiesInner {
    def toStringBody(var_isDefault: Object, var_pokemon: Object) =
        s"""
        | {
        | "isDefault":$var_isDefault,"pokemon":$var_pokemon
        | }
        """.stripMargin
}
