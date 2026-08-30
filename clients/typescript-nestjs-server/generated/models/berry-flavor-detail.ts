import { BerryFlavorDetailBerriesInner } from './berry-flavor-detail-berries-inner';
import { BerryFlavorName } from './berry-flavor-name';
import { ContestTypeSummary } from './contest-type-summary';


export interface BerryFlavorDetail { 
  readonly id: number;
  name: string;
  readonly berries: Array<BerryFlavorDetailBerriesInner>;
  contest_type: ContestTypeSummary;
  readonly names: Array<BerryFlavorName>;
}

