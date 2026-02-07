#ifndef pokemon_summary_TEST
#define pokemon_summary_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pokemon_summary_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pokemon_summary.h"
pokemon_summary_t* instantiate_pokemon_summary(int include_optional);



pokemon_summary_t* instantiate_pokemon_summary(int include_optional) {
  pokemon_summary_t* pokemon_summary = NULL;
  if (include_optional) {
    pokemon_summary = pokemon_summary_create(
      "0",
      "0"
    );
  } else {
    pokemon_summary = pokemon_summary_create(
      "0",
      "0"
    );
  }

  return pokemon_summary;
}


#ifdef pokemon_summary_MAIN

void test_pokemon_summary(int include_optional) {
    pokemon_summary_t* pokemon_summary_1 = instantiate_pokemon_summary(include_optional);

	cJSON* jsonpokemon_summary_1 = pokemon_summary_convertToJSON(pokemon_summary_1);
	printf("pokemon_summary :\n%s\n", cJSON_Print(jsonpokemon_summary_1));
	pokemon_summary_t* pokemon_summary_2 = pokemon_summary_parseFromJSON(jsonpokemon_summary_1);
	cJSON* jsonpokemon_summary_2 = pokemon_summary_convertToJSON(pokemon_summary_2);
	printf("repeating pokemon_summary:\n%s\n", cJSON_Print(jsonpokemon_summary_2));
}

int main() {
  test_pokemon_summary(1);
  test_pokemon_summary(0);

  printf("Hello world \n");
  return 0;
}

#endif // pokemon_summary_MAIN
#endif // pokemon_summary_TEST
