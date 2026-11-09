
/*
 * PokemonStat.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PokemonStat_H_
#define TINY_CPP_CLIENT_PokemonStat_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "StatSummary.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PokemonStat{
public:

    /*! \brief Constructor.
	 */
    PokemonStat();
    PokemonStat(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PokemonStat();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The base value of the stat.
	 */
	int getBaseStat();

	/*! \brief Set The base value of the stat.
	 */
	void setBaseStat(int base_stat);
	/*! \brief Get The effort points (EV) the Pokémon has in the stat.
	 */
	int getEffort();

	/*! \brief Set The effort points (EV) the Pokémon has in the stat.
	 */
	void setEffort(int effort);
	/*! \brief Get The stat the Pokémon has.
	 */
	StatSummary getStat();

	/*! \brief Set The stat the Pokémon has.
	 */
	void setStat(StatSummary stat);


    private:
    int base_stat{};
    int effort{};
    StatSummary stat;
};
}

#endif /* TINY_CPP_CLIENT_PokemonStat_H_ */
