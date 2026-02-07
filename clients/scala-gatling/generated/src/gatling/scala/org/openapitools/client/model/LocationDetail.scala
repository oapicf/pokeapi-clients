
package org.openapitools.client.model


case class LocationDetail (
    _id: Integer,
    _name: String,
    _region: RegionSummary,
    _names: List[LocationName],
    _gameIndices: List[LocationGameIndex],
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
