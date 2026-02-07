#ifndef item_game_index_TEST
#define item_game_index_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define item_game_index_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/item_game_index.h"
item_game_index_t* instantiate_item_game_index(int include_optional);

#include "test_generation_summary.c"


item_game_index_t* instantiate_item_game_index(int include_optional) {
  item_game_index_t* item_game_index = NULL;
  if (include_optional) {
    item_game_index = item_game_index_create(
      56,
       // false, not to have infinite recursion
      instantiate_generation_summary(0)
    );
  } else {
    item_game_index = item_game_index_create(
      56,
      NULL
    );
  }

  return item_game_index;
}


#ifdef item_game_index_MAIN

void test_item_game_index(int include_optional) {
    item_game_index_t* item_game_index_1 = instantiate_item_game_index(include_optional);

	cJSON* jsonitem_game_index_1 = item_game_index_convertToJSON(item_game_index_1);
	printf("item_game_index :\n%s\n", cJSON_Print(jsonitem_game_index_1));
	item_game_index_t* item_game_index_2 = item_game_index_parseFromJSON(jsonitem_game_index_1);
	cJSON* jsonitem_game_index_2 = item_game_index_convertToJSON(item_game_index_2);
	printf("repeating item_game_index:\n%s\n", cJSON_Print(jsonitem_game_index_2));
}

int main() {
  test_item_game_index(1);
  test_item_game_index(0);

  printf("Hello world \n");
  return 0;
}

#endif // item_game_index_MAIN
#endif // item_game_index_TEST
