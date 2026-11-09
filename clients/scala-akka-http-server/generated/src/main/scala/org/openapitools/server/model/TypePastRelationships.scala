package org.openapitools.server.model


/**
 * @param generation The last generation in which the referenced type had the listed damage relations for example: ''null''
 * @param damageRelations The damage relations the referenced type had up to and including the listed generation for example: ''null''
*/
final case class TypePastRelationships (
  generation: GenerationSummary,
  damageRelations: TypeRelationships
)

