#ifndef pokemon_form_detail_form_names_inner_TEST
#define pokemon_form_detail_form_names_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pokemon_form_detail_form_names_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pokemon_form_detail_form_names_inner.h"
pokemon_form_detail_form_names_inner_t* instantiate_pokemon_form_detail_form_names_inner(int include_optional);

#include "test_ability_detail_pokemon_inner_pokemon.c"


pokemon_form_detail_form_names_inner_t* instantiate_pokemon_form_detail_form_names_inner(int include_optional) {
  pokemon_form_detail_form_names_inner_t* pokemon_form_detail_form_names_inner = NULL;
  if (include_optional) {
    pokemon_form_detail_form_names_inner = pokemon_form_detail_form_names_inner_create(
       // false, not to have infinite recursion
      instantiate_ability_detail_pokemon_inner_pokemon(0),
      "0"
    );
  } else {
    pokemon_form_detail_form_names_inner = pokemon_form_detail_form_names_inner_create(
      NULL,
      "0"
    );
  }

  return pokemon_form_detail_form_names_inner;
}


#ifdef pokemon_form_detail_form_names_inner_MAIN

void test_pokemon_form_detail_form_names_inner(int include_optional) {
    pokemon_form_detail_form_names_inner_t* pokemon_form_detail_form_names_inner_1 = instantiate_pokemon_form_detail_form_names_inner(include_optional);

	cJSON* jsonpokemon_form_detail_form_names_inner_1 = pokemon_form_detail_form_names_inner_convertToJSON(pokemon_form_detail_form_names_inner_1);
	printf("pokemon_form_detail_form_names_inner :\n%s\n", cJSON_Print(jsonpokemon_form_detail_form_names_inner_1));
	pokemon_form_detail_form_names_inner_t* pokemon_form_detail_form_names_inner_2 = pokemon_form_detail_form_names_inner_parseFromJSON(jsonpokemon_form_detail_form_names_inner_1);
	cJSON* jsonpokemon_form_detail_form_names_inner_2 = pokemon_form_detail_form_names_inner_convertToJSON(pokemon_form_detail_form_names_inner_2);
	printf("repeating pokemon_form_detail_form_names_inner:\n%s\n", cJSON_Print(jsonpokemon_form_detail_form_names_inner_2));
}

int main() {
  test_pokemon_form_detail_form_names_inner(1);
  test_pokemon_form_detail_form_names_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // pokemon_form_detail_form_names_inner_MAIN
#endif // pokemon_form_detail_form_names_inner_TEST
