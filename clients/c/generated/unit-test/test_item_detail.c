#ifndef item_detail_TEST
#define item_detail_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define item_detail_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/item_detail.h"
item_detail_t* instantiate_item_detail(int include_optional);

#include "test_item_fling_effect_summary.c"
#include "test_item_category_summary.c"
#include "test_item_detail_sprites.c"
#include "test_item_detail_baby_trigger_for.c"


item_detail_t* instantiate_item_detail(int include_optional) {
  item_detail_t* item_detail = NULL;
  if (include_optional) {
    item_detail = item_detail_create(
      56,
      "0",
      56,
      56,
       // false, not to have infinite recursion
      instantiate_item_fling_effect_summary(0),
      list_createList(),
       // false, not to have infinite recursion
      instantiate_item_category_summary(0),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
       // false, not to have infinite recursion
      instantiate_item_detail_sprites(0),
       // false, not to have infinite recursion
      instantiate_item_detail_baby_trigger_for(0),
      list_createList()
    );
  } else {
    item_detail = item_detail_create(
      56,
      "0",
      56,
      56,
      NULL,
      list_createList(),
      NULL,
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      NULL,
      NULL,
      list_createList()
    );
  }

  return item_detail;
}


#ifdef item_detail_MAIN

void test_item_detail(int include_optional) {
    item_detail_t* item_detail_1 = instantiate_item_detail(include_optional);

	cJSON* jsonitem_detail_1 = item_detail_convertToJSON(item_detail_1);
	printf("item_detail :\n%s\n", cJSON_Print(jsonitem_detail_1));
	item_detail_t* item_detail_2 = item_detail_parseFromJSON(jsonitem_detail_1);
	cJSON* jsonitem_detail_2 = item_detail_convertToJSON(item_detail_2);
	printf("repeating item_detail:\n%s\n", cJSON_Print(jsonitem_detail_2));
}

int main() {
  test_item_detail(1);
  test_item_detail(0);

  printf("Hello world \n");
  return 0;
}

#endif // item_detail_MAIN
#endif // item_detail_TEST
