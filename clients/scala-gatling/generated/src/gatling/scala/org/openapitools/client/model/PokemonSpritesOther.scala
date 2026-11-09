
package org.openapitools.client.model


case class PokemonSpritesOther (
    /* Pokémon Dream World artwork URLs. */
    _dreamWorld: Option[PokemonSpritesOtherDreamWorld],
    /* Pokémon HOME sprite URLs. */
    _home: Option[PokemonSpritesOtherHome],
    /* Pokémon Showdown sprite URLs. */
    _showdown: Option[PokemonSpritesOtherShowdown],
    /* Official Pokémon artwork URLs, including shiny artwork and version-specific variants. */
    _officialArtwork: Option[PokemonSpritesOtherOfficialArtwork]
)
object PokemonSpritesOther {
    def toStringBody(var_dreamWorld: Object, var_home: Object, var_showdown: Object, var_officialArtwork: Object) =
        s"""
        | {
        | "dreamWorld":$var_dreamWorld,"home":$var_home,"showdown":$var_showdown,"officialArtwork":$var_officialArtwork
        | }
        """.stripMargin
}
