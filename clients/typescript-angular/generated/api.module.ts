import { NgModule, ModuleWithProviders, SkipSelf, Optional } from '@angular/core';
import { Configuration } from './configuration';
import { HttpClient } from '@angular/common/http';

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

@NgModule({
  imports:      [],
  declarations: [],
  exports:      [],
  providers: []
})
export class ApiModule {
    public static forRoot(configurationFactory: () => Configuration): ModuleWithProviders<ApiModule> {
        return {
            ngModule: ApiModule,
            providers: [ { provide: Configuration, useFactory: configurationFactory } ]
        };
    }

    constructor( @Optional() @SkipSelf() parentModule: ApiModule,
                 @Optional() http: HttpClient) {
        if (parentModule) {
            throw new Error('ApiModule is already loaded. Import in your base AppModule only.');
        }
        if (!http) {
            throw new Error('You need to import the HttpClientModule in your AppModule! \n' +
            'See also https://github.com/angular/angular/issues/20575');
        }
    }
}
