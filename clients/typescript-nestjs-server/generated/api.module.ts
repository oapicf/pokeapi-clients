import { DynamicModule, Module, Provider } from '@nestjs/common';
import { ApiImplementations } from './api-implementations'
import { BerriesApi } from './api';
import { BerriesApiController } from './controllers';
import { ContestsApi } from './api';
import { ContestsApiController } from './controllers';
import { EncountersApi } from './api';
import { EncountersApiController } from './controllers';
import { EvolutionApi } from './api';
import { EvolutionApiController } from './controllers';
import { GamesApi } from './api';
import { GamesApiController } from './controllers';
import { ItemsApi } from './api';
import { ItemsApiController } from './controllers';
import { LocationApi } from './api';
import { LocationApiController } from './controllers';
import { MachinesApi } from './api';
import { MachinesApiController } from './controllers';
import { MovesApi } from './api';
import { MovesApiController } from './controllers';
import { PokemonApi } from './api';
import { PokemonApiController } from './controllers';
import { UtilityApi } from './api';
import { UtilityApiController } from './controllers';

export type ApiModuleConfiguration = {
  /**
  * your Api implementations
  */
  apiImplementations: ApiImplementations,
  /**
  * additional Providers that may be used by your implementations
  */
  providers?: Provider[],
}

@Module({})
export class ApiModule {
  static forRoot(configuration: ApiModuleConfiguration): DynamicModule {
      const providers: Provider[] = [
        {
          provide: BerriesApi,
          useClass: configuration.apiImplementations.berriesApi
        },
        {
          provide: ContestsApi,
          useClass: configuration.apiImplementations.contestsApi
        },
        {
          provide: EncountersApi,
          useClass: configuration.apiImplementations.encountersApi
        },
        {
          provide: EvolutionApi,
          useClass: configuration.apiImplementations.evolutionApi
        },
        {
          provide: GamesApi,
          useClass: configuration.apiImplementations.gamesApi
        },
        {
          provide: ItemsApi,
          useClass: configuration.apiImplementations.itemsApi
        },
        {
          provide: LocationApi,
          useClass: configuration.apiImplementations.locationApi
        },
        {
          provide: MachinesApi,
          useClass: configuration.apiImplementations.machinesApi
        },
        {
          provide: MovesApi,
          useClass: configuration.apiImplementations.movesApi
        },
        {
          provide: PokemonApi,
          useClass: configuration.apiImplementations.pokemonApi
        },
        {
          provide: UtilityApi,
          useClass: configuration.apiImplementations.utilityApi
        },
        ...(configuration.providers || []),
      ];

      return {
        module: ApiModule,
        controllers: [
          BerriesApiController,
          ContestsApiController,
          EncountersApiController,
          EvolutionApiController,
          GamesApiController,
          ItemsApiController,
          LocationApiController,
          MachinesApiController,
          MovesApiController,
          PokemonApiController,
          UtilityApiController,
        ],
        providers: [...providers],
        exports: [...providers]
      }
    }
}