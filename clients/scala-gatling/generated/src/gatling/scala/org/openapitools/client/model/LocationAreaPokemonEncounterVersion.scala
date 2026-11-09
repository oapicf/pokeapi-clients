
package org.openapitools.client.model


case class LocationAreaPokemonEncounterVersion (
    /* The game version this encounter happens in. */
    _version: VersionSummary,
    /* The total percentage of all encounter potential. */
    _maxChance: Integer,
    /* A list of encounters and their specifics. */
    _encounterDetails: List[LocationAreaEncounterDetail]
)
object LocationAreaPokemonEncounterVersion {
    def toStringBody(var_version: Object, var_maxChance: Object, var_encounterDetails: Object) =
        s"""
        | {
        | "version":$var_version,"maxChance":$var_maxChance,"encounterDetails":$var_encounterDetails
        | }
        """.stripMargin
}
