#ifndef pokemon_cries_TEST
#define pokemon_cries_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pokemon_cries_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pokemon_cries.h"
pokemon_cries_t* instantiate_pokemon_cries(int include_optional);



pokemon_cries_t* instantiate_pokemon_cries(int include_optional) {
  pokemon_cries_t* pokemon_cries = NULL;
  if (include_optional) {
    pokemon_cries = pokemon_cries_create(
      "0",
      "0"
    );
  } else {
    pokemon_cries = pokemon_cries_create(
      "0",
      "0"
    );
  }

  return pokemon_cries;
}


#ifdef pokemon_cries_MAIN

void test_pokemon_cries(int include_optional) {
    pokemon_cries_t* pokemon_cries_1 = instantiate_pokemon_cries(include_optional);

	cJSON* jsonpokemon_cries_1 = pokemon_cries_convertToJSON(pokemon_cries_1);
	printf("pokemon_cries :\n%s\n", cJSON_Print(jsonpokemon_cries_1));
	pokemon_cries_t* pokemon_cries_2 = pokemon_cries_parseFromJSON(jsonpokemon_cries_1);
	cJSON* jsonpokemon_cries_2 = pokemon_cries_convertToJSON(pokemon_cries_2);
	printf("repeating pokemon_cries:\n%s\n", cJSON_Print(jsonpokemon_cries_2));
}

int main() {
  test_pokemon_cries(1);
  test_pokemon_cries(0);

  printf("Hello world \n");
  return 0;
}

#endif // pokemon_cries_MAIN
#endif // pokemon_cries_TEST
