import { ItemAttributeName } from './item-attribute-name';
import { AbilityDetailPokemonInnerPokemon } from './ability-detail-pokemon-inner-pokemon';
import { ItemAttributeDescription } from './item-attribute-description';


export interface ItemAttributeDetail { 
  readonly id: number;
  name: string;
  readonly descriptions: Array<ItemAttributeDescription>;
  readonly items: Array<AbilityDetailPokemonInnerPokemon>;
  readonly names: Array<ItemAttributeName>;
}

