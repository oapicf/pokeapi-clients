package models

type CharacteristicDescription struct {

	Description string `json:"description,omitempty"`

	Language LanguageSummary `json:"language"`
}
