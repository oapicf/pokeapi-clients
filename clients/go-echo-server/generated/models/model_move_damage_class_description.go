package models

type MoveDamageClassDescription struct {

	Description string `json:"description,omitempty"`

	Language LanguageSummary `json:"language"`
}
