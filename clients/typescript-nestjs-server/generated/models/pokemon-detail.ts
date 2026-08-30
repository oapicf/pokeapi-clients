import { PokemonDetailPastAbilitiesInner } from './pokemon-detail-past-abilities-inner';
import { PokemonStat } from './pokemon-stat';
import { PokemonDetailCries } from './pokemon-detail-cries';
import { PokemonGameIndex } from './pokemon-game-index';
import { PokemonDetailHeldItems } from './pokemon-detail-held-items';
import { PokemonDetailPastTypesInner } from './pokemon-detail-past-types-inner';
import { PokemonDetailTypesInner } from './pokemon-detail-types-inner';
import { PokemonDetailMovesInner } from './pokemon-detail-moves-inner';
import { PokemonDetailSprites } from './pokemon-detail-sprites';
import { PokemonFormSummary } from './pokemon-form-summary';
import { PokemonSpeciesSummary } from './pokemon-species-summary';
import { PokemonDetailAbilitiesInner } from './pokemon-detail-abilities-inner';


export interface PokemonDetail { 
  readonly id: number;
  name: string;
  base_experience?: number | null;
  height?: number | null;
  is_default?: boolean;
  order?: number | null;
  weight?: number | null;
  readonly abilities: Array<PokemonDetailAbilitiesInner>;
  readonly past_abilities: Array<PokemonDetailPastAbilitiesInner>;
  readonly forms: Array<PokemonFormSummary>;
  readonly game_indices: Array<PokemonGameIndex>;
  held_items: PokemonDetailHeldItems;
  readonly location_area_encounters: string;
  readonly moves: Array<PokemonDetailMovesInner>;
  species: PokemonSpeciesSummary;
  sprites: PokemonDetailSprites;
  cries: PokemonDetailCries;
  readonly stats: Array<PokemonStat>;
  readonly types: Array<PokemonDetailTypesInner>;
  readonly past_types: Array<PokemonDetailPastTypesInner>;
}

