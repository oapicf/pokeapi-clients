import { BerryFlavorMap } from './berry-flavor-map';
import { TypeSummary } from './type-summary';
import { BerryFirmnessSummary } from './berry-firmness-summary';
import { ItemSummary } from './item-summary';


export interface BerryDetail { 
  /**
   * The identifier for this resource.
   */
  readonly id: number;
  /**
   * The name for this resource.
   */
  name: string;
  /**
   * Time it takes the tree to grow one stage, in hours. Berry trees go through four of these growth stages before they can be picked.
   */
  growth_time?: number | null;
  /**
   * The maximum number of these berries that can grow on one tree in Generation IV.
   */
  max_harvest?: number | null;
  /**
   * The power of the move \"Natural Gift\" when used with this Berry.
   */
  natural_gift_power?: number | null;
  /**
   * The size of this Berry, in millimeters.
   */
  size?: number | null;
  /**
   * The smoothness of this Berry, used in making Pokéblocks or Poffins.
   */
  smoothness?: number | null;
  /**
   * The speed at which this Berry dries out the soil as it grows. A higher rate means the soil dries more quickly.
   */
  soil_dryness?: number | null;
  /**
   * The firmness of this berry, used in making Pokéblocks or Poffins.
   */
  firmness: BerryFirmnessSummary | null;
  /**
   * A list of references to each flavor a berry can have and the potency of each of those flavors in regard to this berry.
   */
  readonly flavors: Array<BerryFlavorMap>;
  /**
   * Berries are actually items. This is a reference to the item specific data for this berry.
   */
  item: ItemSummary;
  /**
   * The type inherited by \"Natural Gift\" when used with this Berry.
   */
  natural_gift_type: TypeSummary | null;
}

