package models

type CharacteristicDetail struct {

	Id int32 `json:"id"`

	GeneModulo int32 `json:"gene_modulo"`

	PossibleValues []int32 `json:"possible_values"`

	HighestStat StatSummary `json:"highest_stat"`

	Descriptions []CharacteristicDescription `json:"descriptions"`
}
