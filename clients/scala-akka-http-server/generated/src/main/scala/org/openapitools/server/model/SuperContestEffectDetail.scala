package org.openapitools.server.model


/**
 * @param id The identifier for this resource. for example: ''null''
 * @param appeal The level of appeal this super contest effect has. for example: ''null''
 * @param flavorTextEntries The flavor text of this super contest effect listed in different languages. for example: ''null''
 * @param moves A list of moves that have the effect when used in super contests. for example: ''null''
*/
final case class SuperContestEffectDetail (
  id: Int,
  appeal: Int,
  flavorTextEntries: Seq[SuperContestEffectFlavorText],
  moves: Seq[MoveSummary]
)

