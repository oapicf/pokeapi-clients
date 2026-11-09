package models

type MoveFlavorText struct {

	// The localized flavor text for an api resource in a specific language.
	FlavorText string `json:"flavor_text"`

	// The language this name is in.
	Language LanguageSummary `json:"language"`

	// The version group that uses this flavor text.
	VersionGroup VersionGroupSummary `json:"version_group"`
}
