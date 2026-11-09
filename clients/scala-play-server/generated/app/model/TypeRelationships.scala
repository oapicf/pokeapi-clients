package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TypeRelationships.
  * @param noDamageTo A list of types this type has no effect on.
  * @param halfDamageTo A list of types this type is not very effect against.
  * @param doubleDamageTo A list of types this type is very effect against.
  * @param noDamageFrom A list of types that have no effect on this type.
  * @param halfDamageFrom A list of types that are not very effective against this type.
  * @param doubleDamageFrom A list of types that are very effective against this type.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class TypeRelationships(
  noDamageTo: List[TypeSummary],
  halfDamageTo: List[TypeSummary],
  doubleDamageTo: List[TypeSummary],
  noDamageFrom: List[TypeSummary],
  halfDamageFrom: List[TypeSummary],
  doubleDamageFrom: List[TypeSummary]
)

object TypeRelationships {
  implicit lazy val typeRelationshipsJsonFormat: Format[TypeRelationships] = Json.format[TypeRelationships]
}

