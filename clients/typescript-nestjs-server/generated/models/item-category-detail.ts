import { ItemPocketSummary } from './item-pocket-summary';
import { ItemCategoryName } from './item-category-name';
import { ItemSummary } from './item-summary';


export interface ItemCategoryDetail { 
  readonly id: number;
  name: string;
  readonly items: Array<ItemSummary>;
  readonly names: Array<ItemCategoryName>;
  pocket: ItemPocketSummary;
}

