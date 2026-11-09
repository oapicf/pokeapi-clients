package org.openapitools.server.model


/**
 * @param frontDefault The default depiction of this Pokémon from the front in battle. for example: ''null''
 * @param frontShiny The shiny depiction of this Pokémon from the front in battle. for example: ''null''
 * @param frontFemale The female depiction of this Pokémon from the front in battle. for example: ''null''
 * @param frontShinyFemale The shiny female depiction of this Pokémon from the front in battle. for example: ''null''
 * @param backDefault The default depiction of this Pokémon from the back in battle. for example: ''null''
 * @param backShiny The shiny depiction of this Pokémon from the back in battle. for example: ''null''
 * @param backFemale The female depiction of this Pokémon from the back in battle. for example: ''null''
 * @param backShinyFemale The shiny female depiction of this Pokémon from the back in battle. for example: ''null''
 * @param other Additional sprites grouped by source, such as official artwork, HOME, and Showdown. Available keys vary by resource. for example: ''null''
 * @param versions Sprites grouped by generation and game. Available keys vary by resource. for example: ''null''
*/
final case class PokemonFormSprites (
  frontDefault: String,
  frontShiny: String,
  frontFemale: String,
  frontShinyFemale: String,
  backDefault: String,
  backShiny: String,
  backFemale: String,
  backShinyFemale: String,
  other: Option[PokemonSpritesOther] = None,
  versions: Option[Map[String, Map[String, AnyType]]] = None
)

