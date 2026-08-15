//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/ability_detail_pokemon_inner_pokemon.dart';
import 'package:openapi/src/model/location_area_detail_encounter_method_rates_inner_version_details_inner.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'location_area_detail_encounter_method_rates_inner.g.dart';

/// LocationAreaDetailEncounterMethodRatesInner
///
/// Properties:
/// * [encounterMethod] 
/// * [versionDetails] 
@BuiltValue()
abstract class LocationAreaDetailEncounterMethodRatesInner implements Built<LocationAreaDetailEncounterMethodRatesInner, LocationAreaDetailEncounterMethodRatesInnerBuilder> {
  @BuiltValueField(wireName: r'encounter_method')
  AbilityDetailPokemonInnerPokemon get encounterMethod;

  @BuiltValueField(wireName: r'version_details')
  BuiltList<LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner> get versionDetails;

  LocationAreaDetailEncounterMethodRatesInner._();

  factory LocationAreaDetailEncounterMethodRatesInner([void updates(LocationAreaDetailEncounterMethodRatesInnerBuilder b)]) = _$LocationAreaDetailEncounterMethodRatesInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(LocationAreaDetailEncounterMethodRatesInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<LocationAreaDetailEncounterMethodRatesInner> get serializer => _$LocationAreaDetailEncounterMethodRatesInnerSerializer();
}

class _$LocationAreaDetailEncounterMethodRatesInnerSerializer implements PrimitiveSerializer<LocationAreaDetailEncounterMethodRatesInner> {
  @override
  final Iterable<Type> types = const [LocationAreaDetailEncounterMethodRatesInner, _$LocationAreaDetailEncounterMethodRatesInner];

  @override
  final String wireName = r'LocationAreaDetailEncounterMethodRatesInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    LocationAreaDetailEncounterMethodRatesInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'encounter_method';
    yield serializers.serialize(
      object.encounterMethod,
      specifiedType: const FullType(AbilityDetailPokemonInnerPokemon),
    );
    yield r'version_details';
    yield serializers.serialize(
      object.versionDetails,
      specifiedType: const FullType(BuiltList, [FullType(LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    LocationAreaDetailEncounterMethodRatesInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required LocationAreaDetailEncounterMethodRatesInnerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'encounter_method':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AbilityDetailPokemonInnerPokemon),
          ) as AbilityDetailPokemonInnerPokemon;
          result.encounterMethod.replace(valueDes);
          break;
        case r'version_details':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner)]),
          ) as BuiltList<LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner>;
          result.versionDetails.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  LocationAreaDetailEncounterMethodRatesInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = LocationAreaDetailEncounterMethodRatesInnerBuilder();
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

