# Helidon SE Server with OpenAPI

## Build and run

With JDK11+
```bash
mvn package
java -jar target/openapi-java-server.jar
```

## Exercise the application

```
curl -X GET https://pokeapi.co/api/v2/berry-firmness/
curl -X GET https://pokeapi.co/api/v2/berry-firmness/{id}/
curl -X GET https://pokeapi.co/api/v2/berry-flavor/
curl -X GET https://pokeapi.co/api/v2/berry-flavor/{id}/
curl -X GET https://pokeapi.co/api/v2/berry/
curl -X GET https://pokeapi.co/api/v2/berry/{id}/
curl -X GET https://pokeapi.co/api/v2/contest-effect/
curl -X GET https://pokeapi.co/api/v2/contest-effect/{id}/
curl -X GET https://pokeapi.co/api/v2/contest-type/
curl -X GET https://pokeapi.co/api/v2/contest-type/{id}/
curl -X GET https://pokeapi.co/api/v2/super-contest-effect/
curl -X GET https://pokeapi.co/api/v2/super-contest-effect/{id}/
curl -X GET https://pokeapi.co/api/v2/encounter-condition/
curl -X GET https://pokeapi.co/api/v2/encounter-condition/{id}/
curl -X GET https://pokeapi.co/api/v2/encounter-condition-value/
curl -X GET https://pokeapi.co/api/v2/encounter-condition-value/{id}/
curl -X GET https://pokeapi.co/api/v2/encounter-method/
curl -X GET https://pokeapi.co/api/v2/encounter-method/{id}/
curl -X GET https://pokeapi.co/api/v2/evolution-chain/
curl -X GET https://pokeapi.co/api/v2/evolution-chain/{id}/
curl -X GET https://pokeapi.co/api/v2/evolution-trigger/
curl -X GET https://pokeapi.co/api/v2/evolution-trigger/{id}/
curl -X GET https://pokeapi.co/api/v2/generation/
curl -X GET https://pokeapi.co/api/v2/generation/{id}/
curl -X GET https://pokeapi.co/api/v2/pokedex/
curl -X GET https://pokeapi.co/api/v2/pokedex/{id}/
curl -X GET https://pokeapi.co/api/v2/version-group/
curl -X GET https://pokeapi.co/api/v2/version-group/{id}/
curl -X GET https://pokeapi.co/api/v2/version/
curl -X GET https://pokeapi.co/api/v2/version/{id}/
curl -X GET https://pokeapi.co/api/v2/item-attribute/
curl -X GET https://pokeapi.co/api/v2/item-attribute/{id}/
curl -X GET https://pokeapi.co/api/v2/item-category/
curl -X GET https://pokeapi.co/api/v2/item-category/{id}/
curl -X GET https://pokeapi.co/api/v2/item-fling-effect/
curl -X GET https://pokeapi.co/api/v2/item-fling-effect/{id}/
curl -X GET https://pokeapi.co/api/v2/item/
curl -X GET https://pokeapi.co/api/v2/item-pocket/
curl -X GET https://pokeapi.co/api/v2/item-pocket/{id}/
curl -X GET https://pokeapi.co/api/v2/item/{id}/
curl -X GET https://pokeapi.co/api/v2/location-area/
curl -X GET https://pokeapi.co/api/v2/location-area/{id}/
curl -X GET https://pokeapi.co/api/v2/location/
curl -X GET https://pokeapi.co/api/v2/location/{id}/
curl -X GET https://pokeapi.co/api/v2/pal-park-area/
curl -X GET https://pokeapi.co/api/v2/pal-park-area/{id}/
curl -X GET https://pokeapi.co/api/v2/region/
curl -X GET https://pokeapi.co/api/v2/region/{id}/
curl -X GET https://pokeapi.co/api/v2/machine/
curl -X GET https://pokeapi.co/api/v2/machine/{id}/
curl -X GET https://pokeapi.co/api/v2/move-ailment/
curl -X GET https://pokeapi.co/api/v2/move-ailment/{id}/
curl -X GET https://pokeapi.co/api/v2/move-battle-style/
curl -X GET https://pokeapi.co/api/v2/move-battle-style/{id}/
curl -X GET https://pokeapi.co/api/v2/move-category/
curl -X GET https://pokeapi.co/api/v2/move-category/{id}/
curl -X GET https://pokeapi.co/api/v2/move-learn-method/
curl -X GET https://pokeapi.co/api/v2/move-learn-method/{id}/
curl -X GET https://pokeapi.co/api/v2/move/
curl -X GET https://pokeapi.co/api/v2/move/{id}/
curl -X GET https://pokeapi.co/api/v2/move-target/
curl -X GET https://pokeapi.co/api/v2/move-target/{id}/
curl -X GET https://pokeapi.co/api/v2/ability/
curl -X GET https://pokeapi.co/api/v2/ability/{id}/
curl -X GET https://pokeapi.co/api/v2/characteristic/
curl -X GET https://pokeapi.co/api/v2/characteristic/{id}/
curl -X GET https://pokeapi.co/api/v2/egg-group/
curl -X GET https://pokeapi.co/api/v2/egg-group/{id}/
curl -X GET https://pokeapi.co/api/v2/gender/
curl -X GET https://pokeapi.co/api/v2/gender/{id}/
curl -X GET https://pokeapi.co/api/v2/growth-rate/
curl -X GET https://pokeapi.co/api/v2/growth-rate/{id}/
curl -X GET https://pokeapi.co/api/v2/move-damage-class/
curl -X GET https://pokeapi.co/api/v2/move-damage-class/{id}/
curl -X GET https://pokeapi.co/api/v2/nature/
curl -X GET https://pokeapi.co/api/v2/nature/{id}/
curl -X GET https://pokeapi.co/api/v2/pokeathlon-stat/
curl -X GET https://pokeapi.co/api/v2/pokeathlon-stat/{id}/
curl -X GET https://pokeapi.co/api/v2/pokemon-color/
curl -X GET https://pokeapi.co/api/v2/pokemon-color/{id}/
curl -X GET https://pokeapi.co/api/v2/pokemon-form/
curl -X GET https://pokeapi.co/api/v2/pokemon-form/{id}/
curl -X GET https://pokeapi.co/api/v2/pokemon-habitat/
curl -X GET https://pokeapi.co/api/v2/pokemon-habitat/{id}/
curl -X GET https://pokeapi.co/api/v2/pokemon/
curl -X GET https://pokeapi.co/api/v2/pokemon/{id}/
curl -X GET https://pokeapi.co/api/v2/pokemon-shape/
curl -X GET https://pokeapi.co/api/v2/pokemon-shape/{id}/
curl -X GET https://pokeapi.co/api/v2/pokemon-species/
curl -X GET https://pokeapi.co/api/v2/pokemon-species/{id}/
curl -X GET https://pokeapi.co/api/v2/stat/
curl -X GET https://pokeapi.co/api/v2/stat/{id}/
curl -X GET https://pokeapi.co/api/v2/type/
curl -X GET https://pokeapi.co/api/v2/type/{id}/
curl -X GET https://pokeapi.co/api/v2/language/
curl -X GET https://pokeapi.co/api/v2/language/{id}/

```

## Try health and metrics

```
curl -s -X GET https://pokeapi.co/health
{"outcome":"UP",...
. . .

# Prometheus Format
curl -s -X GET https://pokeapi.co/metrics
# TYPE base:gc_g1_young_generation_count gauge
. . .

# JSON Format
curl -H 'Accept: application/json' -X GET https://pokeapi.co/metrics
{"base":...
. . .
```