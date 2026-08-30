import { Type } from '@nestjs/common';
import { BerriesApi } from './api';
import { ContestsApi } from './api';
import { EncountersApi } from './api';
import { EvolutionApi } from './api';
import { GamesApi } from './api';
import { ItemsApi } from './api';
import { LocationApi } from './api';
import { MachinesApi } from './api';
import { MovesApi } from './api';
import { PokemonApi } from './api';
import { UtilityApi } from './api';

/**
 * Provide this type to {@link ApiModule} to provide your API implementations
**/
export type ApiImplementations = {
  berriesApi: Type<BerriesApi>
  contestsApi: Type<ContestsApi>
  encountersApi: Type<EncountersApi>
  evolutionApi: Type<EvolutionApi>
  gamesApi: Type<GamesApi>
  itemsApi: Type<ItemsApi>
  locationApi: Type<LocationApi>
  machinesApi: Type<MachinesApi>
  movesApi: Type<MovesApi>
  pokemonApi: Type<PokemonApi>
  utilityApi: Type<UtilityApi>
};
