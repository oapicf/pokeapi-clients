
package org.openapitools.client.model


case class LocationAreaEncounterVersionDetail (
    /* The chance of an encounter to occur. */
    _rate: Integer,
    /* The version of the game in which the encounter can occur with the given chance. */
    _version: VersionSummary
)
object LocationAreaEncounterVersionDetail {
    def toStringBody(var_rate: Object, var_version: Object) =
        s"""
        | {
        | "rate":$var_rate,"version":$var_version
        | }
        """.stripMargin
}
