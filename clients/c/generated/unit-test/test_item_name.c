#ifndef item_name_TEST
#define item_name_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define item_name_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/item_name.h"
item_name_t* instantiate_item_name(int include_optional);

#include "test_language_summary.c"


item_name_t* instantiate_item_name(int include_optional) {
  item_name_t* item_name = NULL;
  if (include_optional) {
    item_name = item_name_create(
      "0",
       // false, not to have infinite recursion
      instantiate_language_summary(0)
    );
  } else {
    item_name = item_name_create(
      "0",
      NULL
    );
  }

  return item_name;
}


#ifdef item_name_MAIN

void test_item_name(int include_optional) {
    item_name_t* item_name_1 = instantiate_item_name(include_optional);

	cJSON* jsonitem_name_1 = item_name_convertToJSON(item_name_1);
	printf("item_name :\n%s\n", cJSON_Print(jsonitem_name_1));
	item_name_t* item_name_2 = item_name_parseFromJSON(jsonitem_name_1);
	cJSON* jsonitem_name_2 = item_name_convertToJSON(item_name_2);
	printf("repeating item_name:\n%s\n", cJSON_Print(jsonitem_name_2));
}

int main() {
  test_item_name(1);
  test_item_name(0);

  printf("Hello world \n");
  return 0;
}

#endif // item_name_MAIN
#endif // item_name_TEST
