namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.PokemonFormSummary

module PokemonFormTriggerCondition =

  //#region PokemonFormTriggerCondition


  type PokemonFormTriggerCondition = {
    Trigger : string;
    Name : string;
    Url : string;
    BaseForm : PokemonFormSummary;
  }
  //#endregion
