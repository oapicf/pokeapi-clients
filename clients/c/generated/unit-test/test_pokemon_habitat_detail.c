#ifndef pokemon_habitat_detail_TEST
#define pokemon_habitat_detail_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pokemon_habitat_detail_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pokemon_habitat_detail.h"
pokemon_habitat_detail_t* instantiate_pokemon_habitat_detail(int include_optional);



pokemon_habitat_detail_t* instantiate_pokemon_habitat_detail(int include_optional) {
  pokemon_habitat_detail_t* pokemon_habitat_detail = NULL;
  if (include_optional) {
    pokemon_habitat_detail = pokemon_habitat_detail_create(
      56,
      "0",
      list_createList(),
      list_createList()
    );
  } else {
    pokemon_habitat_detail = pokemon_habitat_detail_create(
      56,
      "0",
      list_createList(),
      list_createList()
    );
  }

  return pokemon_habitat_detail;
}


#ifdef pokemon_habitat_detail_MAIN

void test_pokemon_habitat_detail(int include_optional) {
    pokemon_habitat_detail_t* pokemon_habitat_detail_1 = instantiate_pokemon_habitat_detail(include_optional);

	cJSON* jsonpokemon_habitat_detail_1 = pokemon_habitat_detail_convertToJSON(pokemon_habitat_detail_1);
	printf("pokemon_habitat_detail :\n%s\n", cJSON_Print(jsonpokemon_habitat_detail_1));
	pokemon_habitat_detail_t* pokemon_habitat_detail_2 = pokemon_habitat_detail_parseFromJSON(jsonpokemon_habitat_detail_1);
	cJSON* jsonpokemon_habitat_detail_2 = pokemon_habitat_detail_convertToJSON(pokemon_habitat_detail_2);
	printf("repeating pokemon_habitat_detail:\n%s\n", cJSON_Print(jsonpokemon_habitat_detail_2));
}

int main() {
  test_pokemon_habitat_detail(1);
  test_pokemon_habitat_detail(0);

  printf("Hello world \n");
  return 0;
}

#endif // pokemon_habitat_detail_MAIN
#endif // pokemon_habitat_detail_TEST
