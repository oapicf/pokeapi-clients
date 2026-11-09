
package org.openapitools.client.model


case class CharacteristicDetail (
    /* The identifier for this resource. */
    _id: Integer,
    /* The remainder of the highest stat/IV divided by 5. */
    _geneModulo: Integer,
    /* The possible values of the highest stat that would result in a Pokémon recieving this characteristic when divided by 5. */
    _possibleValues: List[Integer],
    /* The stat which results in this characteristic. */
    _highestStat: StatSummary,
    /* The descriptions of this characteristic listed in different languages. */
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
