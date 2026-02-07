#ifndef nature_summary_TEST
#define nature_summary_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define nature_summary_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/nature_summary.h"
nature_summary_t* instantiate_nature_summary(int include_optional);



nature_summary_t* instantiate_nature_summary(int include_optional) {
  nature_summary_t* nature_summary = NULL;
  if (include_optional) {
    nature_summary = nature_summary_create(
      "0",
      "0"
    );
  } else {
    nature_summary = nature_summary_create(
      "0",
      "0"
    );
  }

  return nature_summary;
}


#ifdef nature_summary_MAIN

void test_nature_summary(int include_optional) {
    nature_summary_t* nature_summary_1 = instantiate_nature_summary(include_optional);

	cJSON* jsonnature_summary_1 = nature_summary_convertToJSON(nature_summary_1);
	printf("nature_summary :\n%s\n", cJSON_Print(jsonnature_summary_1));
	nature_summary_t* nature_summary_2 = nature_summary_parseFromJSON(jsonnature_summary_1);
	cJSON* jsonnature_summary_2 = nature_summary_convertToJSON(nature_summary_2);
	printf("repeating nature_summary:\n%s\n", cJSON_Print(jsonnature_summary_2));
}

int main() {
  test_nature_summary(1);
  test_nature_summary(0);

  printf("Hello world \n");
  return 0;
}

#endif // nature_summary_MAIN
#endif // nature_summary_TEST
