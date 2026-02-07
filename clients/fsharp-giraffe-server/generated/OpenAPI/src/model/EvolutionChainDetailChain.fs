namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AbilityDetailPokemonInnerPokemon
open OpenAPI.Model.AnyType
open OpenAPI.Model.EvolutionChainDetailChainEvolvesToInner

module EvolutionChainDetailChain =

  //#region EvolutionChainDetailChain


  type EvolutionChainDetail_chain = {
    EvolutionDetails : AnyType[];
    EvolvesTo : EvolutionChainDetailChainEvolvesToInner[];
    IsBaby : bool;
    Species : AbilityDetailPokemonInnerPokemon;
  }
  //#endregion
