
package org.openapitools.client.model


case class PokemonSpritesOtherOfficialArtwork (
    /* The URL of the default front official artwork, or null if unavailable. */
    _frontDefault: String,
    /* The URL of the shiny front official artwork, or null if unavailable. */
    _frontShiny: String,
    /* Additional official artwork grouped by version. Available keys vary by resource. */
    _versions: Option[Map[String, Map[String, AnyType]]]
)
object PokemonSpritesOtherOfficialArtwork {
    def toStringBody(var_frontDefault: Object, var_frontShiny: Object, var_versions: Object) =
        s"""
        | {
        | "frontDefault":$var_frontDefault,"frontShiny":$var_frontShiny,"versions":$var_versions
        | }
        """.stripMargin
}
