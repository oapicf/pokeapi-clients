namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AbilityDetailPokemonInnerPokemon
open OpenAPI.Model.EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner

module EvolutionChainDetailChainEvolvesToInner =

  //#region EvolutionChainDetailChainEvolvesToInner

  [<CLIMutable>]
  type EvolutionChainDetailChainEvolvesToInner = {
    [<JsonProperty(PropertyName = "evolution_details")>]
    EvolutionDetails : EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner[];
    [<JsonProperty(PropertyName = "is_baby")>]
    IsBaby : bool;
    [<JsonProperty(PropertyName = "species")>]
    Species : AbilityDetailPokemonInnerPokemon;
  }

  //#endregion
