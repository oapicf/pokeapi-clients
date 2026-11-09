package org.openapitools.server.model


/**
 * @param gameIndex The internal id of an API resource within game data. for example: ''null''
 * @param generation The generation relevent to this game index. for example: ''null''
*/
final case class TypeGameIndex (
  gameIndex: Int,
  generation: GenerationSummary
)

