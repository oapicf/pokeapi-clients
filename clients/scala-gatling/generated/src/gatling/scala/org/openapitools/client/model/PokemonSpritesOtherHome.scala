
package org.openapitools.client.model


case class PokemonSpritesOtherHome (
    /* The URL of the default Pokémon HOME front image, or null if unavailable. */
    _frontDefault: String,
    /* The URL of the female Pokémon HOME front image, or null if unavailable. */
    _frontFemale: String,
    /* The URL of the shiny Pokémon HOME front image, or null if unavailable. */
    _frontShiny: String,
    /* The URL of the shiny female Pokémon HOME front image, or null if unavailable. */
    _frontShinyFemale: String
)
object PokemonSpritesOtherHome {
    def toStringBody(var_frontDefault: Object, var_frontFemale: Object, var_frontShiny: Object, var_frontShinyFemale: Object) =
        s"""
        | {
        | "frontDefault":$var_frontDefault,"frontFemale":$var_frontFemale,"frontShiny":$var_frontShiny,"frontShinyFemale":$var_frontShinyFemale
        | }
        """.stripMargin
}
