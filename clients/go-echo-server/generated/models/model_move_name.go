package models

type MoveName struct {

	Name string `json:"name"`

	Language LanguageSummary `json:"language"`
}
