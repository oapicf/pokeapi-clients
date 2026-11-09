package models

type ContestTypeName struct {

	// The name for this contest.
	Name string `json:"name"`

	// The color associated with this contest's name.
	Color string `json:"color"`

	// The language that this name is in.
	Language LanguageSummary `json:"language"`
}
