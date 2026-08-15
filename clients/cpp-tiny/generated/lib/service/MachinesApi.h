#ifndef TINY_CPP_CLIENT_MachinesApi_H_
#define TINY_CPP_CLIENT_MachinesApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "MachineDetail.h"
#include "PaginatedMachineSummaryList.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class MachinesApi : public Service {
public:
    MachinesApi() = default;

    virtual ~MachinesApi() = default;

    /**
    * List machines.
    *
    * Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.
    * \param limit Number of results to return per page.
    * \param offset The initial index from which to return the results.
    * \param q > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
    */
    Response<
                PaginatedMachineSummaryList
        >
    machineList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
    );
    /**
    * Get machine.
    *
    * Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.
    * \param id This parameter can be a string or an integer. *Required*
    */
    Response<
                MachineDetail
        >
    machineRetrieve(
            
            std::string id
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_MachinesApi_H_ */