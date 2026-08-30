import { AbilityDetailPokemonInnerPokemon } from './ability-detail-pokemon-inner-pokemon';
import { ItemDetailHeldByPokemonInnerVersionDetailsInner } from './item-detail-held-by-pokemon-inner-version-details-inner';


export interface ItemDetailHeldByPokemonInner { 
  pokemon: AbilityDetailPokemonInnerPokemon;
  'version-details': Array<ItemDetailHeldByPokemonInnerVersionDetailsInner>;
}

