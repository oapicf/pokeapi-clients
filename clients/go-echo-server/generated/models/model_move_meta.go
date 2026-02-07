package models

type MoveMeta struct {

	Ailment MoveMetaAilmentSummary `json:"ailment"`

	Category MoveMetaCategorySummary `json:"category"`

	MinHits *int32 `json:"min_hits,omitempty"`

	MaxHits *int32 `json:"max_hits,omitempty"`

	MinTurns *int32 `json:"min_turns,omitempty"`

	MaxTurns *int32 `json:"max_turns,omitempty"`

	Drain *int32 `json:"drain,omitempty"`

	Healing *int32 `json:"healing,omitempty"`

	CritRate *int32 `json:"crit_rate,omitempty"`

	AilmentChance *int32 `json:"ailment_chance,omitempty"`

	FlinchChance *int32 `json:"flinch_chance,omitempty"`

	StatChance *int32 `json:"stat_chance,omitempty"`
}
