#ifndef pokemon_color_name_TEST
#define pokemon_color_name_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pokemon_color_name_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pokemon_color_name.h"
pokemon_color_name_t* instantiate_pokemon_color_name(int include_optional);

#include "test_language_summary.c"


pokemon_color_name_t* instantiate_pokemon_color_name(int include_optional) {
  pokemon_color_name_t* pokemon_color_name = NULL;
  if (include_optional) {
    pokemon_color_name = pokemon_color_name_create(
      "0",
       // false, not to have infinite recursion
      instantiate_language_summary(0)
    );
  } else {
    pokemon_color_name = pokemon_color_name_create(
      "0",
      NULL
    );
  }

  return pokemon_color_name;
}


#ifdef pokemon_color_name_MAIN

void test_pokemon_color_name(int include_optional) {
    pokemon_color_name_t* pokemon_color_name_1 = instantiate_pokemon_color_name(include_optional);

	cJSON* jsonpokemon_color_name_1 = pokemon_color_name_convertToJSON(pokemon_color_name_1);
	printf("pokemon_color_name :\n%s\n", cJSON_Print(jsonpokemon_color_name_1));
	pokemon_color_name_t* pokemon_color_name_2 = pokemon_color_name_parseFromJSON(jsonpokemon_color_name_1);
	cJSON* jsonpokemon_color_name_2 = pokemon_color_name_convertToJSON(pokemon_color_name_2);
	printf("repeating pokemon_color_name:\n%s\n", cJSON_Print(jsonpokemon_color_name_2));
}

int main() {
  test_pokemon_color_name(1);
  test_pokemon_color_name(0);

  printf("Hello world \n");
  return 0;
}

#endif // pokemon_color_name_MAIN
#endif // pokemon_color_name_TEST
