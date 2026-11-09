import { ItemAttributeSummary } from './item-attribute-summary';
import { ItemSprites } from './item-sprites';
import { ItemMachine } from './item-machine';
import { PokemonHeldItem } from './pokemon-held-item';
import { ItemFlingEffectSummary } from './item-fling-effect-summary';
import { ItemPrice } from './item-price';
import { ItemName } from './item-name';
import { ItemCategorySummary } from './item-category-summary';
import { ItemEffectText } from './item-effect-text';
import { EvolutionChainSummary } from './evolution-chain-summary';
import { ItemGameIndex } from './item-game-index';
import { ItemFlavorText } from './item-flavor-text';


export interface ItemDetail { 
  /**
   * The identifier for this resource.
   */
  readonly id: number;
  /**
   * The name for this resource.
   */
  name: string;
  /**
   * The power of the move Fling when used with this item.
   */
  fling_power?: number | null;
  /**
   * The effect of the move Fling when used with this item.
   */
  fling_effect: ItemFlingEffectSummary | null;
  /**
   * A list of attributes this item has.
   */
  readonly attributes: Array<ItemAttributeSummary>;
  /**
   * The category of items this item falls into.
   */
  category: ItemCategorySummary;
  /**
   * The effect of this ability listed in different languages.
   */
  readonly effect_entries: Array<ItemEffectText>;
  /**
   * The flavor text of this ability listed in different languages.
   */
  readonly flavor_text_entries: Array<ItemFlavorText>;
  /**
   * A list of game indices relevent to this item by generation.
   */
  readonly game_indices: Array<ItemGameIndex>;
  /**
   * Purchase and sell prices by currency and version group. Prices may be null when the item cannot be bought or sold.
   */
  readonly prices: Array<ItemPrice>;
  /**
   * The name of this item listed in different languages.
   */
  readonly names: Array<ItemName>;
  /**
   * A list of Pokémon that might be found in the wild holding this item.
   */
  readonly held_by_pokemon: Array<PokemonHeldItem>;
  /**
   * A set of sprites used to depict this item in the game.
   */
  readonly sprites: ItemSprites;
  /**
   * An evolution chain this item requires to produce a bay during mating.
   */
  readonly baby_trigger_for: EvolutionChainSummary | null;
  /**
   * A list of the machines related to this item.
   */
  readonly machines: Array<ItemMachine>;
}

