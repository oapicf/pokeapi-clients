
# Table `PokemonMoveVersionGroup`
(mapped from: PokemonMoveVersionGroup)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**levelLearnedAt** | level_learned_at | int NOT NULL |  | **kotlin.Int** | The minimum level to learn the move. | 
**moveLearnMethod** | move_learn_method | long NOT NULL |  | [**MoveLearnMethodSummary**](MoveLearnMethodSummary.md) | The method by which the move is learned. |  [foreignkey]
**versionGroup** | version_group | long NOT NULL |  | [**VersionGroupSummary**](VersionGroupSummary.md) | The version group in which the move is learned. |  [foreignkey]
**order** | order | int |  | **kotlin.Int** | Order by which the pokemon will learn the move. A newly learnt move will replace the move with lowest order. |  [optional]






