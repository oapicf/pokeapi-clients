
package org.openapitools.client.model


case class CharacteristicDetail (
    _id: Integer,
    _geneModulo: Integer,
    _possibleValues: List[Integer],
    _highestStat: StatSummary,
    _descriptions: List[CharacteristicDescription]
)
object CharacteristicDetail {
    def toStringBody(var_id: Object, var_geneModulo: Object, var_possibleValues: Object, var_highestStat: Object, var_descriptions: Object) =
        s"""
        | {
        | "id":$var_id,"geneModulo":$var_geneModulo,"possibleValues":$var_possibleValues,"highestStat":$var_highestStat,"descriptions":$var_descriptions
        | }
        """.stripMargin
}
