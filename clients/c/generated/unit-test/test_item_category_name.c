#ifndef item_category_name_TEST
#define item_category_name_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define item_category_name_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/item_category_name.h"
item_category_name_t* instantiate_item_category_name(int include_optional);

#include "test_language_summary.c"


item_category_name_t* instantiate_item_category_name(int include_optional) {
  item_category_name_t* item_category_name = NULL;
  if (include_optional) {
    item_category_name = item_category_name_create(
      "0",
       // false, not to have infinite recursion
      instantiate_language_summary(0)
    );
  } else {
    item_category_name = item_category_name_create(
      "0",
      NULL
    );
  }

  return item_category_name;
}


#ifdef item_category_name_MAIN

void test_item_category_name(int include_optional) {
    item_category_name_t* item_category_name_1 = instantiate_item_category_name(include_optional);

	cJSON* jsonitem_category_name_1 = item_category_name_convertToJSON(item_category_name_1);
	printf("item_category_name :\n%s\n", cJSON_Print(jsonitem_category_name_1));
	item_category_name_t* item_category_name_2 = item_category_name_parseFromJSON(jsonitem_category_name_1);
	cJSON* jsonitem_category_name_2 = item_category_name_convertToJSON(item_category_name_2);
	printf("repeating item_category_name:\n%s\n", cJSON_Print(jsonitem_category_name_2));
}

int main() {
  test_item_category_name(1);
  test_item_category_name(0);

  printf("Hello world \n");
  return 0;
}

#endif // item_category_name_MAIN
#endif // item_category_name_TEST
