
package org.openapitools.client.model


case class LocationDetail (
    /* The identifier for this resource. */
    _id: Integer,
    /* The name for this resource. */
    _name: String,
    /* The region this location can be found in. */
    _region: RegionSummary,
    /* The name of this resource listed in different languages. */
    _names: List[LocationName],
    /* A list of game indices relevent to this location by generation. */
    _gameIndices: List[LocationGameIndex],
    /* Areas that can be found within this location. */
    _areas: List[LocationAreaSummary]
)
object LocationDetail {
    def toStringBody(var_id: Object, var_name: Object, var_region: Object, var_names: Object, var_gameIndices: Object, var_areas: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"region":$var_region,"names":$var_names,"gameIndices":$var_gameIndices,"areas":$var_areas
        | }
        """.stripMargin
}
