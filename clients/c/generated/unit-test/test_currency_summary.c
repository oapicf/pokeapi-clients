#ifndef currency_summary_TEST
#define currency_summary_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define currency_summary_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/currency_summary.h"
currency_summary_t* instantiate_currency_summary(int include_optional);



currency_summary_t* instantiate_currency_summary(int include_optional) {
  currency_summary_t* currency_summary = NULL;
  if (include_optional) {
    currency_summary = currency_summary_create(
      "0",
      "0"
    );
  } else {
    currency_summary = currency_summary_create(
      "0",
      "0"
    );
  }

  return currency_summary;
}


#ifdef currency_summary_MAIN

void test_currency_summary(int include_optional) {
    currency_summary_t* currency_summary_1 = instantiate_currency_summary(include_optional);

	cJSON* jsoncurrency_summary_1 = currency_summary_convertToJSON(currency_summary_1);
	printf("currency_summary :\n%s\n", cJSON_Print(jsoncurrency_summary_1));
	currency_summary_t* currency_summary_2 = currency_summary_parseFromJSON(jsoncurrency_summary_1);
	cJSON* jsoncurrency_summary_2 = currency_summary_convertToJSON(currency_summary_2);
	printf("repeating currency_summary:\n%s\n", cJSON_Print(jsoncurrency_summary_2));
}

int main() {
  test_currency_summary(1);
  test_currency_summary(0);

  printf("Hello world \n");
  return 0;
}

#endif // currency_summary_MAIN
#endif // currency_summary_TEST
