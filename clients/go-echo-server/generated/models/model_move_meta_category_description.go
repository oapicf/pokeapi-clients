package models

type MoveMetaCategoryDescription struct {

	Description string `json:"description,omitempty"`

	Language LanguageSummary `json:"language"`
}
