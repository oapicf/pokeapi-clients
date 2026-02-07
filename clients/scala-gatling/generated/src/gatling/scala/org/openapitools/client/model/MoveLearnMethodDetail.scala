
package org.openapitools.client.model


case class MoveLearnMethodDetail (
    _id: Integer,
    _name: String,
    _names: List[MoveLearnMethodName],
    _descriptions: List[MoveLearnMethodDescription],
    _versionGroups: List[AbilityDetailPokemonInnerPokemon]
)
object MoveLearnMethodDetail {
    def toStringBody(var_id: Object, var_name: Object, var_names: Object, var_descriptions: Object, var_versionGroups: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"names":$var_names,"descriptions":$var_descriptions,"versionGroups":$var_versionGroups
        | }
        """.stripMargin
}
