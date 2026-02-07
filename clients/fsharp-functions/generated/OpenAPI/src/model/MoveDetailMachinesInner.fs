namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AbilityDetailPokemonInnerPokemon
open OpenAPI.Model.MoveDetailMachinesInnerMachine

module MoveDetailMachinesInner =

  //#region MoveDetailMachinesInner

  [<CLIMutable>]
  type MoveDetailMachinesInner = {
    [<JsonProperty(PropertyName = "machine")>]
    Machine : MoveDetailMachinesInnerMachine;
    [<JsonProperty(PropertyName = "version_group")>]
    VersionGroup : AbilityDetailPokemonInnerPokemon;
  }

  //#endregion
