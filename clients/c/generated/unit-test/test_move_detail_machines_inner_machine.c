#ifndef move_detail_machines_inner_machine_TEST
#define move_detail_machines_inner_machine_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define move_detail_machines_inner_machine_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/move_detail_machines_inner_machine.h"
move_detail_machines_inner_machine_t* instantiate_move_detail_machines_inner_machine(int include_optional);



move_detail_machines_inner_machine_t* instantiate_move_detail_machines_inner_machine(int include_optional) {
  move_detail_machines_inner_machine_t* move_detail_machines_inner_machine = NULL;
  if (include_optional) {
    move_detail_machines_inner_machine = move_detail_machines_inner_machine_create(
      "0"
    );
  } else {
    move_detail_machines_inner_machine = move_detail_machines_inner_machine_create(
      "0"
    );
  }

  return move_detail_machines_inner_machine;
}


#ifdef move_detail_machines_inner_machine_MAIN

void test_move_detail_machines_inner_machine(int include_optional) {
    move_detail_machines_inner_machine_t* move_detail_machines_inner_machine_1 = instantiate_move_detail_machines_inner_machine(include_optional);

	cJSON* jsonmove_detail_machines_inner_machine_1 = move_detail_machines_inner_machine_convertToJSON(move_detail_machines_inner_machine_1);
	printf("move_detail_machines_inner_machine :\n%s\n", cJSON_Print(jsonmove_detail_machines_inner_machine_1));
	move_detail_machines_inner_machine_t* move_detail_machines_inner_machine_2 = move_detail_machines_inner_machine_parseFromJSON(jsonmove_detail_machines_inner_machine_1);
	cJSON* jsonmove_detail_machines_inner_machine_2 = move_detail_machines_inner_machine_convertToJSON(move_detail_machines_inner_machine_2);
	printf("repeating move_detail_machines_inner_machine:\n%s\n", cJSON_Print(jsonmove_detail_machines_inner_machine_2));
}

int main() {
  test_move_detail_machines_inner_machine(1);
  test_move_detail_machines_inner_machine(0);

  printf("Hello world \n");
  return 0;
}

#endif // move_detail_machines_inner_machine_MAIN
#endif // move_detail_machines_inner_machine_TEST
