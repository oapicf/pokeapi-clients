#ifndef item_detail_baby_trigger_for_TEST
#define item_detail_baby_trigger_for_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define item_detail_baby_trigger_for_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/item_detail_baby_trigger_for.h"
item_detail_baby_trigger_for_t* instantiate_item_detail_baby_trigger_for(int include_optional);



item_detail_baby_trigger_for_t* instantiate_item_detail_baby_trigger_for(int include_optional) {
  item_detail_baby_trigger_for_t* item_detail_baby_trigger_for = NULL;
  if (include_optional) {
    item_detail_baby_trigger_for = item_detail_baby_trigger_for_create(
      "0"
    );
  } else {
    item_detail_baby_trigger_for = item_detail_baby_trigger_for_create(
      "0"
    );
  }

  return item_detail_baby_trigger_for;
}


#ifdef item_detail_baby_trigger_for_MAIN

void test_item_detail_baby_trigger_for(int include_optional) {
    item_detail_baby_trigger_for_t* item_detail_baby_trigger_for_1 = instantiate_item_detail_baby_trigger_for(include_optional);

	cJSON* jsonitem_detail_baby_trigger_for_1 = item_detail_baby_trigger_for_convertToJSON(item_detail_baby_trigger_for_1);
	printf("item_detail_baby_trigger_for :\n%s\n", cJSON_Print(jsonitem_detail_baby_trigger_for_1));
	item_detail_baby_trigger_for_t* item_detail_baby_trigger_for_2 = item_detail_baby_trigger_for_parseFromJSON(jsonitem_detail_baby_trigger_for_1);
	cJSON* jsonitem_detail_baby_trigger_for_2 = item_detail_baby_trigger_for_convertToJSON(item_detail_baby_trigger_for_2);
	printf("repeating item_detail_baby_trigger_for:\n%s\n", cJSON_Print(jsonitem_detail_baby_trigger_for_2));
}

int main() {
  test_item_detail_baby_trigger_for(1);
  test_item_detail_baby_trigger_for(0);

  printf("Hello world \n");
  return 0;
}

#endif // item_detail_baby_trigger_for_MAIN
#endif // item_detail_baby_trigger_for_TEST
