#ifndef pokemon_encounters_retrieve_200_response_inner_location_area_TEST
#define pokemon_encounters_retrieve_200_response_inner_location_area_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pokemon_encounters_retrieve_200_response_inner_location_area_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pokemon_encounters_retrieve_200_response_inner_location_area.h"
pokemon_encounters_retrieve_200_response_inner_location_area_t* instantiate_pokemon_encounters_retrieve_200_response_inner_location_area(int include_optional);



pokemon_encounters_retrieve_200_response_inner_location_area_t* instantiate_pokemon_encounters_retrieve_200_response_inner_location_area(int include_optional) {
  pokemon_encounters_retrieve_200_response_inner_location_area_t* pokemon_encounters_retrieve_200_response_inner_location_area = NULL;
  if (include_optional) {
    pokemon_encounters_retrieve_200_response_inner_location_area = pokemon_encounters_retrieve_200_response_inner_location_area_create(
      "cerulean-city-area",
      "https://pokeapi.co/api/v2/location-area/281/"
    );
  } else {
    pokemon_encounters_retrieve_200_response_inner_location_area = pokemon_encounters_retrieve_200_response_inner_location_area_create(
      "cerulean-city-area",
      "https://pokeapi.co/api/v2/location-area/281/"
    );
  }

  return pokemon_encounters_retrieve_200_response_inner_location_area;
}


#ifdef pokemon_encounters_retrieve_200_response_inner_location_area_MAIN

void test_pokemon_encounters_retrieve_200_response_inner_location_area(int include_optional) {
    pokemon_encounters_retrieve_200_response_inner_location_area_t* pokemon_encounters_retrieve_200_response_inner_location_area_1 = instantiate_pokemon_encounters_retrieve_200_response_inner_location_area(include_optional);

	cJSON* jsonpokemon_encounters_retrieve_200_response_inner_location_area_1 = pokemon_encounters_retrieve_200_response_inner_location_area_convertToJSON(pokemon_encounters_retrieve_200_response_inner_location_area_1);
	printf("pokemon_encounters_retrieve_200_response_inner_location_area :\n%s\n", cJSON_Print(jsonpokemon_encounters_retrieve_200_response_inner_location_area_1));
	pokemon_encounters_retrieve_200_response_inner_location_area_t* pokemon_encounters_retrieve_200_response_inner_location_area_2 = pokemon_encounters_retrieve_200_response_inner_location_area_parseFromJSON(jsonpokemon_encounters_retrieve_200_response_inner_location_area_1);
	cJSON* jsonpokemon_encounters_retrieve_200_response_inner_location_area_2 = pokemon_encounters_retrieve_200_response_inner_location_area_convertToJSON(pokemon_encounters_retrieve_200_response_inner_location_area_2);
	printf("repeating pokemon_encounters_retrieve_200_response_inner_location_area:\n%s\n", cJSON_Print(jsonpokemon_encounters_retrieve_200_response_inner_location_area_2));
}

int main() {
  test_pokemon_encounters_retrieve_200_response_inner_location_area(1);
  test_pokemon_encounters_retrieve_200_response_inner_location_area(0);

  printf("Hello world \n");
  return 0;
}

#endif // pokemon_encounters_retrieve_200_response_inner_location_area_MAIN
#endif // pokemon_encounters_retrieve_200_response_inner_location_area_TEST
