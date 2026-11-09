package models

type AbilityFlavorText struct {

	// The localized name for an API resource in a specific language.
	FlavorText string `json:"flavor_text"`

	// The language this text resource is in.
	Language LanguageSummary `json:"language"`

	// The version group that uses this flavor text.
	VersionGroup VersionGroupSummary `json:"version_group"`
}
