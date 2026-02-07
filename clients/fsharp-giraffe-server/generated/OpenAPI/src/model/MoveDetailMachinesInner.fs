namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AbilityDetailPokemonInnerPokemon
open OpenAPI.Model.MoveDetailMachinesInnerMachine

module MoveDetailMachinesInner =

  //#region MoveDetailMachinesInner


  type MoveDetail_machines_inner = {
    Machine : MoveDetailMachinesInnerMachine;
    VersionGroup : AbilityDetailPokemonInnerPokemon;
  }
  //#endregion
