package models

type ItemFlavorText struct {

	// The localized flavor text for an API resource in a specific language.
	Text string `json:"text"`

	// The version group which uses this flavor text.
	VersionGroup VersionGroupSummary `json:"version_group"`

	// The language this name is in.
	Language LanguageSummary `json:"language"`
}
