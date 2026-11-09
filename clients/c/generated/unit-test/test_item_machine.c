#ifndef item_machine_TEST
#define item_machine_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define item_machine_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/item_machine.h"
item_machine_t* instantiate_item_machine(int include_optional);

#include "test_machine_summary.c"
#include "test_version_group_summary.c"


item_machine_t* instantiate_item_machine(int include_optional) {
  item_machine_t* item_machine = NULL;
  if (include_optional) {
    item_machine = item_machine_create(
       // false, not to have infinite recursion
      instantiate_machine_summary(0),
       // false, not to have infinite recursion
      instantiate_version_group_summary(0)
    );
  } else {
    item_machine = item_machine_create(
      NULL,
      NULL
    );
  }

  return item_machine;
}


#ifdef item_machine_MAIN

void test_item_machine(int include_optional) {
    item_machine_t* item_machine_1 = instantiate_item_machine(include_optional);

	cJSON* jsonitem_machine_1 = item_machine_convertToJSON(item_machine_1);
	printf("item_machine :\n%s\n", cJSON_Print(jsonitem_machine_1));
	item_machine_t* item_machine_2 = item_machine_parseFromJSON(jsonitem_machine_1);
	cJSON* jsonitem_machine_2 = item_machine_convertToJSON(item_machine_2);
	printf("repeating item_machine:\n%s\n", cJSON_Print(jsonitem_machine_2));
}

int main() {
  test_item_machine(1);
  test_item_machine(0);

  printf("Hello world \n");
  return 0;
}

#endif // item_machine_MAIN
#endif // item_machine_TEST
