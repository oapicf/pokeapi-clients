import { ItemPocketName } from './item-pocket-name';
import { ItemCategorySummary } from './item-category-summary';


export interface ItemPocketDetail { 
  /**
   * The identifier for this resource.
   */
  readonly id: number;
  /**
   * The name for this resource.
   */
  name: string;
  /**
   * A list of item categories that are relevant to this item pocket.
   */
  readonly categories: Array<ItemCategorySummary>;
  /**
   * The name of this resource listed in different languages.
   */
  readonly names: Array<ItemPocketName>;
}

