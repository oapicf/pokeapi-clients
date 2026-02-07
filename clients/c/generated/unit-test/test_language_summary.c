#ifndef language_summary_TEST
#define language_summary_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define language_summary_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/language_summary.h"
language_summary_t* instantiate_language_summary(int include_optional);



language_summary_t* instantiate_language_summary(int include_optional) {
  language_summary_t* language_summary = NULL;
  if (include_optional) {
    language_summary = language_summary_create(
      "0",
      "0"
    );
  } else {
    language_summary = language_summary_create(
      "0",
      "0"
    );
  }

  return language_summary;
}


#ifdef language_summary_MAIN

void test_language_summary(int include_optional) {
    language_summary_t* language_summary_1 = instantiate_language_summary(include_optional);

	cJSON* jsonlanguage_summary_1 = language_summary_convertToJSON(language_summary_1);
	printf("language_summary :\n%s\n", cJSON_Print(jsonlanguage_summary_1));
	language_summary_t* language_summary_2 = language_summary_parseFromJSON(jsonlanguage_summary_1);
	cJSON* jsonlanguage_summary_2 = language_summary_convertToJSON(language_summary_2);
	printf("repeating language_summary:\n%s\n", cJSON_Print(jsonlanguage_summary_2));
}

int main() {
  test_language_summary(1);
  test_language_summary(0);

  printf("Hello world \n");
  return 0;
}

#endif // language_summary_MAIN
#endif // language_summary_TEST
