
# Table `PokemonStat`
(mapped from: PokemonStat)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**baseStat** | base_stat | int NOT NULL |  | **kotlin.Int** | The base value of the stat. | 
**effort** | effort | int NOT NULL |  | **kotlin.Int** | The effort points (EV) the Pokémon has in the stat. | 
**stat** | stat | long NOT NULL |  | [**StatSummary**](StatSummary.md) | The stat the Pokémon has. |  [foreignkey]





