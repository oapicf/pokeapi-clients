package models

type PokeapiMetaResponse struct {

	// The deployment time as a Unix timestamp string.
	DeployDate *string `json:"deploy_date"`

	// The source commit hash used for this deployment.
	Hash *string `json:"hash"`

	// The deployment tag, or null if the deployment has no tag.
	Tag *string `json:"tag"`
}
