#ifndef pokemon_shape_detail_TEST
#define pokemon_shape_detail_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pokemon_shape_detail_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pokemon_shape_detail.h"
pokemon_shape_detail_t* instantiate_pokemon_shape_detail(int include_optional);



pokemon_shape_detail_t* instantiate_pokemon_shape_detail(int include_optional) {
  pokemon_shape_detail_t* pokemon_shape_detail = NULL;
  if (include_optional) {
    pokemon_shape_detail = pokemon_shape_detail_create(
      56,
      "0",
      list_createList(),
      list_createList(),
      list_createList()
    );
  } else {
    pokemon_shape_detail = pokemon_shape_detail_create(
      56,
      "0",
      list_createList(),
      list_createList(),
      list_createList()
    );
  }

  return pokemon_shape_detail;
}


#ifdef pokemon_shape_detail_MAIN

void test_pokemon_shape_detail(int include_optional) {
    pokemon_shape_detail_t* pokemon_shape_detail_1 = instantiate_pokemon_shape_detail(include_optional);

	cJSON* jsonpokemon_shape_detail_1 = pokemon_shape_detail_convertToJSON(pokemon_shape_detail_1);
	printf("pokemon_shape_detail :\n%s\n", cJSON_Print(jsonpokemon_shape_detail_1));
	pokemon_shape_detail_t* pokemon_shape_detail_2 = pokemon_shape_detail_parseFromJSON(jsonpokemon_shape_detail_1);
	cJSON* jsonpokemon_shape_detail_2 = pokemon_shape_detail_convertToJSON(pokemon_shape_detail_2);
	printf("repeating pokemon_shape_detail:\n%s\n", cJSON_Print(jsonpokemon_shape_detail_2));
}

int main() {
  test_pokemon_shape_detail(1);
  test_pokemon_shape_detail(0);

  printf("Hello world \n");
  return 0;
}

#endif // pokemon_shape_detail_MAIN
#endif // pokemon_shape_detail_TEST
