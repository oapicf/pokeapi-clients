#ifndef item_detail_machines_inner_TEST
#define item_detail_machines_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define item_detail_machines_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/item_detail_machines_inner.h"
item_detail_machines_inner_t* instantiate_item_detail_machines_inner(int include_optional);

#include "test_ability_detail_pokemon_inner_pokemon.c"


item_detail_machines_inner_t* instantiate_item_detail_machines_inner(int include_optional) {
  item_detail_machines_inner_t* item_detail_machines_inner = NULL;
  if (include_optional) {
    item_detail_machines_inner = item_detail_machines_inner_create(
      "0",
       // false, not to have infinite recursion
      instantiate_ability_detail_pokemon_inner_pokemon(0)
    );
  } else {
    item_detail_machines_inner = item_detail_machines_inner_create(
      "0",
      NULL
    );
  }

  return item_detail_machines_inner;
}


#ifdef item_detail_machines_inner_MAIN

void test_item_detail_machines_inner(int include_optional) {
    item_detail_machines_inner_t* item_detail_machines_inner_1 = instantiate_item_detail_machines_inner(include_optional);

	cJSON* jsonitem_detail_machines_inner_1 = item_detail_machines_inner_convertToJSON(item_detail_machines_inner_1);
	printf("item_detail_machines_inner :\n%s\n", cJSON_Print(jsonitem_detail_machines_inner_1));
	item_detail_machines_inner_t* item_detail_machines_inner_2 = item_detail_machines_inner_parseFromJSON(jsonitem_detail_machines_inner_1);
	cJSON* jsonitem_detail_machines_inner_2 = item_detail_machines_inner_convertToJSON(item_detail_machines_inner_2);
	printf("repeating item_detail_machines_inner:\n%s\n", cJSON_Print(jsonitem_detail_machines_inner_2));
}

int main() {
  test_item_detail_machines_inner(1);
  test_item_detail_machines_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // item_detail_machines_inner_MAIN
#endif // item_detail_machines_inner_TEST
