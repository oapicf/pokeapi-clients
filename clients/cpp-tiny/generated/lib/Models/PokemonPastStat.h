
/*
 * PokemonPastStat.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PokemonPastStat_H_
#define TINY_CPP_CLIENT_PokemonPastStat_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "GenerationSummary.h"
#include "PokemonStat.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PokemonPastStat{
public:

    /*! \brief Constructor.
	 */
    PokemonPastStat();
    PokemonPastStat(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PokemonPastStat();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The last generation in which the referenced pokémon had the listed stats.
	 */
	GenerationSummary getGeneration();

	/*! \brief Set The last generation in which the referenced pokémon had the listed stats.
	 */
	void setGeneration(GenerationSummary generation);
	/*! \brief Get The stat the Pokémon had up to and including the listed generation.
	 */
	std::list<PokemonStat> getStats();

	/*! \brief Set The stat the Pokémon had up to and including the listed generation.
	 */
	void setStats(std::list<PokemonStat> stats);


    private:
    GenerationSummary generation;
    std::list<PokemonStat> stats;
};
}

#endif /* TINY_CPP_CLIENT_PokemonPastStat_H_ */
