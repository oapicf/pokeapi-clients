#ifndef item_attribute_description_TEST
#define item_attribute_description_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define item_attribute_description_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/item_attribute_description.h"
item_attribute_description_t* instantiate_item_attribute_description(int include_optional);

#include "test_language_summary.c"


item_attribute_description_t* instantiate_item_attribute_description(int include_optional) {
  item_attribute_description_t* item_attribute_description = NULL;
  if (include_optional) {
    item_attribute_description = item_attribute_description_create(
      "0",
       // false, not to have infinite recursion
      instantiate_language_summary(0)
    );
  } else {
    item_attribute_description = item_attribute_description_create(
      "0",
      NULL
    );
  }

  return item_attribute_description;
}


#ifdef item_attribute_description_MAIN

void test_item_attribute_description(int include_optional) {
    item_attribute_description_t* item_attribute_description_1 = instantiate_item_attribute_description(include_optional);

	cJSON* jsonitem_attribute_description_1 = item_attribute_description_convertToJSON(item_attribute_description_1);
	printf("item_attribute_description :\n%s\n", cJSON_Print(jsonitem_attribute_description_1));
	item_attribute_description_t* item_attribute_description_2 = item_attribute_description_parseFromJSON(jsonitem_attribute_description_1);
	cJSON* jsonitem_attribute_description_2 = item_attribute_description_convertToJSON(item_attribute_description_2);
	printf("repeating item_attribute_description:\n%s\n", cJSON_Print(jsonitem_attribute_description_2));
}

int main() {
  test_item_attribute_description(1);
  test_item_attribute_description(0);

  printf("Hello world \n");
  return 0;
}

#endif // item_attribute_description_MAIN
#endif // item_attribute_description_TEST
