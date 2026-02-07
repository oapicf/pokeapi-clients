package org.openapitools.server.model


/**
 * @param id  for example: ''null''
 * @param name  for example: ''null''
 * @param affectingNatures  for example: ''null''
 * @param names  for example: ''null''
*/
final case class PokeathlonStatDetail (
  id: Int,
  name: String,
  affectingNatures: PokeathlonStatDetailAffectingNatures,
  names: Seq[PokeathlonStatName]
)

