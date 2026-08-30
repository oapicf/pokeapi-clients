import { ItemPocketName } from './item-pocket-name';
import { ItemCategorySummary } from './item-category-summary';


export interface ItemPocketDetail { 
  readonly id: number;
  name: string;
  readonly categories: Array<ItemCategorySummary>;
  readonly names: Array<ItemPocketName>;
}

