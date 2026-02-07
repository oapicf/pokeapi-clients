import com.google.inject.AbstractModule;

import controllers.*;
import openapitools.SecurityAPIUtils;

public class Module extends AbstractModule {

    @Override
    protected void configure() {
        bind(BerriesApiControllerImpInterface.class).to(BerriesApiControllerImp.class);
        bind(ContestsApiControllerImpInterface.class).to(ContestsApiControllerImp.class);
        bind(EncountersApiControllerImpInterface.class).to(EncountersApiControllerImp.class);
        bind(EvolutionApiControllerImpInterface.class).to(EvolutionApiControllerImp.class);
        bind(GamesApiControllerImpInterface.class).to(GamesApiControllerImp.class);
        bind(ItemsApiControllerImpInterface.class).to(ItemsApiControllerImp.class);
        bind(LocationApiControllerImpInterface.class).to(LocationApiControllerImp.class);
        bind(MachinesApiControllerImpInterface.class).to(MachinesApiControllerImp.class);
        bind(MovesApiControllerImpInterface.class).to(MovesApiControllerImp.class);
        bind(PokemonApiControllerImpInterface.class).to(PokemonApiControllerImp.class);
        bind(UtilityApiControllerImpInterface.class).to(UtilityApiControllerImp.class);
        bind(SecurityAPIUtils.class);
    }
}