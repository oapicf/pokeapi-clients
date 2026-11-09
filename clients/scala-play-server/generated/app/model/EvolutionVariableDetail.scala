package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for EvolutionVariableDetail.
  * @param id The identifier for this resource.
  * @param name The name for this resource.
  * @param symbol The symbol used for this variable in evolution condition expressions.
  * @param dataType The data type of this variable.
  * @param source The source of the variable value.
  * @param versionGroup The version group in which this variable was introduced.
  * @param names The name of this resource listed in different languages.
  * @param descriptions The description of this resource listed in different languages.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class EvolutionVariableDetail(
  id: Int,
  name: String,
  symbol: String,
  dataType: Option[String],
  source: Option[String],
  versionGroup: VersionGroupSummary,
  names: List[EvolutionVariableName],
  descriptions: List[EvolutionVariableDescription]
)

object EvolutionVariableDetail {
  implicit lazy val evolutionVariableDetailJsonFormat: Format[EvolutionVariableDetail] = Json.format[EvolutionVariableDetail]
}

