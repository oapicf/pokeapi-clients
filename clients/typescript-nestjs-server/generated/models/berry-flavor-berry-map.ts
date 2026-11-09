import { BerrySummary } from './berry-summary';


export interface BerryFlavorBerryMap { 
  /**
   * How powerful the referenced flavor is for this berry.
   */
  potency: number;
  /**
   * The berry with the referenced flavor.
   */
  berry: BerrySummary;
}

