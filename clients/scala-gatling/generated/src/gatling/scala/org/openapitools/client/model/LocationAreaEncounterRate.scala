
package org.openapitools.client.model


case class LocationAreaEncounterRate (
    /* The method in which Pokémon may be encountered in an area.. */
    _encounterMethod: EncounterMethodSummary,
    /* The chance of the encounter to occur on a version of the game. */
    _versionDetails: List[LocationAreaEncounterVersionDetail]
)
object LocationAreaEncounterRate {
    def toStringBody(var_encounterMethod: Object, var_versionDetails: Object) =
        s"""
        | {
        | "encounterMethod":$var_encounterMethod,"versionDetails":$var_versionDetails
        | }
        """.stripMargin
}
