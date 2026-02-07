package org.openapitools.server.model


/**
 * @param decrease  for example: ''null''
 * @param increase  for example: ''null''
*/
final case class PokeathlonStatDetailAffectingNatures (
  decrease: Seq[PokeathlonStatDetailAffectingNaturesDecreaseInner],
  increase: Seq[PokeathlonStatDetailAffectingNaturesIncreaseInner]
)

