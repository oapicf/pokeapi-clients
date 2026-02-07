package models

type ContestTypeName struct {

	Name string `json:"name"`

	Color string `json:"color"`

	Language LanguageSummary `json:"language"`
}
