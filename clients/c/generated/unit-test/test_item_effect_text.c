#ifndef item_effect_text_TEST
#define item_effect_text_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define item_effect_text_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/item_effect_text.h"
item_effect_text_t* instantiate_item_effect_text(int include_optional);

#include "test_language_summary.c"


item_effect_text_t* instantiate_item_effect_text(int include_optional) {
  item_effect_text_t* item_effect_text = NULL;
  if (include_optional) {
    item_effect_text = item_effect_text_create(
      "0",
      "0",
       // false, not to have infinite recursion
      instantiate_language_summary(0)
    );
  } else {
    item_effect_text = item_effect_text_create(
      "0",
      "0",
      NULL
    );
  }

  return item_effect_text;
}


#ifdef item_effect_text_MAIN

void test_item_effect_text(int include_optional) {
    item_effect_text_t* item_effect_text_1 = instantiate_item_effect_text(include_optional);

	cJSON* jsonitem_effect_text_1 = item_effect_text_convertToJSON(item_effect_text_1);
	printf("item_effect_text :\n%s\n", cJSON_Print(jsonitem_effect_text_1));
	item_effect_text_t* item_effect_text_2 = item_effect_text_parseFromJSON(jsonitem_effect_text_1);
	cJSON* jsonitem_effect_text_2 = item_effect_text_convertToJSON(item_effect_text_2);
	printf("repeating item_effect_text:\n%s\n", cJSON_Print(jsonitem_effect_text_2));
}

int main() {
  test_item_effect_text(1);
  test_item_effect_text(0);

  printf("Hello world \n");
  return 0;
}

#endif // item_effect_text_MAIN
#endif // item_effect_text_TEST
