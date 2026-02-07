#ifndef item_category_summary_TEST
#define item_category_summary_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define item_category_summary_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/item_category_summary.h"
item_category_summary_t* instantiate_item_category_summary(int include_optional);



item_category_summary_t* instantiate_item_category_summary(int include_optional) {
  item_category_summary_t* item_category_summary = NULL;
  if (include_optional) {
    item_category_summary = item_category_summary_create(
      "0",
      "0"
    );
  } else {
    item_category_summary = item_category_summary_create(
      "0",
      "0"
    );
  }

  return item_category_summary;
}


#ifdef item_category_summary_MAIN

void test_item_category_summary(int include_optional) {
    item_category_summary_t* item_category_summary_1 = instantiate_item_category_summary(include_optional);

	cJSON* jsonitem_category_summary_1 = item_category_summary_convertToJSON(item_category_summary_1);
	printf("item_category_summary :\n%s\n", cJSON_Print(jsonitem_category_summary_1));
	item_category_summary_t* item_category_summary_2 = item_category_summary_parseFromJSON(jsonitem_category_summary_1);
	cJSON* jsonitem_category_summary_2 = item_category_summary_convertToJSON(item_category_summary_2);
	printf("repeating item_category_summary:\n%s\n", cJSON_Print(jsonitem_category_summary_2));
}

int main() {
  test_item_category_summary(1);
  test_item_category_summary(0);

  printf("Hello world \n");
  return 0;
}

#endif // item_category_summary_MAIN
#endif // item_category_summary_TEST
