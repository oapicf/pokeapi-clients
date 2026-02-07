package models

type ItemAttributeDetail struct {

	Id int32 `json:"id"`

	Name string `json:"name"`

	Descriptions []ItemAttributeDescription `json:"descriptions"`

	Items []AbilityDetailPokemonInnerPokemon `json:"items"`

	Names []ItemAttributeName `json:"names"`
}
