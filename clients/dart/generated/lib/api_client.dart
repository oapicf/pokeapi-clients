//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ApiClient {
  ApiClient({this.basePath = 'https://pokeapi.co', this.authentication,});

  final String basePath;
  final Authentication? authentication;

  var _client = Client();
  final _defaultHeaderMap = <String, String>{};

  /// Returns the current HTTP [Client] instance to use in this class.
  ///
  /// The return value is guaranteed to never be null.
  Client get client => _client;

  /// Requests to use a new HTTP [Client] in this class.
  set client(Client newClient) {
    _client = newClient;
  }

  Map<String, String> get defaultHeaderMap => _defaultHeaderMap;

  void addDefaultHeader(String key, String value) {
     _defaultHeaderMap[key] = value;
  }

  // We don't use a Map<String, String> for queryParams.
  // If collectionFormat is 'multi', a key might appear multiple times.
  Future<Response> invokeAPI(
    String path,
    String method,
    List<QueryParam> queryParams,
    Object? body,
    Map<String, String> headerParams,
    Map<String, String> formParams,
    String? contentType,
  ) async {
    await authentication?.applyToParams(queryParams, headerParams);

    headerParams.addAll(_defaultHeaderMap);
    if (contentType != null) {
      headerParams['Content-Type'] = contentType;
    }

    final urlEncodedQueryParams = queryParams.map((param) => '$param');
    final queryString = urlEncodedQueryParams.isNotEmpty ? '?${urlEncodedQueryParams.join('&')}' : '';
    final uri = Uri.parse('$basePath$path$queryString');

    try {
      // Special case for uploading a single file which isn't a 'multipart/form-data'.
      if (
        body is MultipartFile && (contentType == null ||
        !contentType.toLowerCase().startsWith('multipart/form-data'))
      ) {
        final request = StreamedRequest(method, uri);
        request.headers.addAll(headerParams);
        request.contentLength = body.length;
        body.finalize().listen(
          request.sink.add,
          onDone: request.sink.close,
          // ignore: avoid_types_on_closure_parameters
          onError: (Object error, StackTrace trace) => request.sink.close(),
          cancelOnError: true,
        );
        final response = await _client.send(request);
        return Response.fromStream(response);
      }

      if (body is MultipartRequest) {
        final request = MultipartRequest(method, uri);
        request.fields.addAll(body.fields);
        request.files.addAll(body.files);
        request.headers.addAll(body.headers);
        request.headers.addAll(headerParams);
        final response = await _client.send(request);
        return Response.fromStream(response);
      }

      final msgBody = contentType == 'application/x-www-form-urlencoded'
        ? formParams
        : await serializeAsync(body);
      final nullableHeaderParams = headerParams.isEmpty ? null : headerParams;

      switch(method) {
        case 'POST': return await _client.post(uri, headers: nullableHeaderParams, body: msgBody,);
        case 'PUT': return await _client.put(uri, headers: nullableHeaderParams, body: msgBody,);
        case 'DELETE': return await _client.delete(uri, headers: nullableHeaderParams, body: msgBody,);
        case 'PATCH': return await _client.patch(uri, headers: nullableHeaderParams, body: msgBody,);
        case 'HEAD': return await _client.head(uri, headers: nullableHeaderParams,);
        case 'GET': return await _client.get(uri, headers: nullableHeaderParams,);
      }
    } on SocketException catch (error, trace) {
      throw ApiException.withInner(
        HttpStatus.badRequest,
        'Socket operation failed: $method $path',
        error,
        trace,
      );
    } on TlsException catch (error, trace) {
      throw ApiException.withInner(
        HttpStatus.badRequest,
        'TLS/SSL communication failed: $method $path',
        error,
        trace,
      );
    } on IOException catch (error, trace) {
      throw ApiException.withInner(
        HttpStatus.badRequest,
        'I/O operation failed: $method $path',
        error,
        trace,
      );
    } on ClientException catch (error, trace) {
      throw ApiException.withInner(
        HttpStatus.badRequest,
        'HTTP connection failed: $method $path',
        error,
        trace,
      );
    } on Exception catch (error, trace) {
      throw ApiException.withInner(
        HttpStatus.badRequest,
        'Exception occurred: $method $path',
        error,
        trace,
      );
    }

    throw ApiException(
      HttpStatus.badRequest,
      'Invalid HTTP operation: $method $path',
    );
  }

  Future<dynamic> deserializeAsync(String value, String targetType, {bool growable = false,}) async =>
    // ignore: deprecated_member_use_from_same_package
    deserialize(value, targetType, growable: growable);

  @Deprecated('Scheduled for removal in OpenAPI Generator 6.x. Use deserializeAsync() instead.')
  dynamic deserialize(String value, String targetType, {bool growable = false,}) {
    // Remove all spaces. Necessary for regular expressions as well.
    targetType = targetType.replaceAll(' ', ''); // ignore: parameter_assignments

    // If the expected target type is String, nothing to do...
    return targetType == 'String'
      ? value
      : fromJson(json.decode(value), targetType, growable: growable);
  }

  // ignore: deprecated_member_use_from_same_package
  Future<String> serializeAsync(Object? value) async => serialize(value);

  @Deprecated('Scheduled for removal in OpenAPI Generator 6.x. Use serializeAsync() instead.')
  String serialize(Object? value) => value == null ? '' : json.encode(value);

  /// Returns a native instance of an OpenAPI class matching the [specified type][targetType].
  static dynamic fromJson(dynamic value, String targetType, {bool growable = false,}) {
    try {
      switch (targetType) {
        case 'String':
          return value is String ? value : value.toString();
        case 'int':
          return value is int ? value : int.parse('$value');
        case 'double':
          return value is double ? value : double.parse('$value');
        case 'bool':
          if (value is bool) {
            return value;
          }
          final valueString = '$value'.toLowerCase();
          return valueString == 'true' || valueString == '1';
        case 'DateTime':
          return value is DateTime ? value : DateTime.tryParse(value);
        case 'AbilityChange':
          return AbilityChange.fromJson(value);
        case 'AbilityChangeEffectText':
          return AbilityChangeEffectText.fromJson(value);
        case 'AbilityDetail':
          return AbilityDetail.fromJson(value);
        case 'AbilityDetailPokemonInner':
          return AbilityDetailPokemonInner.fromJson(value);
        case 'AbilityDetailPokemonInnerPokemon':
          return AbilityDetailPokemonInnerPokemon.fromJson(value);
        case 'AbilityEffectText':
          return AbilityEffectText.fromJson(value);
        case 'AbilityFlavorText':
          return AbilityFlavorText.fromJson(value);
        case 'AbilityName':
          return AbilityName.fromJson(value);
        case 'AbilitySummary':
          return AbilitySummary.fromJson(value);
        case 'BerryDetail':
          return BerryDetail.fromJson(value);
        case 'BerryDetailFlavorsInner':
          return BerryDetailFlavorsInner.fromJson(value);
        case 'BerryDetailFlavorsInnerFlavor':
          return BerryDetailFlavorsInnerFlavor.fromJson(value);
        case 'BerryFirmnessDetail':
          return BerryFirmnessDetail.fromJson(value);
        case 'BerryFirmnessName':
          return BerryFirmnessName.fromJson(value);
        case 'BerryFirmnessSummary':
          return BerryFirmnessSummary.fromJson(value);
        case 'BerryFlavorDetail':
          return BerryFlavorDetail.fromJson(value);
        case 'BerryFlavorDetailBerriesInner':
          return BerryFlavorDetailBerriesInner.fromJson(value);
        case 'BerryFlavorDetailBerriesInnerBerry':
          return BerryFlavorDetailBerriesInnerBerry.fromJson(value);
        case 'BerryFlavorName':
          return BerryFlavorName.fromJson(value);
        case 'BerryFlavorSummary':
          return BerryFlavorSummary.fromJson(value);
        case 'BerrySummary':
          return BerrySummary.fromJson(value);
        case 'CharacteristicDescription':
          return CharacteristicDescription.fromJson(value);
        case 'CharacteristicDetail':
          return CharacteristicDetail.fromJson(value);
        case 'CharacteristicSummary':
          return CharacteristicSummary.fromJson(value);
        case 'ContestEffectDetail':
          return ContestEffectDetail.fromJson(value);
        case 'ContestEffectEffectText':
          return ContestEffectEffectText.fromJson(value);
        case 'ContestEffectFlavorText':
          return ContestEffectFlavorText.fromJson(value);
        case 'ContestEffectSummary':
          return ContestEffectSummary.fromJson(value);
        case 'ContestTypeDetail':
          return ContestTypeDetail.fromJson(value);
        case 'ContestTypeName':
          return ContestTypeName.fromJson(value);
        case 'ContestTypeSummary':
          return ContestTypeSummary.fromJson(value);
        case 'EggGroupDetail':
          return EggGroupDetail.fromJson(value);
        case 'EggGroupDetailPokemonSpeciesInner':
          return EggGroupDetailPokemonSpeciesInner.fromJson(value);
        case 'EggGroupName':
          return EggGroupName.fromJson(value);
        case 'EggGroupSummary':
          return EggGroupSummary.fromJson(value);
        case 'EncounterConditionDetail':
          return EncounterConditionDetail.fromJson(value);
        case 'EncounterConditionName':
          return EncounterConditionName.fromJson(value);
        case 'EncounterConditionSummary':
          return EncounterConditionSummary.fromJson(value);
        case 'EncounterConditionValueDetail':
          return EncounterConditionValueDetail.fromJson(value);
        case 'EncounterConditionValueName':
          return EncounterConditionValueName.fromJson(value);
        case 'EncounterConditionValueSummary':
          return EncounterConditionValueSummary.fromJson(value);
        case 'EncounterMethodDetail':
          return EncounterMethodDetail.fromJson(value);
        case 'EncounterMethodName':
          return EncounterMethodName.fromJson(value);
        case 'EncounterMethodSummary':
          return EncounterMethodSummary.fromJson(value);
        case 'EvolutionChainDetail':
          return EvolutionChainDetail.fromJson(value);
        case 'EvolutionChainDetailChain':
          return EvolutionChainDetailChain.fromJson(value);
        case 'EvolutionChainDetailChainEvolvesToInner':
          return EvolutionChainDetailChainEvolvesToInner.fromJson(value);
        case 'EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner':
          return EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner.fromJson(value);
        case 'EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender':
          return EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender.fromJson(value);
        case 'EvolutionChainSummary':
          return EvolutionChainSummary.fromJson(value);
        case 'EvolutionTriggerDetail':
          return EvolutionTriggerDetail.fromJson(value);
        case 'EvolutionTriggerName':
          return EvolutionTriggerName.fromJson(value);
        case 'EvolutionTriggerSummary':
          return EvolutionTriggerSummary.fromJson(value);
        case 'Experience':
          return Experience.fromJson(value);
        case 'GenderDetail':
          return GenderDetail.fromJson(value);
        case 'GenderDetailPokemonSpeciesDetailsInner':
          return GenderDetailPokemonSpeciesDetailsInner.fromJson(value);
        case 'GenderSummary':
          return GenderSummary.fromJson(value);
        case 'GenerationDetail':
          return GenerationDetail.fromJson(value);
        case 'GenerationName':
          return GenerationName.fromJson(value);
        case 'GenerationSummary':
          return GenerationSummary.fromJson(value);
        case 'GrowthRateDescription':
          return GrowthRateDescription.fromJson(value);
        case 'GrowthRateDetail':
          return GrowthRateDetail.fromJson(value);
        case 'GrowthRateSummary':
          return GrowthRateSummary.fromJson(value);
        case 'ItemAttributeDescription':
          return ItemAttributeDescription.fromJson(value);
        case 'ItemAttributeDetail':
          return ItemAttributeDetail.fromJson(value);
        case 'ItemAttributeName':
          return ItemAttributeName.fromJson(value);
        case 'ItemAttributeSummary':
          return ItemAttributeSummary.fromJson(value);
        case 'ItemCategoryDetail':
          return ItemCategoryDetail.fromJson(value);
        case 'ItemCategoryName':
          return ItemCategoryName.fromJson(value);
        case 'ItemCategorySummary':
          return ItemCategorySummary.fromJson(value);
        case 'ItemDetail':
          return ItemDetail.fromJson(value);
        case 'ItemDetailBabyTriggerFor':
          return ItemDetailBabyTriggerFor.fromJson(value);
        case 'ItemDetailHeldByPokemonInner':
          return ItemDetailHeldByPokemonInner.fromJson(value);
        case 'ItemDetailHeldByPokemonInnerVersionDetailsInner':
          return ItemDetailHeldByPokemonInnerVersionDetailsInner.fromJson(value);
        case 'ItemDetailMachinesInner':
          return ItemDetailMachinesInner.fromJson(value);
        case 'ItemDetailSprites':
          return ItemDetailSprites.fromJson(value);
        case 'ItemEffectText':
          return ItemEffectText.fromJson(value);
        case 'ItemFlavorText':
          return ItemFlavorText.fromJson(value);
        case 'ItemFlingEffectDetail':
          return ItemFlingEffectDetail.fromJson(value);
        case 'ItemFlingEffectEffectText':
          return ItemFlingEffectEffectText.fromJson(value);
        case 'ItemFlingEffectSummary':
          return ItemFlingEffectSummary.fromJson(value);
        case 'ItemGameIndex':
          return ItemGameIndex.fromJson(value);
        case 'ItemName':
          return ItemName.fromJson(value);
        case 'ItemPocketDetail':
          return ItemPocketDetail.fromJson(value);
        case 'ItemPocketName':
          return ItemPocketName.fromJson(value);
        case 'ItemPocketSummary':
          return ItemPocketSummary.fromJson(value);
        case 'ItemSummary':
          return ItemSummary.fromJson(value);
        case 'LanguageDetail':
          return LanguageDetail.fromJson(value);
        case 'LanguageName':
          return LanguageName.fromJson(value);
        case 'LanguageSummary':
          return LanguageSummary.fromJson(value);
        case 'LocationAreaDetail':
          return LocationAreaDetail.fromJson(value);
        case 'LocationAreaDetailEncounterMethodRatesInner':
          return LocationAreaDetailEncounterMethodRatesInner.fromJson(value);
        case 'LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner':
          return LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner.fromJson(value);
        case 'LocationAreaDetailPokemonEncountersInner':
          return LocationAreaDetailPokemonEncountersInner.fromJson(value);
        case 'LocationAreaDetailPokemonEncountersInnerVersionDetailsInner':
          return LocationAreaDetailPokemonEncountersInnerVersionDetailsInner.fromJson(value);
        case 'LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails':
          return LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails.fromJson(value);
        case 'LocationAreaName':
          return LocationAreaName.fromJson(value);
        case 'LocationAreaSummary':
          return LocationAreaSummary.fromJson(value);
        case 'LocationDetail':
          return LocationDetail.fromJson(value);
        case 'LocationGameIndex':
          return LocationGameIndex.fromJson(value);
        case 'LocationName':
          return LocationName.fromJson(value);
        case 'LocationSummary':
          return LocationSummary.fromJson(value);
        case 'MachineDetail':
          return MachineDetail.fromJson(value);
        case 'MachineSummary':
          return MachineSummary.fromJson(value);
        case 'MoveBattleStyleDetail':
          return MoveBattleStyleDetail.fromJson(value);
        case 'MoveBattleStyleName':
          return MoveBattleStyleName.fromJson(value);
        case 'MoveBattleStyleSummary':
          return MoveBattleStyleSummary.fromJson(value);
        case 'MoveChange':
          return MoveChange.fromJson(value);
        case 'MoveChangeEffectEntriesInner':
          return MoveChangeEffectEntriesInner.fromJson(value);
        case 'MoveDamageClassDescription':
          return MoveDamageClassDescription.fromJson(value);
        case 'MoveDamageClassDetail':
          return MoveDamageClassDetail.fromJson(value);
        case 'MoveDamageClassName':
          return MoveDamageClassName.fromJson(value);
        case 'MoveDamageClassSummary':
          return MoveDamageClassSummary.fromJson(value);
        case 'MoveDetail':
          return MoveDetail.fromJson(value);
        case 'MoveDetailContestCombos':
          return MoveDetailContestCombos.fromJson(value);
        case 'MoveDetailContestCombosNormal':
          return MoveDetailContestCombosNormal.fromJson(value);
        case 'MoveDetailEffectChangesInner':
          return MoveDetailEffectChangesInner.fromJson(value);
        case 'MoveDetailEffectChangesInnerEffectEntriesInner':
          return MoveDetailEffectChangesInnerEffectEntriesInner.fromJson(value);
        case 'MoveDetailMachinesInner':
          return MoveDetailMachinesInner.fromJson(value);
        case 'MoveDetailMachinesInnerMachine':
          return MoveDetailMachinesInnerMachine.fromJson(value);
        case 'MoveDetailStatChangesInner':
          return MoveDetailStatChangesInner.fromJson(value);
        case 'MoveFlavorText':
          return MoveFlavorText.fromJson(value);
        case 'MoveLearnMethodDescription':
          return MoveLearnMethodDescription.fromJson(value);
        case 'MoveLearnMethodDetail':
          return MoveLearnMethodDetail.fromJson(value);
        case 'MoveLearnMethodName':
          return MoveLearnMethodName.fromJson(value);
        case 'MoveLearnMethodSummary':
          return MoveLearnMethodSummary.fromJson(value);
        case 'MoveMeta':
          return MoveMeta.fromJson(value);
        case 'MoveMetaAilmentDetail':
          return MoveMetaAilmentDetail.fromJson(value);
        case 'MoveMetaAilmentName':
          return MoveMetaAilmentName.fromJson(value);
        case 'MoveMetaAilmentSummary':
          return MoveMetaAilmentSummary.fromJson(value);
        case 'MoveMetaCategoryDescription':
          return MoveMetaCategoryDescription.fromJson(value);
        case 'MoveMetaCategoryDetail':
          return MoveMetaCategoryDetail.fromJson(value);
        case 'MoveMetaCategorySummary':
          return MoveMetaCategorySummary.fromJson(value);
        case 'MoveName':
          return MoveName.fromJson(value);
        case 'MoveSummary':
          return MoveSummary.fromJson(value);
        case 'MoveTargetDescription':
          return MoveTargetDescription.fromJson(value);
        case 'MoveTargetDetail':
          return MoveTargetDetail.fromJson(value);
        case 'MoveTargetName':
          return MoveTargetName.fromJson(value);
        case 'MoveTargetSummary':
          return MoveTargetSummary.fromJson(value);
        case 'NatureBattleStylePreference':
          return NatureBattleStylePreference.fromJson(value);
        case 'NatureDetail':
          return NatureDetail.fromJson(value);
        case 'NatureDetailPokeathlonStatChangesInner':
          return NatureDetailPokeathlonStatChangesInner.fromJson(value);
        case 'NatureName':
          return NatureName.fromJson(value);
        case 'NatureSummary':
          return NatureSummary.fromJson(value);
        case 'PaginatedAbilitySummaryList':
          return PaginatedAbilitySummaryList.fromJson(value);
        case 'PaginatedBerryFirmnessSummaryList':
          return PaginatedBerryFirmnessSummaryList.fromJson(value);
        case 'PaginatedBerryFlavorSummaryList':
          return PaginatedBerryFlavorSummaryList.fromJson(value);
        case 'PaginatedBerrySummaryList':
          return PaginatedBerrySummaryList.fromJson(value);
        case 'PaginatedCharacteristicSummaryList':
          return PaginatedCharacteristicSummaryList.fromJson(value);
        case 'PaginatedContestEffectSummaryList':
          return PaginatedContestEffectSummaryList.fromJson(value);
        case 'PaginatedContestTypeSummaryList':
          return PaginatedContestTypeSummaryList.fromJson(value);
        case 'PaginatedEggGroupSummaryList':
          return PaginatedEggGroupSummaryList.fromJson(value);
        case 'PaginatedEncounterConditionSummaryList':
          return PaginatedEncounterConditionSummaryList.fromJson(value);
        case 'PaginatedEncounterConditionValueSummaryList':
          return PaginatedEncounterConditionValueSummaryList.fromJson(value);
        case 'PaginatedEncounterMethodSummaryList':
          return PaginatedEncounterMethodSummaryList.fromJson(value);
        case 'PaginatedEvolutionChainSummaryList':
          return PaginatedEvolutionChainSummaryList.fromJson(value);
        case 'PaginatedEvolutionTriggerSummaryList':
          return PaginatedEvolutionTriggerSummaryList.fromJson(value);
        case 'PaginatedGenderSummaryList':
          return PaginatedGenderSummaryList.fromJson(value);
        case 'PaginatedGenerationSummaryList':
          return PaginatedGenerationSummaryList.fromJson(value);
        case 'PaginatedGrowthRateSummaryList':
          return PaginatedGrowthRateSummaryList.fromJson(value);
        case 'PaginatedItemAttributeSummaryList':
          return PaginatedItemAttributeSummaryList.fromJson(value);
        case 'PaginatedItemCategorySummaryList':
          return PaginatedItemCategorySummaryList.fromJson(value);
        case 'PaginatedItemFlingEffectSummaryList':
          return PaginatedItemFlingEffectSummaryList.fromJson(value);
        case 'PaginatedItemPocketSummaryList':
          return PaginatedItemPocketSummaryList.fromJson(value);
        case 'PaginatedItemSummaryList':
          return PaginatedItemSummaryList.fromJson(value);
        case 'PaginatedLanguageSummaryList':
          return PaginatedLanguageSummaryList.fromJson(value);
        case 'PaginatedLocationAreaSummaryList':
          return PaginatedLocationAreaSummaryList.fromJson(value);
        case 'PaginatedLocationSummaryList':
          return PaginatedLocationSummaryList.fromJson(value);
        case 'PaginatedMachineSummaryList':
          return PaginatedMachineSummaryList.fromJson(value);
        case 'PaginatedMoveBattleStyleSummaryList':
          return PaginatedMoveBattleStyleSummaryList.fromJson(value);
        case 'PaginatedMoveDamageClassSummaryList':
          return PaginatedMoveDamageClassSummaryList.fromJson(value);
        case 'PaginatedMoveLearnMethodSummaryList':
          return PaginatedMoveLearnMethodSummaryList.fromJson(value);
        case 'PaginatedMoveMetaAilmentSummaryList':
          return PaginatedMoveMetaAilmentSummaryList.fromJson(value);
        case 'PaginatedMoveMetaCategorySummaryList':
          return PaginatedMoveMetaCategorySummaryList.fromJson(value);
        case 'PaginatedMoveSummaryList':
          return PaginatedMoveSummaryList.fromJson(value);
        case 'PaginatedMoveTargetSummaryList':
          return PaginatedMoveTargetSummaryList.fromJson(value);
        case 'PaginatedNatureSummaryList':
          return PaginatedNatureSummaryList.fromJson(value);
        case 'PaginatedPalParkAreaSummaryList':
          return PaginatedPalParkAreaSummaryList.fromJson(value);
        case 'PaginatedPokeathlonStatSummaryList':
          return PaginatedPokeathlonStatSummaryList.fromJson(value);
        case 'PaginatedPokedexSummaryList':
          return PaginatedPokedexSummaryList.fromJson(value);
        case 'PaginatedPokemonColorSummaryList':
          return PaginatedPokemonColorSummaryList.fromJson(value);
        case 'PaginatedPokemonFormSummaryList':
          return PaginatedPokemonFormSummaryList.fromJson(value);
        case 'PaginatedPokemonHabitatSummaryList':
          return PaginatedPokemonHabitatSummaryList.fromJson(value);
        case 'PaginatedPokemonShapeSummaryList':
          return PaginatedPokemonShapeSummaryList.fromJson(value);
        case 'PaginatedPokemonSpeciesSummaryList':
          return PaginatedPokemonSpeciesSummaryList.fromJson(value);
        case 'PaginatedPokemonSummaryList':
          return PaginatedPokemonSummaryList.fromJson(value);
        case 'PaginatedRegionSummaryList':
          return PaginatedRegionSummaryList.fromJson(value);
        case 'PaginatedStatSummaryList':
          return PaginatedStatSummaryList.fromJson(value);
        case 'PaginatedSuperContestEffectSummaryList':
          return PaginatedSuperContestEffectSummaryList.fromJson(value);
        case 'PaginatedTypeSummaryList':
          return PaginatedTypeSummaryList.fromJson(value);
        case 'PaginatedVersionGroupSummaryList':
          return PaginatedVersionGroupSummaryList.fromJson(value);
        case 'PaginatedVersionSummaryList':
          return PaginatedVersionSummaryList.fromJson(value);
        case 'PalParkAreaDetail':
          return PalParkAreaDetail.fromJson(value);
        case 'PalParkAreaDetailPokemonEncountersInner':
          return PalParkAreaDetailPokemonEncountersInner.fromJson(value);
        case 'PalParkAreaName':
          return PalParkAreaName.fromJson(value);
        case 'PalParkAreaSummary':
          return PalParkAreaSummary.fromJson(value);
        case 'PokeathlonStatDetail':
          return PokeathlonStatDetail.fromJson(value);
        case 'PokeathlonStatDetailAffectingNatures':
          return PokeathlonStatDetailAffectingNatures.fromJson(value);
        case 'PokeathlonStatDetailAffectingNaturesDecreaseInner':
          return PokeathlonStatDetailAffectingNaturesDecreaseInner.fromJson(value);
        case 'PokeathlonStatDetailAffectingNaturesIncreaseInner':
          return PokeathlonStatDetailAffectingNaturesIncreaseInner.fromJson(value);
        case 'PokeathlonStatName':
          return PokeathlonStatName.fromJson(value);
        case 'PokeathlonStatSummary':
          return PokeathlonStatSummary.fromJson(value);
        case 'PokedexDescription':
          return PokedexDescription.fromJson(value);
        case 'PokedexDetail':
          return PokedexDetail.fromJson(value);
        case 'PokedexDetailPokemonEntriesInner':
          return PokedexDetailPokemonEntriesInner.fromJson(value);
        case 'PokedexName':
          return PokedexName.fromJson(value);
        case 'PokedexSummary':
          return PokedexSummary.fromJson(value);
        case 'PokemonColorDetail':
          return PokemonColorDetail.fromJson(value);
        case 'PokemonColorName':
          return PokemonColorName.fromJson(value);
        case 'PokemonColorSummary':
          return PokemonColorSummary.fromJson(value);
        case 'PokemonDetail':
          return PokemonDetail.fromJson(value);
        case 'PokemonDetailAbilitiesInner':
          return PokemonDetailAbilitiesInner.fromJson(value);
        case 'PokemonDetailCries':
          return PokemonDetailCries.fromJson(value);
        case 'PokemonDetailHeldItems':
          return PokemonDetailHeldItems.fromJson(value);
        case 'PokemonDetailMovesInner':
          return PokemonDetailMovesInner.fromJson(value);
        case 'PokemonDetailMovesInnerVersionGroupDetailsInner':
          return PokemonDetailMovesInnerVersionGroupDetailsInner.fromJson(value);
        case 'PokemonDetailPastAbilitiesInner':
          return PokemonDetailPastAbilitiesInner.fromJson(value);
        case 'PokemonDetailPastTypesInner':
          return PokemonDetailPastTypesInner.fromJson(value);
        case 'PokemonDetailSprites':
          return PokemonDetailSprites.fromJson(value);
        case 'PokemonDetailTypesInner':
          return PokemonDetailTypesInner.fromJson(value);
        case 'PokemonDexEntry':
          return PokemonDexEntry.fromJson(value);
        case 'PokemonFormDetail':
          return PokemonFormDetail.fromJson(value);
        case 'PokemonFormDetailFormNamesInner':
          return PokemonFormDetailFormNamesInner.fromJson(value);
        case 'PokemonFormDetailSprites':
          return PokemonFormDetailSprites.fromJson(value);
        case 'PokemonFormSummary':
          return PokemonFormSummary.fromJson(value);
        case 'PokemonGameIndex':
          return PokemonGameIndex.fromJson(value);
        case 'PokemonHabitatDetail':
          return PokemonHabitatDetail.fromJson(value);
        case 'PokemonHabitatName':
          return PokemonHabitatName.fromJson(value);
        case 'PokemonHabitatSummary':
          return PokemonHabitatSummary.fromJson(value);
        case 'PokemonShapeDetail':
          return PokemonShapeDetail.fromJson(value);
        case 'PokemonShapeDetailAwesomeNamesInner':
          return PokemonShapeDetailAwesomeNamesInner.fromJson(value);
        case 'PokemonShapeDetailNamesInner':
          return PokemonShapeDetailNamesInner.fromJson(value);
        case 'PokemonShapeSummary':
          return PokemonShapeSummary.fromJson(value);
        case 'PokemonSpeciesDescription':
          return PokemonSpeciesDescription.fromJson(value);
        case 'PokemonSpeciesDetail':
          return PokemonSpeciesDetail.fromJson(value);
        case 'PokemonSpeciesDetailGeneraInner':
          return PokemonSpeciesDetailGeneraInner.fromJson(value);
        case 'PokemonSpeciesDetailPalParkEncountersInner':
          return PokemonSpeciesDetailPalParkEncountersInner.fromJson(value);
        case 'PokemonSpeciesDetailVarietiesInner':
          return PokemonSpeciesDetailVarietiesInner.fromJson(value);
        case 'PokemonSpeciesFlavorText':
          return PokemonSpeciesFlavorText.fromJson(value);
        case 'PokemonSpeciesSummary':
          return PokemonSpeciesSummary.fromJson(value);
        case 'PokemonStat':
          return PokemonStat.fromJson(value);
        case 'PokemonSummary':
          return PokemonSummary.fromJson(value);
        case 'RegionDetail':
          return RegionDetail.fromJson(value);
        case 'RegionName':
          return RegionName.fromJson(value);
        case 'RegionSummary':
          return RegionSummary.fromJson(value);
        case 'StatDetail':
          return StatDetail.fromJson(value);
        case 'StatDetailAffectingMoves':
          return StatDetailAffectingMoves.fromJson(value);
        case 'StatDetailAffectingMovesIncreaseInner':
          return StatDetailAffectingMovesIncreaseInner.fromJson(value);
        case 'StatDetailAffectingNatures':
          return StatDetailAffectingNatures.fromJson(value);
        case 'StatName':
          return StatName.fromJson(value);
        case 'StatSummary':
          return StatSummary.fromJson(value);
        case 'SuperContestEffectDetail':
          return SuperContestEffectDetail.fromJson(value);
        case 'SuperContestEffectFlavorText':
          return SuperContestEffectFlavorText.fromJson(value);
        case 'SuperContestEffectSummary':
          return SuperContestEffectSummary.fromJson(value);
        case 'TypeDetail':
          return TypeDetail.fromJson(value);
        case 'TypeDetailDamageRelations':
          return TypeDetailDamageRelations.fromJson(value);
        case 'TypeDetailPastDamageRelationsInner':
          return TypeDetailPastDamageRelationsInner.fromJson(value);
        case 'TypeDetailPastDamageRelationsInnerDamageRelations':
          return TypeDetailPastDamageRelationsInnerDamageRelations.fromJson(value);
        case 'TypeDetailPokemonInner':
          return TypeDetailPokemonInner.fromJson(value);
        case 'TypeDetailPokemonInnerPokemon':
          return TypeDetailPokemonInnerPokemon.fromJson(value);
        case 'TypeDetailSpritesValueValue':
          return TypeDetailSpritesValueValue.fromJson(value);
        case 'TypeGameIndex':
          return TypeGameIndex.fromJson(value);
        case 'TypeSummary':
          return TypeSummary.fromJson(value);
        case 'VersionDetail':
          return VersionDetail.fromJson(value);
        case 'VersionGroupDetail':
          return VersionGroupDetail.fromJson(value);
        case 'VersionGroupSummary':
          return VersionGroupSummary.fromJson(value);
        case 'VersionName':
          return VersionName.fromJson(value);
        case 'VersionSummary':
          return VersionSummary.fromJson(value);
        default:
          dynamic match;
          if (value is List && (match = _regList.firstMatch(targetType)?.group(1)) != null) {
            return value
              .map<dynamic>((dynamic v) => fromJson(v, match, growable: growable,))
              .toList(growable: growable);
          }
          if (value is Set && (match = _regSet.firstMatch(targetType)?.group(1)) != null) {
            return value
              .map<dynamic>((dynamic v) => fromJson(v, match, growable: growable,))
              .toSet();
          }
          if (value is Map && (match = _regMap.firstMatch(targetType)?.group(1)) != null) {
            return Map<String, dynamic>.fromIterables(
              value.keys.cast<String>(),
              value.values.map<dynamic>((dynamic v) => fromJson(v, match, growable: growable,)),
            );
          }
      }
    } on Exception catch (error, trace) {
      throw ApiException.withInner(HttpStatus.internalServerError, 'Exception during deserialization.', error, trace,);
    }
    throw ApiException(HttpStatus.internalServerError, 'Could not find a suitable class for deserialization',);
  }
}

/// Primarily intended for use in an isolate.
class DeserializationMessage {
  const DeserializationMessage({
    required this.json,
    required this.targetType,
    this.growable = false,
  });

  /// The JSON value to deserialize.
  final String json;

  /// Target type to deserialize to.
  final String targetType;

  /// Whether to make deserialized lists or maps growable.
  final bool growable;
}

/// Primarily intended for use in an isolate.
Future<dynamic> decodeAsync(DeserializationMessage message) async {
  // Remove all spaces. Necessary for regular expressions as well.
  final targetType = message.targetType.replaceAll(' ', '');

  // If the expected target type is String, nothing to do...
  return targetType == 'String'
    ? message.json
    : json.decode(message.json);
}

/// Primarily intended for use in an isolate.
Future<dynamic> deserializeAsync(DeserializationMessage message) async {
  // Remove all spaces. Necessary for regular expressions as well.
  final targetType = message.targetType.replaceAll(' ', '');

  // If the expected target type is String, nothing to do...
  return targetType == 'String'
    ? message.json
    : ApiClient.fromJson(
        json.decode(message.json),
        targetType,
        growable: message.growable,
      );
}

/// Primarily intended for use in an isolate.
Future<String> serializeAsync(Object? value) async => value == null ? '' : json.encode(value);
