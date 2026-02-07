namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.PokeathlonStatDetailAffectingNaturesDecreaseInner
open OpenAPI.Model.PokeathlonStatDetailAffectingNaturesIncreaseInner

module PokeathlonStatDetailAffectingNatures =

  //#region PokeathlonStatDetailAffectingNatures


  type PokeathlonStatDetail_affecting_natures = {
    Decrease : PokeathlonStatDetailAffectingNaturesDecreaseInner[];
    Increase : PokeathlonStatDetailAffectingNaturesIncreaseInner[];
  }
  //#endregion
