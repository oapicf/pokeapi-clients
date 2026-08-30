import { AbilityDetailPokemonInnerPokemon } from './ability-detail-pokemon-inner-pokemon';
import { ItemDetailHeldByPokemonInnerVersionDetailsInner } from './item-detail-held-by-pokemon-inner-version-details-inner';


export interface PokemonDetailHeldItems { 
  item: AbilityDetailPokemonInnerPokemon;
  version_details: Array<ItemDetailHeldByPokemonInnerVersionDetailsInner>;
}

