
package org.openapitools.client.model


case class PokemonSpritesOtherDreamWorld (
    /* The URL of the default Pokémon Dream World front image, or null if unavailable. */
    _frontDefault: String,
    /* The URL of the female Pokémon Dream World front image, or null if unavailable. */
    _frontFemale: String
)
object PokemonSpritesOtherDreamWorld {
    def toStringBody(var_frontDefault: Object, var_frontFemale: Object) =
        s"""
        | {
        | "frontDefault":$var_frontDefault,"frontFemale":$var_frontFemale
        | }
        """.stripMargin
}
