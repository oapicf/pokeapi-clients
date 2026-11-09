package org.openapitools.server.model


/**
 * @param maxChange The amount of change. for example: ''null''
 * @param pokeathlonStat The stat being affected. for example: ''null''
*/
final case class NaturePokeathlonStat (
  maxChange: Int,
  pokeathlonStat: PokeathlonStatSummary
)

