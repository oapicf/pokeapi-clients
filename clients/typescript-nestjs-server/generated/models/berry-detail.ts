import { BerryDetailFlavorsInner } from './berry-detail-flavors-inner';
import { TypeSummary } from './type-summary';
import { BerryFirmnessSummary } from './berry-firmness-summary';
import { ItemSummary } from './item-summary';


export interface BerryDetail { 
  readonly id: number;
  name: string;
  growth_time: number;
  max_harvest: number;
  natural_gift_power: number;
  size: number;
  smoothness: number;
  soil_dryness: number;
  firmness: BerryFirmnessSummary;
  readonly flavors: Array<BerryDetailFlavorsInner>;
  item: ItemSummary;
  natural_gift_type: TypeSummary;
}

