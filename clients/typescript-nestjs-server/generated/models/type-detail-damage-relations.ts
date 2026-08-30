import { AbilityDetailPokemonInnerPokemon } from './ability-detail-pokemon-inner-pokemon';


export interface TypeDetailDamageRelations { 
  no_damage_to: Array<AbilityDetailPokemonInnerPokemon>;
  half_damage_to: Array<AbilityDetailPokemonInnerPokemon>;
  double_damage_to: Array<AbilityDetailPokemonInnerPokemon>;
  no_damage_from: Array<AbilityDetailPokemonInnerPokemon>;
  half_damage_from: Array<AbilityDetailPokemonInnerPokemon>;
  double_damage_from: Array<AbilityDetailPokemonInnerPokemon>;
}

