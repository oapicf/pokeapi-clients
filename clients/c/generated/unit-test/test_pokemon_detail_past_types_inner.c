#ifndef pokemon_detail_past_types_inner_TEST
#define pokemon_detail_past_types_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pokemon_detail_past_types_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pokemon_detail_past_types_inner.h"
pokemon_detail_past_types_inner_t* instantiate_pokemon_detail_past_types_inner(int include_optional);

#include "test_ability_detail_pokemon_inner_pokemon.c"


pokemon_detail_past_types_inner_t* instantiate_pokemon_detail_past_types_inner(int include_optional) {
  pokemon_detail_past_types_inner_t* pokemon_detail_past_types_inner = NULL;
  if (include_optional) {
    pokemon_detail_past_types_inner = pokemon_detail_past_types_inner_create(
       // false, not to have infinite recursion
      instantiate_ability_detail_pokemon_inner_pokemon(0),
      list_createList()
    );
  } else {
    pokemon_detail_past_types_inner = pokemon_detail_past_types_inner_create(
      NULL,
      list_createList()
    );
  }

  return pokemon_detail_past_types_inner;
}


#ifdef pokemon_detail_past_types_inner_MAIN

void test_pokemon_detail_past_types_inner(int include_optional) {
    pokemon_detail_past_types_inner_t* pokemon_detail_past_types_inner_1 = instantiate_pokemon_detail_past_types_inner(include_optional);

	cJSON* jsonpokemon_detail_past_types_inner_1 = pokemon_detail_past_types_inner_convertToJSON(pokemon_detail_past_types_inner_1);
	printf("pokemon_detail_past_types_inner :\n%s\n", cJSON_Print(jsonpokemon_detail_past_types_inner_1));
	pokemon_detail_past_types_inner_t* pokemon_detail_past_types_inner_2 = pokemon_detail_past_types_inner_parseFromJSON(jsonpokemon_detail_past_types_inner_1);
	cJSON* jsonpokemon_detail_past_types_inner_2 = pokemon_detail_past_types_inner_convertToJSON(pokemon_detail_past_types_inner_2);
	printf("repeating pokemon_detail_past_types_inner:\n%s\n", cJSON_Print(jsonpokemon_detail_past_types_inner_2));
}

int main() {
  test_pokemon_detail_past_types_inner(1);
  test_pokemon_detail_past_types_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // pokemon_detail_past_types_inner_MAIN
#endif // pokemon_detail_past_types_inner_TEST
