#ifndef item_flavor_text_TEST
#define item_flavor_text_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define item_flavor_text_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/item_flavor_text.h"
item_flavor_text_t* instantiate_item_flavor_text(int include_optional);

#include "test_version_group_summary.c"
#include "test_language_summary.c"


item_flavor_text_t* instantiate_item_flavor_text(int include_optional) {
  item_flavor_text_t* item_flavor_text = NULL;
  if (include_optional) {
    item_flavor_text = item_flavor_text_create(
      "0",
       // false, not to have infinite recursion
      instantiate_version_group_summary(0),
       // false, not to have infinite recursion
      instantiate_language_summary(0)
    );
  } else {
    item_flavor_text = item_flavor_text_create(
      "0",
      NULL,
      NULL
    );
  }

  return item_flavor_text;
}


#ifdef item_flavor_text_MAIN

void test_item_flavor_text(int include_optional) {
    item_flavor_text_t* item_flavor_text_1 = instantiate_item_flavor_text(include_optional);

	cJSON* jsonitem_flavor_text_1 = item_flavor_text_convertToJSON(item_flavor_text_1);
	printf("item_flavor_text :\n%s\n", cJSON_Print(jsonitem_flavor_text_1));
	item_flavor_text_t* item_flavor_text_2 = item_flavor_text_parseFromJSON(jsonitem_flavor_text_1);
	cJSON* jsonitem_flavor_text_2 = item_flavor_text_convertToJSON(item_flavor_text_2);
	printf("repeating item_flavor_text:\n%s\n", cJSON_Print(jsonitem_flavor_text_2));
}

int main() {
  test_item_flavor_text(1);
  test_item_flavor_text(0);

  printf("Hello world \n");
  return 0;
}

#endif // item_flavor_text_MAIN
#endif // item_flavor_text_TEST
