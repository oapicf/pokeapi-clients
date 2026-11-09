package org.openapitools.server.model


/**
 * @param id The identifier for this resource. for example: ''null''
 * @param name The name for this resource. for example: ''null''
 * @param symbol The symbol used for this variable in evolution condition expressions. for example: ''null''
 * @param dataType The data type of this variable. for example: ''null''
 * @param source The source of the variable value. for example: ''null''
 * @param versionGroup The version group in which this variable was introduced. for example: ''null''
 * @param names The name of this resource listed in different languages. for example: ''null''
 * @param descriptions The description of this resource listed in different languages. for example: ''null''
*/
final case class EvolutionVariableDetail (
  id: Int,
  name: String,
  symbol: String,
  dataType: Option[String] = None,
  source: Option[String] = None,
  versionGroup: VersionGroupSummary,
  names: Seq[EvolutionVariableName],
  descriptions: Seq[EvolutionVariableDescription]
)

