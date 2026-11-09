package org.openapitools.server.model


/**
 * @param increase A list of natures and how they change the referenced Pokéathlon stat. for example: ''null''
 * @param decrease A list of natures and how they change the referenced Pokéathlon stat. for example: ''null''
*/
final case class PokeathlonStatAffectingNatures (
  increase: Seq[PokeathlonStatAffectingNature],
  decrease: Seq[PokeathlonStatAffectingNature]
)

