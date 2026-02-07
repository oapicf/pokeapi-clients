import {interfaces} from 'inversify';

import { BerriesService } from './api/berries.service';
import { ContestsService } from './api/contests.service';
import { EncountersService } from './api/encounters.service';
import { EvolutionService } from './api/evolution.service';
import { GamesService } from './api/games.service';
import { ItemsService } from './api/items.service';
import { LocationService } from './api/location.service';
import { MachinesService } from './api/machines.service';
import { MovesService } from './api/moves.service';
import { PokemonService } from './api/pokemon.service';
import { UtilityService } from './api/utility.service';

export class ApiServiceBinder {
    public static with(container: interfaces.Container) {
        container.bind<BerriesService>('BerriesService').to(BerriesService).inSingletonScope();
        container.bind<ContestsService>('ContestsService').to(ContestsService).inSingletonScope();
        container.bind<EncountersService>('EncountersService').to(EncountersService).inSingletonScope();
        container.bind<EvolutionService>('EvolutionService').to(EvolutionService).inSingletonScope();
        container.bind<GamesService>('GamesService').to(GamesService).inSingletonScope();
        container.bind<ItemsService>('ItemsService').to(ItemsService).inSingletonScope();
        container.bind<LocationService>('LocationService').to(LocationService).inSingletonScope();
        container.bind<MachinesService>('MachinesService').to(MachinesService).inSingletonScope();
        container.bind<MovesService>('MovesService').to(MovesService).inSingletonScope();
        container.bind<PokemonService>('PokemonService').to(PokemonService).inSingletonScope();
        container.bind<UtilityService>('UtilityService').to(UtilityService).inSingletonScope();
    }
}
