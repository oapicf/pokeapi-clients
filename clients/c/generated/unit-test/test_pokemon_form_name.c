#ifndef pokemon_form_name_TEST
#define pokemon_form_name_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pokemon_form_name_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pokemon_form_name.h"
pokemon_form_name_t* instantiate_pokemon_form_name(int include_optional);

#include "test_language_summary.c"


pokemon_form_name_t* instantiate_pokemon_form_name(int include_optional) {
  pokemon_form_name_t* pokemon_form_name = NULL;
  if (include_optional) {
    pokemon_form_name = pokemon_form_name_create(
      "0",
       // false, not to have infinite recursion
      instantiate_language_summary(0)
    );
  } else {
    pokemon_form_name = pokemon_form_name_create(
      "0",
      NULL
    );
  }

  return pokemon_form_name;
}


#ifdef pokemon_form_name_MAIN

void test_pokemon_form_name(int include_optional) {
    pokemon_form_name_t* pokemon_form_name_1 = instantiate_pokemon_form_name(include_optional);

	cJSON* jsonpokemon_form_name_1 = pokemon_form_name_convertToJSON(pokemon_form_name_1);
	printf("pokemon_form_name :\n%s\n", cJSON_Print(jsonpokemon_form_name_1));
	pokemon_form_name_t* pokemon_form_name_2 = pokemon_form_name_parseFromJSON(jsonpokemon_form_name_1);
	cJSON* jsonpokemon_form_name_2 = pokemon_form_name_convertToJSON(pokemon_form_name_2);
	printf("repeating pokemon_form_name:\n%s\n", cJSON_Print(jsonpokemon_form_name_2));
}

int main() {
  test_pokemon_form_name(1);
  test_pokemon_form_name(0);

  printf("Hello world \n");
  return 0;
}

#endif // pokemon_form_name_MAIN
#endif // pokemon_form_name_TEST
