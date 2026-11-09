#ifndef pokemon_form_trigger_condition_TEST
#define pokemon_form_trigger_condition_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pokemon_form_trigger_condition_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pokemon_form_trigger_condition.h"
pokemon_form_trigger_condition_t* instantiate_pokemon_form_trigger_condition(int include_optional);

#include "test_pokemon_form_summary.c"


pokemon_form_trigger_condition_t* instantiate_pokemon_form_trigger_condition(int include_optional) {
  pokemon_form_trigger_condition_t* pokemon_form_trigger_condition = NULL;
  if (include_optional) {
    pokemon_form_trigger_condition = pokemon_form_trigger_condition_create(
      "0",
      "0",
      "0",
       // false, not to have infinite recursion
      instantiate_pokemon_form_summary(0)
    );
  } else {
    pokemon_form_trigger_condition = pokemon_form_trigger_condition_create(
      "0",
      "0",
      "0",
      NULL
    );
  }

  return pokemon_form_trigger_condition;
}


#ifdef pokemon_form_trigger_condition_MAIN

void test_pokemon_form_trigger_condition(int include_optional) {
    pokemon_form_trigger_condition_t* pokemon_form_trigger_condition_1 = instantiate_pokemon_form_trigger_condition(include_optional);

	cJSON* jsonpokemon_form_trigger_condition_1 = pokemon_form_trigger_condition_convertToJSON(pokemon_form_trigger_condition_1);
	printf("pokemon_form_trigger_condition :\n%s\n", cJSON_Print(jsonpokemon_form_trigger_condition_1));
	pokemon_form_trigger_condition_t* pokemon_form_trigger_condition_2 = pokemon_form_trigger_condition_parseFromJSON(jsonpokemon_form_trigger_condition_1);
	cJSON* jsonpokemon_form_trigger_condition_2 = pokemon_form_trigger_condition_convertToJSON(pokemon_form_trigger_condition_2);
	printf("repeating pokemon_form_trigger_condition:\n%s\n", cJSON_Print(jsonpokemon_form_trigger_condition_2));
}

int main() {
  test_pokemon_form_trigger_condition(1);
  test_pokemon_form_trigger_condition(0);

  printf("Hello world \n");
  return 0;
}

#endif // pokemon_form_trigger_condition_MAIN
#endif // pokemon_form_trigger_condition_TEST
