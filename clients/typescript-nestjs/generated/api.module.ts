import { DynamicModule, Module, Global, Provider } from '@nestjs/common';
import { HttpModule, HttpService } from '@nestjs/axios';
import { AsyncConfiguration, Configuration, ConfigurationFactory } from './configuration';

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

@Global()
@Module({
  imports:      [ HttpModule ],
  exports:      [
    BerriesService,
    ContestsService,
    EncountersService,
    EvolutionService,
    GamesService,
    ItemsService,
    LocationService,
    MachinesService,
    MovesService,
    PokemonService,
    UtilityService
  ],
  providers: [
    BerriesService,
    ContestsService,
    EncountersService,
    EvolutionService,
    GamesService,
    ItemsService,
    LocationService,
    MachinesService,
    MovesService,
    PokemonService,
    UtilityService
  ]
})
export class ApiModule {
    public static forRoot(configurationFactory: () => Configuration): DynamicModule {
        return {
            module: ApiModule,
            providers: [ { provide: Configuration, useFactory: configurationFactory } ]
        };
    }

    /**
     * Register the module asynchronously.
     */
    static forRootAsync(options: AsyncConfiguration): DynamicModule {
        const providers = [...this.createAsyncProviders(options)];
        return {
            module: ApiModule,
            imports: options.imports || [],
            providers,
            exports: providers,
        };
    }

    private static createAsyncProviders(options: AsyncConfiguration): Provider[] {
        if (options.useClass) {
            return [
                this.createAsyncConfigurationProvider(options),
                {
                    provide: options.useClass,
                    useClass: options.useClass,
                },
            ];
        }
        return [this.createAsyncConfigurationProvider(options)];
    }

    private static createAsyncConfigurationProvider(
        options: AsyncConfiguration,
    ): Provider {
        if (options.useFactory) {
            return {
                provide: Configuration,
                useFactory: options.useFactory,
                inject: options.inject || [],
            };
        }
        return {
            provide: Configuration,
            useFactory: async (optionsFactory: ConfigurationFactory) =>
                await optionsFactory.createConfiguration(),
            inject: (options.useExisting && [options.useExisting]) || (options.useClass && [options.useClass]) || [],
        };
    }

    constructor( httpService: HttpService) { }
}
