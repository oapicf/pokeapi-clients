package org.openapitools.server.model


/**
 * @param id The identifier for this resource. for example: ''null''
 * @param name The name for this resource. for example: ''null''
 * @param affectingNatures A detail of natures which affect this Pokéathlon stat positively or negatively. for example: ''null''
 * @param names The name of this resource listed in different languages. for example: ''null''
*/
final case class PokeathlonStatDetail (
  id: Int,
  name: String,
  affectingNatures: PokeathlonStatAffectingNatures,
  names: Seq[PokeathlonStatName]
)

