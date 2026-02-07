
package org.openapitools.client.model


case class PokeathlonStatDetail (
    _id: Integer,
    _name: String,
    _affectingNatures: PokeathlonStatDetailAffectingNatures,
    _names: List[PokeathlonStatName]
)
object PokeathlonStatDetail {
    def toStringBody(var_id: Object, var_name: Object, var_affectingNatures: Object, var_names: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"affectingNatures":$var_affectingNatures,"names":$var_names
        | }
        """.stripMargin
}
