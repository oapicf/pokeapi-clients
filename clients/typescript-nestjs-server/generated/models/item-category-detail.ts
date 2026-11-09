import { ItemPocketSummary } from './item-pocket-summary';
import { ItemCategoryName } from './item-category-name';
import { ItemSummary } from './item-summary';


export interface ItemCategoryDetail { 
  /**
   * The identifier for this resource.
   */
  readonly id: number;
  /**
   * The name for this resource.
   */
  name: string;
  /**
   * A list of items that are a part of this category.
   */
  readonly items: Array<ItemSummary>;
  /**
   * The name of this item category listed in different languages.
   */
  readonly names: Array<ItemCategoryName>;
  /**
   * The pocket items in this category would be put in.
   */
  pocket: ItemPocketSummary;
}

