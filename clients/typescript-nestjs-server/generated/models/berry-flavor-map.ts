import { BerryFlavorSummary } from './berry-flavor-summary';


export interface BerryFlavorMap { 
  /**
   * How powerful the referenced flavor is for this berry.
   */
  potency: number;
  /**
   * The referenced berry flavor.
   */
  flavor: BerryFlavorSummary;
}

