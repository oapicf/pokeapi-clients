#ifndef pokemon_detail_cries_TEST
#define pokemon_detail_cries_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pokemon_detail_cries_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pokemon_detail_cries.h"
pokemon_detail_cries_t* instantiate_pokemon_detail_cries(int include_optional);



pokemon_detail_cries_t* instantiate_pokemon_detail_cries(int include_optional) {
  pokemon_detail_cries_t* pokemon_detail_cries = NULL;
  if (include_optional) {
    pokemon_detail_cries = pokemon_detail_cries_create(
      "0",
      "0"
    );
  } else {
    pokemon_detail_cries = pokemon_detail_cries_create(
      "0",
      "0"
    );
  }

  return pokemon_detail_cries;
}


#ifdef pokemon_detail_cries_MAIN

void test_pokemon_detail_cries(int include_optional) {
    pokemon_detail_cries_t* pokemon_detail_cries_1 = instantiate_pokemon_detail_cries(include_optional);

	cJSON* jsonpokemon_detail_cries_1 = pokemon_detail_cries_convertToJSON(pokemon_detail_cries_1);
	printf("pokemon_detail_cries :\n%s\n", cJSON_Print(jsonpokemon_detail_cries_1));
	pokemon_detail_cries_t* pokemon_detail_cries_2 = pokemon_detail_cries_parseFromJSON(jsonpokemon_detail_cries_1);
	cJSON* jsonpokemon_detail_cries_2 = pokemon_detail_cries_convertToJSON(pokemon_detail_cries_2);
	printf("repeating pokemon_detail_cries:\n%s\n", cJSON_Print(jsonpokemon_detail_cries_2));
}

int main() {
  test_pokemon_detail_cries(1);
  test_pokemon_detail_cries(0);

  printf("Hello world \n");
  return 0;
}

#endif // pokemon_detail_cries_MAIN
#endif // pokemon_detail_cries_TEST
