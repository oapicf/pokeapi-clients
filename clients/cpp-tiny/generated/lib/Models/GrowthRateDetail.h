
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
	std::string getFormula();

	/*! \brief Set 
	 */
	void setFormula(std::string formula);
	/*! \brief Get 
	 */
	std::list<GrowthRateDescription> getDescriptions();

	/*! \brief Set 
	 */
	void setDescriptions(std::list<GrowthRateDescription> descriptions);
	/*! \brief Get 
	 */
	std::list<Experience> getLevels();

	/*! \brief Set 
	 */
	void setLevels(std::list<Experience> levels);
	/*! \brief Get 
	 */
	std::list<PokemonSpeciesSummary> getPokemonSpecies();

	/*! \brief Set 
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
