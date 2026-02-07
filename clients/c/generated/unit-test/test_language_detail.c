#ifndef language_detail_TEST
#define language_detail_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define language_detail_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/language_detail.h"
language_detail_t* instantiate_language_detail(int include_optional);



language_detail_t* instantiate_language_detail(int include_optional) {
  language_detail_t* language_detail = NULL;
  if (include_optional) {
    language_detail = language_detail_create(
      56,
      "0",
      1,
      "0",
      "0",
      list_createList()
    );
  } else {
    language_detail = language_detail_create(
      56,
      "0",
      1,
      "0",
      "0",
      list_createList()
    );
  }

  return language_detail;
}


#ifdef language_detail_MAIN

void test_language_detail(int include_optional) {
    language_detail_t* language_detail_1 = instantiate_language_detail(include_optional);

	cJSON* jsonlanguage_detail_1 = language_detail_convertToJSON(language_detail_1);
	printf("language_detail :\n%s\n", cJSON_Print(jsonlanguage_detail_1));
	language_detail_t* language_detail_2 = language_detail_parseFromJSON(jsonlanguage_detail_1);
	cJSON* jsonlanguage_detail_2 = language_detail_convertToJSON(language_detail_2);
	printf("repeating language_detail:\n%s\n", cJSON_Print(jsonlanguage_detail_2));
}

int main() {
  test_language_detail(1);
  test_language_detail(0);

  printf("Hello world \n");
  return 0;
}

#endif // language_detail_MAIN
#endif // language_detail_TEST
