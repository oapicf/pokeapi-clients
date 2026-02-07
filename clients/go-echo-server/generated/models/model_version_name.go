package models

type VersionName struct {

	Name string `json:"name"`

	Language LanguageSummary `json:"language"`
}
