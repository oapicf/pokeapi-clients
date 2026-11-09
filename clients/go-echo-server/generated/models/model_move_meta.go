package models

type MoveMeta struct {

	// The status ailment this move inflicts on its target.
	Ailment MoveMetaAilmentSummary `json:"ailment"`

	// The category of move this move falls under, e.g. damage or ailment.
	Category MoveMetaCategorySummary `json:"category"`

	// The minimum number of times this move hits. Null if it always only hits once.
	MinHits *int32 `json:"min_hits,omitempty"`

	// The maximum number of times this move hits. Null if it always only hits once.
	MaxHits *int32 `json:"max_hits,omitempty"`

	// The minimum number of turns this move continues to take effect. Null if it always only lasts one turn.
	MinTurns *int32 `json:"min_turns,omitempty"`

	// The maximum number of turns this move continues to take effect. Null if it always only lasts one turn.
	MaxTurns *int32 `json:"max_turns,omitempty"`

	// HP drain (if positive) or Recoil damage (if negative), in percent of damage done.
	Drain *int32 `json:"drain,omitempty"`

	// The amount of hp gained by the attacking Pokemon, in percent of it's maximum HP.
	Healing *int32 `json:"healing,omitempty"`

	// Critical hit rate bonus.
	CritRate *int32 `json:"crit_rate,omitempty"`

	// The likelihood this attack will cause an ailment.
	AilmentChance *int32 `json:"ailment_chance,omitempty"`

	// The likelihood this attack will cause the target Pokémon to flinch.
	FlinchChance *int32 `json:"flinch_chance,omitempty"`

	// The likelihood this attack will cause a stat change in the target Pokémon.
	StatChance *int32 `json:"stat_chance,omitempty"`
}
