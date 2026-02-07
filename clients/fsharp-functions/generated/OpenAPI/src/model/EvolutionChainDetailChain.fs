namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AbilityDetailPokemonInnerPokemon
open OpenAPI.Model.AnyType
open OpenAPI.Model.EvolutionChainDetailChainEvolvesToInner

module EvolutionChainDetailChain =

  //#region EvolutionChainDetailChain

  [<CLIMutable>]
  type EvolutionChainDetailChain = {
    [<JsonProperty(PropertyName = "evolution_details")>]
    EvolutionDetails : AnyType[];
    [<JsonProperty(PropertyName = "evolves_to")>]
    EvolvesTo : EvolutionChainDetailChainEvolvesToInner[];
    [<JsonProperty(PropertyName = "is_baby")>]
    IsBaby : bool;
    [<JsonProperty(PropertyName = "species")>]
    Species : AbilityDetailPokemonInnerPokemon;
  }

  //#endregion
