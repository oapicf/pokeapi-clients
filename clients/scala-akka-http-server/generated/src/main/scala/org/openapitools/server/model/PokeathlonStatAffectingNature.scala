package org.openapitools.server.model


/**
 * @param maxChange The maximum amount of change to the referenced Pokéathlon stat. for example: ''null''
 * @param nature The nature causing the change. for example: ''null''
*/
final case class PokeathlonStatAffectingNature (
  maxChange: Int,
  nature: NatureSummary
)

