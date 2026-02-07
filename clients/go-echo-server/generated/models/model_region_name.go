package models

type RegionName struct {

	Name string `json:"name"`

	Language LanguageSummary `json:"language"`
}
