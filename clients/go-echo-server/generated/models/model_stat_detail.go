package models

type StatDetail struct {

	Id int32 `json:"id"`

	Name string `json:"name"`

	GameIndex int32 `json:"game_index"`

	IsBattleOnly bool `json:"is_battle_only,omitempty"`

	AffectingMoves StatDetailAffectingMoves `json:"affecting_moves"`

	AffectingNatures StatDetailAffectingNatures `json:"affecting_natures"`

	Characteristics []CharacteristicSummary `json:"characteristics"`

	MoveDamageClass MoveDamageClassSummary `json:"move_damage_class"`

	Names []StatName `json:"names"`
}
