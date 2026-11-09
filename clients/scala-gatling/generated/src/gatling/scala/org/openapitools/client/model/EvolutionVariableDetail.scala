
package org.openapitools.client.model


case class EvolutionVariableDetail (
    /* The identifier for this resource. */
    _id: Integer,
    /* The name for this resource. */
    _name: String,
    /* The symbol used for this variable in evolution condition expressions. */
    _symbol: String,
    /* The data type of this variable. */
    _dataType: Option[String],
    /* The source of the variable value. */
    _source: Option[String],
    /* The version group in which this variable was introduced. */
    _versionGroup: VersionGroupSummary,
    /* The name of this resource listed in different languages. */
    _names: List[EvolutionVariableName],
    /* The description of this resource listed in different languages. */
    _descriptions: List[EvolutionVariableDescription]
)
object EvolutionVariableDetail {
    def toStringBody(var_id: Object, var_name: Object, var_symbol: Object, var_dataType: Object, var_source: Object, var_versionGroup: Object, var_names: Object, var_descriptions: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"symbol":$var_symbol,"dataType":$var_dataType,"source":$var_source,"versionGroup":$var_versionGroup,"names":$var_names,"descriptions":$var_descriptions
        | }
        """.stripMargin
}
