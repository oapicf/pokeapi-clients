#ifndef pokemon_color_summary_TEST
#define pokemon_color_summary_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pokemon_color_summary_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pokemon_color_summary.h"
pokemon_color_summary_t* instantiate_pokemon_color_summary(int include_optional);



pokemon_color_summary_t* instantiate_pokemon_color_summary(int include_optional) {
  pokemon_color_summary_t* pokemon_color_summary = NULL;
  if (include_optional) {
    pokemon_color_summary = pokemon_color_summary_create(
      "0",
      "0"
    );
  } else {
    pokemon_color_summary = pokemon_color_summary_create(
      "0",
      "0"
    );
  }

  return pokemon_color_summary;
}


#ifdef pokemon_color_summary_MAIN

void test_pokemon_color_summary(int include_optional) {
    pokemon_color_summary_t* pokemon_color_summary_1 = instantiate_pokemon_color_summary(include_optional);

	cJSON* jsonpokemon_color_summary_1 = pokemon_color_summary_convertToJSON(pokemon_color_summary_1);
	printf("pokemon_color_summary :\n%s\n", cJSON_Print(jsonpokemon_color_summary_1));
	pokemon_color_summary_t* pokemon_color_summary_2 = pokemon_color_summary_parseFromJSON(jsonpokemon_color_summary_1);
	cJSON* jsonpokemon_color_summary_2 = pokemon_color_summary_convertToJSON(pokemon_color_summary_2);
	printf("repeating pokemon_color_summary:\n%s\n", cJSON_Print(jsonpokemon_color_summary_2));
}

int main() {
  test_pokemon_color_summary(1);
  test_pokemon_color_summary(0);

  printf("Hello world \n");
  return 0;
}

#endif // pokemon_color_summary_MAIN
#endif // pokemon_color_summary_TEST
