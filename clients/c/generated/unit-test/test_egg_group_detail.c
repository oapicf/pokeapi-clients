#ifndef egg_group_detail_TEST
#define egg_group_detail_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define egg_group_detail_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/egg_group_detail.h"
egg_group_detail_t* instantiate_egg_group_detail(int include_optional);



egg_group_detail_t* instantiate_egg_group_detail(int include_optional) {
  egg_group_detail_t* egg_group_detail = NULL;
  if (include_optional) {
    egg_group_detail = egg_group_detail_create(
      56,
      "0",
      list_createList(),
      list_createList()
    );
  } else {
    egg_group_detail = egg_group_detail_create(
      56,
      "0",
      list_createList(),
      list_createList()
    );
  }

  return egg_group_detail;
}


#ifdef egg_group_detail_MAIN

void test_egg_group_detail(int include_optional) {
    egg_group_detail_t* egg_group_detail_1 = instantiate_egg_group_detail(include_optional);

	cJSON* jsonegg_group_detail_1 = egg_group_detail_convertToJSON(egg_group_detail_1);
	printf("egg_group_detail :\n%s\n", cJSON_Print(jsonegg_group_detail_1));
	egg_group_detail_t* egg_group_detail_2 = egg_group_detail_parseFromJSON(jsonegg_group_detail_1);
	cJSON* jsonegg_group_detail_2 = egg_group_detail_convertToJSON(egg_group_detail_2);
	printf("repeating egg_group_detail:\n%s\n", cJSON_Print(jsonegg_group_detail_2));
}

int main() {
  test_egg_group_detail(1);
  test_egg_group_detail(0);

  printf("Hello world \n");
  return 0;
}

#endif // egg_group_detail_MAIN
#endif // egg_group_detail_TEST
