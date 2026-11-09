/*
 * PokemonPastStat.h
 *
 * 
 */

#ifndef _PokemonPastStat_H_
#define _PokemonPastStat_H_


#include <string>
#include "GenerationSummary.h"
#include "PokemonStat.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PokemonPastStat : public Object {
public:
	/*! \brief Constructor.
	 */
	PokemonPastStat();
	PokemonPastStat(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PokemonPastStat();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The last generation in which the referenced pokémon had the listed stats.
	 */
	GenerationSummary getGeneration();

	/*! \brief Set The last generation in which the referenced pokémon had the listed stats.
	 */
	void setGeneration(GenerationSummary  generation);
	/*! \brief Get The stat the Pokémon had up to and including the listed generation.
	 */
	std::list<PokemonStat> getStats();

	/*! \brief Set The stat the Pokémon had up to and including the listed generation.
	 */
	void setStats(std::list <PokemonStat> stats);

private:
	GenerationSummary generation;
	std::list <PokemonStat>stats;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PokemonPastStat_H_ */
