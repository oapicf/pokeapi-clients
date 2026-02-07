namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AbilityDetailPokemonInnerPokemon

module StatDetailAffectingNatures =

  //#region StatDetailAffectingNatures


  type StatDetail_affecting_natures = {
    Increase : AbilityDetailPokemonInnerPokemon[];
    Decrease : AbilityDetailPokemonInnerPokemon[];
  }
  //#endregion
