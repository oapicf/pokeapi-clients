package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TypePastRelationships.
  * @param generation The last generation in which the referenced type had the listed damage relations
  * @param damageRelations The damage relations the referenced type had up to and including the listed generation
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class TypePastRelationships(
  generation: GenerationSummary,
  damageRelations: TypeRelationships
)

object TypePastRelationships {
  implicit lazy val typePastRelationshipsJsonFormat: Format[TypePastRelationships] = Json.format[TypePastRelationships]
}

