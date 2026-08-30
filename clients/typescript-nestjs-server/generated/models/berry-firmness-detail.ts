import { BerryFirmnessName } from './berry-firmness-name';
import { BerrySummary } from './berry-summary';


export interface BerryFirmnessDetail { 
  readonly id: number;
  name: string;
  readonly berries: Array<BerrySummary>;
  readonly names: Array<BerryFirmnessName>;
}

