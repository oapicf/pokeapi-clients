
/*
 * PokemonFormType.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PokemonFormType_H_
#define TINY_CPP_CLIENT_PokemonFormType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "TypeSummary.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PokemonFormType{
public:

    /*! \brief Constructor.
	 */
    PokemonFormType();
    PokemonFormType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PokemonFormType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The order the Pokémon's types are listed in.
	 */
	int getSlot();

	/*! \brief Set The order the Pokémon's types are listed in.
	 */
	void setSlot(int slot);
	/*! \brief Get The type the referenced Form has.
	 */
	TypeSummary getType();

	/*! \brief Set The type the referenced Form has.
	 */
	void setType(TypeSummary type);


    private:
    int slot{};
    TypeSummary type;
};
}

#endif /* TINY_CPP_CLIENT_PokemonFormType_H_ */
