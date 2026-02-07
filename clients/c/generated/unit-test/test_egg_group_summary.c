#ifndef egg_group_summary_TEST
#define egg_group_summary_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define egg_group_summary_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/egg_group_summary.h"
egg_group_summary_t* instantiate_egg_group_summary(int include_optional);



egg_group_summary_t* instantiate_egg_group_summary(int include_optional) {
  egg_group_summary_t* egg_group_summary = NULL;
  if (include_optional) {
    egg_group_summary = egg_group_summary_create(
      "0",
      "0"
    );
  } else {
    egg_group_summary = egg_group_summary_create(
      "0",
      "0"
    );
  }

  return egg_group_summary;
}


#ifdef egg_group_summary_MAIN

void test_egg_group_summary(int include_optional) {
    egg_group_summary_t* egg_group_summary_1 = instantiate_egg_group_summary(include_optional);

	cJSON* jsonegg_group_summary_1 = egg_group_summary_convertToJSON(egg_group_summary_1);
	printf("egg_group_summary :\n%s\n", cJSON_Print(jsonegg_group_summary_1));
	egg_group_summary_t* egg_group_summary_2 = egg_group_summary_parseFromJSON(jsonegg_group_summary_1);
	cJSON* jsonegg_group_summary_2 = egg_group_summary_convertToJSON(egg_group_summary_2);
	printf("repeating egg_group_summary:\n%s\n", cJSON_Print(jsonegg_group_summary_2));
}

int main() {
  test_egg_group_summary(1);
  test_egg_group_summary(0);

  printf("Hello world \n");
  return 0;
}

#endif // egg_group_summary_MAIN
#endif // egg_group_summary_TEST
