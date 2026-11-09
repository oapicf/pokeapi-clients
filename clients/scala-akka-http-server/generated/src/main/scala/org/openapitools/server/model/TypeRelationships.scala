package org.openapitools.server.model


/**
 * @param noDamageTo A list of types this type has no effect on. for example: ''null''
 * @param halfDamageTo A list of types this type is not very effect against. for example: ''null''
 * @param doubleDamageTo A list of types this type is very effect against. for example: ''null''
 * @param noDamageFrom A list of types that have no effect on this type. for example: ''null''
 * @param halfDamageFrom A list of types that are not very effective against this type. for example: ''null''
 * @param doubleDamageFrom A list of types that are very effective against this type. for example: ''null''
*/
final case class TypeRelationships (
  noDamageTo: Seq[TypeSummary],
  halfDamageTo: Seq[TypeSummary],
  doubleDamageTo: Seq[TypeSummary],
  noDamageFrom: Seq[TypeSummary],
  halfDamageFrom: Seq[TypeSummary],
  doubleDamageFrom: Seq[TypeSummary]
)

