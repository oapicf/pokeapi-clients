//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/location_area_detail_encounter_method_rates_inner.dart';
import 'package:openapi/src/model/location_area_name.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/location_area_detail_pokemon_encounters_inner.dart';
import 'package:openapi/src/model/location_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'location_area_detail.g.dart';

/// LocationAreaDetail
///
/// Properties:
/// * [id] 
/// * [name] 
/// * [gameIndex] 
/// * [encounterMethodRates] 
/// * [location] 
/// * [names] 
/// * [pokemonEncounters] 
@BuiltValue()
abstract class LocationAreaDetail implements Built<LocationAreaDetail, LocationAreaDetailBuilder> {
  @BuiltValueField(wireName: r'id')
  int get id;

  @BuiltValueField(wireName: r'name')
  String get name;

  @BuiltValueField(wireName: r'game_index')
  int get gameIndex;

  @BuiltValueField(wireName: r'encounter_method_rates')
  BuiltList<LocationAreaDetailEncounterMethodRatesInner> get encounterMethodRates;

  @BuiltValueField(wireName: r'location')
  LocationSummary get location;

  @BuiltValueField(wireName: r'names')
  BuiltList<LocationAreaName> get names;

  @BuiltValueField(wireName: r'pokemon_encounters')
  BuiltList<LocationAreaDetailPokemonEncountersInner> get pokemonEncounters;

  LocationAreaDetail._();

  factory LocationAreaDetail([void updates(LocationAreaDetailBuilder b)]) = _$LocationAreaDetail;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(LocationAreaDetailBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<LocationAreaDetail> get serializer => _$LocationAreaDetailSerializer();
}

class _$LocationAreaDetailSerializer implements PrimitiveSerializer<LocationAreaDetail> {
  @override
  final Iterable<Type> types = const [LocationAreaDetail, _$LocationAreaDetail];

  @override
  final String wireName = r'LocationAreaDetail';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    LocationAreaDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(int),
    );
    yield r'name';
    yield serializers.serialize(
      object.name,
      specifiedType: const FullType(String),
    );
    yield r'game_index';
    yield serializers.serialize(
      object.gameIndex,
      specifiedType: const FullType(int),
    );
    yield r'encounter_method_rates';
    yield serializers.serialize(
      object.encounterMethodRates,
      specifiedType: const FullType(BuiltList, [FullType(LocationAreaDetailEncounterMethodRatesInner)]),
    );
    yield r'location';
    yield serializers.serialize(
      object.location,
      specifiedType: const FullType(LocationSummary),
    );
    yield r'names';
    yield serializers.serialize(
      object.names,
      specifiedType: const FullType(BuiltList, [FullType(LocationAreaName)]),
    );
    yield r'pokemon_encounters';
    yield serializers.serialize(
      object.pokemonEncounters,
      specifiedType: const FullType(BuiltList, [FullType(LocationAreaDetailPokemonEncountersInner)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    LocationAreaDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required LocationAreaDetailBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.id = valueDes;
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        case r'game_index':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.gameIndex = valueDes;
          break;
        case r'encounter_method_rates':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(LocationAreaDetailEncounterMethodRatesInner)]),
          ) as BuiltList<LocationAreaDetailEncounterMethodRatesInner>;
          result.encounterMethodRates.replace(valueDes);
          break;
        case r'location':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(LocationSummary),
          ) as LocationSummary;
          result.location.replace(valueDes);
          break;
        case r'names':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(LocationAreaName)]),
          ) as BuiltList<LocationAreaName>;
          result.names.replace(valueDes);
          break;
        case r'pokemon_encounters':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(LocationAreaDetailPokemonEncountersInner)]),
          ) as BuiltList<LocationAreaDetailPokemonEncountersInner>;
          result.pokemonEncounters.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  LocationAreaDetail deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = LocationAreaDetailBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

