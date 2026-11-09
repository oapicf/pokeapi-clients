
package org.openapitools.client.model


case class PokeathlonStatDetail (
    /* The identifier for this resource. */
    _id: Integer,
    /* The name for this resource. */
    _name: String,
    /* A detail of natures which affect this Pokéathlon stat positively or negatively. */
    _affectingNatures: PokeathlonStatAffectingNatures,
    /* The name of this resource listed in different languages. */
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
