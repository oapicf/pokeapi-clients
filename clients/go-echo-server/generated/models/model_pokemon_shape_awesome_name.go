package models

type PokemonShapeAwesomeName struct {

	// The localized \"scientific\" name for an API resource in a specific language.
	AwesomeName string `json:"awesome_name"`

	// The language this \"scientific\" name is in.
	Language LanguageSummary `json:"language"`
}
