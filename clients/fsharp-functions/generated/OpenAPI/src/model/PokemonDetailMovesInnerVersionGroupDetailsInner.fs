namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AbilityDetailPokemonInnerPokemon

module PokemonDetailMovesInnerVersionGroupDetailsInner =

  //#region PokemonDetailMovesInnerVersionGroupDetailsInner

  [<CLIMutable>]
  type PokemonDetailMovesInnerVersionGroupDetailsInner = {
    [<JsonProperty(PropertyName = "level_learned_at")>]
    LevelLearnedAt : int;
    [<JsonProperty(PropertyName = "move_learn_method")>]
    MoveLearnMethod : AbilityDetailPokemonInnerPokemon;
    [<JsonProperty(PropertyName = "version_group")>]
    VersionGroup : AbilityDetailPokemonInnerPokemon;
  }

  //#endregion
