
/*
 * PokemonPastType.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PokemonPastType_H_
#define TINY_CPP_CLIENT_PokemonPastType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "GenerationSummary.h"
#include "PokemonType.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PokemonPastType{
public:

    /*! \brief Constructor.
	 */
    PokemonPastType();
    PokemonPastType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PokemonPastType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The last generation in which the referenced pokémon had the listed types.
	 */
	GenerationSummary getGeneration();

	/*! \brief Set The last generation in which the referenced pokémon had the listed types.
	 */
	void setGeneration(GenerationSummary generation);
	/*! \brief Get The types the referenced pokémon had up to and including the listed generation.
	 */
	std::list<PokemonType> getTypes();

	/*! \brief Set The types the referenced pokémon had up to and including the listed generation.
	 */
	void setTypes(std::list<PokemonType> types);


    private:
    GenerationSummary generation;
    std::list<PokemonType> types;
};
}

#endif /* TINY_CPP_CLIENT_PokemonPastType_H_ */
