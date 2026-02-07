namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AbilityDetailPokemonInnerPokemon

module ItemDetailMachinesInner =

  //#region ItemDetailMachinesInner

  [<CLIMutable>]
  type ItemDetailMachinesInner = {
    [<JsonProperty(PropertyName = "machine")>]
    Machine : string;
    [<JsonProperty(PropertyName = "version_group")>]
    VersionGroup : AbilityDetailPokemonInnerPokemon;
  }

  //#endregion
