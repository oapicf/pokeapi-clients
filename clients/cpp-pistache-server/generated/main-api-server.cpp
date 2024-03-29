/**
* 
* No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
*
* The version of the OpenAPI document: 20220523
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/


#include "pistache/endpoint.h"
#include "pistache/http.h"
#include "pistache/router.h"
#ifdef __linux__
#include <vector>
#include <signal.h>
#include <unistd.h>
#endif

#include "ApiBase.h"

#include "AbilityApiImpl.h"
#include "BerryApiImpl.h"
#include "BerryFirmnessApiImpl.h"
#include "BerryFlavorApiImpl.h"
#include "CharacteristicApiImpl.h"
#include "ContestEffectApiImpl.h"
#include "ContestTypeApiImpl.h"
#include "EggGroupApiImpl.h"
#include "EncounterConditionApiImpl.h"
#include "EncounterConditionValueApiImpl.h"
#include "EncounterMethodApiImpl.h"
#include "EvolutionChainApiImpl.h"
#include "EvolutionTriggerApiImpl.h"
#include "GenderApiImpl.h"
#include "GenerationApiImpl.h"
#include "GrowthRateApiImpl.h"
#include "ItemApiImpl.h"
#include "ItemAttributeApiImpl.h"
#include "ItemCategoryApiImpl.h"
#include "ItemFlingEffectApiImpl.h"
#include "ItemPocketApiImpl.h"
#include "LanguageApiImpl.h"
#include "LocationApiImpl.h"
#include "LocationAreaApiImpl.h"
#include "MachineApiImpl.h"
#include "MoveApiImpl.h"
#include "MoveAilmentApiImpl.h"
#include "MoveBattleStyleApiImpl.h"
#include "MoveCategoryApiImpl.h"
#include "MoveDamageClassApiImpl.h"
#include "MoveLearnMethodApiImpl.h"
#include "MoveTargetApiImpl.h"
#include "NatureApiImpl.h"
#include "PalParkAreaApiImpl.h"
#include "PokeathlonStatApiImpl.h"
#include "PokedexApiImpl.h"
#include "PokemonApiImpl.h"
#include "PokemonColorApiImpl.h"
#include "PokemonFormApiImpl.h"
#include "PokemonHabitatApiImpl.h"
#include "PokemonShapeApiImpl.h"
#include "PokemonSpeciesApiImpl.h"
#include "RegionApiImpl.h"
#include "StatApiImpl.h"
#include "SuperContestEffectApiImpl.h"
#include "TypeApiImpl.h"
#include "VersionApiImpl.h"
#include "VersionGroupApiImpl.h"

#define PISTACHE_SERVER_THREADS     2
#define PISTACHE_SERVER_MAX_REQUEST_SIZE 32768
#define PISTACHE_SERVER_MAX_RESPONSE_SIZE 32768

static Pistache::Http::Endpoint *httpEndpoint;
#ifdef __linux__
static void sigHandler [[noreturn]] (int sig){
    switch(sig){
        case SIGINT:
        case SIGQUIT:
        case SIGTERM:
        case SIGHUP:
        default:
            httpEndpoint->shutdown();
            break;
    }
    exit(0);
}

static void setUpUnixSignals(std::vector<int> quitSignals) {
    sigset_t blocking_mask;
    sigemptyset(&blocking_mask);
    for (auto sig : quitSignals)
        sigaddset(&blocking_mask, sig);

    struct sigaction sa;
    sa.sa_handler = sigHandler;
    sa.sa_mask    = blocking_mask;
    sa.sa_flags   = 0;

    for (auto sig : quitSignals)
        sigaction(sig, &sa, nullptr);
}
#endif

using namespace org::openapitools::server::api;

int main() {
#ifdef __linux__
    std::vector<int> sigs{SIGQUIT, SIGINT, SIGTERM, SIGHUP};
    setUpUnixSignals(sigs);
#endif
    Pistache::Address addr(Pistache::Ipv4::any(), Pistache::Port(8080));

    httpEndpoint = new Pistache::Http::Endpoint((addr));
    auto router = std::make_shared<Pistache::Rest::Router>();

    auto opts = Pistache::Http::Endpoint::options()
        .threads(PISTACHE_SERVER_THREADS);
    opts.flags(Pistache::Tcp::Options::ReuseAddr);
    opts.maxRequestSize(PISTACHE_SERVER_MAX_REQUEST_SIZE);
    opts.maxResponseSize(PISTACHE_SERVER_MAX_RESPONSE_SIZE);
    httpEndpoint->init(opts);

    auto apiImpls = std::vector<std::shared_ptr<ApiBase>>();
    
    apiImpls.push_back(std::make_shared<AbilityApiImpl>(router));
    apiImpls.push_back(std::make_shared<BerryApiImpl>(router));
    apiImpls.push_back(std::make_shared<BerryFirmnessApiImpl>(router));
    apiImpls.push_back(std::make_shared<BerryFlavorApiImpl>(router));
    apiImpls.push_back(std::make_shared<CharacteristicApiImpl>(router));
    apiImpls.push_back(std::make_shared<ContestEffectApiImpl>(router));
    apiImpls.push_back(std::make_shared<ContestTypeApiImpl>(router));
    apiImpls.push_back(std::make_shared<EggGroupApiImpl>(router));
    apiImpls.push_back(std::make_shared<EncounterConditionApiImpl>(router));
    apiImpls.push_back(std::make_shared<EncounterConditionValueApiImpl>(router));
    apiImpls.push_back(std::make_shared<EncounterMethodApiImpl>(router));
    apiImpls.push_back(std::make_shared<EvolutionChainApiImpl>(router));
    apiImpls.push_back(std::make_shared<EvolutionTriggerApiImpl>(router));
    apiImpls.push_back(std::make_shared<GenderApiImpl>(router));
    apiImpls.push_back(std::make_shared<GenerationApiImpl>(router));
    apiImpls.push_back(std::make_shared<GrowthRateApiImpl>(router));
    apiImpls.push_back(std::make_shared<ItemApiImpl>(router));
    apiImpls.push_back(std::make_shared<ItemAttributeApiImpl>(router));
    apiImpls.push_back(std::make_shared<ItemCategoryApiImpl>(router));
    apiImpls.push_back(std::make_shared<ItemFlingEffectApiImpl>(router));
    apiImpls.push_back(std::make_shared<ItemPocketApiImpl>(router));
    apiImpls.push_back(std::make_shared<LanguageApiImpl>(router));
    apiImpls.push_back(std::make_shared<LocationApiImpl>(router));
    apiImpls.push_back(std::make_shared<LocationAreaApiImpl>(router));
    apiImpls.push_back(std::make_shared<MachineApiImpl>(router));
    apiImpls.push_back(std::make_shared<MoveApiImpl>(router));
    apiImpls.push_back(std::make_shared<MoveAilmentApiImpl>(router));
    apiImpls.push_back(std::make_shared<MoveBattleStyleApiImpl>(router));
    apiImpls.push_back(std::make_shared<MoveCategoryApiImpl>(router));
    apiImpls.push_back(std::make_shared<MoveDamageClassApiImpl>(router));
    apiImpls.push_back(std::make_shared<MoveLearnMethodApiImpl>(router));
    apiImpls.push_back(std::make_shared<MoveTargetApiImpl>(router));
    apiImpls.push_back(std::make_shared<NatureApiImpl>(router));
    apiImpls.push_back(std::make_shared<PalParkAreaApiImpl>(router));
    apiImpls.push_back(std::make_shared<PokeathlonStatApiImpl>(router));
    apiImpls.push_back(std::make_shared<PokedexApiImpl>(router));
    apiImpls.push_back(std::make_shared<PokemonApiImpl>(router));
    apiImpls.push_back(std::make_shared<PokemonColorApiImpl>(router));
    apiImpls.push_back(std::make_shared<PokemonFormApiImpl>(router));
    apiImpls.push_back(std::make_shared<PokemonHabitatApiImpl>(router));
    apiImpls.push_back(std::make_shared<PokemonShapeApiImpl>(router));
    apiImpls.push_back(std::make_shared<PokemonSpeciesApiImpl>(router));
    apiImpls.push_back(std::make_shared<RegionApiImpl>(router));
    apiImpls.push_back(std::make_shared<StatApiImpl>(router));
    apiImpls.push_back(std::make_shared<SuperContestEffectApiImpl>(router));
    apiImpls.push_back(std::make_shared<TypeApiImpl>(router));
    apiImpls.push_back(std::make_shared<VersionApiImpl>(router));
    apiImpls.push_back(std::make_shared<VersionGroupApiImpl>(router));

    for (auto api : apiImpls) {
        api->init();
    }

    httpEndpoint->setHandler(router->handler());
    httpEndpoint->serve();

    httpEndpoint->shutdown();
}
