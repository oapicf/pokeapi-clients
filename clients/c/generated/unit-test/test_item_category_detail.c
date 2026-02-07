#ifndef item_category_detail_TEST
#define item_category_detail_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define item_category_detail_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/item_category_detail.h"
item_category_detail_t* instantiate_item_category_detail(int include_optional);

#include "test_item_pocket_summary.c"


item_category_detail_t* instantiate_item_category_detail(int include_optional) {
  item_category_detail_t* item_category_detail = NULL;
  if (include_optional) {
    item_category_detail = item_category_detail_create(
      56,
      "0",
      list_createList(),
      list_createList(),
       // false, not to have infinite recursion
      instantiate_item_pocket_summary(0)
    );
  } else {
    item_category_detail = item_category_detail_create(
      56,
      "0",
      list_createList(),
      list_createList(),
      NULL
    );
  }

  return item_category_detail;
}


#ifdef item_category_detail_MAIN

void test_item_category_detail(int include_optional) {
    item_category_detail_t* item_category_detail_1 = instantiate_item_category_detail(include_optional);

	cJSON* jsonitem_category_detail_1 = item_category_detail_convertToJSON(item_category_detail_1);
	printf("item_category_detail :\n%s\n", cJSON_Print(jsonitem_category_detail_1));
	item_category_detail_t* item_category_detail_2 = item_category_detail_parseFromJSON(jsonitem_category_detail_1);
	cJSON* jsonitem_category_detail_2 = item_category_detail_convertToJSON(item_category_detail_2);
	printf("repeating item_category_detail:\n%s\n", cJSON_Print(jsonitem_category_detail_2));
}

int main() {
  test_item_category_detail(1);
  test_item_category_detail(0);

  printf("Hello world \n");
  return 0;
}

#endif // item_category_detail_MAIN
#endif // item_category_detail_TEST
