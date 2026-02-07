<?php
declare(strict_types=1);

namespace App;

use Articus\DataTransfer as DT;
use OpenAPIGenerator\APIClient as OAGAC;
use Psr\Http\Client\ClientExceptionInterface;
use Psr\Http\Message\ResponseInterface;

/**
 * PokéAPI
 * All the Pokémon data you'll ever need in one place, easily accessible through a modern free open-source RESTful API.  ## What is this?  This is a full RESTful API linked to an extensive database detailing everything about the Pokémon main game series.  We've covered everything from Pokémon to Berry Flavors.  ## Where do I start?  We have awesome [documentation](https://pokeapi.co/docs/v2) on how to use this API. It takes minutes to get started.  This API will always be publicly available and will never require any extensive setup process to consume.  Created by [**Paul Hallett**(]https://github.com/phalt) and other [**PokéAPI contributors***](https://github.com/PokeAPI/pokeapi#contributing) around the world. Pokémon and Pokémon character names are trademarks of Nintendo.
 * The version of the OpenAPI document: 2.7.0
 */
class ApiClient extends OAGAC\AbstractApiClient
{
    //region abilityList
    /**
     * @param \App\DTO\AbilityListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function abilityListRaw(
        \App\DTO\AbilityListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/ability/', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * @param \App\DTO\AbilityListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function abilityList(
        \App\DTO\AbilityListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->abilityListRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\PaginatedAbilitySummaryList();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * @param \App\DTO\AbilityListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\PaginatedAbilitySummaryList
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function abilityListResult(
        \App\DTO\AbilityListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\PaginatedAbilitySummaryList
    {
        return $this->getSuccessfulContent(...$this->abilityList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region abilityRetrieve
    /**
     * @param \App\DTO\AbilityRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function abilityRetrieveRaw(
        \App\DTO\AbilityRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/ability/{id}/', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * @param \App\DTO\AbilityRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function abilityRetrieve(
        \App\DTO\AbilityRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->abilityRetrieveRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\AbilityDetail();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * @param \App\DTO\AbilityRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\AbilityDetail
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function abilityRetrieveResult(
        \App\DTO\AbilityRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\AbilityDetail
    {
        return $this->getSuccessfulContent(...$this->abilityRetrieve($parameters, $security, $responseMediaType));
    }
    //endregion

    //region berryFirmnessList
    /**
     * List berry firmness
     * @param \App\DTO\BerryFirmnessListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function berryFirmnessListRaw(
        \App\DTO\BerryFirmnessListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/berry-firmness/', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List berry firmness
     * @param \App\DTO\BerryFirmnessListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function berryFirmnessList(
        \App\DTO\BerryFirmnessListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->berryFirmnessListRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\PaginatedBerryFirmnessSummaryList();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List berry firmness
     * @param \App\DTO\BerryFirmnessListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\PaginatedBerryFirmnessSummaryList
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function berryFirmnessListResult(
        \App\DTO\BerryFirmnessListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\PaginatedBerryFirmnessSummaryList
    {
        return $this->getSuccessfulContent(...$this->berryFirmnessList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region berryFirmnessRetrieve
    /**
     * Get berry by firmness
     * @param \App\DTO\BerryFirmnessRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function berryFirmnessRetrieveRaw(
        \App\DTO\BerryFirmnessRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/berry-firmness/{id}/', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get berry by firmness
     * @param \App\DTO\BerryFirmnessRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function berryFirmnessRetrieve(
        \App\DTO\BerryFirmnessRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->berryFirmnessRetrieveRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\BerryFirmnessDetail();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get berry by firmness
     * @param \App\DTO\BerryFirmnessRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\BerryFirmnessDetail
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function berryFirmnessRetrieveResult(
        \App\DTO\BerryFirmnessRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\BerryFirmnessDetail
    {
        return $this->getSuccessfulContent(...$this->berryFirmnessRetrieve($parameters, $security, $responseMediaType));
    }
    //endregion

    //region berryFlavorList
    /**
     * List berry flavors
     * @param \App\DTO\BerryFlavorListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function berryFlavorListRaw(
        \App\DTO\BerryFlavorListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/berry-flavor/', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List berry flavors
     * @param \App\DTO\BerryFlavorListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function berryFlavorList(
        \App\DTO\BerryFlavorListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->berryFlavorListRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\PaginatedBerryFlavorSummaryList();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List berry flavors
     * @param \App\DTO\BerryFlavorListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\PaginatedBerryFlavorSummaryList
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function berryFlavorListResult(
        \App\DTO\BerryFlavorListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\PaginatedBerryFlavorSummaryList
    {
        return $this->getSuccessfulContent(...$this->berryFlavorList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region berryFlavorRetrieve
    /**
     * Get berries by flavor
     * @param \App\DTO\BerryFlavorRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function berryFlavorRetrieveRaw(
        \App\DTO\BerryFlavorRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/berry-flavor/{id}/', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get berries by flavor
     * @param \App\DTO\BerryFlavorRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function berryFlavorRetrieve(
        \App\DTO\BerryFlavorRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->berryFlavorRetrieveRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\BerryFlavorDetail();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get berries by flavor
     * @param \App\DTO\BerryFlavorRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\BerryFlavorDetail
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function berryFlavorRetrieveResult(
        \App\DTO\BerryFlavorRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\BerryFlavorDetail
    {
        return $this->getSuccessfulContent(...$this->berryFlavorRetrieve($parameters, $security, $responseMediaType));
    }
    //endregion

    //region berryList
    /**
     * List berries
     * @param \App\DTO\BerryListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function berryListRaw(
        \App\DTO\BerryListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/berry/', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List berries
     * @param \App\DTO\BerryListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function berryList(
        \App\DTO\BerryListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->berryListRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\PaginatedBerrySummaryList();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List berries
     * @param \App\DTO\BerryListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\PaginatedBerrySummaryList
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function berryListResult(
        \App\DTO\BerryListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\PaginatedBerrySummaryList
    {
        return $this->getSuccessfulContent(...$this->berryList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region berryRetrieve
    /**
     * Get a berry
     * @param \App\DTO\BerryRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function berryRetrieveRaw(
        \App\DTO\BerryRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/berry/{id}/', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get a berry
     * @param \App\DTO\BerryRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function berryRetrieve(
        \App\DTO\BerryRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->berryRetrieveRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\BerryDetail();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get a berry
     * @param \App\DTO\BerryRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\BerryDetail
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function berryRetrieveResult(
        \App\DTO\BerryRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\BerryDetail
    {
        return $this->getSuccessfulContent(...$this->berryRetrieve($parameters, $security, $responseMediaType));
    }
    //endregion

    //region characteristicList
    /**
     * List charecterictics
     * @param \App\DTO\CharacteristicListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function characteristicListRaw(
        \App\DTO\CharacteristicListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/characteristic/', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List charecterictics
     * @param \App\DTO\CharacteristicListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function characteristicList(
        \App\DTO\CharacteristicListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->characteristicListRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\PaginatedCharacteristicSummaryList();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List charecterictics
     * @param \App\DTO\CharacteristicListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\PaginatedCharacteristicSummaryList
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function characteristicListResult(
        \App\DTO\CharacteristicListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\PaginatedCharacteristicSummaryList
    {
        return $this->getSuccessfulContent(...$this->characteristicList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region characteristicRetrieve
    /**
     * Get characteristic
     * @param \App\DTO\CharacteristicRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function characteristicRetrieveRaw(
        \App\DTO\CharacteristicRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/characteristic/{id}/', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get characteristic
     * @param \App\DTO\CharacteristicRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function characteristicRetrieve(
        \App\DTO\CharacteristicRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->characteristicRetrieveRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\CharacteristicDetail();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get characteristic
     * @param \App\DTO\CharacteristicRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\CharacteristicDetail
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function characteristicRetrieveResult(
        \App\DTO\CharacteristicRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\CharacteristicDetail
    {
        return $this->getSuccessfulContent(...$this->characteristicRetrieve($parameters, $security, $responseMediaType));
    }
    //endregion

    //region contestEffectList
    /**
     * List contest effects
     * @param \App\DTO\ContestEffectListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function contestEffectListRaw(
        \App\DTO\ContestEffectListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/contest-effect/', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List contest effects
     * @param \App\DTO\ContestEffectListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function contestEffectList(
        \App\DTO\ContestEffectListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->contestEffectListRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\PaginatedContestEffectSummaryList();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List contest effects
     * @param \App\DTO\ContestEffectListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\PaginatedContestEffectSummaryList
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function contestEffectListResult(
        \App\DTO\ContestEffectListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\PaginatedContestEffectSummaryList
    {
        return $this->getSuccessfulContent(...$this->contestEffectList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region contestEffectRetrieve
    /**
     * Get contest effect
     * @param \App\DTO\ContestEffectRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function contestEffectRetrieveRaw(
        \App\DTO\ContestEffectRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/contest-effect/{id}/', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get contest effect
     * @param \App\DTO\ContestEffectRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function contestEffectRetrieve(
        \App\DTO\ContestEffectRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->contestEffectRetrieveRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\ContestEffectDetail();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get contest effect
     * @param \App\DTO\ContestEffectRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\ContestEffectDetail
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function contestEffectRetrieveResult(
        \App\DTO\ContestEffectRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\ContestEffectDetail
    {
        return $this->getSuccessfulContent(...$this->contestEffectRetrieve($parameters, $security, $responseMediaType));
    }
    //endregion

    //region contestTypeList
    /**
     * List contest types
     * @param \App\DTO\ContestTypeListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function contestTypeListRaw(
        \App\DTO\ContestTypeListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/contest-type/', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List contest types
     * @param \App\DTO\ContestTypeListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function contestTypeList(
        \App\DTO\ContestTypeListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->contestTypeListRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\PaginatedContestTypeSummaryList();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List contest types
     * @param \App\DTO\ContestTypeListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\PaginatedContestTypeSummaryList
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function contestTypeListResult(
        \App\DTO\ContestTypeListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\PaginatedContestTypeSummaryList
    {
        return $this->getSuccessfulContent(...$this->contestTypeList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region contestTypeRetrieve
    /**
     * Get contest type
     * @param \App\DTO\ContestTypeRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function contestTypeRetrieveRaw(
        \App\DTO\ContestTypeRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/contest-type/{id}/', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get contest type
     * @param \App\DTO\ContestTypeRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function contestTypeRetrieve(
        \App\DTO\ContestTypeRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->contestTypeRetrieveRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\ContestTypeDetail();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get contest type
     * @param \App\DTO\ContestTypeRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\ContestTypeDetail
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function contestTypeRetrieveResult(
        \App\DTO\ContestTypeRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\ContestTypeDetail
    {
        return $this->getSuccessfulContent(...$this->contestTypeRetrieve($parameters, $security, $responseMediaType));
    }
    //endregion

    //region eggGroupList
    /**
     * List egg groups
     * @param \App\DTO\EggGroupListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function eggGroupListRaw(
        \App\DTO\EggGroupListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/egg-group/', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List egg groups
     * @param \App\DTO\EggGroupListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function eggGroupList(
        \App\DTO\EggGroupListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->eggGroupListRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\PaginatedEggGroupSummaryList();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List egg groups
     * @param \App\DTO\EggGroupListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\PaginatedEggGroupSummaryList
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function eggGroupListResult(
        \App\DTO\EggGroupListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\PaginatedEggGroupSummaryList
    {
        return $this->getSuccessfulContent(...$this->eggGroupList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region eggGroupRetrieve
    /**
     * Get egg group
     * @param \App\DTO\EggGroupRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function eggGroupRetrieveRaw(
        \App\DTO\EggGroupRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/egg-group/{id}/', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get egg group
     * @param \App\DTO\EggGroupRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function eggGroupRetrieve(
        \App\DTO\EggGroupRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->eggGroupRetrieveRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\EggGroupDetail();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get egg group
     * @param \App\DTO\EggGroupRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\EggGroupDetail
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function eggGroupRetrieveResult(
        \App\DTO\EggGroupRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\EggGroupDetail
    {
        return $this->getSuccessfulContent(...$this->eggGroupRetrieve($parameters, $security, $responseMediaType));
    }
    //endregion

    //region encounterConditionList
    /**
     * List encounter conditions
     * @param \App\DTO\EncounterConditionListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function encounterConditionListRaw(
        \App\DTO\EncounterConditionListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/encounter-condition/', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List encounter conditions
     * @param \App\DTO\EncounterConditionListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function encounterConditionList(
        \App\DTO\EncounterConditionListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->encounterConditionListRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\PaginatedEncounterConditionSummaryList();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List encounter conditions
     * @param \App\DTO\EncounterConditionListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\PaginatedEncounterConditionSummaryList
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function encounterConditionListResult(
        \App\DTO\EncounterConditionListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\PaginatedEncounterConditionSummaryList
    {
        return $this->getSuccessfulContent(...$this->encounterConditionList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region encounterConditionRetrieve
    /**
     * Get encounter condition
     * @param \App\DTO\EncounterConditionRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function encounterConditionRetrieveRaw(
        \App\DTO\EncounterConditionRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/encounter-condition/{id}/', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get encounter condition
     * @param \App\DTO\EncounterConditionRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function encounterConditionRetrieve(
        \App\DTO\EncounterConditionRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->encounterConditionRetrieveRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\EncounterConditionDetail();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get encounter condition
     * @param \App\DTO\EncounterConditionRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\EncounterConditionDetail
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function encounterConditionRetrieveResult(
        \App\DTO\EncounterConditionRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\EncounterConditionDetail
    {
        return $this->getSuccessfulContent(...$this->encounterConditionRetrieve($parameters, $security, $responseMediaType));
    }
    //endregion

    //region encounterConditionValueList
    /**
     * List encounter condition values
     * @param \App\DTO\EncounterConditionValueListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function encounterConditionValueListRaw(
        \App\DTO\EncounterConditionValueListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/encounter-condition-value/', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List encounter condition values
     * @param \App\DTO\EncounterConditionValueListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function encounterConditionValueList(
        \App\DTO\EncounterConditionValueListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->encounterConditionValueListRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\PaginatedEncounterConditionValueSummaryList();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List encounter condition values
     * @param \App\DTO\EncounterConditionValueListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\PaginatedEncounterConditionValueSummaryList
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function encounterConditionValueListResult(
        \App\DTO\EncounterConditionValueListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\PaginatedEncounterConditionValueSummaryList
    {
        return $this->getSuccessfulContent(...$this->encounterConditionValueList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region encounterConditionValueRetrieve
    /**
     * Get encounter condition value
     * @param \App\DTO\EncounterConditionValueRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function encounterConditionValueRetrieveRaw(
        \App\DTO\EncounterConditionValueRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/encounter-condition-value/{id}/', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get encounter condition value
     * @param \App\DTO\EncounterConditionValueRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function encounterConditionValueRetrieve(
        \App\DTO\EncounterConditionValueRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->encounterConditionValueRetrieveRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\EncounterConditionValueDetail();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get encounter condition value
     * @param \App\DTO\EncounterConditionValueRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\EncounterConditionValueDetail
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function encounterConditionValueRetrieveResult(
        \App\DTO\EncounterConditionValueRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\EncounterConditionValueDetail
    {
        return $this->getSuccessfulContent(...$this->encounterConditionValueRetrieve($parameters, $security, $responseMediaType));
    }
    //endregion

    //region encounterMethodList
    /**
     * List encounter methods
     * @param \App\DTO\EncounterMethodListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function encounterMethodListRaw(
        \App\DTO\EncounterMethodListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/encounter-method/', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List encounter methods
     * @param \App\DTO\EncounterMethodListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function encounterMethodList(
        \App\DTO\EncounterMethodListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->encounterMethodListRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\PaginatedEncounterMethodSummaryList();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List encounter methods
     * @param \App\DTO\EncounterMethodListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\PaginatedEncounterMethodSummaryList
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function encounterMethodListResult(
        \App\DTO\EncounterMethodListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\PaginatedEncounterMethodSummaryList
    {
        return $this->getSuccessfulContent(...$this->encounterMethodList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region encounterMethodRetrieve
    /**
     * Get encounter method
     * @param \App\DTO\EncounterMethodRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function encounterMethodRetrieveRaw(
        \App\DTO\EncounterMethodRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/encounter-method/{id}/', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get encounter method
     * @param \App\DTO\EncounterMethodRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function encounterMethodRetrieve(
        \App\DTO\EncounterMethodRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->encounterMethodRetrieveRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\EncounterMethodDetail();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get encounter method
     * @param \App\DTO\EncounterMethodRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\EncounterMethodDetail
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function encounterMethodRetrieveResult(
        \App\DTO\EncounterMethodRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\EncounterMethodDetail
    {
        return $this->getSuccessfulContent(...$this->encounterMethodRetrieve($parameters, $security, $responseMediaType));
    }
    //endregion

    //region evolutionChainList
    /**
     * List evolution chains
     * @param \App\DTO\EvolutionChainListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function evolutionChainListRaw(
        \App\DTO\EvolutionChainListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/evolution-chain/', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List evolution chains
     * @param \App\DTO\EvolutionChainListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function evolutionChainList(
        \App\DTO\EvolutionChainListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->evolutionChainListRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\PaginatedEvolutionChainSummaryList();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List evolution chains
     * @param \App\DTO\EvolutionChainListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\PaginatedEvolutionChainSummaryList
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function evolutionChainListResult(
        \App\DTO\EvolutionChainListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\PaginatedEvolutionChainSummaryList
    {
        return $this->getSuccessfulContent(...$this->evolutionChainList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region evolutionChainRetrieve
    /**
     * Get evolution chain
     * @param \App\DTO\EvolutionChainRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function evolutionChainRetrieveRaw(
        \App\DTO\EvolutionChainRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/evolution-chain/{id}/', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get evolution chain
     * @param \App\DTO\EvolutionChainRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function evolutionChainRetrieve(
        \App\DTO\EvolutionChainRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->evolutionChainRetrieveRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\EvolutionChainDetail();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get evolution chain
     * @param \App\DTO\EvolutionChainRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\EvolutionChainDetail
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function evolutionChainRetrieveResult(
        \App\DTO\EvolutionChainRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\EvolutionChainDetail
    {
        return $this->getSuccessfulContent(...$this->evolutionChainRetrieve($parameters, $security, $responseMediaType));
    }
    //endregion

    //region evolutionTriggerList
    /**
     * List evolution triggers
     * @param \App\DTO\EvolutionTriggerListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function evolutionTriggerListRaw(
        \App\DTO\EvolutionTriggerListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/evolution-trigger/', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List evolution triggers
     * @param \App\DTO\EvolutionTriggerListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function evolutionTriggerList(
        \App\DTO\EvolutionTriggerListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->evolutionTriggerListRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\PaginatedEvolutionTriggerSummaryList();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List evolution triggers
     * @param \App\DTO\EvolutionTriggerListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\PaginatedEvolutionTriggerSummaryList
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function evolutionTriggerListResult(
        \App\DTO\EvolutionTriggerListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\PaginatedEvolutionTriggerSummaryList
    {
        return $this->getSuccessfulContent(...$this->evolutionTriggerList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region evolutionTriggerRetrieve
    /**
     * Get evolution trigger
     * @param \App\DTO\EvolutionTriggerRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function evolutionTriggerRetrieveRaw(
        \App\DTO\EvolutionTriggerRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/evolution-trigger/{id}/', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get evolution trigger
     * @param \App\DTO\EvolutionTriggerRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function evolutionTriggerRetrieve(
        \App\DTO\EvolutionTriggerRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->evolutionTriggerRetrieveRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\EvolutionTriggerDetail();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get evolution trigger
     * @param \App\DTO\EvolutionTriggerRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\EvolutionTriggerDetail
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function evolutionTriggerRetrieveResult(
        \App\DTO\EvolutionTriggerRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\EvolutionTriggerDetail
    {
        return $this->getSuccessfulContent(...$this->evolutionTriggerRetrieve($parameters, $security, $responseMediaType));
    }
    //endregion

    //region genderList
    /**
     * List genders
     * @param \App\DTO\GenderListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function genderListRaw(
        \App\DTO\GenderListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/gender/', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List genders
     * @param \App\DTO\GenderListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function genderList(
        \App\DTO\GenderListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->genderListRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\PaginatedGenderSummaryList();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List genders
     * @param \App\DTO\GenderListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\PaginatedGenderSummaryList
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function genderListResult(
        \App\DTO\GenderListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\PaginatedGenderSummaryList
    {
        return $this->getSuccessfulContent(...$this->genderList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region genderRetrieve
    /**
     * Get gender
     * @param \App\DTO\GenderRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function genderRetrieveRaw(
        \App\DTO\GenderRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/gender/{id}/', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get gender
     * @param \App\DTO\GenderRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function genderRetrieve(
        \App\DTO\GenderRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->genderRetrieveRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\GenderDetail();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get gender
     * @param \App\DTO\GenderRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\GenderDetail
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function genderRetrieveResult(
        \App\DTO\GenderRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\GenderDetail
    {
        return $this->getSuccessfulContent(...$this->genderRetrieve($parameters, $security, $responseMediaType));
    }
    //endregion

    //region generationList
    /**
     * List genrations
     * @param \App\DTO\GenerationListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function generationListRaw(
        \App\DTO\GenerationListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/generation/', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List genrations
     * @param \App\DTO\GenerationListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function generationList(
        \App\DTO\GenerationListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->generationListRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\PaginatedGenerationSummaryList();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List genrations
     * @param \App\DTO\GenerationListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\PaginatedGenerationSummaryList
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function generationListResult(
        \App\DTO\GenerationListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\PaginatedGenerationSummaryList
    {
        return $this->getSuccessfulContent(...$this->generationList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region generationRetrieve
    /**
     * Get genration
     * @param \App\DTO\GenerationRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function generationRetrieveRaw(
        \App\DTO\GenerationRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/generation/{id}/', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get genration
     * @param \App\DTO\GenerationRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function generationRetrieve(
        \App\DTO\GenerationRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->generationRetrieveRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\GenerationDetail();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get genration
     * @param \App\DTO\GenerationRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\GenerationDetail
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function generationRetrieveResult(
        \App\DTO\GenerationRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\GenerationDetail
    {
        return $this->getSuccessfulContent(...$this->generationRetrieve($parameters, $security, $responseMediaType));
    }
    //endregion

    //region growthRateList
    /**
     * List growth rates
     * @param \App\DTO\GrowthRateListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function growthRateListRaw(
        \App\DTO\GrowthRateListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/growth-rate/', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List growth rates
     * @param \App\DTO\GrowthRateListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function growthRateList(
        \App\DTO\GrowthRateListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->growthRateListRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\PaginatedGrowthRateSummaryList();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List growth rates
     * @param \App\DTO\GrowthRateListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\PaginatedGrowthRateSummaryList
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function growthRateListResult(
        \App\DTO\GrowthRateListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\PaginatedGrowthRateSummaryList
    {
        return $this->getSuccessfulContent(...$this->growthRateList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region growthRateRetrieve
    /**
     * Get growth rate
     * @param \App\DTO\GrowthRateRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function growthRateRetrieveRaw(
        \App\DTO\GrowthRateRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/growth-rate/{id}/', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get growth rate
     * @param \App\DTO\GrowthRateRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function growthRateRetrieve(
        \App\DTO\GrowthRateRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->growthRateRetrieveRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\GrowthRateDetail();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get growth rate
     * @param \App\DTO\GrowthRateRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\GrowthRateDetail
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function growthRateRetrieveResult(
        \App\DTO\GrowthRateRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\GrowthRateDetail
    {
        return $this->getSuccessfulContent(...$this->growthRateRetrieve($parameters, $security, $responseMediaType));
    }
    //endregion

    //region itemAttributeList
    /**
     * List item attributes
     * @param \App\DTO\ItemAttributeListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function itemAttributeListRaw(
        \App\DTO\ItemAttributeListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/item-attribute/', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List item attributes
     * @param \App\DTO\ItemAttributeListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function itemAttributeList(
        \App\DTO\ItemAttributeListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->itemAttributeListRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\PaginatedItemAttributeSummaryList();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List item attributes
     * @param \App\DTO\ItemAttributeListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\PaginatedItemAttributeSummaryList
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function itemAttributeListResult(
        \App\DTO\ItemAttributeListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\PaginatedItemAttributeSummaryList
    {
        return $this->getSuccessfulContent(...$this->itemAttributeList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region itemAttributeRetrieve
    /**
     * Get item attribute
     * @param \App\DTO\ItemAttributeRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function itemAttributeRetrieveRaw(
        \App\DTO\ItemAttributeRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/item-attribute/{id}/', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get item attribute
     * @param \App\DTO\ItemAttributeRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function itemAttributeRetrieve(
        \App\DTO\ItemAttributeRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->itemAttributeRetrieveRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\ItemAttributeDetail();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get item attribute
     * @param \App\DTO\ItemAttributeRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\ItemAttributeDetail
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function itemAttributeRetrieveResult(
        \App\DTO\ItemAttributeRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\ItemAttributeDetail
    {
        return $this->getSuccessfulContent(...$this->itemAttributeRetrieve($parameters, $security, $responseMediaType));
    }
    //endregion

    //region itemCategoryList
    /**
     * List item categories
     * @param \App\DTO\ItemCategoryListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function itemCategoryListRaw(
        \App\DTO\ItemCategoryListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/item-category/', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List item categories
     * @param \App\DTO\ItemCategoryListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function itemCategoryList(
        \App\DTO\ItemCategoryListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->itemCategoryListRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\PaginatedItemCategorySummaryList();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List item categories
     * @param \App\DTO\ItemCategoryListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\PaginatedItemCategorySummaryList
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function itemCategoryListResult(
        \App\DTO\ItemCategoryListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\PaginatedItemCategorySummaryList
    {
        return $this->getSuccessfulContent(...$this->itemCategoryList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region itemCategoryRetrieve
    /**
     * Get item category
     * @param \App\DTO\ItemCategoryRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function itemCategoryRetrieveRaw(
        \App\DTO\ItemCategoryRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/item-category/{id}/', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get item category
     * @param \App\DTO\ItemCategoryRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function itemCategoryRetrieve(
        \App\DTO\ItemCategoryRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->itemCategoryRetrieveRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\ItemCategoryDetail();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get item category
     * @param \App\DTO\ItemCategoryRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\ItemCategoryDetail
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function itemCategoryRetrieveResult(
        \App\DTO\ItemCategoryRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\ItemCategoryDetail
    {
        return $this->getSuccessfulContent(...$this->itemCategoryRetrieve($parameters, $security, $responseMediaType));
    }
    //endregion

    //region itemFlingEffectList
    /**
     * List item fling effects
     * @param \App\DTO\ItemFlingEffectListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function itemFlingEffectListRaw(
        \App\DTO\ItemFlingEffectListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/item-fling-effect/', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List item fling effects
     * @param \App\DTO\ItemFlingEffectListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function itemFlingEffectList(
        \App\DTO\ItemFlingEffectListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->itemFlingEffectListRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\PaginatedItemFlingEffectSummaryList();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List item fling effects
     * @param \App\DTO\ItemFlingEffectListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\PaginatedItemFlingEffectSummaryList
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function itemFlingEffectListResult(
        \App\DTO\ItemFlingEffectListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\PaginatedItemFlingEffectSummaryList
    {
        return $this->getSuccessfulContent(...$this->itemFlingEffectList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region itemFlingEffectRetrieve
    /**
     * Get item fling effect
     * @param \App\DTO\ItemFlingEffectRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function itemFlingEffectRetrieveRaw(
        \App\DTO\ItemFlingEffectRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/item-fling-effect/{id}/', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get item fling effect
     * @param \App\DTO\ItemFlingEffectRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function itemFlingEffectRetrieve(
        \App\DTO\ItemFlingEffectRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->itemFlingEffectRetrieveRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\ItemFlingEffectDetail();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get item fling effect
     * @param \App\DTO\ItemFlingEffectRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\ItemFlingEffectDetail
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function itemFlingEffectRetrieveResult(
        \App\DTO\ItemFlingEffectRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\ItemFlingEffectDetail
    {
        return $this->getSuccessfulContent(...$this->itemFlingEffectRetrieve($parameters, $security, $responseMediaType));
    }
    //endregion

    //region itemList
    /**
     * List items
     * @param \App\DTO\ItemListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function itemListRaw(
        \App\DTO\ItemListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/item/', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List items
     * @param \App\DTO\ItemListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function itemList(
        \App\DTO\ItemListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->itemListRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\PaginatedItemSummaryList();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List items
     * @param \App\DTO\ItemListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\PaginatedItemSummaryList
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function itemListResult(
        \App\DTO\ItemListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\PaginatedItemSummaryList
    {
        return $this->getSuccessfulContent(...$this->itemList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region itemPocketList
    /**
     * List item pockets
     * @param \App\DTO\ItemPocketListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function itemPocketListRaw(
        \App\DTO\ItemPocketListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/item-pocket/', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List item pockets
     * @param \App\DTO\ItemPocketListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function itemPocketList(
        \App\DTO\ItemPocketListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->itemPocketListRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\PaginatedItemPocketSummaryList();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List item pockets
     * @param \App\DTO\ItemPocketListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\PaginatedItemPocketSummaryList
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function itemPocketListResult(
        \App\DTO\ItemPocketListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\PaginatedItemPocketSummaryList
    {
        return $this->getSuccessfulContent(...$this->itemPocketList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region itemPocketRetrieve
    /**
     * Get item pocket
     * @param \App\DTO\ItemPocketRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function itemPocketRetrieveRaw(
        \App\DTO\ItemPocketRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/item-pocket/{id}/', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get item pocket
     * @param \App\DTO\ItemPocketRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function itemPocketRetrieve(
        \App\DTO\ItemPocketRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->itemPocketRetrieveRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\ItemPocketDetail();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get item pocket
     * @param \App\DTO\ItemPocketRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\ItemPocketDetail
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function itemPocketRetrieveResult(
        \App\DTO\ItemPocketRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\ItemPocketDetail
    {
        return $this->getSuccessfulContent(...$this->itemPocketRetrieve($parameters, $security, $responseMediaType));
    }
    //endregion

    //region itemRetrieve
    /**
     * Get item
     * @param \App\DTO\ItemRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function itemRetrieveRaw(
        \App\DTO\ItemRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/item/{id}/', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get item
     * @param \App\DTO\ItemRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function itemRetrieve(
        \App\DTO\ItemRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->itemRetrieveRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\ItemDetail();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get item
     * @param \App\DTO\ItemRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\ItemDetail
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function itemRetrieveResult(
        \App\DTO\ItemRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\ItemDetail
    {
        return $this->getSuccessfulContent(...$this->itemRetrieve($parameters, $security, $responseMediaType));
    }
    //endregion

    //region languageList
    /**
     * List languages
     * @param \App\DTO\LanguageListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function languageListRaw(
        \App\DTO\LanguageListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/language/', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List languages
     * @param \App\DTO\LanguageListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function languageList(
        \App\DTO\LanguageListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->languageListRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\PaginatedLanguageSummaryList();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List languages
     * @param \App\DTO\LanguageListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\PaginatedLanguageSummaryList
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function languageListResult(
        \App\DTO\LanguageListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\PaginatedLanguageSummaryList
    {
        return $this->getSuccessfulContent(...$this->languageList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region languageRetrieve
    /**
     * Get language
     * @param \App\DTO\LanguageRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function languageRetrieveRaw(
        \App\DTO\LanguageRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/language/{id}/', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get language
     * @param \App\DTO\LanguageRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function languageRetrieve(
        \App\DTO\LanguageRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->languageRetrieveRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\LanguageDetail();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get language
     * @param \App\DTO\LanguageRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\LanguageDetail
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function languageRetrieveResult(
        \App\DTO\LanguageRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\LanguageDetail
    {
        return $this->getSuccessfulContent(...$this->languageRetrieve($parameters, $security, $responseMediaType));
    }
    //endregion

    //region locationAreaList
    /**
     * List location areas
     * @param \App\DTO\LocationAreaListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function locationAreaListRaw(
        \App\DTO\LocationAreaListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/location-area/', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List location areas
     * @param \App\DTO\LocationAreaListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function locationAreaList(
        \App\DTO\LocationAreaListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->locationAreaListRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\PaginatedLocationAreaSummaryList();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List location areas
     * @param \App\DTO\LocationAreaListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\PaginatedLocationAreaSummaryList
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function locationAreaListResult(
        \App\DTO\LocationAreaListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\PaginatedLocationAreaSummaryList
    {
        return $this->getSuccessfulContent(...$this->locationAreaList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region locationAreaRetrieve
    /**
     * Get location area
     * @param \App\DTO\LocationAreaRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function locationAreaRetrieveRaw(
        \App\DTO\LocationAreaRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/location-area/{id}/', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get location area
     * @param \App\DTO\LocationAreaRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function locationAreaRetrieve(
        \App\DTO\LocationAreaRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->locationAreaRetrieveRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\LocationAreaDetail();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get location area
     * @param \App\DTO\LocationAreaRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\LocationAreaDetail
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function locationAreaRetrieveResult(
        \App\DTO\LocationAreaRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\LocationAreaDetail
    {
        return $this->getSuccessfulContent(...$this->locationAreaRetrieve($parameters, $security, $responseMediaType));
    }
    //endregion

    //region locationList
    /**
     * List locations
     * @param \App\DTO\LocationListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function locationListRaw(
        \App\DTO\LocationListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/location/', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List locations
     * @param \App\DTO\LocationListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function locationList(
        \App\DTO\LocationListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->locationListRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\PaginatedLocationSummaryList();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List locations
     * @param \App\DTO\LocationListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\PaginatedLocationSummaryList
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function locationListResult(
        \App\DTO\LocationListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\PaginatedLocationSummaryList
    {
        return $this->getSuccessfulContent(...$this->locationList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region locationRetrieve
    /**
     * Get location
     * @param \App\DTO\LocationRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function locationRetrieveRaw(
        \App\DTO\LocationRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/location/{id}/', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get location
     * @param \App\DTO\LocationRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function locationRetrieve(
        \App\DTO\LocationRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->locationRetrieveRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\LocationDetail();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get location
     * @param \App\DTO\LocationRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\LocationDetail
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function locationRetrieveResult(
        \App\DTO\LocationRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\LocationDetail
    {
        return $this->getSuccessfulContent(...$this->locationRetrieve($parameters, $security, $responseMediaType));
    }
    //endregion

    //region machineList
    /**
     * List machines
     * @param \App\DTO\MachineListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function machineListRaw(
        \App\DTO\MachineListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/machine/', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List machines
     * @param \App\DTO\MachineListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function machineList(
        \App\DTO\MachineListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->machineListRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\PaginatedMachineSummaryList();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List machines
     * @param \App\DTO\MachineListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\PaginatedMachineSummaryList
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function machineListResult(
        \App\DTO\MachineListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\PaginatedMachineSummaryList
    {
        return $this->getSuccessfulContent(...$this->machineList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region machineRetrieve
    /**
     * Get machine
     * @param \App\DTO\MachineRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function machineRetrieveRaw(
        \App\DTO\MachineRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/machine/{id}/', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get machine
     * @param \App\DTO\MachineRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function machineRetrieve(
        \App\DTO\MachineRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->machineRetrieveRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\MachineDetail();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get machine
     * @param \App\DTO\MachineRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\MachineDetail
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function machineRetrieveResult(
        \App\DTO\MachineRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\MachineDetail
    {
        return $this->getSuccessfulContent(...$this->machineRetrieve($parameters, $security, $responseMediaType));
    }
    //endregion

    //region moveAilmentList
    /**
     * List move meta ailments
     * @param \App\DTO\MoveAilmentListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function moveAilmentListRaw(
        \App\DTO\MoveAilmentListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/move-ailment/', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List move meta ailments
     * @param \App\DTO\MoveAilmentListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function moveAilmentList(
        \App\DTO\MoveAilmentListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->moveAilmentListRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\PaginatedMoveMetaAilmentSummaryList();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List move meta ailments
     * @param \App\DTO\MoveAilmentListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\PaginatedMoveMetaAilmentSummaryList
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function moveAilmentListResult(
        \App\DTO\MoveAilmentListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\PaginatedMoveMetaAilmentSummaryList
    {
        return $this->getSuccessfulContent(...$this->moveAilmentList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region moveAilmentRetrieve
    /**
     * Get move meta ailment
     * @param \App\DTO\MoveAilmentRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function moveAilmentRetrieveRaw(
        \App\DTO\MoveAilmentRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/move-ailment/{id}/', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get move meta ailment
     * @param \App\DTO\MoveAilmentRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function moveAilmentRetrieve(
        \App\DTO\MoveAilmentRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->moveAilmentRetrieveRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\MoveMetaAilmentDetail();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get move meta ailment
     * @param \App\DTO\MoveAilmentRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\MoveMetaAilmentDetail
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function moveAilmentRetrieveResult(
        \App\DTO\MoveAilmentRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\MoveMetaAilmentDetail
    {
        return $this->getSuccessfulContent(...$this->moveAilmentRetrieve($parameters, $security, $responseMediaType));
    }
    //endregion

    //region moveBattleStyleList
    /**
     * List move battle styles
     * @param \App\DTO\MoveBattleStyleListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function moveBattleStyleListRaw(
        \App\DTO\MoveBattleStyleListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/move-battle-style/', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List move battle styles
     * @param \App\DTO\MoveBattleStyleListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function moveBattleStyleList(
        \App\DTO\MoveBattleStyleListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->moveBattleStyleListRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\PaginatedMoveBattleStyleSummaryList();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List move battle styles
     * @param \App\DTO\MoveBattleStyleListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\PaginatedMoveBattleStyleSummaryList
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function moveBattleStyleListResult(
        \App\DTO\MoveBattleStyleListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\PaginatedMoveBattleStyleSummaryList
    {
        return $this->getSuccessfulContent(...$this->moveBattleStyleList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region moveBattleStyleRetrieve
    /**
     * Get move battle style
     * @param \App\DTO\MoveBattleStyleRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function moveBattleStyleRetrieveRaw(
        \App\DTO\MoveBattleStyleRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/move-battle-style/{id}/', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get move battle style
     * @param \App\DTO\MoveBattleStyleRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function moveBattleStyleRetrieve(
        \App\DTO\MoveBattleStyleRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->moveBattleStyleRetrieveRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\MoveBattleStyleDetail();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get move battle style
     * @param \App\DTO\MoveBattleStyleRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\MoveBattleStyleDetail
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function moveBattleStyleRetrieveResult(
        \App\DTO\MoveBattleStyleRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\MoveBattleStyleDetail
    {
        return $this->getSuccessfulContent(...$this->moveBattleStyleRetrieve($parameters, $security, $responseMediaType));
    }
    //endregion

    //region moveCategoryList
    /**
     * List move meta categories
     * @param \App\DTO\MoveCategoryListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function moveCategoryListRaw(
        \App\DTO\MoveCategoryListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/move-category/', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List move meta categories
     * @param \App\DTO\MoveCategoryListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function moveCategoryList(
        \App\DTO\MoveCategoryListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->moveCategoryListRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\PaginatedMoveMetaCategorySummaryList();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List move meta categories
     * @param \App\DTO\MoveCategoryListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\PaginatedMoveMetaCategorySummaryList
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function moveCategoryListResult(
        \App\DTO\MoveCategoryListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\PaginatedMoveMetaCategorySummaryList
    {
        return $this->getSuccessfulContent(...$this->moveCategoryList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region moveCategoryRetrieve
    /**
     * Get move meta category
     * @param \App\DTO\MoveCategoryRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function moveCategoryRetrieveRaw(
        \App\DTO\MoveCategoryRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/move-category/{id}/', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get move meta category
     * @param \App\DTO\MoveCategoryRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function moveCategoryRetrieve(
        \App\DTO\MoveCategoryRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->moveCategoryRetrieveRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\MoveMetaCategoryDetail();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get move meta category
     * @param \App\DTO\MoveCategoryRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\MoveMetaCategoryDetail
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function moveCategoryRetrieveResult(
        \App\DTO\MoveCategoryRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\MoveMetaCategoryDetail
    {
        return $this->getSuccessfulContent(...$this->moveCategoryRetrieve($parameters, $security, $responseMediaType));
    }
    //endregion

    //region moveDamageClassList
    /**
     * List move damage classes
     * @param \App\DTO\MoveDamageClassListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function moveDamageClassListRaw(
        \App\DTO\MoveDamageClassListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/move-damage-class/', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List move damage classes
     * @param \App\DTO\MoveDamageClassListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function moveDamageClassList(
        \App\DTO\MoveDamageClassListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->moveDamageClassListRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\PaginatedMoveDamageClassSummaryList();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List move damage classes
     * @param \App\DTO\MoveDamageClassListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\PaginatedMoveDamageClassSummaryList
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function moveDamageClassListResult(
        \App\DTO\MoveDamageClassListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\PaginatedMoveDamageClassSummaryList
    {
        return $this->getSuccessfulContent(...$this->moveDamageClassList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region moveDamageClassRetrieve
    /**
     * Get move damage class
     * @param \App\DTO\MoveDamageClassRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function moveDamageClassRetrieveRaw(
        \App\DTO\MoveDamageClassRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/move-damage-class/{id}/', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get move damage class
     * @param \App\DTO\MoveDamageClassRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function moveDamageClassRetrieve(
        \App\DTO\MoveDamageClassRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->moveDamageClassRetrieveRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\MoveDamageClassDetail();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get move damage class
     * @param \App\DTO\MoveDamageClassRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\MoveDamageClassDetail
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function moveDamageClassRetrieveResult(
        \App\DTO\MoveDamageClassRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\MoveDamageClassDetail
    {
        return $this->getSuccessfulContent(...$this->moveDamageClassRetrieve($parameters, $security, $responseMediaType));
    }
    //endregion

    //region moveLearnMethodList
    /**
     * List move learn methods
     * @param \App\DTO\MoveLearnMethodListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function moveLearnMethodListRaw(
        \App\DTO\MoveLearnMethodListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/move-learn-method/', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List move learn methods
     * @param \App\DTO\MoveLearnMethodListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function moveLearnMethodList(
        \App\DTO\MoveLearnMethodListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->moveLearnMethodListRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\PaginatedMoveLearnMethodSummaryList();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List move learn methods
     * @param \App\DTO\MoveLearnMethodListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\PaginatedMoveLearnMethodSummaryList
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function moveLearnMethodListResult(
        \App\DTO\MoveLearnMethodListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\PaginatedMoveLearnMethodSummaryList
    {
        return $this->getSuccessfulContent(...$this->moveLearnMethodList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region moveLearnMethodRetrieve
    /**
     * Get move learn method
     * @param \App\DTO\MoveLearnMethodRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function moveLearnMethodRetrieveRaw(
        \App\DTO\MoveLearnMethodRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/move-learn-method/{id}/', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get move learn method
     * @param \App\DTO\MoveLearnMethodRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function moveLearnMethodRetrieve(
        \App\DTO\MoveLearnMethodRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->moveLearnMethodRetrieveRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\MoveLearnMethodDetail();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get move learn method
     * @param \App\DTO\MoveLearnMethodRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\MoveLearnMethodDetail
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function moveLearnMethodRetrieveResult(
        \App\DTO\MoveLearnMethodRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\MoveLearnMethodDetail
    {
        return $this->getSuccessfulContent(...$this->moveLearnMethodRetrieve($parameters, $security, $responseMediaType));
    }
    //endregion

    //region moveList
    /**
     * List moves
     * @param \App\DTO\MoveListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function moveListRaw(
        \App\DTO\MoveListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/move/', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List moves
     * @param \App\DTO\MoveListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function moveList(
        \App\DTO\MoveListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->moveListRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\PaginatedMoveSummaryList();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List moves
     * @param \App\DTO\MoveListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\PaginatedMoveSummaryList
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function moveListResult(
        \App\DTO\MoveListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\PaginatedMoveSummaryList
    {
        return $this->getSuccessfulContent(...$this->moveList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region moveRetrieve
    /**
     * Get move
     * @param \App\DTO\MoveRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function moveRetrieveRaw(
        \App\DTO\MoveRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/move/{id}/', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get move
     * @param \App\DTO\MoveRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function moveRetrieve(
        \App\DTO\MoveRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->moveRetrieveRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\MoveDetail();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get move
     * @param \App\DTO\MoveRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\MoveDetail
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function moveRetrieveResult(
        \App\DTO\MoveRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\MoveDetail
    {
        return $this->getSuccessfulContent(...$this->moveRetrieve($parameters, $security, $responseMediaType));
    }
    //endregion

    //region moveTargetList
    /**
     * List move targets
     * @param \App\DTO\MoveTargetListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function moveTargetListRaw(
        \App\DTO\MoveTargetListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/move-target/', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List move targets
     * @param \App\DTO\MoveTargetListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function moveTargetList(
        \App\DTO\MoveTargetListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->moveTargetListRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\PaginatedMoveTargetSummaryList();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List move targets
     * @param \App\DTO\MoveTargetListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\PaginatedMoveTargetSummaryList
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function moveTargetListResult(
        \App\DTO\MoveTargetListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\PaginatedMoveTargetSummaryList
    {
        return $this->getSuccessfulContent(...$this->moveTargetList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region moveTargetRetrieve
    /**
     * Get move target
     * @param \App\DTO\MoveTargetRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function moveTargetRetrieveRaw(
        \App\DTO\MoveTargetRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/move-target/{id}/', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get move target
     * @param \App\DTO\MoveTargetRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function moveTargetRetrieve(
        \App\DTO\MoveTargetRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->moveTargetRetrieveRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\MoveTargetDetail();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get move target
     * @param \App\DTO\MoveTargetRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\MoveTargetDetail
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function moveTargetRetrieveResult(
        \App\DTO\MoveTargetRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\MoveTargetDetail
    {
        return $this->getSuccessfulContent(...$this->moveTargetRetrieve($parameters, $security, $responseMediaType));
    }
    //endregion

    //region natureList
    /**
     * List natures
     * @param \App\DTO\NatureListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function natureListRaw(
        \App\DTO\NatureListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/nature/', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List natures
     * @param \App\DTO\NatureListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function natureList(
        \App\DTO\NatureListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->natureListRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\PaginatedNatureSummaryList();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List natures
     * @param \App\DTO\NatureListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\PaginatedNatureSummaryList
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function natureListResult(
        \App\DTO\NatureListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\PaginatedNatureSummaryList
    {
        return $this->getSuccessfulContent(...$this->natureList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region natureRetrieve
    /**
     * Get nature
     * @param \App\DTO\NatureRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function natureRetrieveRaw(
        \App\DTO\NatureRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/nature/{id}/', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get nature
     * @param \App\DTO\NatureRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function natureRetrieve(
        \App\DTO\NatureRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->natureRetrieveRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\NatureDetail();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get nature
     * @param \App\DTO\NatureRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\NatureDetail
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function natureRetrieveResult(
        \App\DTO\NatureRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\NatureDetail
    {
        return $this->getSuccessfulContent(...$this->natureRetrieve($parameters, $security, $responseMediaType));
    }
    //endregion

    //region palParkAreaList
    /**
     * List pal park areas
     * @param \App\DTO\PalParkAreaListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function palParkAreaListRaw(
        \App\DTO\PalParkAreaListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/pal-park-area/', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List pal park areas
     * @param \App\DTO\PalParkAreaListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function palParkAreaList(
        \App\DTO\PalParkAreaListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->palParkAreaListRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\PaginatedPalParkAreaSummaryList();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List pal park areas
     * @param \App\DTO\PalParkAreaListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\PaginatedPalParkAreaSummaryList
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function palParkAreaListResult(
        \App\DTO\PalParkAreaListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\PaginatedPalParkAreaSummaryList
    {
        return $this->getSuccessfulContent(...$this->palParkAreaList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region palParkAreaRetrieve
    /**
     * Get pal park area
     * @param \App\DTO\PalParkAreaRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function palParkAreaRetrieveRaw(
        \App\DTO\PalParkAreaRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/pal-park-area/{id}/', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get pal park area
     * @param \App\DTO\PalParkAreaRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function palParkAreaRetrieve(
        \App\DTO\PalParkAreaRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->palParkAreaRetrieveRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\PalParkAreaDetail();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get pal park area
     * @param \App\DTO\PalParkAreaRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\PalParkAreaDetail
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function palParkAreaRetrieveResult(
        \App\DTO\PalParkAreaRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\PalParkAreaDetail
    {
        return $this->getSuccessfulContent(...$this->palParkAreaRetrieve($parameters, $security, $responseMediaType));
    }
    //endregion

    //region pokeathlonStatList
    /**
     * List pokeathlon stats
     * @param \App\DTO\PokeathlonStatListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function pokeathlonStatListRaw(
        \App\DTO\PokeathlonStatListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/pokeathlon-stat/', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List pokeathlon stats
     * @param \App\DTO\PokeathlonStatListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function pokeathlonStatList(
        \App\DTO\PokeathlonStatListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->pokeathlonStatListRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\PaginatedPokeathlonStatSummaryList();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List pokeathlon stats
     * @param \App\DTO\PokeathlonStatListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\PaginatedPokeathlonStatSummaryList
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function pokeathlonStatListResult(
        \App\DTO\PokeathlonStatListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\PaginatedPokeathlonStatSummaryList
    {
        return $this->getSuccessfulContent(...$this->pokeathlonStatList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region pokeathlonStatRetrieve
    /**
     * Get pokeathlon stat
     * @param \App\DTO\PokeathlonStatRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function pokeathlonStatRetrieveRaw(
        \App\DTO\PokeathlonStatRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/pokeathlon-stat/{id}/', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get pokeathlon stat
     * @param \App\DTO\PokeathlonStatRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function pokeathlonStatRetrieve(
        \App\DTO\PokeathlonStatRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->pokeathlonStatRetrieveRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\PokeathlonStatDetail();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get pokeathlon stat
     * @param \App\DTO\PokeathlonStatRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\PokeathlonStatDetail
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function pokeathlonStatRetrieveResult(
        \App\DTO\PokeathlonStatRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\PokeathlonStatDetail
    {
        return $this->getSuccessfulContent(...$this->pokeathlonStatRetrieve($parameters, $security, $responseMediaType));
    }
    //endregion

    //region pokedexList
    /**
     * List pokedex
     * @param \App\DTO\PokedexListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function pokedexListRaw(
        \App\DTO\PokedexListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/pokedex/', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List pokedex
     * @param \App\DTO\PokedexListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function pokedexList(
        \App\DTO\PokedexListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->pokedexListRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\PaginatedPokedexSummaryList();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List pokedex
     * @param \App\DTO\PokedexListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\PaginatedPokedexSummaryList
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function pokedexListResult(
        \App\DTO\PokedexListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\PaginatedPokedexSummaryList
    {
        return $this->getSuccessfulContent(...$this->pokedexList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region pokedexRetrieve
    /**
     * Get pokedex
     * @param \App\DTO\PokedexRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function pokedexRetrieveRaw(
        \App\DTO\PokedexRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/pokedex/{id}/', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get pokedex
     * @param \App\DTO\PokedexRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function pokedexRetrieve(
        \App\DTO\PokedexRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->pokedexRetrieveRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\PokedexDetail();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get pokedex
     * @param \App\DTO\PokedexRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\PokedexDetail
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function pokedexRetrieveResult(
        \App\DTO\PokedexRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\PokedexDetail
    {
        return $this->getSuccessfulContent(...$this->pokedexRetrieve($parameters, $security, $responseMediaType));
    }
    //endregion

    //region pokemonColorList
    /**
     * List pokemon colors
     * @param \App\DTO\PokemonColorListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function pokemonColorListRaw(
        \App\DTO\PokemonColorListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/pokemon-color/', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List pokemon colors
     * @param \App\DTO\PokemonColorListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function pokemonColorList(
        \App\DTO\PokemonColorListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->pokemonColorListRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\PaginatedPokemonColorSummaryList();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List pokemon colors
     * @param \App\DTO\PokemonColorListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\PaginatedPokemonColorSummaryList
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function pokemonColorListResult(
        \App\DTO\PokemonColorListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\PaginatedPokemonColorSummaryList
    {
        return $this->getSuccessfulContent(...$this->pokemonColorList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region pokemonColorRetrieve
    /**
     * Get pokemon color
     * @param \App\DTO\PokemonColorRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function pokemonColorRetrieveRaw(
        \App\DTO\PokemonColorRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/pokemon-color/{id}/', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get pokemon color
     * @param \App\DTO\PokemonColorRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function pokemonColorRetrieve(
        \App\DTO\PokemonColorRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->pokemonColorRetrieveRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\PokemonColorDetail();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get pokemon color
     * @param \App\DTO\PokemonColorRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\PokemonColorDetail
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function pokemonColorRetrieveResult(
        \App\DTO\PokemonColorRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\PokemonColorDetail
    {
        return $this->getSuccessfulContent(...$this->pokemonColorRetrieve($parameters, $security, $responseMediaType));
    }
    //endregion

    //region pokemonFormList
    /**
     * List pokemon forms
     * @param \App\DTO\PokemonFormListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function pokemonFormListRaw(
        \App\DTO\PokemonFormListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/pokemon-form/', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List pokemon forms
     * @param \App\DTO\PokemonFormListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function pokemonFormList(
        \App\DTO\PokemonFormListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->pokemonFormListRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\PaginatedPokemonFormSummaryList();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List pokemon forms
     * @param \App\DTO\PokemonFormListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\PaginatedPokemonFormSummaryList
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function pokemonFormListResult(
        \App\DTO\PokemonFormListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\PaginatedPokemonFormSummaryList
    {
        return $this->getSuccessfulContent(...$this->pokemonFormList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region pokemonFormRetrieve
    /**
     * Get pokemon form
     * @param \App\DTO\PokemonFormRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function pokemonFormRetrieveRaw(
        \App\DTO\PokemonFormRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/pokemon-form/{id}/', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get pokemon form
     * @param \App\DTO\PokemonFormRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function pokemonFormRetrieve(
        \App\DTO\PokemonFormRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->pokemonFormRetrieveRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\PokemonFormDetail();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get pokemon form
     * @param \App\DTO\PokemonFormRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\PokemonFormDetail
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function pokemonFormRetrieveResult(
        \App\DTO\PokemonFormRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\PokemonFormDetail
    {
        return $this->getSuccessfulContent(...$this->pokemonFormRetrieve($parameters, $security, $responseMediaType));
    }
    //endregion

    //region pokemonHabitatList
    /**
     * List pokemom habitas
     * @param \App\DTO\PokemonHabitatListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function pokemonHabitatListRaw(
        \App\DTO\PokemonHabitatListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/pokemon-habitat/', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List pokemom habitas
     * @param \App\DTO\PokemonHabitatListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function pokemonHabitatList(
        \App\DTO\PokemonHabitatListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->pokemonHabitatListRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\PaginatedPokemonHabitatSummaryList();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List pokemom habitas
     * @param \App\DTO\PokemonHabitatListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\PaginatedPokemonHabitatSummaryList
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function pokemonHabitatListResult(
        \App\DTO\PokemonHabitatListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\PaginatedPokemonHabitatSummaryList
    {
        return $this->getSuccessfulContent(...$this->pokemonHabitatList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region pokemonHabitatRetrieve
    /**
     * Get pokemom habita
     * @param \App\DTO\PokemonHabitatRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function pokemonHabitatRetrieveRaw(
        \App\DTO\PokemonHabitatRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/pokemon-habitat/{id}/', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get pokemom habita
     * @param \App\DTO\PokemonHabitatRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function pokemonHabitatRetrieve(
        \App\DTO\PokemonHabitatRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->pokemonHabitatRetrieveRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\PokemonHabitatDetail();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get pokemom habita
     * @param \App\DTO\PokemonHabitatRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\PokemonHabitatDetail
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function pokemonHabitatRetrieveResult(
        \App\DTO\PokemonHabitatRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\PokemonHabitatDetail
    {
        return $this->getSuccessfulContent(...$this->pokemonHabitatRetrieve($parameters, $security, $responseMediaType));
    }
    //endregion

    //region pokemonList
    /**
     * List pokemon
     * @param \App\DTO\PokemonListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function pokemonListRaw(
        \App\DTO\PokemonListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/pokemon/', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List pokemon
     * @param \App\DTO\PokemonListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function pokemonList(
        \App\DTO\PokemonListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->pokemonListRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\PaginatedPokemonSummaryList();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List pokemon
     * @param \App\DTO\PokemonListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\PaginatedPokemonSummaryList
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function pokemonListResult(
        \App\DTO\PokemonListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\PaginatedPokemonSummaryList
    {
        return $this->getSuccessfulContent(...$this->pokemonList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region pokemonRetrieve
    /**
     * Get pokemon
     * @param \App\DTO\PokemonRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function pokemonRetrieveRaw(
        \App\DTO\PokemonRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/pokemon/{id}/', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get pokemon
     * @param \App\DTO\PokemonRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function pokemonRetrieve(
        \App\DTO\PokemonRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->pokemonRetrieveRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\PokemonDetail();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get pokemon
     * @param \App\DTO\PokemonRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\PokemonDetail
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function pokemonRetrieveResult(
        \App\DTO\PokemonRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\PokemonDetail
    {
        return $this->getSuccessfulContent(...$this->pokemonRetrieve($parameters, $security, $responseMediaType));
    }
    //endregion

    //region pokemonShapeList
    /**
     * List pokemon shapes
     * @param \App\DTO\PokemonShapeListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function pokemonShapeListRaw(
        \App\DTO\PokemonShapeListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/pokemon-shape/', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List pokemon shapes
     * @param \App\DTO\PokemonShapeListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function pokemonShapeList(
        \App\DTO\PokemonShapeListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->pokemonShapeListRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\PaginatedPokemonShapeSummaryList();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List pokemon shapes
     * @param \App\DTO\PokemonShapeListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\PaginatedPokemonShapeSummaryList
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function pokemonShapeListResult(
        \App\DTO\PokemonShapeListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\PaginatedPokemonShapeSummaryList
    {
        return $this->getSuccessfulContent(...$this->pokemonShapeList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region pokemonShapeRetrieve
    /**
     * Get pokemon shape
     * @param \App\DTO\PokemonShapeRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function pokemonShapeRetrieveRaw(
        \App\DTO\PokemonShapeRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/pokemon-shape/{id}/', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get pokemon shape
     * @param \App\DTO\PokemonShapeRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function pokemonShapeRetrieve(
        \App\DTO\PokemonShapeRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->pokemonShapeRetrieveRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\PokemonShapeDetail();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get pokemon shape
     * @param \App\DTO\PokemonShapeRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\PokemonShapeDetail
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function pokemonShapeRetrieveResult(
        \App\DTO\PokemonShapeRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\PokemonShapeDetail
    {
        return $this->getSuccessfulContent(...$this->pokemonShapeRetrieve($parameters, $security, $responseMediaType));
    }
    //endregion

    //region pokemonSpeciesList
    /**
     * List pokemon species
     * @param \App\DTO\PokemonSpeciesListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function pokemonSpeciesListRaw(
        \App\DTO\PokemonSpeciesListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/pokemon-species/', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List pokemon species
     * @param \App\DTO\PokemonSpeciesListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function pokemonSpeciesList(
        \App\DTO\PokemonSpeciesListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->pokemonSpeciesListRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\PaginatedPokemonSpeciesSummaryList();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List pokemon species
     * @param \App\DTO\PokemonSpeciesListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\PaginatedPokemonSpeciesSummaryList
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function pokemonSpeciesListResult(
        \App\DTO\PokemonSpeciesListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\PaginatedPokemonSpeciesSummaryList
    {
        return $this->getSuccessfulContent(...$this->pokemonSpeciesList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region pokemonSpeciesRetrieve
    /**
     * Get pokemon species
     * @param \App\DTO\PokemonSpeciesRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function pokemonSpeciesRetrieveRaw(
        \App\DTO\PokemonSpeciesRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/pokemon-species/{id}/', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get pokemon species
     * @param \App\DTO\PokemonSpeciesRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function pokemonSpeciesRetrieve(
        \App\DTO\PokemonSpeciesRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->pokemonSpeciesRetrieveRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\PokemonSpeciesDetail();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get pokemon species
     * @param \App\DTO\PokemonSpeciesRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\PokemonSpeciesDetail
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function pokemonSpeciesRetrieveResult(
        \App\DTO\PokemonSpeciesRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\PokemonSpeciesDetail
    {
        return $this->getSuccessfulContent(...$this->pokemonSpeciesRetrieve($parameters, $security, $responseMediaType));
    }
    //endregion

    //region regionList
    /**
     * List regions
     * @param \App\DTO\RegionListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function regionListRaw(
        \App\DTO\RegionListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/region/', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List regions
     * @param \App\DTO\RegionListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function regionList(
        \App\DTO\RegionListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->regionListRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\PaginatedRegionSummaryList();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List regions
     * @param \App\DTO\RegionListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\PaginatedRegionSummaryList
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function regionListResult(
        \App\DTO\RegionListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\PaginatedRegionSummaryList
    {
        return $this->getSuccessfulContent(...$this->regionList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region regionRetrieve
    /**
     * Get region
     * @param \App\DTO\RegionRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function regionRetrieveRaw(
        \App\DTO\RegionRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/region/{id}/', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get region
     * @param \App\DTO\RegionRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function regionRetrieve(
        \App\DTO\RegionRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->regionRetrieveRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\RegionDetail();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get region
     * @param \App\DTO\RegionRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\RegionDetail
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function regionRetrieveResult(
        \App\DTO\RegionRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\RegionDetail
    {
        return $this->getSuccessfulContent(...$this->regionRetrieve($parameters, $security, $responseMediaType));
    }
    //endregion

    //region statList
    /**
     * List stats
     * @param \App\DTO\StatListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function statListRaw(
        \App\DTO\StatListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/stat/', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List stats
     * @param \App\DTO\StatListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function statList(
        \App\DTO\StatListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->statListRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\PaginatedStatSummaryList();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List stats
     * @param \App\DTO\StatListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\PaginatedStatSummaryList
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function statListResult(
        \App\DTO\StatListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\PaginatedStatSummaryList
    {
        return $this->getSuccessfulContent(...$this->statList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region statRetrieve
    /**
     * Get stat
     * @param \App\DTO\StatRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function statRetrieveRaw(
        \App\DTO\StatRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/stat/{id}/', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get stat
     * @param \App\DTO\StatRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function statRetrieve(
        \App\DTO\StatRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->statRetrieveRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\StatDetail();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get stat
     * @param \App\DTO\StatRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\StatDetail
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function statRetrieveResult(
        \App\DTO\StatRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\StatDetail
    {
        return $this->getSuccessfulContent(...$this->statRetrieve($parameters, $security, $responseMediaType));
    }
    //endregion

    //region superContestEffectList
    /**
     * List super contest effects
     * @param \App\DTO\SuperContestEffectListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function superContestEffectListRaw(
        \App\DTO\SuperContestEffectListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/super-contest-effect/', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List super contest effects
     * @param \App\DTO\SuperContestEffectListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function superContestEffectList(
        \App\DTO\SuperContestEffectListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->superContestEffectListRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\PaginatedSuperContestEffectSummaryList();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List super contest effects
     * @param \App\DTO\SuperContestEffectListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\PaginatedSuperContestEffectSummaryList
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function superContestEffectListResult(
        \App\DTO\SuperContestEffectListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\PaginatedSuperContestEffectSummaryList
    {
        return $this->getSuccessfulContent(...$this->superContestEffectList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region superContestEffectRetrieve
    /**
     * Get super contest effect
     * @param \App\DTO\SuperContestEffectRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function superContestEffectRetrieveRaw(
        \App\DTO\SuperContestEffectRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/super-contest-effect/{id}/', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get super contest effect
     * @param \App\DTO\SuperContestEffectRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function superContestEffectRetrieve(
        \App\DTO\SuperContestEffectRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->superContestEffectRetrieveRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\SuperContestEffectDetail();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get super contest effect
     * @param \App\DTO\SuperContestEffectRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\SuperContestEffectDetail
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function superContestEffectRetrieveResult(
        \App\DTO\SuperContestEffectRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\SuperContestEffectDetail
    {
        return $this->getSuccessfulContent(...$this->superContestEffectRetrieve($parameters, $security, $responseMediaType));
    }
    //endregion

    //region typeList
    /**
     * List types
     * @param \App\DTO\TypeListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function typeListRaw(
        \App\DTO\TypeListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/type/', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List types
     * @param \App\DTO\TypeListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function typeList(
        \App\DTO\TypeListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->typeListRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\PaginatedTypeSummaryList();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List types
     * @param \App\DTO\TypeListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\PaginatedTypeSummaryList
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function typeListResult(
        \App\DTO\TypeListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\PaginatedTypeSummaryList
    {
        return $this->getSuccessfulContent(...$this->typeList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region typeRetrieve
    /**
     * Get types
     * @param \App\DTO\TypeRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function typeRetrieveRaw(
        \App\DTO\TypeRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/type/{id}/', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get types
     * @param \App\DTO\TypeRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function typeRetrieve(
        \App\DTO\TypeRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->typeRetrieveRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\TypeDetail();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get types
     * @param \App\DTO\TypeRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\TypeDetail
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function typeRetrieveResult(
        \App\DTO\TypeRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\TypeDetail
    {
        return $this->getSuccessfulContent(...$this->typeRetrieve($parameters, $security, $responseMediaType));
    }
    //endregion

    //region versionGroupList
    /**
     * List version groups
     * @param \App\DTO\VersionGroupListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function versionGroupListRaw(
        \App\DTO\VersionGroupListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/version-group/', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List version groups
     * @param \App\DTO\VersionGroupListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function versionGroupList(
        \App\DTO\VersionGroupListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->versionGroupListRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\PaginatedVersionGroupSummaryList();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List version groups
     * @param \App\DTO\VersionGroupListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\PaginatedVersionGroupSummaryList
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function versionGroupListResult(
        \App\DTO\VersionGroupListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\PaginatedVersionGroupSummaryList
    {
        return $this->getSuccessfulContent(...$this->versionGroupList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region versionGroupRetrieve
    /**
     * Get version group
     * @param \App\DTO\VersionGroupRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function versionGroupRetrieveRaw(
        \App\DTO\VersionGroupRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/version-group/{id}/', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get version group
     * @param \App\DTO\VersionGroupRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function versionGroupRetrieve(
        \App\DTO\VersionGroupRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->versionGroupRetrieveRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\VersionGroupDetail();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get version group
     * @param \App\DTO\VersionGroupRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\VersionGroupDetail
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function versionGroupRetrieveResult(
        \App\DTO\VersionGroupRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\VersionGroupDetail
    {
        return $this->getSuccessfulContent(...$this->versionGroupRetrieve($parameters, $security, $responseMediaType));
    }
    //endregion

    //region versionList
    /**
     * List versions
     * @param \App\DTO\VersionListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function versionListRaw(
        \App\DTO\VersionListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/version/', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List versions
     * @param \App\DTO\VersionListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function versionList(
        \App\DTO\VersionListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->versionListRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\PaginatedVersionSummaryList();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List versions
     * @param \App\DTO\VersionListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\PaginatedVersionSummaryList
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function versionListResult(
        \App\DTO\VersionListParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\PaginatedVersionSummaryList
    {
        return $this->getSuccessfulContent(...$this->versionList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region versionRetrieve
    /**
     * Get version
     * @param \App\DTO\VersionRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function versionRetrieveRaw(
        \App\DTO\VersionRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/api/v2/version/{id}/', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get version
     * @param \App\DTO\VersionRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function versionRetrieve(
        \App\DTO\VersionRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->versionRetrieveRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /*  */
                $responseContent = new \App\DTO\VersionDetail();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get version
     * @param \App\DTO\VersionRetrieveParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\VersionDetail
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function versionRetrieveResult(
        \App\DTO\VersionRetrieveParameterData $parameters,
        iterable $security = ['basicAuth' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\VersionDetail
    {
        return $this->getSuccessfulContent(...$this->versionRetrieve($parameters, $security, $responseMediaType));
    }
    //endregion
}

