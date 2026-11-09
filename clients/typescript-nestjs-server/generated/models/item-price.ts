import { VersionGroupSummary } from './version-group-summary';
import { CurrencySummary } from './currency-summary';


export interface ItemPrice { 
  /**
   * The purchase price in this currency and version group, or null if unavailable.
   */
  purchase_price?: number | null;
  /**
   * The sell price in this currency and version group, or null if unavailable.
   */
  sell_price?: number | null;
  /**
   * The currency used for this price.
   */
  currency: CurrencySummary;
  /**
   * The version group to which this price applies.
   */
  version_group: VersionGroupSummary;
}

