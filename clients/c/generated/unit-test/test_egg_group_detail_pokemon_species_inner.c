#ifndef egg_group_detail_pokemon_species_inner_TEST
#define egg_group_detail_pokemon_species_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define egg_group_detail_pokemon_species_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/egg_group_detail_pokemon_species_inner.h"
egg_group_detail_pokemon_species_inner_t* instantiate_egg_group_detail_pokemon_species_inner(int include_optional);



egg_group_detail_pokemon_species_inner_t* instantiate_egg_group_detail_pokemon_species_inner(int include_optional) {
  egg_group_detail_pokemon_species_inner_t* egg_group_detail_pokemon_species_inner = NULL;
  if (include_optional) {
    egg_group_detail_pokemon_species_inner = egg_group_detail_pokemon_species_inner_create(
      "0",
      "0"
    );
  } else {
    egg_group_detail_pokemon_species_inner = egg_group_detail_pokemon_species_inner_create(
      "0",
      "0"
    );
  }

  return egg_group_detail_pokemon_species_inner;
}


#ifdef egg_group_detail_pokemon_species_inner_MAIN

void test_egg_group_detail_pokemon_species_inner(int include_optional) {
    egg_group_detail_pokemon_species_inner_t* egg_group_detail_pokemon_species_inner_1 = instantiate_egg_group_detail_pokemon_species_inner(include_optional);

	cJSON* jsonegg_group_detail_pokemon_species_inner_1 = egg_group_detail_pokemon_species_inner_convertToJSON(egg_group_detail_pokemon_species_inner_1);
	printf("egg_group_detail_pokemon_species_inner :\n%s\n", cJSON_Print(jsonegg_group_detail_pokemon_species_inner_1));
	egg_group_detail_pokemon_species_inner_t* egg_group_detail_pokemon_species_inner_2 = egg_group_detail_pokemon_species_inner_parseFromJSON(jsonegg_group_detail_pokemon_species_inner_1);
	cJSON* jsonegg_group_detail_pokemon_species_inner_2 = egg_group_detail_pokemon_species_inner_convertToJSON(egg_group_detail_pokemon_species_inner_2);
	printf("repeating egg_group_detail_pokemon_species_inner:\n%s\n", cJSON_Print(jsonegg_group_detail_pokemon_species_inner_2));
}

int main() {
  test_egg_group_detail_pokemon_species_inner(1);
  test_egg_group_detail_pokemon_species_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // egg_group_detail_pokemon_species_inner_MAIN
#endif // egg_group_detail_pokemon_species_inner_TEST
