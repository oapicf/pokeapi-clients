#ifndef pokemon_habitat_name_TEST
#define pokemon_habitat_name_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pokemon_habitat_name_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pokemon_habitat_name.h"
pokemon_habitat_name_t* instantiate_pokemon_habitat_name(int include_optional);

#include "test_language_summary.c"


pokemon_habitat_name_t* instantiate_pokemon_habitat_name(int include_optional) {
  pokemon_habitat_name_t* pokemon_habitat_name = NULL;
  if (include_optional) {
    pokemon_habitat_name = pokemon_habitat_name_create(
      "0",
       // false, not to have infinite recursion
      instantiate_language_summary(0)
    );
  } else {
    pokemon_habitat_name = pokemon_habitat_name_create(
      "0",
      NULL
    );
  }

  return pokemon_habitat_name;
}


#ifdef pokemon_habitat_name_MAIN

void test_pokemon_habitat_name(int include_optional) {
    pokemon_habitat_name_t* pokemon_habitat_name_1 = instantiate_pokemon_habitat_name(include_optional);

	cJSON* jsonpokemon_habitat_name_1 = pokemon_habitat_name_convertToJSON(pokemon_habitat_name_1);
	printf("pokemon_habitat_name :\n%s\n", cJSON_Print(jsonpokemon_habitat_name_1));
	pokemon_habitat_name_t* pokemon_habitat_name_2 = pokemon_habitat_name_parseFromJSON(jsonpokemon_habitat_name_1);
	cJSON* jsonpokemon_habitat_name_2 = pokemon_habitat_name_convertToJSON(pokemon_habitat_name_2);
	printf("repeating pokemon_habitat_name:\n%s\n", cJSON_Print(jsonpokemon_habitat_name_2));
}

int main() {
  test_pokemon_habitat_name(1);
  test_pokemon_habitat_name(0);

  printf("Hello world \n");
  return 0;
}

#endif // pokemon_habitat_name_MAIN
#endif // pokemon_habitat_name_TEST
