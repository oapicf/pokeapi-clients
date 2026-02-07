#ifndef item_attribute_detail_TEST
#define item_attribute_detail_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define item_attribute_detail_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/item_attribute_detail.h"
item_attribute_detail_t* instantiate_item_attribute_detail(int include_optional);



item_attribute_detail_t* instantiate_item_attribute_detail(int include_optional) {
  item_attribute_detail_t* item_attribute_detail = NULL;
  if (include_optional) {
    item_attribute_detail = item_attribute_detail_create(
      56,
      "0",
      list_createList(),
      list_createList(),
      list_createList()
    );
  } else {
    item_attribute_detail = item_attribute_detail_create(
      56,
      "0",
      list_createList(),
      list_createList(),
      list_createList()
    );
  }

  return item_attribute_detail;
}


#ifdef item_attribute_detail_MAIN

void test_item_attribute_detail(int include_optional) {
    item_attribute_detail_t* item_attribute_detail_1 = instantiate_item_attribute_detail(include_optional);

	cJSON* jsonitem_attribute_detail_1 = item_attribute_detail_convertToJSON(item_attribute_detail_1);
	printf("item_attribute_detail :\n%s\n", cJSON_Print(jsonitem_attribute_detail_1));
	item_attribute_detail_t* item_attribute_detail_2 = item_attribute_detail_parseFromJSON(jsonitem_attribute_detail_1);
	cJSON* jsonitem_attribute_detail_2 = item_attribute_detail_convertToJSON(item_attribute_detail_2);
	printf("repeating item_attribute_detail:\n%s\n", cJSON_Print(jsonitem_attribute_detail_2));
}

int main() {
  test_item_attribute_detail(1);
  test_item_attribute_detail(0);

  printf("Hello world \n");
  return 0;
}

#endif // item_attribute_detail_MAIN
#endif // item_attribute_detail_TEST
