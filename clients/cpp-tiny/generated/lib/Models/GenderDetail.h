
/*
 * GenderDetail.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_GenderDetail_H_
#define TINY_CPP_CLIENT_GenderDetail_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "GenderPokemonSpecies.h"
#include "PokemonSpeciesSummary.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class GenderDetail{
public:

    /*! \brief Constructor.
	 */
    GenderDetail();
    GenderDetail(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GenderDetail();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The identifier for this resource.
	 */
	int getId();

	/*! \brief Set The identifier for this resource.
	 */
	void setId(int id);
	/*! \brief Get The name for this resource.
	 */
	std::string getName();

	/*! \brief Set The name for this resource.
	 */
	void setName(std::string name);
	/*! \brief Get A list of Pokémon species that can be this gender and how likely it is that they will be.
	 */
	std::list<GenderPokemonSpecies> getPokemonSpeciesDetails();

	/*! \brief Set A list of Pokémon species that can be this gender and how likely it is that they will be.
	 */
	void setPokemonSpeciesDetails(std::list<GenderPokemonSpecies> pokemon_species_details);
	/*! \brief Get A list of Pokémon species that required this gender in order for a Pokémon to evolve into them.
	 */
	std::list<PokemonSpeciesSummary> getRequiredForEvolution();

	/*! \brief Set A list of Pokémon species that required this gender in order for a Pokémon to evolve into them.
	 */
	void setRequiredForEvolution(std::list<PokemonSpeciesSummary> required_for_evolution);


    private:
    int id{};
    std::string name{};
    std::list<GenderPokemonSpecies> pokemon_species_details;
    std::list<PokemonSpeciesSummary> required_for_evolution;
};
}

#endif /* TINY_CPP_CLIENT_GenderDetail_H_ */
