#ifndef berry_summary_TEST
#define berry_summary_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define berry_summary_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/berry_summary.h"
berry_summary_t* instantiate_berry_summary(int include_optional);



berry_summary_t* instantiate_berry_summary(int include_optional) {
  berry_summary_t* berry_summary = NULL;
  if (include_optional) {
    berry_summary = berry_summary_create(
      "0",
      "0"
    );
  } else {
    berry_summary = berry_summary_create(
      "0",
      "0"
    );
  }

  return berry_summary;
}


#ifdef berry_summary_MAIN

void test_berry_summary(int include_optional) {
    berry_summary_t* berry_summary_1 = instantiate_berry_summary(include_optional);

	cJSON* jsonberry_summary_1 = berry_summary_convertToJSON(berry_summary_1);
	printf("berry_summary :\n%s\n", cJSON_Print(jsonberry_summary_1));
	berry_summary_t* berry_summary_2 = berry_summary_parseFromJSON(jsonberry_summary_1);
	cJSON* jsonberry_summary_2 = berry_summary_convertToJSON(berry_summary_2);
	printf("repeating berry_summary:\n%s\n", cJSON_Print(jsonberry_summary_2));
}

int main() {
  test_berry_summary(1);
  test_berry_summary(0);

  printf("Hello world \n");
  return 0;
}

#endif // berry_summary_MAIN
#endif // berry_summary_TEST
