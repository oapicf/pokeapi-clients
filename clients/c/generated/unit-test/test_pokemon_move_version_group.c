#ifndef pokemon_move_version_group_TEST
#define pokemon_move_version_group_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pokemon_move_version_group_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pokemon_move_version_group.h"
pokemon_move_version_group_t* instantiate_pokemon_move_version_group(int include_optional);

#include "test_move_learn_method_summary.c"
#include "test_version_group_summary.c"


pokemon_move_version_group_t* instantiate_pokemon_move_version_group(int include_optional) {
  pokemon_move_version_group_t* pokemon_move_version_group = NULL;
  if (include_optional) {
    pokemon_move_version_group = pokemon_move_version_group_create(
      56,
       // false, not to have infinite recursion
      instantiate_move_learn_method_summary(0),
       // false, not to have infinite recursion
      instantiate_version_group_summary(0),
      56
    );
  } else {
    pokemon_move_version_group = pokemon_move_version_group_create(
      56,
      NULL,
      NULL,
      56
    );
  }

  return pokemon_move_version_group;
}


#ifdef pokemon_move_version_group_MAIN

void test_pokemon_move_version_group(int include_optional) {
    pokemon_move_version_group_t* pokemon_move_version_group_1 = instantiate_pokemon_move_version_group(include_optional);

	cJSON* jsonpokemon_move_version_group_1 = pokemon_move_version_group_convertToJSON(pokemon_move_version_group_1);
	printf("pokemon_move_version_group :\n%s\n", cJSON_Print(jsonpokemon_move_version_group_1));
	pokemon_move_version_group_t* pokemon_move_version_group_2 = pokemon_move_version_group_parseFromJSON(jsonpokemon_move_version_group_1);
	cJSON* jsonpokemon_move_version_group_2 = pokemon_move_version_group_convertToJSON(pokemon_move_version_group_2);
	printf("repeating pokemon_move_version_group:\n%s\n", cJSON_Print(jsonpokemon_move_version_group_2));
}

int main() {
  test_pokemon_move_version_group(1);
  test_pokemon_move_version_group(0);

  printf("Hello world \n");
  return 0;
}

#endif // pokemon_move_version_group_MAIN
#endif // pokemon_move_version_group_TEST
