package models

type MoveFlavorText struct {

	FlavorText string `json:"flavor_text"`

	Language LanguageSummary `json:"language"`

	VersionGroup VersionGroupSummary `json:"version_group"`
}
