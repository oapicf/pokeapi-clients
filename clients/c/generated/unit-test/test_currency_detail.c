#ifndef currency_detail_TEST
#define currency_detail_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define currency_detail_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/currency_detail.h"
currency_detail_t* instantiate_currency_detail(int include_optional);



currency_detail_t* instantiate_currency_detail(int include_optional) {
  currency_detail_t* currency_detail = NULL;
  if (include_optional) {
    currency_detail = currency_detail_create(
      56,
      "0",
      list_createList()
    );
  } else {
    currency_detail = currency_detail_create(
      56,
      "0",
      list_createList()
    );
  }

  return currency_detail;
}


#ifdef currency_detail_MAIN

void test_currency_detail(int include_optional) {
    currency_detail_t* currency_detail_1 = instantiate_currency_detail(include_optional);

	cJSON* jsoncurrency_detail_1 = currency_detail_convertToJSON(currency_detail_1);
	printf("currency_detail :\n%s\n", cJSON_Print(jsoncurrency_detail_1));
	currency_detail_t* currency_detail_2 = currency_detail_parseFromJSON(jsoncurrency_detail_1);
	cJSON* jsoncurrency_detail_2 = currency_detail_convertToJSON(currency_detail_2);
	printf("repeating currency_detail:\n%s\n", cJSON_Print(jsoncurrency_detail_2));
}

int main() {
  test_currency_detail(1);
  test_currency_detail(0);

  printf("Hello world \n");
  return 0;
}

#endif // currency_detail_MAIN
#endif // currency_detail_TEST
