
/*
 * GrowthRateDetail.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_GrowthRateDetail_H_
#define TINY_CPP_CLIENT_GrowthRateDetail_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Experience.h"
#include "GrowthRateDescription.h"
#include "PokemonSpeciesSummary.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class GrowthRateDetail{
public:

    /*! \brief Constructor.
	 */
    GrowthRateDetail();
    GrowthRateDetail(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GrowthRateDetail();


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
	/*! \brief Get The formula used to calculate the rate at which the Pokémon species gains level.
	 */
	std::string getFormula();

	/*! \brief Set The formula used to calculate the rate at which the Pokémon species gains level.
	 */
	void setFormula(std::string formula);
	/*! \brief Get The descriptions of this characteristic listed in different languages.
	 */
	std::list<GrowthRateDescription> getDescriptions();

	/*! \brief Set The descriptions of this characteristic listed in different languages.
	 */
	void setDescriptions(std::list<GrowthRateDescription> descriptions);
	/*! \brief Get A list of levels and the amount of experienced needed to atain them based on this growth rate.
	 */
	std::list<Experience> getLevels();

	/*! \brief Set A list of levels and the amount of experienced needed to atain them based on this growth rate.
	 */
	void setLevels(std::list<Experience> levels);
	/*! \brief Get A list of Pokémon species that gain levels at this growth rate.
	 */
	std::list<PokemonSpeciesSummary> getPokemonSpecies();

	/*! \brief Set A list of Pokémon species that gain levels at this growth rate.
	 */
	void setPokemonSpecies(std::list<PokemonSpeciesSummary> pokemon_species);


    private:
    int id{};
    std::string name{};
    std::string formula{};
    std::list<GrowthRateDescription> descriptions;
    std::list<Experience> levels;
    std::list<PokemonSpeciesSummary> pokemon_species;
};
}

#endif /* TINY_CPP_CLIENT_GrowthRateDetail_H_ */
