package org.openapitools.server.model


/**
 * @param frontDefault The URL of the default front official artwork, or null if unavailable. for example: ''null''
 * @param frontShiny The URL of the shiny front official artwork, or null if unavailable. for example: ''null''
 * @param versions Additional official artwork grouped by version. Available keys vary by resource. for example: ''null''
*/
final case class PokemonSpritesOtherOfficialArtwork (
  frontDefault: String,
  frontShiny: String,
  versions: Option[Map[String, Map[String, AnyType]]] = None
)

