import { EvolutionChainDetailChain } from './evolution-chain-detail-chain';
import { ItemSummary } from './item-summary';


export interface EvolutionChainDetail { 
  readonly id: number;
  baby_trigger_item: ItemSummary;
  chain: EvolutionChainDetailChain;
}

