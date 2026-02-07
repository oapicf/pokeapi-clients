package models

type ItemFlavorText struct {

	Text string `json:"text"`

	VersionGroup VersionGroupSummary `json:"version_group"`

	Language LanguageSummary `json:"language"`
}
