#ifndef item_price_TEST
#define item_price_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define item_price_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/item_price.h"
item_price_t* instantiate_item_price(int include_optional);

#include "test_currency_summary.c"
#include "test_version_group_summary.c"


item_price_t* instantiate_item_price(int include_optional) {
  item_price_t* item_price = NULL;
  if (include_optional) {
    item_price = item_price_create(
      -2147483648,
      -2147483648,
       // false, not to have infinite recursion
      instantiate_currency_summary(0),
       // false, not to have infinite recursion
      instantiate_version_group_summary(0)
    );
  } else {
    item_price = item_price_create(
      -2147483648,
      -2147483648,
      NULL,
      NULL
    );
  }

  return item_price;
}


#ifdef item_price_MAIN

void test_item_price(int include_optional) {
    item_price_t* item_price_1 = instantiate_item_price(include_optional);

	cJSON* jsonitem_price_1 = item_price_convertToJSON(item_price_1);
	printf("item_price :\n%s\n", cJSON_Print(jsonitem_price_1));
	item_price_t* item_price_2 = item_price_parseFromJSON(jsonitem_price_1);
	cJSON* jsonitem_price_2 = item_price_convertToJSON(item_price_2);
	printf("repeating item_price:\n%s\n", cJSON_Print(jsonitem_price_2));
}

int main() {
  test_item_price(1);
  test_item_price(0);

  printf("Hello world \n");
  return 0;
}

#endif // item_price_MAIN
#endif // item_price_TEST
