
package org.openapitools.client.model


case class PokemonSprites (
    /* The default depiction of this Pokémon from the front in battle. */
    _frontDefault: String,
    /* The shiny depiction of this Pokémon from the front in battle. */
    _frontShiny: String,
    /* The female depiction of this Pokémon from the front in battle. */
    _frontFemale: String,
    /* The shiny female depiction of this Pokémon from the front in battle. */
    _frontShinyFemale: String,
    /* The default depiction of this Pokémon from the back in battle. */
    _backDefault: String,
    /* The shiny depiction of this Pokémon from the back in battle. */
    _backShiny: String,
    /* The female depiction of this Pokémon from the back in battle. */
    _backFemale: String,
    /* The shiny female depiction of this Pokémon from the back in battle. */
    _backShinyFemale: String,
    /* Additional sprites grouped by source, such as official artwork, HOME, and Showdown. Available keys vary by resource. */
    _other: Option[PokemonSpritesOther],
    /* Sprites grouped by generation and game. Available keys vary by resource. */
    _versions: Option[Map[String, Map[String, AnyType]]]
)
object PokemonSprites {
    def toStringBody(var_frontDefault: Object, var_frontShiny: Object, var_frontFemale: Object, var_frontShinyFemale: Object, var_backDefault: Object, var_backShiny: Object, var_backFemale: Object, var_backShinyFemale: Object, var_other: Object, var_versions: Object) =
        s"""
        | {
        | "frontDefault":$var_frontDefault,"frontShiny":$var_frontShiny,"frontFemale":$var_frontFemale,"frontShinyFemale":$var_frontShinyFemale,"backDefault":$var_backDefault,"backShiny":$var_backShiny,"backFemale":$var_backFemale,"backShinyFemale":$var_backShinyFemale,"other":$var_other,"versions":$var_versions
        | }
        """.stripMargin
}
