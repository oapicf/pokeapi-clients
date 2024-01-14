import { DynamicModule, Module, Global, Provider } from '@nestjs/common';
import { HttpModule, HttpService } from '@nestjs/axios';
import { AsyncConfiguration, Configuration, ConfigurationFactory } from './configuration';

import { AbilityService } from './api/ability.service';
import { BerryService } from './api/berry.service';
import { BerryFirmnessService } from './api/berryFirmness.service';
import { BerryFlavorService } from './api/berryFlavor.service';
import { CharacteristicService } from './api/characteristic.service';
import { ContestEffectService } from './api/contestEffect.service';
import { ContestTypeService } from './api/contestType.service';
import { EggGroupService } from './api/eggGroup.service';
import { EncounterConditionService } from './api/encounterCondition.service';
import { EncounterConditionValueService } from './api/encounterConditionValue.service';
import { EncounterMethodService } from './api/encounterMethod.service';
import { EvolutionChainService } from './api/evolutionChain.service';
import { EvolutionTriggerService } from './api/evolutionTrigger.service';
import { GenderService } from './api/gender.service';
import { GenerationService } from './api/generation.service';
import { GrowthRateService } from './api/growthRate.service';
import { ItemService } from './api/item.service';
import { ItemAttributeService } from './api/itemAttribute.service';
import { ItemCategoryService } from './api/itemCategory.service';
import { ItemFlingEffectService } from './api/itemFlingEffect.service';
import { ItemPocketService } from './api/itemPocket.service';
import { LanguageService } from './api/language.service';
import { LocationService } from './api/location.service';
import { LocationAreaService } from './api/locationArea.service';
import { MachineService } from './api/machine.service';
import { MoveService } from './api/move.service';
import { MoveAilmentService } from './api/moveAilment.service';
import { MoveBattleStyleService } from './api/moveBattleStyle.service';
import { MoveCategoryService } from './api/moveCategory.service';
import { MoveDamageClassService } from './api/moveDamageClass.service';
import { MoveLearnMethodService } from './api/moveLearnMethod.service';
import { MoveTargetService } from './api/moveTarget.service';
import { NatureService } from './api/nature.service';
import { PalParkAreaService } from './api/palParkArea.service';
import { PokeathlonStatService } from './api/pokeathlonStat.service';
import { PokedexService } from './api/pokedex.service';
import { PokemonService } from './api/pokemon.service';
import { PokemonColorService } from './api/pokemonColor.service';
import { PokemonFormService } from './api/pokemonForm.service';
import { PokemonHabitatService } from './api/pokemonHabitat.service';
import { PokemonShapeService } from './api/pokemonShape.service';
import { PokemonSpeciesService } from './api/pokemonSpecies.service';
import { RegionService } from './api/region.service';
import { StatService } from './api/stat.service';
import { SuperContestEffectService } from './api/superContestEffect.service';
import { TypeService } from './api/type.service';
import { VersionService } from './api/version.service';
import { VersionGroupService } from './api/versionGroup.service';

@Global()
@Module({
  imports:      [ HttpModule ],
  exports:      [
    AbilityService,
    BerryService,
    BerryFirmnessService,
    BerryFlavorService,
    CharacteristicService,
    ContestEffectService,
    ContestTypeService,
    EggGroupService,
    EncounterConditionService,
    EncounterConditionValueService,
    EncounterMethodService,
    EvolutionChainService,
    EvolutionTriggerService,
    GenderService,
    GenerationService,
    GrowthRateService,
    ItemService,
    ItemAttributeService,
    ItemCategoryService,
    ItemFlingEffectService,
    ItemPocketService,
    LanguageService,
    LocationService,
    LocationAreaService,
    MachineService,
    MoveService,
    MoveAilmentService,
    MoveBattleStyleService,
    MoveCategoryService,
    MoveDamageClassService,
    MoveLearnMethodService,
    MoveTargetService,
    NatureService,
    PalParkAreaService,
    PokeathlonStatService,
    PokedexService,
    PokemonService,
    PokemonColorService,
    PokemonFormService,
    PokemonHabitatService,
    PokemonShapeService,
    PokemonSpeciesService,
    RegionService,
    StatService,
    SuperContestEffectService,
    TypeService,
    VersionService,
    VersionGroupService
  ],
  providers: [
    AbilityService,
    BerryService,
    BerryFirmnessService,
    BerryFlavorService,
    CharacteristicService,
    ContestEffectService,
    ContestTypeService,
    EggGroupService,
    EncounterConditionService,
    EncounterConditionValueService,
    EncounterMethodService,
    EvolutionChainService,
    EvolutionTriggerService,
    GenderService,
    GenerationService,
    GrowthRateService,
    ItemService,
    ItemAttributeService,
    ItemCategoryService,
    ItemFlingEffectService,
    ItemPocketService,
    LanguageService,
    LocationService,
    LocationAreaService,
    MachineService,
    MoveService,
    MoveAilmentService,
    MoveBattleStyleService,
    MoveCategoryService,
    MoveDamageClassService,
    MoveLearnMethodService,
    MoveTargetService,
    NatureService,
    PalParkAreaService,
    PokeathlonStatService,
    PokedexService,
    PokemonService,
    PokemonColorService,
    PokemonFormService,
    PokemonHabitatService,
    PokemonShapeService,
    PokemonSpeciesService,
    RegionService,
    StatService,
    SuperContestEffectService,
    TypeService,
    VersionService,
    VersionGroupService
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
        if (options.useExisting || options.useFactory) {
            return [this.createAsyncConfigurationProvider(options)];
        }
        return [
            this.createAsyncConfigurationProvider(options),
            {
                provide: options.useClass,
                useClass: options.useClass,
            },
        ];
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
            inject: [options.useExisting || options.useClass],
        };
    }

    constructor( httpService: HttpService) { }
}
