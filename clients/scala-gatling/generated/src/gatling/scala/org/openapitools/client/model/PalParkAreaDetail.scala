
package org.openapitools.client.model


case class PalParkAreaDetail (
    /* The identifier for this resource. */
    _id: Integer,
    /* The name for this resource. */
    _name: String,
    /* The name of this resource listed in different languages. */
    _names: List[PalParkAreaName],
    /* A list of Pokémon encountered in thi pal park area along with details. */
    _pokemonEncounters: List[PalParkEncounter]
)
object PalParkAreaDetail {
    def toStringBody(var_id: Object, var_name: Object, var_names: Object, var_pokemonEncounters: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"names":$var_names,"pokemonEncounters":$var_pokemonEncounters
        | }
        """.stripMargin
}
