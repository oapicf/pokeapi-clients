#ifndef currency_name_TEST
#define currency_name_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define currency_name_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/currency_name.h"
currency_name_t* instantiate_currency_name(int include_optional);

#include "test_language_summary.c"


currency_name_t* instantiate_currency_name(int include_optional) {
  currency_name_t* currency_name = NULL;
  if (include_optional) {
    currency_name = currency_name_create(
      "0",
       // false, not to have infinite recursion
      instantiate_language_summary(0)
    );
  } else {
    currency_name = currency_name_create(
      "0",
      NULL
    );
  }

  return currency_name;
}


#ifdef currency_name_MAIN

void test_currency_name(int include_optional) {
    currency_name_t* currency_name_1 = instantiate_currency_name(include_optional);

	cJSON* jsoncurrency_name_1 = currency_name_convertToJSON(currency_name_1);
	printf("currency_name :\n%s\n", cJSON_Print(jsoncurrency_name_1));
	currency_name_t* currency_name_2 = currency_name_parseFromJSON(jsoncurrency_name_1);
	cJSON* jsoncurrency_name_2 = currency_name_convertToJSON(currency_name_2);
	printf("repeating currency_name:\n%s\n", cJSON_Print(jsoncurrency_name_2));
}

int main() {
  test_currency_name(1);
  test_currency_name(0);

  printf("Hello world \n");
  return 0;
}

#endif // currency_name_MAIN
#endif // currency_name_TEST
