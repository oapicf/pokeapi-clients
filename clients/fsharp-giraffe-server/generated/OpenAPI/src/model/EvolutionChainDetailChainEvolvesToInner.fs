namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AbilityDetailPokemonInnerPokemon
open OpenAPI.Model.EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner

module EvolutionChainDetailChainEvolvesToInner =

  //#region EvolutionChainDetailChainEvolvesToInner


  type EvolutionChainDetail_chain_evolves_to_inner = {
    EvolutionDetails : EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner[];
    IsBaby : bool;
    Species : AbilityDetailPokemonInnerPokemon;
  }
  //#endregion
