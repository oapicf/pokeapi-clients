import { PokeathlonStatDetailAffectingNaturesDecreaseInner } from './pokeathlon-stat-detail-affecting-natures-decrease-inner';
import { PokeathlonStatDetailAffectingNaturesIncreaseInner } from './pokeathlon-stat-detail-affecting-natures-increase-inner';


export interface PokeathlonStatDetailAffectingNatures { 
  decrease: Array<PokeathlonStatDetailAffectingNaturesDecreaseInner>;
  increase: Array<PokeathlonStatDetailAffectingNaturesIncreaseInner>;
}

