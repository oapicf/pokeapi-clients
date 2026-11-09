package models

type PokemonMoveVersionGroup struct {

	// The minimum level to learn the move.
	LevelLearnedAt int32 `json:"level_learned_at"`

	// The method by which the move is learned.
	MoveLearnMethod MoveLearnMethodSummary `json:"move_learn_method"`

	// The version group in which the move is learned.
	VersionGroup VersionGroupSummary `json:"version_group"`

	// Order by which the pokemon will learn the move. A newly learnt move will replace the move with lowest order.
	Order *int32 `json:"order,omitempty"`
}
