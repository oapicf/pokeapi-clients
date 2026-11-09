import { NatureSummary } from './nature-summary';


export interface StatAffectingNatures { 
  /**
   * A list of natures and how they change the referenced stat.
   */
  increase: Array<NatureSummary>;
  /**
   * A list of nature sand how they change the referenced stat.
   */
  decrease: Array<NatureSummary>;
}

