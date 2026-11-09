#ifndef pokemon_encounter_detail_response_TEST
#define pokemon_encounter_detail_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pokemon_encounter_detail_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pokemon_encounter_detail_response.h"
pokemon_encounter_detail_response_t* instantiate_pokemon_encounter_detail_response(int include_optional);

#include "test_encounter_method_summary.c"


pokemon_encounter_detail_response_t* instantiate_pokemon_encounter_detail_response(int include_optional) {
  pokemon_encounter_detail_response_t* pokemon_encounter_detail_response = NULL;
  if (include_optional) {
    pokemon_encounter_detail_response = pokemon_encounter_detail_response_create(
      56,
      list_createList(),
      56,
       // false, not to have infinite recursion
      instantiate_encounter_method_summary(0),
      56
    );
  } else {
    pokemon_encounter_detail_response = pokemon_encounter_detail_response_create(
      56,
      list_createList(),
      56,
      NULL,
      56
    );
  }

  return pokemon_encounter_detail_response;
}


#ifdef pokemon_encounter_detail_response_MAIN

void test_pokemon_encounter_detail_response(int include_optional) {
    pokemon_encounter_detail_response_t* pokemon_encounter_detail_response_1 = instantiate_pokemon_encounter_detail_response(include_optional);

	cJSON* jsonpokemon_encounter_detail_response_1 = pokemon_encounter_detail_response_convertToJSON(pokemon_encounter_detail_response_1);
	printf("pokemon_encounter_detail_response :\n%s\n", cJSON_Print(jsonpokemon_encounter_detail_response_1));
	pokemon_encounter_detail_response_t* pokemon_encounter_detail_response_2 = pokemon_encounter_detail_response_parseFromJSON(jsonpokemon_encounter_detail_response_1);
	cJSON* jsonpokemon_encounter_detail_response_2 = pokemon_encounter_detail_response_convertToJSON(pokemon_encounter_detail_response_2);
	printf("repeating pokemon_encounter_detail_response:\n%s\n", cJSON_Print(jsonpokemon_encounter_detail_response_2));
}

int main() {
  test_pokemon_encounter_detail_response(1);
  test_pokemon_encounter_detail_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // pokemon_encounter_detail_response_MAIN
#endif // pokemon_encounter_detail_response_TEST
