
package org.openapitools.client.model


case class PokeapiMetaResponse (
    /* The deployment time as a Unix timestamp string. */
    _deployDate: String,
    /* The source commit hash used for this deployment. */
    _hash: String,
    /* The deployment tag, or null if the deployment has no tag. */
    _tag: String
)
object PokeapiMetaResponse {
    def toStringBody(var_deployDate: Object, var_hash: Object, var_tag: Object) =
        s"""
        | {
        | "deployDate":$var_deployDate,"hash":$var_hash,"tag":$var_tag
        | }
        """.stripMargin
}
