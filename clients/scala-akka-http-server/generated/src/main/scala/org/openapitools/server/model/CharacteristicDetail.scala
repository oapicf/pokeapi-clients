package org.openapitools.server.model


/**
 * @param id The identifier for this resource. for example: ''null''
 * @param geneModulo The remainder of the highest stat/IV divided by 5. for example: ''null''
 * @param possibleValues The possible values of the highest stat that would result in a Pokémon recieving this characteristic when divided by 5. for example: ''null''
 * @param highestStat The stat which results in this characteristic. for example: ''null''
 * @param descriptions The descriptions of this characteristic listed in different languages. for example: ''null''
*/
final case class CharacteristicDetail (
  id: Int,
  geneModulo: Int,
  possibleValues: Seq[Int],
  highestStat: StatSummary,
  descriptions: Seq[CharacteristicDescription]
)

