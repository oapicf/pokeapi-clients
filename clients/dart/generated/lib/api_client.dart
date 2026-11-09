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
    String? contentType, {
    Future<void>? abortTrigger,
  }) async {
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
        final request = AbortableStreamedRequest(method, uri, abortTrigger: abortTrigger);
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
        final request = AbortableMultipartRequest(method, uri, abortTrigger: abortTrigger);
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

      final request = AbortableRequest(method, uri, abortTrigger: abortTrigger);
      if (nullableHeaderParams != null) {
        request.headers.addAll(nullableHeaderParams);
      }
      if (msgBody is String && msgBody.isNotEmpty) {
        request.body = msgBody;
      } else if (msgBody is List<int> && msgBody.isNotEmpty) {
        request.bodyBytes = msgBody;
      } else if (msgBody is Map<String, String>) {
        request.bodyFields = msgBody;
      }
      final response = await _client.send(request);
      return Response.fromStream(response);
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
        case 'AbilityEffectText':
          return AbilityEffectText.fromJson(value);
        case 'AbilityFlavorText':
          return AbilityFlavorText.fromJson(value);
        case 'AbilityName':
          return AbilityName.fromJson(value);
        case 'AbilityPokemonDetail':
          return AbilityPokemonDetail.fromJson(value);
        case 'AbilitySummary':
          return AbilitySummary.fromJson(value);
        case 'BerryDetail':
          return BerryDetail.fromJson(value);
        case 'BerryFirmnessDetail':
          return BerryFirmnessDetail.fromJson(value);
        case 'BerryFirmnessName':
          return BerryFirmnessName.fromJson(value);
        case 'BerryFirmnessSummary':
          return BerryFirmnessSummary.fromJson(value);
        case 'BerryFlavorBerryMap':
          return BerryFlavorBerryMap.fromJson(value);
        case 'BerryFlavorDetail':
          return BerryFlavorDetail.fromJson(value);
        case 'BerryFlavorMap':
          return BerryFlavorMap.fromJson(value);
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
        case 'CurrencyDetail':
          return CurrencyDetail.fromJson(value);
        case 'CurrencyName':
          return CurrencyName.fromJson(value);
        case 'CurrencySummary':
          return CurrencySummary.fromJson(value);
        case 'EggGroupDetail':
          return EggGroupDetail.fromJson(value);
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
        case 'EncounterPokemonDetail':
          return EncounterPokemonDetail.fromJson(value);
        case 'EvolutionChainDetail':
          return EvolutionChainDetail.fromJson(value);
        case 'EvolutionChainLink':
          return EvolutionChainLink.fromJson(value);
        case 'EvolutionChainSummary':
          return EvolutionChainSummary.fromJson(value);
        case 'EvolutionConditionExpression':
          return EvolutionConditionExpression.fromJson(value);
        case 'EvolutionTriggerDetail':
          return EvolutionTriggerDetail.fromJson(value);
        case 'EvolutionTriggerName':
          return EvolutionTriggerName.fromJson(value);
        case 'EvolutionTriggerSummary':
          return EvolutionTriggerSummary.fromJson(value);
        case 'EvolutionVariableDescription':
          return EvolutionVariableDescription.fromJson(value);
        case 'EvolutionVariableDetail':
          return EvolutionVariableDetail.fromJson(value);
        case 'EvolutionVariableName':
          return EvolutionVariableName.fromJson(value);
        case 'EvolutionVariableSummary':
          return EvolutionVariableSummary.fromJson(value);
        case 'Experience':
          return Experience.fromJson(value);
        case 'GenderDetail':
          return GenderDetail.fromJson(value);
        case 'GenderPokemonSpecies':
          return GenderPokemonSpecies.fromJson(value);
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
        case 'ItemMachine':
          return ItemMachine.fromJson(value);
        case 'ItemName':
          return ItemName.fromJson(value);
        case 'ItemPocketDetail':
          return ItemPocketDetail.fromJson(value);
        case 'ItemPocketName':
          return ItemPocketName.fromJson(value);
        case 'ItemPocketSummary':
          return ItemPocketSummary.fromJson(value);
        case 'ItemPrice':
          return ItemPrice.fromJson(value);
        case 'ItemSprites':
          return ItemSprites.fromJson(value);
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
        case 'LocationAreaEncounterDetail':
          return LocationAreaEncounterDetail.fromJson(value);
        case 'LocationAreaEncounterRate':
          return LocationAreaEncounterRate.fromJson(value);
        case 'LocationAreaEncounterVersionDetail':
          return LocationAreaEncounterVersionDetail.fromJson(value);
        case 'LocationAreaName':
          return LocationAreaName.fromJson(value);
        case 'LocationAreaPokemonEncounter':
          return LocationAreaPokemonEncounter.fromJson(value);
        case 'LocationAreaPokemonEncounterVersion':
          return LocationAreaPokemonEncounterVersion.fromJson(value);
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
        case 'MoveComboUsage':
          return MoveComboUsage.fromJson(value);
        case 'MoveCombos':
          return MoveCombos.fromJson(value);
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
        case 'MoveEffectChange':
          return MoveEffectChange.fromJson(value);
        case 'MoveEffectChangeEffectText':
          return MoveEffectChangeEffectText.fromJson(value);
        case 'MoveEffectEffectText':
          return MoveEffectEffectText.fromJson(value);
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
        case 'MoveMetaStatChange':
          return MoveMetaStatChange.fromJson(value);
        case 'MoveName':
          return MoveName.fromJson(value);
        case 'MoveStatChange':
          return MoveStatChange.fromJson(value);
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
        case 'NatureName':
          return NatureName.fromJson(value);
        case 'NaturePokeathlonStat':
          return NaturePokeathlonStat.fromJson(value);
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
        case 'PaginatedCurrencySummaryList':
          return PaginatedCurrencySummaryList.fromJson(value);
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
        case 'PaginatedEvolutionVariableSummaryList':
          return PaginatedEvolutionVariableSummaryList.fromJson(value);
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
        case 'PalParkAreaName':
          return PalParkAreaName.fromJson(value);
        case 'PalParkAreaSummary':
          return PalParkAreaSummary.fromJson(value);
        case 'PalParkEncounter':
          return PalParkEncounter.fromJson(value);
        case 'PokeapiMetaResponse':
          return PokeapiMetaResponse.fromJson(value);
        case 'PokeathlonStatAffectingNature':
          return PokeathlonStatAffectingNature.fromJson(value);
        case 'PokeathlonStatAffectingNatures':
          return PokeathlonStatAffectingNatures.fromJson(value);
        case 'PokeathlonStatDetail':
          return PokeathlonStatDetail.fromJson(value);
        case 'PokeathlonStatName':
          return PokeathlonStatName.fromJson(value);
        case 'PokeathlonStatSummary':
          return PokeathlonStatSummary.fromJson(value);
        case 'PokedexDescription':
          return PokedexDescription.fromJson(value);
        case 'PokedexDetail':
          return PokedexDetail.fromJson(value);
        case 'PokedexName':
          return PokedexName.fromJson(value);
        case 'PokedexSummary':
          return PokedexSummary.fromJson(value);
        case 'PokemonAbility':
          return PokemonAbility.fromJson(value);
        case 'PokemonAbilityPast':
          return PokemonAbilityPast.fromJson(value);
        case 'PokemonColorDetail':
          return PokemonColorDetail.fromJson(value);
        case 'PokemonColorName':
          return PokemonColorName.fromJson(value);
        case 'PokemonColorSummary':
          return PokemonColorSummary.fromJson(value);
        case 'PokemonCries':
          return PokemonCries.fromJson(value);
        case 'PokemonDetail':
          return PokemonDetail.fromJson(value);
        case 'PokemonDexEntry':
          return PokemonDexEntry.fromJson(value);
        case 'PokemonDexNumber':
          return PokemonDexNumber.fromJson(value);
        case 'PokemonEncounterDetailResponse':
          return PokemonEncounterDetailResponse.fromJson(value);
        case 'PokemonEncounterResponse':
          return PokemonEncounterResponse.fromJson(value);
        case 'PokemonEncounterVersionDetailResponse':
          return PokemonEncounterVersionDetailResponse.fromJson(value);
        case 'PokemonEvolution':
          return PokemonEvolution.fromJson(value);
        case 'PokemonEvolutionKnownMove':
          return PokemonEvolutionKnownMove.fromJson(value);
        case 'PokemonFormDetail':
          return PokemonFormDetail.fromJson(value);
        case 'PokemonFormFlavorText':
          return PokemonFormFlavorText.fromJson(value);
        case 'PokemonFormName':
          return PokemonFormName.fromJson(value);
        case 'PokemonFormSprites':
          return PokemonFormSprites.fromJson(value);
        case 'PokemonFormSummary':
          return PokemonFormSummary.fromJson(value);
        case 'PokemonFormTriggerCondition':
          return PokemonFormTriggerCondition.fromJson(value);
        case 'PokemonFormType':
          return PokemonFormType.fromJson(value);
        case 'PokemonGameIndex':
          return PokemonGameIndex.fromJson(value);
        case 'PokemonHabitatDetail':
          return PokemonHabitatDetail.fromJson(value);
        case 'PokemonHabitatName':
          return PokemonHabitatName.fromJson(value);
        case 'PokemonHabitatSummary':
          return PokemonHabitatSummary.fromJson(value);
        case 'PokemonHeldItem':
          return PokemonHeldItem.fromJson(value);
        case 'PokemonHeldItemSummary':
          return PokemonHeldItemSummary.fromJson(value);
        case 'PokemonHeldItemVersion':
          return PokemonHeldItemVersion.fromJson(value);
        case 'PokemonMove':
          return PokemonMove.fromJson(value);
        case 'PokemonMoveVersionGroup':
          return PokemonMoveVersionGroup.fromJson(value);
        case 'PokemonPastAbility':
          return PokemonPastAbility.fromJson(value);
        case 'PokemonPastStat':
          return PokemonPastStat.fromJson(value);
        case 'PokemonPastType':
          return PokemonPastType.fromJson(value);
        case 'PokemonShapeAwesomeName':
          return PokemonShapeAwesomeName.fromJson(value);
        case 'PokemonShapeDetail':
          return PokemonShapeDetail.fromJson(value);
        case 'PokemonShapeName':
          return PokemonShapeName.fromJson(value);
        case 'PokemonShapeSummary':
          return PokemonShapeSummary.fromJson(value);
        case 'PokemonSpeciesDescription':
          return PokemonSpeciesDescription.fromJson(value);
        case 'PokemonSpeciesDetail':
          return PokemonSpeciesDetail.fromJson(value);
        case 'PokemonSpeciesFlavorText':
          return PokemonSpeciesFlavorText.fromJson(value);
        case 'PokemonSpeciesGenus':
          return PokemonSpeciesGenus.fromJson(value);
        case 'PokemonSpeciesName':
          return PokemonSpeciesName.fromJson(value);
        case 'PokemonSpeciesPalParkEncounter':
          return PokemonSpeciesPalParkEncounter.fromJson(value);
        case 'PokemonSpeciesSummary':
          return PokemonSpeciesSummary.fromJson(value);
        case 'PokemonSpeciesVariety':
          return PokemonSpeciesVariety.fromJson(value);
        case 'PokemonSprites':
          return PokemonSprites.fromJson(value);
        case 'PokemonSpritesOther':
          return PokemonSpritesOther.fromJson(value);
        case 'PokemonSpritesOtherDreamWorld':
          return PokemonSpritesOtherDreamWorld.fromJson(value);
        case 'PokemonSpritesOtherHome':
          return PokemonSpritesOtherHome.fromJson(value);
        case 'PokemonSpritesOtherOfficialArtwork':
          return PokemonSpritesOtherOfficialArtwork.fromJson(value);
        case 'PokemonSpritesOtherShowdown':
          return PokemonSpritesOtherShowdown.fromJson(value);
        case 'PokemonStat':
          return PokemonStat.fromJson(value);
        case 'PokemonSummary':
          return PokemonSummary.fromJson(value);
        case 'PokemonType':
          return PokemonType.fromJson(value);
        case 'RegionDetail':
          return RegionDetail.fromJson(value);
        case 'RegionName':
          return RegionName.fromJson(value);
        case 'RegionSummary':
          return RegionSummary.fromJson(value);
        case 'StatAffectingMoves':
          return StatAffectingMoves.fromJson(value);
        case 'StatAffectingNatures':
          return StatAffectingNatures.fromJson(value);
        case 'StatDetail':
          return StatDetail.fromJson(value);
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
        case 'TypeGameIndex':
          return TypeGameIndex.fromJson(value);
        case 'TypeGameSprite':
          return TypeGameSprite.fromJson(value);
        case 'TypeName':
          return TypeName.fromJson(value);
        case 'TypePastRelationships':
          return TypePastRelationships.fromJson(value);
        case 'TypePokemon':
          return TypePokemon.fromJson(value);
        case 'TypeRelationships':
          return TypeRelationships.fromJson(value);
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
