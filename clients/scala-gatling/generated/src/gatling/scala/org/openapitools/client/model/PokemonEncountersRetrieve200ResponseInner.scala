
package org.openapitools.client.model


case class PokemonEncountersRetrieve200ResponseInner (
    _locationArea: PokemonEncountersRetrieve200ResponseInnerLocationArea,
    _versionDetails: List[PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner]
)
object PokemonEncountersRetrieve200ResponseInner {
    def toStringBody(var_locationArea: Object, var_versionDetails: Object) =
        s"""
        | {
        | "locationArea":$var_locationArea,"versionDetails":$var_versionDetails
        | }
        """.stripMargin
}
