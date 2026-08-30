
/*
 * PokemonHabitatDetail.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PokemonHabitatDetail_H_
#define TINY_CPP_CLIENT_PokemonHabitatDetail_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "PokemonHabitatName.h"
#include "PokemonSpeciesSummary.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PokemonHabitatDetail{
public:

    /*! \brief Constructor.
	 */
    PokemonHabitatDetail();
    PokemonHabitatDetail(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PokemonHabitatDetail();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	int getId();

	/*! \brief Set 
	 */
	void setId(int id);
	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string name);
	/*! \brief Get 
	 */
	std::list<PokemonHabitatName> getNames();

	/*! \brief Set 
	 */
	void setNames(std::list<PokemonHabitatName> names);
	/*! \brief Get 
	 */
	std::list<PokemonSpeciesSummary> getPokemonSpecies();

	/*! \brief Set 
	 */
	void setPokemonSpecies(std::list<PokemonSpeciesSummary> pokemon_species);


    private:
    int id{};
    std::string name{};
    std::list<PokemonHabitatName> names;
    std::list<PokemonSpeciesSummary> pokemon_species;
};
}

#endif /* TINY_CPP_CLIENT_PokemonHabitatDetail_H_ */
