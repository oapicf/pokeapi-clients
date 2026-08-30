
/*
 * CharacteristicDetail.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CharacteristicDetail_H_
#define TINY_CPP_CLIENT_CharacteristicDetail_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CharacteristicDescription.h"
#include "StatSummary.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CharacteristicDetail{
public:

    /*! \brief Constructor.
	 */
    CharacteristicDetail();
    CharacteristicDetail(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CharacteristicDetail();


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
	int getGeneModulo();

	/*! \brief Set 
	 */
	void setGeneModulo(int gene_modulo);
	/*! \brief Get 
	 */
	std::list<int> getPossibleValues();

	/*! \brief Set 
	 */
	void setPossibleValues(std::list<int> possible_values);
	/*! \brief Get 
	 */
	StatSummary getHighestStat();

	/*! \brief Set 
	 */
	void setHighestStat(StatSummary highest_stat);
	/*! \brief Get 
	 */
	std::list<CharacteristicDescription> getDescriptions();

	/*! \brief Set 
	 */
	void setDescriptions(std::list<CharacteristicDescription> descriptions);


    private:
    int id{};
    int gene_modulo{};
    std::list<int> possible_values;
    StatSummary highest_stat;
    std::list<CharacteristicDescription> descriptions;
};
}

#endif /* TINY_CPP_CLIENT_CharacteristicDetail_H_ */
