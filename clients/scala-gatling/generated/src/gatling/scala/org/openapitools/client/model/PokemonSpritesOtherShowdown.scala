
package org.openapitools.client.model


case class PokemonSpritesOtherShowdown (
    /* The URL of the default Pokémon Showdown front image, or null if unavailable. */
    _frontDefault: String,
    /* The URL of the female Pokémon Showdown front image, or null if unavailable. */
    _frontFemale: String,
    /* The URL of the shiny Pokémon Showdown front image, or null if unavailable. */
    _frontShiny: String,
    /* The URL of the shiny female Pokémon Showdown front image, or null if unavailable. */
    _frontShinyFemale: String,
    /* The URL of the default Pokémon Showdown back image, or null if unavailable. */
    _backDefault: String,
    /* The URL of the female Pokémon Showdown back image, or null if unavailable. */
    _backFemale: String,
    /* The URL of the shiny Pokémon Showdown back image, or null if unavailable. */
    _backShiny: String,
    /* The URL of the shiny female Pokémon Showdown back image, or null if unavailable. */
    _backShinyFemale: String
)
object PokemonSpritesOtherShowdown {
    def toStringBody(var_frontDefault: Object, var_frontFemale: Object, var_frontShiny: Object, var_frontShinyFemale: Object, var_backDefault: Object, var_backFemale: Object, var_backShiny: Object, var_backShinyFemale: Object) =
        s"""
        | {
        | "frontDefault":$var_frontDefault,"frontFemale":$var_frontFemale,"frontShiny":$var_frontShiny,"frontShinyFemale":$var_frontShinyFemale,"backDefault":$var_backDefault,"backFemale":$var_backFemale,"backShiny":$var_backShiny,"backShinyFemale":$var_backShinyFemale
        | }
        """.stripMargin
}
