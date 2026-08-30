import { ItemDetailSprites } from './item-detail-sprites';
import { ItemFlingEffectSummary } from './item-fling-effect-summary';
import { ItemName } from './item-name';
import { AbilityDetailPokemonInnerPokemon } from './ability-detail-pokemon-inner-pokemon';
import { ItemCategorySummary } from './item-category-summary';
import { ItemDetailHeldByPokemonInner } from './item-detail-held-by-pokemon-inner';
import { ItemEffectText } from './item-effect-text';
import { ItemGameIndex } from './item-game-index';
import { ItemFlavorText } from './item-flavor-text';
import { ItemDetailBabyTriggerFor } from './item-detail-baby-trigger-for';
import { ItemDetailMachinesInner } from './item-detail-machines-inner';


export interface ItemDetail { 
  readonly id: number;
  name: string;
  cost?: number | null;
  fling_power?: number | null;
  fling_effect: ItemFlingEffectSummary;
  readonly attributes: Array<AbilityDetailPokemonInnerPokemon>;
  category: ItemCategorySummary;
  readonly effect_entries: Array<ItemEffectText>;
  readonly flavor_text_entries: Array<ItemFlavorText>;
  readonly game_indices: Array<ItemGameIndex>;
  readonly names: Array<ItemName>;
  readonly held_by_pokemon: Array<ItemDetailHeldByPokemonInner>;
  sprites: ItemDetailSprites;
  baby_trigger_for: ItemDetailBabyTriggerFor;
  readonly machines: Array<ItemDetailMachinesInner>;
}

