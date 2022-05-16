<?php
require_once __DIR__ . '/vendor/autoload.php';

use Symfony\Component\HttpFoundation\Request;
use Symfony\Component\HttpFoundation\Response;
use Silex\Application;

$app = new Silex\Application();


$app->GET('/api/v2/api/v2/ability/', function(Application $app, Request $request) {
            $limit = $request->get('limit');
            $offset = $request->get('offset');
            return new Response('How about implementing abilityList as a GET method ?');
            });


$app->GET('/api/v2/api/v2/ability/{id}/', function(Application $app, Request $request, $id) {
            return new Response('How about implementing abilityRead as a GET method ?');
            });


$app->GET('/api/v2/api/v2/berry/', function(Application $app, Request $request) {
            $limit = $request->get('limit');
            $offset = $request->get('offset');
            return new Response('How about implementing berryList as a GET method ?');
            });


$app->GET('/api/v2/api/v2/berry/{id}/', function(Application $app, Request $request, $id) {
            return new Response('How about implementing berryRead as a GET method ?');
            });


$app->GET('/api/v2/api/v2/berry-firmness/', function(Application $app, Request $request) {
            $limit = $request->get('limit');
            $offset = $request->get('offset');
            return new Response('How about implementing berryFirmnessList as a GET method ?');
            });


$app->GET('/api/v2/api/v2/berry-firmness/{id}/', function(Application $app, Request $request, $id) {
            return new Response('How about implementing berryFirmnessRead as a GET method ?');
            });


$app->GET('/api/v2/api/v2/berry-flavor/', function(Application $app, Request $request) {
            $limit = $request->get('limit');
            $offset = $request->get('offset');
            return new Response('How about implementing berryFlavorList as a GET method ?');
            });


$app->GET('/api/v2/api/v2/berry-flavor/{id}/', function(Application $app, Request $request, $id) {
            return new Response('How about implementing berryFlavorRead as a GET method ?');
            });


$app->GET('/api/v2/api/v2/characteristic/', function(Application $app, Request $request) {
            $limit = $request->get('limit');
            $offset = $request->get('offset');
            return new Response('How about implementing characteristicList as a GET method ?');
            });


$app->GET('/api/v2/api/v2/characteristic/{id}/', function(Application $app, Request $request, $id) {
            return new Response('How about implementing characteristicRead as a GET method ?');
            });


$app->GET('/api/v2/api/v2/contest-effect/', function(Application $app, Request $request) {
            $limit = $request->get('limit');
            $offset = $request->get('offset');
            return new Response('How about implementing contestEffectList as a GET method ?');
            });


$app->GET('/api/v2/api/v2/contest-effect/{id}/', function(Application $app, Request $request, $id) {
            return new Response('How about implementing contestEffectRead as a GET method ?');
            });


$app->GET('/api/v2/api/v2/contest-type/', function(Application $app, Request $request) {
            $limit = $request->get('limit');
            $offset = $request->get('offset');
            return new Response('How about implementing contestTypeList as a GET method ?');
            });


$app->GET('/api/v2/api/v2/contest-type/{id}/', function(Application $app, Request $request, $id) {
            return new Response('How about implementing contestTypeRead as a GET method ?');
            });


$app->GET('/api/v2/api/v2/egg-group/', function(Application $app, Request $request) {
            $limit = $request->get('limit');
            $offset = $request->get('offset');
            return new Response('How about implementing eggGroupList as a GET method ?');
            });


$app->GET('/api/v2/api/v2/egg-group/{id}/', function(Application $app, Request $request, $id) {
            return new Response('How about implementing eggGroupRead as a GET method ?');
            });


$app->GET('/api/v2/api/v2/encounter-condition/', function(Application $app, Request $request) {
            $limit = $request->get('limit');
            $offset = $request->get('offset');
            return new Response('How about implementing encounterConditionList as a GET method ?');
            });


$app->GET('/api/v2/api/v2/encounter-condition/{id}/', function(Application $app, Request $request, $id) {
            return new Response('How about implementing encounterConditionRead as a GET method ?');
            });


$app->GET('/api/v2/api/v2/encounter-condition-value/', function(Application $app, Request $request) {
            $limit = $request->get('limit');
            $offset = $request->get('offset');
            return new Response('How about implementing encounterConditionValueList as a GET method ?');
            });


$app->GET('/api/v2/api/v2/encounter-condition-value/{id}/', function(Application $app, Request $request, $id) {
            return new Response('How about implementing encounterConditionValueRead as a GET method ?');
            });


$app->GET('/api/v2/api/v2/encounter-method/', function(Application $app, Request $request) {
            $limit = $request->get('limit');
            $offset = $request->get('offset');
            return new Response('How about implementing encounterMethodList as a GET method ?');
            });


$app->GET('/api/v2/api/v2/encounter-method/{id}/', function(Application $app, Request $request, $id) {
            return new Response('How about implementing encounterMethodRead as a GET method ?');
            });


$app->GET('/api/v2/api/v2/evolution-chain/', function(Application $app, Request $request) {
            $limit = $request->get('limit');
            $offset = $request->get('offset');
            return new Response('How about implementing evolutionChainList as a GET method ?');
            });


$app->GET('/api/v2/api/v2/evolution-chain/{id}/', function(Application $app, Request $request, $id) {
            return new Response('How about implementing evolutionChainRead as a GET method ?');
            });


$app->GET('/api/v2/api/v2/evolution-trigger/', function(Application $app, Request $request) {
            $limit = $request->get('limit');
            $offset = $request->get('offset');
            return new Response('How about implementing evolutionTriggerList as a GET method ?');
            });


$app->GET('/api/v2/api/v2/evolution-trigger/{id}/', function(Application $app, Request $request, $id) {
            return new Response('How about implementing evolutionTriggerRead as a GET method ?');
            });


$app->GET('/api/v2/api/v2/gender/', function(Application $app, Request $request) {
            $limit = $request->get('limit');
            $offset = $request->get('offset');
            return new Response('How about implementing genderList as a GET method ?');
            });


$app->GET('/api/v2/api/v2/gender/{id}/', function(Application $app, Request $request, $id) {
            return new Response('How about implementing genderRead as a GET method ?');
            });


$app->GET('/api/v2/api/v2/generation/', function(Application $app, Request $request) {
            $limit = $request->get('limit');
            $offset = $request->get('offset');
            return new Response('How about implementing generationList as a GET method ?');
            });


$app->GET('/api/v2/api/v2/generation/{id}/', function(Application $app, Request $request, $id) {
            return new Response('How about implementing generationRead as a GET method ?');
            });


$app->GET('/api/v2/api/v2/growth-rate/', function(Application $app, Request $request) {
            $limit = $request->get('limit');
            $offset = $request->get('offset');
            return new Response('How about implementing growthRateList as a GET method ?');
            });


$app->GET('/api/v2/api/v2/growth-rate/{id}/', function(Application $app, Request $request, $id) {
            return new Response('How about implementing growthRateRead as a GET method ?');
            });


$app->GET('/api/v2/api/v2/item/', function(Application $app, Request $request) {
            $limit = $request->get('limit');
            $offset = $request->get('offset');
            return new Response('How about implementing itemList as a GET method ?');
            });


$app->GET('/api/v2/api/v2/item/{id}/', function(Application $app, Request $request, $id) {
            return new Response('How about implementing itemRead as a GET method ?');
            });


$app->GET('/api/v2/api/v2/item-attribute/', function(Application $app, Request $request) {
            $limit = $request->get('limit');
            $offset = $request->get('offset');
            return new Response('How about implementing itemAttributeList as a GET method ?');
            });


$app->GET('/api/v2/api/v2/item-attribute/{id}/', function(Application $app, Request $request, $id) {
            return new Response('How about implementing itemAttributeRead as a GET method ?');
            });


$app->GET('/api/v2/api/v2/item-category/', function(Application $app, Request $request) {
            $limit = $request->get('limit');
            $offset = $request->get('offset');
            return new Response('How about implementing itemCategoryList as a GET method ?');
            });


$app->GET('/api/v2/api/v2/item-category/{id}/', function(Application $app, Request $request, $id) {
            return new Response('How about implementing itemCategoryRead as a GET method ?');
            });


$app->GET('/api/v2/api/v2/item-fling-effect/', function(Application $app, Request $request) {
            $limit = $request->get('limit');
            $offset = $request->get('offset');
            return new Response('How about implementing itemFlingEffectList as a GET method ?');
            });


$app->GET('/api/v2/api/v2/item-fling-effect/{id}/', function(Application $app, Request $request, $id) {
            return new Response('How about implementing itemFlingEffectRead as a GET method ?');
            });


$app->GET('/api/v2/api/v2/item-pocket/', function(Application $app, Request $request) {
            $limit = $request->get('limit');
            $offset = $request->get('offset');
            return new Response('How about implementing itemPocketList as a GET method ?');
            });


$app->GET('/api/v2/api/v2/item-pocket/{id}/', function(Application $app, Request $request, $id) {
            return new Response('How about implementing itemPocketRead as a GET method ?');
            });


$app->GET('/api/v2/api/v2/language/', function(Application $app, Request $request) {
            $limit = $request->get('limit');
            $offset = $request->get('offset');
            return new Response('How about implementing languageList as a GET method ?');
            });


$app->GET('/api/v2/api/v2/language/{id}/', function(Application $app, Request $request, $id) {
            return new Response('How about implementing languageRead as a GET method ?');
            });


$app->GET('/api/v2/api/v2/location/', function(Application $app, Request $request) {
            $limit = $request->get('limit');
            $offset = $request->get('offset');
            return new Response('How about implementing locationList as a GET method ?');
            });


$app->GET('/api/v2/api/v2/location/{id}/', function(Application $app, Request $request, $id) {
            return new Response('How about implementing locationRead as a GET method ?');
            });


$app->GET('/api/v2/api/v2/location-area/', function(Application $app, Request $request) {
            $limit = $request->get('limit');
            $offset = $request->get('offset');
            return new Response('How about implementing locationAreaList as a GET method ?');
            });


$app->GET('/api/v2/api/v2/location-area/{id}/', function(Application $app, Request $request, $id) {
            return new Response('How about implementing locationAreaRead as a GET method ?');
            });


$app->GET('/api/v2/api/v2/machine/', function(Application $app, Request $request) {
            $limit = $request->get('limit');
            $offset = $request->get('offset');
            return new Response('How about implementing machineList as a GET method ?');
            });


$app->GET('/api/v2/api/v2/machine/{id}/', function(Application $app, Request $request, $id) {
            return new Response('How about implementing machineRead as a GET method ?');
            });


$app->GET('/api/v2/api/v2/move/', function(Application $app, Request $request) {
            $limit = $request->get('limit');
            $offset = $request->get('offset');
            return new Response('How about implementing moveList as a GET method ?');
            });


$app->GET('/api/v2/api/v2/move/{id}/', function(Application $app, Request $request, $id) {
            return new Response('How about implementing moveRead as a GET method ?');
            });


$app->GET('/api/v2/api/v2/move-ailment/', function(Application $app, Request $request) {
            $limit = $request->get('limit');
            $offset = $request->get('offset');
            return new Response('How about implementing moveAilmentList as a GET method ?');
            });


$app->GET('/api/v2/api/v2/move-ailment/{id}/', function(Application $app, Request $request, $id) {
            return new Response('How about implementing moveAilmentRead as a GET method ?');
            });


$app->GET('/api/v2/api/v2/move-battle-style/', function(Application $app, Request $request) {
            $limit = $request->get('limit');
            $offset = $request->get('offset');
            return new Response('How about implementing moveBattleStyleList as a GET method ?');
            });


$app->GET('/api/v2/api/v2/move-battle-style/{id}/', function(Application $app, Request $request, $id) {
            return new Response('How about implementing moveBattleStyleRead as a GET method ?');
            });


$app->GET('/api/v2/api/v2/move-category/', function(Application $app, Request $request) {
            $limit = $request->get('limit');
            $offset = $request->get('offset');
            return new Response('How about implementing moveCategoryList as a GET method ?');
            });


$app->GET('/api/v2/api/v2/move-category/{id}/', function(Application $app, Request $request, $id) {
            return new Response('How about implementing moveCategoryRead as a GET method ?');
            });


$app->GET('/api/v2/api/v2/move-damage-class/', function(Application $app, Request $request) {
            $limit = $request->get('limit');
            $offset = $request->get('offset');
            return new Response('How about implementing moveDamageClassList as a GET method ?');
            });


$app->GET('/api/v2/api/v2/move-damage-class/{id}/', function(Application $app, Request $request, $id) {
            return new Response('How about implementing moveDamageClassRead as a GET method ?');
            });


$app->GET('/api/v2/api/v2/move-learn-method/', function(Application $app, Request $request) {
            $limit = $request->get('limit');
            $offset = $request->get('offset');
            return new Response('How about implementing moveLearnMethodList as a GET method ?');
            });


$app->GET('/api/v2/api/v2/move-learn-method/{id}/', function(Application $app, Request $request, $id) {
            return new Response('How about implementing moveLearnMethodRead as a GET method ?');
            });


$app->GET('/api/v2/api/v2/move-target/', function(Application $app, Request $request) {
            $limit = $request->get('limit');
            $offset = $request->get('offset');
            return new Response('How about implementing moveTargetList as a GET method ?');
            });


$app->GET('/api/v2/api/v2/move-target/{id}/', function(Application $app, Request $request, $id) {
            return new Response('How about implementing moveTargetRead as a GET method ?');
            });


$app->GET('/api/v2/api/v2/nature/', function(Application $app, Request $request) {
            $limit = $request->get('limit');
            $offset = $request->get('offset');
            return new Response('How about implementing natureList as a GET method ?');
            });


$app->GET('/api/v2/api/v2/nature/{id}/', function(Application $app, Request $request, $id) {
            return new Response('How about implementing natureRead as a GET method ?');
            });


$app->GET('/api/v2/api/v2/pal-park-area/', function(Application $app, Request $request) {
            $limit = $request->get('limit');
            $offset = $request->get('offset');
            return new Response('How about implementing palParkAreaList as a GET method ?');
            });


$app->GET('/api/v2/api/v2/pal-park-area/{id}/', function(Application $app, Request $request, $id) {
            return new Response('How about implementing palParkAreaRead as a GET method ?');
            });


$app->GET('/api/v2/api/v2/pokeathlon-stat/', function(Application $app, Request $request) {
            $limit = $request->get('limit');
            $offset = $request->get('offset');
            return new Response('How about implementing pokeathlonStatList as a GET method ?');
            });


$app->GET('/api/v2/api/v2/pokeathlon-stat/{id}/', function(Application $app, Request $request, $id) {
            return new Response('How about implementing pokeathlonStatRead as a GET method ?');
            });


$app->GET('/api/v2/api/v2/pokedex/', function(Application $app, Request $request) {
            $limit = $request->get('limit');
            $offset = $request->get('offset');
            return new Response('How about implementing pokedexList as a GET method ?');
            });


$app->GET('/api/v2/api/v2/pokedex/{id}/', function(Application $app, Request $request, $id) {
            return new Response('How about implementing pokedexRead as a GET method ?');
            });


$app->GET('/api/v2/api/v2/pokemon/', function(Application $app, Request $request) {
            $limit = $request->get('limit');
            $offset = $request->get('offset');
            return new Response('How about implementing pokemonList as a GET method ?');
            });


$app->GET('/api/v2/api/v2/pokemon/{id}/', function(Application $app, Request $request, $id) {
            return new Response('How about implementing pokemonRead as a GET method ?');
            });


$app->GET('/api/v2/api/v2/pokemon-color/', function(Application $app, Request $request) {
            $limit = $request->get('limit');
            $offset = $request->get('offset');
            return new Response('How about implementing pokemonColorList as a GET method ?');
            });


$app->GET('/api/v2/api/v2/pokemon-color/{id}/', function(Application $app, Request $request, $id) {
            return new Response('How about implementing pokemonColorRead as a GET method ?');
            });


$app->GET('/api/v2/api/v2/pokemon-form/', function(Application $app, Request $request) {
            $limit = $request->get('limit');
            $offset = $request->get('offset');
            return new Response('How about implementing pokemonFormList as a GET method ?');
            });


$app->GET('/api/v2/api/v2/pokemon-form/{id}/', function(Application $app, Request $request, $id) {
            return new Response('How about implementing pokemonFormRead as a GET method ?');
            });


$app->GET('/api/v2/api/v2/pokemon-habitat/', function(Application $app, Request $request) {
            $limit = $request->get('limit');
            $offset = $request->get('offset');
            return new Response('How about implementing pokemonHabitatList as a GET method ?');
            });


$app->GET('/api/v2/api/v2/pokemon-habitat/{id}/', function(Application $app, Request $request, $id) {
            return new Response('How about implementing pokemonHabitatRead as a GET method ?');
            });


$app->GET('/api/v2/api/v2/pokemon-shape/', function(Application $app, Request $request) {
            $limit = $request->get('limit');
            $offset = $request->get('offset');
            return new Response('How about implementing pokemonShapeList as a GET method ?');
            });


$app->GET('/api/v2/api/v2/pokemon-shape/{id}/', function(Application $app, Request $request, $id) {
            return new Response('How about implementing pokemonShapeRead as a GET method ?');
            });


$app->GET('/api/v2/api/v2/pokemon-species/', function(Application $app, Request $request) {
            $limit = $request->get('limit');
            $offset = $request->get('offset');
            return new Response('How about implementing pokemonSpeciesList as a GET method ?');
            });


$app->GET('/api/v2/api/v2/pokemon-species/{id}/', function(Application $app, Request $request, $id) {
            return new Response('How about implementing pokemonSpeciesRead as a GET method ?');
            });


$app->GET('/api/v2/api/v2/region/', function(Application $app, Request $request) {
            $limit = $request->get('limit');
            $offset = $request->get('offset');
            return new Response('How about implementing regionList as a GET method ?');
            });


$app->GET('/api/v2/api/v2/region/{id}/', function(Application $app, Request $request, $id) {
            return new Response('How about implementing regionRead as a GET method ?');
            });


$app->GET('/api/v2/api/v2/stat/', function(Application $app, Request $request) {
            $limit = $request->get('limit');
            $offset = $request->get('offset');
            return new Response('How about implementing statList as a GET method ?');
            });


$app->GET('/api/v2/api/v2/stat/{id}/', function(Application $app, Request $request, $id) {
            return new Response('How about implementing statRead as a GET method ?');
            });


$app->GET('/api/v2/api/v2/super-contest-effect/', function(Application $app, Request $request) {
            $limit = $request->get('limit');
            $offset = $request->get('offset');
            return new Response('How about implementing superContestEffectList as a GET method ?');
            });


$app->GET('/api/v2/api/v2/super-contest-effect/{id}/', function(Application $app, Request $request, $id) {
            return new Response('How about implementing superContestEffectRead as a GET method ?');
            });


$app->GET('/api/v2/api/v2/type/', function(Application $app, Request $request) {
            $limit = $request->get('limit');
            $offset = $request->get('offset');
            return new Response('How about implementing typeList as a GET method ?');
            });


$app->GET('/api/v2/api/v2/type/{id}/', function(Application $app, Request $request, $id) {
            return new Response('How about implementing typeRead as a GET method ?');
            });


$app->GET('/api/v2/api/v2/version/', function(Application $app, Request $request) {
            $limit = $request->get('limit');
            $offset = $request->get('offset');
            return new Response('How about implementing versionList as a GET method ?');
            });


$app->GET('/api/v2/api/v2/version/{id}/', function(Application $app, Request $request, $id) {
            return new Response('How about implementing versionRead as a GET method ?');
            });


$app->GET('/api/v2/api/v2/version-group/', function(Application $app, Request $request) {
            $limit = $request->get('limit');
            $offset = $request->get('offset');
            return new Response('How about implementing versionGroupList as a GET method ?');
            });


$app->GET('/api/v2/api/v2/version-group/{id}/', function(Application $app, Request $request, $id) {
            return new Response('How about implementing versionGroupRead as a GET method ?');
            });


$app->run();
