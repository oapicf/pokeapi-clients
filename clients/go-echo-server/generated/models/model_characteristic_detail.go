package models

type CharacteristicDetail struct {

	// The identifier for this resource.
	Id int32 `json:"id"`

	// The remainder of the highest stat/IV divided by 5.
	GeneModulo int32 `json:"gene_modulo"`

	// The possible values of the highest stat that would result in a Pokémon recieving this characteristic when divided by 5.
	PossibleValues []int32 `json:"possible_values"`

	// The stat which results in this characteristic.
	HighestStat StatSummary `json:"highest_stat"`

	// The descriptions of this characteristic listed in different languages.
	Descriptions []CharacteristicDescription `json:"descriptions"`
}
