import com.google.inject.AbstractModule;

import controllers.*;
import openapitools.SecurityAPIUtils;

public class Module extends AbstractModule {

    @Override
    protected void configure() {
        bind(AbilityApiControllerImpInterface.class).to(AbilityApiControllerImp.class);
        bind(BerryApiControllerImpInterface.class).to(BerryApiControllerImp.class);
        bind(BerryFirmnessApiControllerImpInterface.class).to(BerryFirmnessApiControllerImp.class);
        bind(BerryFlavorApiControllerImpInterface.class).to(BerryFlavorApiControllerImp.class);
        bind(CharacteristicApiControllerImpInterface.class).to(CharacteristicApiControllerImp.class);
        bind(ContestEffectApiControllerImpInterface.class).to(ContestEffectApiControllerImp.class);
        bind(ContestTypeApiControllerImpInterface.class).to(ContestTypeApiControllerImp.class);
        bind(EggGroupApiControllerImpInterface.class).to(EggGroupApiControllerImp.class);
        bind(EncounterConditionApiControllerImpInterface.class).to(EncounterConditionApiControllerImp.class);
        bind(EncounterConditionValueApiControllerImpInterface.class).to(EncounterConditionValueApiControllerImp.class);
        bind(EncounterMethodApiControllerImpInterface.class).to(EncounterMethodApiControllerImp.class);
        bind(EvolutionChainApiControllerImpInterface.class).to(EvolutionChainApiControllerImp.class);
        bind(EvolutionTriggerApiControllerImpInterface.class).to(EvolutionTriggerApiControllerImp.class);
        bind(GenderApiControllerImpInterface.class).to(GenderApiControllerImp.class);
        bind(GenerationApiControllerImpInterface.class).to(GenerationApiControllerImp.class);
        bind(GrowthRateApiControllerImpInterface.class).to(GrowthRateApiControllerImp.class);
        bind(ItemApiControllerImpInterface.class).to(ItemApiControllerImp.class);
        bind(ItemAttributeApiControllerImpInterface.class).to(ItemAttributeApiControllerImp.class);
        bind(ItemCategoryApiControllerImpInterface.class).to(ItemCategoryApiControllerImp.class);
        bind(ItemFlingEffectApiControllerImpInterface.class).to(ItemFlingEffectApiControllerImp.class);
        bind(ItemPocketApiControllerImpInterface.class).to(ItemPocketApiControllerImp.class);
        bind(LanguageApiControllerImpInterface.class).to(LanguageApiControllerImp.class);
        bind(LocationApiControllerImpInterface.class).to(LocationApiControllerImp.class);
        bind(LocationAreaApiControllerImpInterface.class).to(LocationAreaApiControllerImp.class);
        bind(MachineApiControllerImpInterface.class).to(MachineApiControllerImp.class);
        bind(MoveApiControllerImpInterface.class).to(MoveApiControllerImp.class);
        bind(MoveAilmentApiControllerImpInterface.class).to(MoveAilmentApiControllerImp.class);
        bind(MoveBattleStyleApiControllerImpInterface.class).to(MoveBattleStyleApiControllerImp.class);
        bind(MoveCategoryApiControllerImpInterface.class).to(MoveCategoryApiControllerImp.class);
        bind(MoveDamageClassApiControllerImpInterface.class).to(MoveDamageClassApiControllerImp.class);
        bind(MoveLearnMethodApiControllerImpInterface.class).to(MoveLearnMethodApiControllerImp.class);
        bind(MoveTargetApiControllerImpInterface.class).to(MoveTargetApiControllerImp.class);
        bind(NatureApiControllerImpInterface.class).to(NatureApiControllerImp.class);
        bind(PalParkAreaApiControllerImpInterface.class).to(PalParkAreaApiControllerImp.class);
        bind(PokeathlonStatApiControllerImpInterface.class).to(PokeathlonStatApiControllerImp.class);
        bind(PokedexApiControllerImpInterface.class).to(PokedexApiControllerImp.class);
        bind(PokemonApiControllerImpInterface.class).to(PokemonApiControllerImp.class);
        bind(PokemonColorApiControllerImpInterface.class).to(PokemonColorApiControllerImp.class);
        bind(PokemonFormApiControllerImpInterface.class).to(PokemonFormApiControllerImp.class);
        bind(PokemonHabitatApiControllerImpInterface.class).to(PokemonHabitatApiControllerImp.class);
        bind(PokemonShapeApiControllerImpInterface.class).to(PokemonShapeApiControllerImp.class);
        bind(PokemonSpeciesApiControllerImpInterface.class).to(PokemonSpeciesApiControllerImp.class);
        bind(RegionApiControllerImpInterface.class).to(RegionApiControllerImp.class);
        bind(StatApiControllerImpInterface.class).to(StatApiControllerImp.class);
        bind(SuperContestEffectApiControllerImpInterface.class).to(SuperContestEffectApiControllerImp.class);
        bind(TypeApiControllerImpInterface.class).to(TypeApiControllerImp.class);
        bind(VersionApiControllerImpInterface.class).to(VersionApiControllerImp.class);
        bind(VersionGroupApiControllerImpInterface.class).to(VersionGroupApiControllerImp.class);
        bind(SecurityAPIUtils.class);
    }
}