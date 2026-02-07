#ifndef pokemon_shape_summary_TEST
#define pokemon_shape_summary_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pokemon_shape_summary_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pokemon_shape_summary.h"
pokemon_shape_summary_t* instantiate_pokemon_shape_summary(int include_optional);



pokemon_shape_summary_t* instantiate_pokemon_shape_summary(int include_optional) {
  pokemon_shape_summary_t* pokemon_shape_summary = NULL;
  if (include_optional) {
    pokemon_shape_summary = pokemon_shape_summary_create(
      "0",
      "0"
    );
  } else {
    pokemon_shape_summary = pokemon_shape_summary_create(
      "0",
      "0"
    );
  }

  return pokemon_shape_summary;
}


#ifdef pokemon_shape_summary_MAIN

void test_pokemon_shape_summary(int include_optional) {
    pokemon_shape_summary_t* pokemon_shape_summary_1 = instantiate_pokemon_shape_summary(include_optional);

	cJSON* jsonpokemon_shape_summary_1 = pokemon_shape_summary_convertToJSON(pokemon_shape_summary_1);
	printf("pokemon_shape_summary :\n%s\n", cJSON_Print(jsonpokemon_shape_summary_1));
	pokemon_shape_summary_t* pokemon_shape_summary_2 = pokemon_shape_summary_parseFromJSON(jsonpokemon_shape_summary_1);
	cJSON* jsonpokemon_shape_summary_2 = pokemon_shape_summary_convertToJSON(pokemon_shape_summary_2);
	printf("repeating pokemon_shape_summary:\n%s\n", cJSON_Print(jsonpokemon_shape_summary_2));
}

int main() {
  test_pokemon_shape_summary(1);
  test_pokemon_shape_summary(0);

  printf("Hello world \n");
  return 0;
}

#endif // pokemon_shape_summary_MAIN
#endif // pokemon_shape_summary_TEST
