package models

type PokeathlonStatDetail struct {

	// The identifier for this resource.
	Id int32 `json:"id"`

	// The name for this resource.
	Name string `json:"name"`

	// A detail of natures which affect this Pokéathlon stat positively or negatively.
	AffectingNatures PokeathlonStatAffectingNatures `json:"affecting_natures"`

	// The name of this resource listed in different languages.
	Names []PokeathlonStatName `json:"names"`
}
