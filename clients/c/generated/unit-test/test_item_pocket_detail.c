#ifndef item_pocket_detail_TEST
#define item_pocket_detail_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define item_pocket_detail_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/item_pocket_detail.h"
item_pocket_detail_t* instantiate_item_pocket_detail(int include_optional);



item_pocket_detail_t* instantiate_item_pocket_detail(int include_optional) {
  item_pocket_detail_t* item_pocket_detail = NULL;
  if (include_optional) {
    item_pocket_detail = item_pocket_detail_create(
      56,
      "0",
      list_createList(),
      list_createList()
    );
  } else {
    item_pocket_detail = item_pocket_detail_create(
      56,
      "0",
      list_createList(),
      list_createList()
    );
  }

  return item_pocket_detail;
}


#ifdef item_pocket_detail_MAIN

void test_item_pocket_detail(int include_optional) {
    item_pocket_detail_t* item_pocket_detail_1 = instantiate_item_pocket_detail(include_optional);

	cJSON* jsonitem_pocket_detail_1 = item_pocket_detail_convertToJSON(item_pocket_detail_1);
	printf("item_pocket_detail :\n%s\n", cJSON_Print(jsonitem_pocket_detail_1));
	item_pocket_detail_t* item_pocket_detail_2 = item_pocket_detail_parseFromJSON(jsonitem_pocket_detail_1);
	cJSON* jsonitem_pocket_detail_2 = item_pocket_detail_convertToJSON(item_pocket_detail_2);
	printf("repeating item_pocket_detail:\n%s\n", cJSON_Print(jsonitem_pocket_detail_2));
}

int main() {
  test_item_pocket_detail(1);
  test_item_pocket_detail(0);

  printf("Hello world \n");
  return 0;
}

#endif // item_pocket_detail_MAIN
#endif // item_pocket_detail_TEST
