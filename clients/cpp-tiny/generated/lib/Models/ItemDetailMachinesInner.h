
/*
 * ItemDetail_machines_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ItemDetail_machines_inner_H_
#define TINY_CPP_CLIENT_ItemDetail_machines_inner_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AbilityDetail_pokemon_inner_pokemon.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ItemDetail_machines_inner{
public:

    /*! \brief Constructor.
	 */
    ItemDetail_machines_inner();
    ItemDetail_machines_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ItemDetail_machines_inner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getMachine();

	/*! \brief Set 
	 */
	void setMachine(std::string  machine);
	/*! \brief Get 
	 */
	AbilityDetail_pokemon_inner_pokemon getVersionGroup();

	/*! \brief Set 
	 */
	void setVersionGroup(AbilityDetail_pokemon_inner_pokemon  version_group);


    private:
    std::string machine{};
    AbilityDetail_pokemon_inner_pokemon version_group;
};
}

#endif /* TINY_CPP_CLIENT_ItemDetail_machines_inner_H_ */
