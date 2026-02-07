package models

type PokeathlonStatDetail struct {

	Id int32 `json:"id"`

	Name string `json:"name"`

	AffectingNatures PokeathlonStatDetailAffectingNatures `json:"affecting_natures"`

	Names []PokeathlonStatName `json:"names"`
}
