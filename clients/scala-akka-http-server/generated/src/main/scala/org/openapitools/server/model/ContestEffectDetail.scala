package org.openapitools.server.model


/**
 * @param id The identifier for this resource. for example: ''null''
 * @param appeal The base number of hearts the user of this move gets. for example: ''null''
 * @param jam The base number of hearts the user's opponent loses. for example: ''null''
 * @param effectEntries The result of this contest effect listed in different languages. for example: ''null''
 * @param flavorTextEntries The flavor text of this contest effect listed in different languages. for example: ''null''
*/
final case class ContestEffectDetail (
  id: Int,
  appeal: Int,
  jam: Int,
  effectEntries: Seq[ContestEffectEffectText],
  flavorTextEntries: Seq[ContestEffectFlavorText]
)

