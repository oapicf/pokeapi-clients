package org.openapitools.server.model


/**
 * @param deployDate The deployment time as a Unix timestamp string. for example: ''null''
 * @param hash The source commit hash used for this deployment. for example: ''null''
 * @param tag The deployment tag, or null if the deployment has no tag. for example: ''null''
*/
final case class PokeapiMetaResponse (
  deployDate: String,
  hash: String,
  tag: String
)

