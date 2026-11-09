import { ItemAttributeName } from './item-attribute-name';
import { ItemAttributeDescription } from './item-attribute-description';
import { ItemSummary } from './item-summary';


export interface ItemAttributeDetail { 
  /**
   * The identifier for this resource.
   */
  readonly id: number;
  /**
   * The name for this resource.
   */
  name: string;
  /**
   * The description of this item attribute listed in different languages.
   */
  readonly descriptions: Array<ItemAttributeDescription>;
  /**
   * A list of items that have this attribute.
   */
  readonly items: Array<ItemSummary>;
  /**
   * The name of this item attribute listed in different languages.
   */
  readonly names: Array<ItemAttributeName>;
}

